package command.commands.impl;

import command.commands.Command;
import command.food.Chicken;
import command.food.Food;

public class ChickenCommand implements Command{
	@Override
	public Food getFood() {
		return new Chicken();
	}
}
