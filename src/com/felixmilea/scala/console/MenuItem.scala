package com.felixmilea.scala.console

case class MenuItem(label: String, action: Function0[Unit], pause: Boolean = false)