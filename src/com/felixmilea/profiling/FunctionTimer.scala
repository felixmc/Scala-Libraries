package com.felixmilea.profiling

class FunctionTimer extends Timer
{
	// times the executing of a function in milliseconds, returns the function's return
	def time (f: => Any) : Any =
	{
		start
		val result = f
		stop
		return result
	}
}