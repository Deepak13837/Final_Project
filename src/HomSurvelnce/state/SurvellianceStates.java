package HomSurvelnce.state;

public class SurvellianceStates {
	State newState;
	State faceDetectionState;
	State faceRecognitionState;
	State motionRecordState;
	State state;

	public SurvellianceStates() {
		newState= new NewState(this);
		faceDetectionState = new FaceDetectionState(this);
		faceRecognitionState = new FaceRecognitionState(this);
		motionRecordState = new MotionRecordState(this);
		
		state = newState ;
	}
	
	public void faceDetect() {
		state.faceDetect();
	}
	public void faceRecognize() {
		state.faceRecognize();
	}
	public void motionRecording() {
		state.motionRecording();
	}
	
	
	public void setState(State state) {
		this.state = state;
	}
	public State getState() {
		return state;
	}
	public State getNewState() {
		return newState;
	}
	public State getFaceDetectionState() {
		return faceDetectionState;
	}
	public State getFaceRecognitionState() {
		return faceRecognitionState;
	}
	public State getMotionRecordState() {
		return motionRecordState;
	}
	
	public String toString() {
		StringBuffer result = new StringBuffer();

		result.append("---- Survelliance States ------");

		result.append("\nSurvelliance is in " + state + "\n");

		return result.toString();
	}

}





