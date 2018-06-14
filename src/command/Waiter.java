package command;

import java.util.ArrayList;
import java.util.List;

import command.commands.Command;
import command.commands.CommandFactory;

public class Waiter {
	private List<Command> commands = new ArrayList<>();
	
	public void orderDishs(String name) {
		Command command = CommandFactory.getCommand(name);
		if(command != null) {
			commands.add(command);
		}
	}
	
	public void placeOrder() {
		System.out.println("�µ���");
		for (Command command : commands) {
			System.out.println("����"+command.getFood()+"����");
		}
	}
}
