package com.felixmilea.console
class MenuItem (_label: String, _action: () => Unit, _pause : Boolean = false)
{
	val label : String = _label
	val action : () => Unit = _action
	val pause = _pause
}