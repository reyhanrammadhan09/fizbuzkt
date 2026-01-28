package input.menu

open class CommandInput {
    protected fun executeCommand() {
        when (input) {
            MenuCommand.START.nameMenu -> println("game start")
            MenuCommand.OPTIONS.nameMenu -> println("enter to options")
            MenuCommand.HELP.nameMenu -> println("enter to help/guide")
            MenuCommand.EXIT.nameMenu -> println("exit from game")
        }
    }
//    Fill in the Command Input
    companion object : CommandInput() {
        private var input: String? = null
        fun fillInput(input: String?) {
            this.input = input
            executeCommand()
        }
    }
}