package HomSurvelnce.test;

import HomSurvelnce.iterator.Iterator;
import HomSurvelnce.iterator.WiredSystemMenu;

public class IteratorUnitTest {
	public static void main(String[] args) {
		WiredSystemMenu wiredSystemMenu = new WiredSystemMenu();
		Iterator iterator = wiredSystemMenu.createIterator();
		if(iterator.hasNext()) {
			System.out.println("Valid Test has next Item");
		}
		else {
			System.err.println("Invalid Call to iterator hasNext");
		}
	}

}

