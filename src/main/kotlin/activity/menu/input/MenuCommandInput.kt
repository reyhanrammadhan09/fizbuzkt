package activity.menu.input

import activity.CommandInput
import activity.ErrorMessage

class MenuCommandInput(val input: String) {
    var isError: Boolean = false
    fun executeCommand() {
        //check is input blank
        when (input) {
            MenuCommand.START.nameMenu -> println("game start")
            MenuCommand.OPTIONS.nameMenu -> println("enter to options")
            MenuCommand.HELP.nameMenu -> println("enter to help/guide")
            MenuCommand.EXIT.nameMenu -> println("Exit the game")
            else -> {
                if (input.isNotBlank()) println(
                    ErrorMessage(this).errorMessage()
                )
                isError = true
            }
        }
    }
}