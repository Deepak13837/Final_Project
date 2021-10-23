package HomSurvelnce.iterator;

import HomSurvelnce.WirelessSystem;

public class PrintWirelessSystemMenu {
	WirelessSystemMenu wirelessSystemMenu;
	WirelessSystem wirelessSystem;
	
	public PrintWirelessSystemMenu(WirelessSystemMenu wirelessSystemMenu) {
		this.wirelessSystemMenu = wirelessSystemMenu;
	}
	
	public void printMenu() {
		Iterator iterateProductMenu = wirelessSystemMenu.createIterator();
		printMenu(iterateProductMenu);
	}
	
	private void printMenu(Iterator iterator) {
		System.out.println("\n\n\n\n-------------------WIRELESS SURVELLIANCE SYSTEM-------------------\n\n");
		
		 
		while(iterator.hasNext()){
			WirelessSystem  wirelessSystem= (WirelessSystem) iterator.next();
			  
			  System.out.print(wirelessSystem.getSystemName() + "\t");
			  System.out.print(wirelessSystem.getSystemType()+"\t");
			  System.out.print(" $"+wirelessSystem.getCost()+"\n");
			  System.out.println(wirelessSystem.getDescription()+"\t");

			
		}
		 
	}
}




