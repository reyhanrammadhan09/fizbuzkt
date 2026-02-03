package activity.menu

import activity.CommandInput
import activity.menu.input.MenuCommand
import activity.menu.input.MenuCommandInput

fun menuTui() {
    val titleGame = """
        
        ██╗    ██╗██╗  ██╗███████╗███╗   ██╗██╗   ██╗ ██████╗  ██████╗ 
        ██║    ██║██║  ██║██╔════╝████╗  ██║╚██╗ ██╔╝██╔═══██╗██╔═══██╗
        ██║ █╗ ██║███████║█████╗  ██╔██╗ ██║ ╚████╔╝ ██║   ██║██║   ██║
        ██║███╗██║██╔══██║██╔══╝  ██║╚██╗██║  ╚██╔╝  ██║   ██║██║   ██║
        ╚███╔███╔╝██║  ██║███████╗██║ ╚████║   ██║   ╚██████╔╝╚██████╔╝
         ╚══╝╚══╝ ╚═╝  ╚═╝╚══════╝╚═╝  ╚═══╝   ╚═╝    ╚═════╝  ╚═════╝    
         
    Main menu Command:
    start - to start the game
    options - to view the option menus
    help - for help and guidance
    exit - to quit this game
        
    o,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,
        
        
    """.trimMargin()
    print("\u001b[H\u001b[2J")
    System.out.flush()
    println(titleGame)
    do {
        print("~> ")
        val reader = MenuCommandInput(readln())
        reader.executeCommand()
    } while(reader.isError)
}