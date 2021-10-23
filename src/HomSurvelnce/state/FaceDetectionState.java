package HomSurvelnce.state;

public class FaceDetectionState implements State{
	SurvellianceStates survellianceStates;
	public FaceDetectionState(SurvellianceStates survellianceStates) {
		this.survellianceStates = survellianceStates;
	}
	

	@Override
	public void faceDetect() {
		System.out.println("Survelliance system recognizes the face");
	}

	@Override
	public void faceRecognize() {
		System.out.println("Survelliance system recognizes the face");
		survellianceStates.setState(survellianceStates.getFaceRecognitionState());

	}

	@Override
	public void motionRecording() {
		System.out.println("whenever the motion is detected, the system records the motion");
	}

	
	public String toString() {
		return " Face Detection state";
	}


	@Override
	public void status(Context context) {
		// TODO Auto-generated method stub
		
	}


	
}




