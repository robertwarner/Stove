
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

		if (timer != TIME_DURATION) {
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
		Temperature finalTemp;

		switch (this.mySetting) {
		case HIGH:
			finalTemp = Temperature.BLAZING;
			break;
		case LOW:
			finalTemp = Temperature.HOT;
			break;
		case MEDIUM:
			finalTemp = Temperature.WARM;
			break;
		case OFF:
			finalTemp = Temperature.COLD;
			break;
		default:
			finalTemp = Temperature.COLD;
			break;

		}
		this.timer--;

		if (this.timer == 0 && this.myTemperature != finalTemp) {
			/****
			 * 
			 * This is the part that I am confused on! 
			 * We need to consider the temperature increasing and decreasing
			 * 
			 * 
			 */
		}

	}

	public void display() {

	}

}
