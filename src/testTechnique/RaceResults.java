package testTechnique;

public class RaceResults {
	public TimeDuration time;
	public String RFID;
	
	RaceResults(TimeDuration x, String y){
		time=x;
		RFID=y;
	}
	
	void onNewResult(String tagNumber, TimeDuration resultTime) {
		
	}
}
