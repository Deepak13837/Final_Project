package HomSurvelnce.factory;

import java.util.Scanner;

import HomSurvelnce.iterator.PrintWiredSystemMenu;
import HomSurvelnce.iterator.PrintWirelessSystemMenu;
import HomSurvelnce.iterator.WiredSystemMenu;
import HomSurvelnce.iterator.WirelessSystemMenu;
import HomSurvelnce.state.Context;
import HomSurvelnce.state.MainMenuStatus;
import HomSurvelnce.state.SurvellianceStates;


public class MenuFactory {
	public void chooseMenu() {
		Scanner usrInpt = new Scanner(System.in);
		
		System.out.println("\n\n-------------SELECT MENU----------------\n\n"+
		"Enter number associated with your menu selection.\n"+
		"1) Wired Survelliance System Menu\n"+
		"2) Wireless Survelliance System\n"+
		"3) Survelliance States\n"+

		"4) Home Screen" );
		
		
		int menuChoice = usrInpt.nextInt();
		
		
		if(menuChoice ==1) {
			WiredSystemMenu wiredSystemMenu = new WiredSystemMenu();
			PrintWiredSystemMenu prntpmnu = new PrintWiredSystemMenu(wiredSystemMenu);
			
			prntpmnu.printMenu();
		}
		if(menuChoice ==2) {
			WirelessSystemMenu wirelessSystemMenu = new WirelessSystemMenu();
			PrintWirelessSystemMenu prntmnu = new PrintWirelessSystemMenu(wirelessSystemMenu);

			prntmnu.printMenu();
			
		}
		if(menuChoice ==3) {
			SurvellianceStates states = new SurvellianceStates();

			System.out.println(states);
			states.faceDetect();
			System.out.println(states);
			states.faceRecognize();
			System.out.println(states);
			states.motionRecording();
			System.out.println(states);

			
		}

		
		else {
			Context context = new Context();
			MainMenuStatus goHome = new MainMenuStatus();
			goHome.status(context);
		}
		
		
		
		
		Context context = new Context();
		
		
	}
}

