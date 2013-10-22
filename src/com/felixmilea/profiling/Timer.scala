package com.felixmilea.profiling

class Timer
{
	private var beginning : Long = 0
	private var end : Long = 0
	
	def start = { beginning = System.currentTimeMillis; end = beginning }
	def stop = { end = System.currentTimeMillis }
	
	def elapsedTime : Long = end - beginning
	def currentTime : Long = System.currentTimeMillis - beginning
}