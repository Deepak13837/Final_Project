package HomSurvelnce.state;

public class MotionRecordState implements State {
	SurvellianceStates survellianceStates;
	public MotionRecordState(SurvellianceStates survellianceStates) {
		this.survellianceStates = survellianceStates;
	}
	

	@Override
	public void faceDetect() {
		System.out.println("Survelliance system recognizes the face");
	}

	@Override
	public void faceRecognize() {
		System.out.println("Survelliance system recognizes the face");

	}

	@Override
	public void motionRecording() {
		System.out.println("whenever the motion is detected, the system records the motion");
	}

	
	public String toString() {
		return " motion record state";
	}


	@Override
	public void status(Context context) {
		// TODO Auto-generated method stub
		
	}


	
}






