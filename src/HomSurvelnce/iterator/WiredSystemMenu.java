package HomSurvelnce.iterator;

import HomSurvelnce.DvrSystem;
import HomSurvelnce.NVRSystem;
import HomSurvelnce.WiredSystem;

public class WiredSystemMenu {
	
	WiredSystem[] wiredSystemMenu;
	
	public WiredSystemMenu() {
		wiredSystemMenu = new WiredSystem[3];
		wiredSystemMenu[0]=new DvrSystem();
		wiredSystemMenu[1]=new NVRSystem();
		
	}
	public Iterator createIterator() {
		return new WiredSystemIterator(wiredSystemMenu);
	}
}
