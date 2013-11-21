package com.felixmilea.scala.console

abstract class ConsoleMenuApp extends App
{
	val menu = new ConsoleMenu("Application Menu")
		
	def start ()
	{
	  	menu.addItem(new MenuItem("Exit", exit))
		while (true) menu.promptMenu
	}
	
	def exit ()
	{
		println("Good Bye!")
		System.exit(0)
	}
  
}