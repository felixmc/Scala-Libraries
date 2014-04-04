package com.felixmilea.scala.console

abstract class ConsoleMenuApp(title: String = "Application Menu") extends App {
  val menu = new ConsoleMenu(title)

  def start() {
    menu.addItem(new MenuItem("Exit", exit))
    while (true) menu.promptMenu
  }

  def exit() {
    println("Good Bye!")
    System.exit(0)
  }

}