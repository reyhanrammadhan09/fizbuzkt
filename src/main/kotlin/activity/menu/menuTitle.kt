package activity.menu

import activity.clear
import activity.menu.input.MenuCommandInput

fun menuTitle() {
    val titleGameMenu = """
        
        888888 88 8888P 88""Yb 88   88 8888P 88  dP 888888 
        88__   88   dP  88__dP 88   88   dP  88odP    88   
        88""   88  dP   88""Yb Y8   8P  dP   88"Yb    88   
        88     88 d8888 88oodP `YbodP' d8888 88  Yb   88   
        
    Main menu Command:
    start - to start the game
    options - to view the option menus
    help - for help and guidance
    exit - to quit this game
        
    o,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,
        
        
    """.trimMargin()
    clear()
    println(titleGameMenu)
    do {
        print(">> ")
        val reader = MenuCommandInput(readln())
        reader.executeCommand()
    } while(reader.isError)
}