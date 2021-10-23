package HomSurvelnce.state;

public class FaceRecognitionState implements State {
	SurvellianceStates survellianceStates;
	public FaceRecognitionState(SurvellianceStates survellianceStates) {
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
		survellianceStates.setState(survellianceStates.getMotionRecordState());

	}

	
	public String toString() {
		return " Face Recognition state";
	}


	@Override
	public void status(Context context) {
		// TODO Auto-generated method stub
		
	}


	
}






