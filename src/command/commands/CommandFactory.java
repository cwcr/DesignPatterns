package command.commands;

public class CommandFactory {
	public static Command getCommand(String name) {	
		try {
			return (Command)Class.forName("command.commands.impl."+name+"Command").newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			System.err.println("本店没有此菜，请重新选择");
			return null;
		}
	}
}
