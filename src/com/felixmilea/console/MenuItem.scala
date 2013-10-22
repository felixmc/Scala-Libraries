package com.felixmilea.console
class MenuItem (_label: String, _action: () => Unit)
{
	val label : String = _label
	val action : () => Unit = _action
}