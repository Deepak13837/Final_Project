package HomSurvelnce.state;

public interface State {
	public void status(Context context);

	void faceDetect();

	void faceRecognize();

	void motionRecording();

}
