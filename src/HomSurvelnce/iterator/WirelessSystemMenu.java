package HomSurvelnce.iterator;

import HomSurvelnce.ADT;
import HomSurvelnce.Vivint;
import HomSurvelnce.WirelessSystem;

public class WirelessSystemMenu {
	
	WirelessSystem[] WirelessSystemMenu;
	
	public WirelessSystemMenu() {
		WirelessSystemMenu = new WirelessSystem[3];
		WirelessSystemMenu[0]=new Vivint();
		WirelessSystemMenu[1]=new ADT();
		
	}
	public Iterator createIterator() {
		return new WirelessSystemIterator(WirelessSystemMenu);
	}
}
