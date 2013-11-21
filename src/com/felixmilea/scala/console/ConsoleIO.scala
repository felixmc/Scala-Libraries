

package com.felixmilea.scala.console

object ConsoleIO
{
	def promptInt (prompt: String, min : Integer = Integer.MIN_VALUE, max : Integer = Integer.MAX_VALUE) : Integer =
	{
		var value : Integer = null

		while (value == null)
		{
			print(prompt)
			val input : String = readLine()
			try
			{
				val inputValue = Integer.parseInt(input)
				if (inputValue < min || inputValue > max)
					printf("Input integer needs to be between %d and %d.\n", min, max)
				else
					value = inputValue
			}
			catch
			{
				case nfe: NumberFormatException => println("Input is not a valid integer.")
				//case oe: OverflowException => error("The input value is too large.")
			}
		}
		
		return value
	}
	
	def promptString (prompt: String) : String =
	{
		print(prompt)
		return readLine()
	}
	
	def waitForEnter ()
	{
		println("\n\nPress Enter to continue..")
		readLine()
	}

}