package HomSurvelnce.test;

import HomSurvelnce.factory.MenuFactory;
import HomSurvelnce.state.Context;


public class FactoryUnitTest {
	public static void main(String[] args) {
		Context context = new Context();
		MenuFactory testFactory = new MenuFactory();
		testFactory.chooseMenu();

}

}
