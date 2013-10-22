package com.felixmilea.console

class ConsoleMenu (_title: String)
{
	private var menuItems : List[MenuItem] = List()
	private val title : String = _title
	
	def addItem (item: MenuItem)
	{
		menuItems = menuItems :+ item
	}
	
	def runItem (index: Integer) =
	{
 		println()
		menuItems(index).action()
		ConsoleIO.waitForEnter()
	}
	
	def printItems ()
	{
		for (i <- (1 to menuItems.length))
			println(i + ". " + menuItems(i - 1).label)
	}
	
	def promptMenu ()
	{
		println(title)
		printItems()
		
		var index : Integer = null;
		
		do
		{
			if (index != null) println("Invalid option.\n")
			index = ConsoleIO.promptInt("\nChoose menu option: ")
		} while ( (index <= 0) || (index > menuItems.length) )
		
		runItem( index - 1 )
	}

}