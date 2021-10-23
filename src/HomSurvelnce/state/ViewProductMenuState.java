package HomSurvelnce.state;

import HomSurvelnce.factory.MenuFactory;

public class ViewProductMenuState implements State{
	public void status(Context context) {
		MenuFactory menuFactory = new MenuFactory();
		menuFactory.chooseMenu();
	}

	@Override
	public void faceDetect() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void faceRecognize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void motionRecording() {
		// TODO Auto-generated method stub
		
	}

	
}
