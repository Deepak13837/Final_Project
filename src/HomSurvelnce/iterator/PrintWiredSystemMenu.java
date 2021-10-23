package HomSurvelnce.iterator;

import HomSurvelnce.WiredSystem;

public class PrintWiredSystemMenu {
	WiredSystemMenu wiredSystemMenu;
	WiredSystem wiredSystem;
	
	public PrintWiredSystemMenu(WiredSystemMenu wiredSystemMenu) {
		this.wiredSystemMenu = wiredSystemMenu;
	}
	
	public void printMenu() {
		Iterator iterateProductMenu = wiredSystemMenu.createIterator();
		printMenu(iterateProductMenu);
	}
	
	private void printMenu(Iterator iterator) {
		System.out.println("\n\n\n\n-------------------WIRED SURVELLIANCE SYSTEM-------------------\n\n");
		
		 
		while(iterator.hasNext()){
			WiredSystem  wiredSystem= (WiredSystem) iterator.next();
			  
			  System.out.print(wiredSystem.getSystemName() + "\t");
			  System.out.print(wiredSystem.getSystemType()+"\t");
			  System.out.print(" $"+wiredSystem.getCost()+"\n");
			  System.out.println(wiredSystem.getDescription()+"\t");

			
		}
		 
	}
}







