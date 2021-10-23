package HomSurvelnce.iterator;

import HomSurvelnce.WirelessSystem;

public class WirelessSystemIterator implements Iterator {

	WirelessSystem[] wirelessSystemMenu;
	int position;
	public WirelessSystemIterator(WirelessSystem[] wirelessSystemMenu) {
		this.wirelessSystemMenu = wirelessSystemMenu;
	}

	@Override
	public boolean hasNext() {
		if(position > wirelessSystemMenu.length || wirelessSystemMenu[position] == null) {
			return false;
		}
		else return true;
	}

	@Override
	public WirelessSystem next() {
		WirelessSystem wirelessSystem= (WirelessSystem) wirelessSystemMenu[position];
		position = position +1;
		
		return wirelessSystem;
	}


}
