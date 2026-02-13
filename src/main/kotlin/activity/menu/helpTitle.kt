package activity.menu

import activity.clear
import activity.menu.input.MenuCommandInput

fun helpTitle() {
    val titleHelpMenu = """
        |menu menu: 
        |   start       to start the fizzbuzz game
        |   options     to view the option menus
        |   help        for help and guidance
        |   exit        to quit this game
        |   
        |   
    """.trimMargin()
    clear()
    println(titleHelpMenu)
    do {
        print(">> ")
        val reader = MenuCommandInput(readln())
        reader.executeCommand()
    } while (reader.isError)
}