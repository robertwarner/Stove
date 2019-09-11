
/**
 * Burner Class
 * 
 * @author Rob
 * @author Jo
 *
 */

public class Burner {

	enum Temperature {
		BLAZING, HOT, WARM, COLD;
	}

	Temperature myTemperature;
	Setting mySetting;
	int timer;
	public final static int TIME_DURATION = 2;

	public Burner() {
		this.mySetting = Setting.OFF;
		this.myTemperature = Temperature.COLD;
		this.timer = 0;

	}

	public void plusButton() {

		if(timer != TIME_DURATION) {
			timer += TIME_DURATION;
		}

		
		switch (this.mySetting) {
		case HIGH:
			break;
		case LOW:
			this.mySetting = Setting.MEDIUM;
			break;
		case MEDIUM:
			this.mySetting = Setting.HIGH;
			break;
		case OFF:
			this.mySetting = Setting.LOW; 
			break;
		default:
			break;
			

		}
	}

	public void minusButton() {
		switch (this.mySetting) {
		case HIGH:
			this.mySetting = Setting.MEDIUM;
			break;
		case LOW:
			this.mySetting = Setting.OFF;
			break;
		case MEDIUM:
			this.mySetting = Setting.LOW;
			break;
		case OFF:
			break;
		default:
			break;
			
		}

	}

	public void updateTemperature() {
		this.timer--;
		if(this.timer == 0) {
			switch(this.mySetting) {
			case HIGH:
				
				break;
			case LOW:
				
				break;
			case MEDIUM:
				break;
			case OFF:
				break;
			default:
				break;
				
			}
			
		}
		
	}

	public void display() {

	}

}
