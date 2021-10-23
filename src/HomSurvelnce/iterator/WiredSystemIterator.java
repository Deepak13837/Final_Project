package HomSurvelnce.iterator;

import HomSurvelnce.WiredSystem;

public class WiredSystemIterator implements Iterator {

	WiredSystem[] wiredSystemMenu;
	int position;
	public WiredSystemIterator(WiredSystem[] wiredSystemMenu) {
		this.wiredSystemMenu = wiredSystemMenu;
	}

	@Override
	public boolean hasNext() {
		if(position > wiredSystemMenu.length || wiredSystemMenu[position] == null) {
			return false;
		}
		else return true;
	}

	@Override
	public WiredSystem next() {
		WiredSystem wiredSystem= (WiredSystem) wiredSystemMenu[position];
		position = position +1;
		
		return wiredSystem;
	}


}
