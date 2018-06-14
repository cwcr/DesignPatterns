package command.commands.impl;

import command.commands.Command;
import command.food.Mutton;
import command.food.Food;

public class MuttonCommand implements Command{
	@Override
	public Food getFood() {
		return new Mutton();
	}
}
