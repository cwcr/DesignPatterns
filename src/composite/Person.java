package composite;

import java.util.List;

import composite.dto.Role;

import java.util.ArrayList;
import java.util.Iterator;

public class Person {
	private List<Role> roles = new ArrayList<>();
	
	public void is (Role role) {
		roles.add(role);
	}
	
	public void call() {
		for (Role role : roles) {
			role.call();
		}
	}
}
