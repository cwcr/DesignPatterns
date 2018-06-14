package command.commands;

public class CommandFactory {
	public static Command getCommand(String name) {	
		try {
			return (Command)Class.forName("command.commands.impl."+name+"Command").newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			System.err.println("����û�д˲ˣ�������ѡ��");
			return null;
		}
	}
}
