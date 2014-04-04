package com.felixmilea.scala.profiling

class Timer {
  private var beginning: Long = 0
  private var end: Long = 0

  var timingMethod: Function0[Long] = System.currentTimeMillis

  def start = { beginning = timingMethod(); end = beginning }
  def stop = { end = timingMethod() }

  def elapsedTime: Long = end - beginning
  def currentTime: Long = timingMethod() - beginning
}