package ch11;

import java.sql.Date;

public class SmartPhoneMain {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("구글", "안드로이드");
		
		String strObj = myPhone.toString();
		System.out.println(strObj);
		
		System.out.println(myPhone);
		
		Object obj1 = new Object();
		Date obj2 = new Date(0);
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
				
	}

}
