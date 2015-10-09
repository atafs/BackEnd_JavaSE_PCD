package OO_11Exception;

import java.io.IOException;

public class B {

	public void y(){
		
		A a = new A();
		try {
			a.x();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
