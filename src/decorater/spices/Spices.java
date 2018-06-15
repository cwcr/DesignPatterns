package decorater.spices;

import decorater.bean.Drinks;

public abstract class Spices {
	private String name;
	public Spices(String name) {
		this.name = name;
	}
	
	public void decorator(Drinks drinks) {
		String description = drinks.getDescription();
		if(description!=null) {
			if(description.contains(name)) {
				//doNothing
			}else {
				description = description+"¡¢"+name;
			}
		}else {
			description = name;
		}
		drinks.setDescription(description);
	}
}
