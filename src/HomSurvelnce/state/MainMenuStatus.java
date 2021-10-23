package HomSurvelnce.state;

import java.util.Scanner;

public class MainMenuStatus implements State{
	@Override
	public void status(Context context) {
		// TODO Auto-generated method stub
		Scanner usrInpt = new Scanner(System.in);
		
		System.out.print("--------HOME SURVELLIANCE SYSTEM-----\n" + 
		"1) Survelliance Products \n" + 
		"2) Log Out\n");
		
		System.out.print("");

		int UserInpt = usrInpt.nextInt();
		
		if(UserInpt ==1) {
			ViewProductMenuState viewproducts = new ViewProductMenuState();
			viewproducts.status(context);
		}
		
		
		else {
			System.exit(0);
		}
	context.setState(this);
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
