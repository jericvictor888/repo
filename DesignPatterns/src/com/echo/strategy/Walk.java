/** Set the different implementation of the same method*/
package com.echo.strategy;

public interface Walk {
	String walk();	
}

class WalkFast implements Walk
{
	@Override
	public String walk() {
		return "Walks fast...";
	}
	
}

class WalkSlow implements Walk
{
	@Override
	public String walk() {
		return "Walks slow...";
	}
}

