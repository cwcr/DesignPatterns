package observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	public List<Observer> list = new ArrayList<Observer>();
	
	//���
	public void attach(Observer o) {
		list.add(o);
	}
	
	//����
	public void detach(Observer o) {
		list.remove(o);
	}
	
	//֪ͨ
	public void notice() {
		for (Observer o : list) {
			o.update();
		}

	}
}
