package com.felixmilea.scala.console

import scala.collection.mutable.ArrayBuffer

class ConsoleMenu(val title: String) {
  private val menuItems: ArrayBuffer[MenuItem] = ArrayBuffer()

  def addItem(item: MenuItem) {
    menuItems :+ item
  }

  def runItem(index: Integer) = {
    println()
    menuItems(index).action()

    if (menuItems(index).pause) ConsoleIO.waitForEnter()
    else println
  }

  def printItems() {
    for (i <- (1 to menuItems.length)) {
      val padding = " " * (menuItems.size.toString.size - i.toString.size)
      printf("%d.%s %s\n", i, padding, menuItems(i - 1).label)
    }
  }

  def promptMenu() {
    println(title)
    println("=" * title.size)
    printItems()

    var index: Integer = null;

    do {
      if (index != null) println("Invalid option.\n")
      index = ConsoleIO.promptInt("\nChoose menu option: ")
    } while ((index <= 0) || (index > menuItems.length))

    runItem(index - 1)
  }

}