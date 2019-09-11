
/**
 * eBurner Class
 * 
 * @author Rob
 * @author Jo
 *
 */

public class Burner {

	public enum Temperature {
		BLAZING(3), HOT(2), WARM(1), COLD(0);
		
		private int value;
		
		private Temperature(int value) {
			this.value = value;
		}
		
		public int getValue() {
			return this.value;
		}
		
		
		
		@Override
		public String toString() {
			switch(value) {
			case 0:
				return "cooool";
			case 1:
				return "warm";
			case 2:
				return "CAREFUL";
			case 3:
				return "VERY HOT! DO NOT TOUCH";
			default:
				return "ERROR";
				
			
			}
		}
		
		
		
		
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
		timer += TIME_DURATION;
		

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
		timer += TIME_DURATION;
		
		
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
			finalTemp = Temperature.WARM;
			break;
		case MEDIUM:
			finalTemp = Temperature.HOT;
			break;
		case OFF:
			finalTemp = Temperature.COLD;
			break;
		default:
			finalTemp = Temperature.COLD;
			break;

		}
		this.timer--;

		if (this.timer % 2 == 0 && this.myTemperature != finalTemp) {
		//if (this.myTemperature != finalTemp) {
			if (myTemperature.getValue() > finalTemp.getValue()) {
				switch(myTemperature) {
				case BLAZING:
					this.myTemperature = Temperature.HOT;
					break;
				case COLD:
					this.myTemperature = Temperature.COLD;
					break;
				case HOT:
					this.myTemperature = Temperature.WARM;
					break;
				case WARM:
					this.myTemperature = Temperature.COLD;
					break;
				default:
					break;
				
				}
			} else {
				switch(myTemperature) {
				case BLAZING:
					this.myTemperature = Temperature.BLAZING;
					break;
				case COLD:
					this.myTemperature = Temperature.WARM;
					break;
				case HOT:
					this.myTemperature = Temperature.BLAZING;
					break;
				case WARM:
					this.myTemperature = Temperature.HOT;
					break;
				default:
					break;
				
				}
				
			}
			if(this.myTemperature != finalTemp) {
				this.timer = TIME_DURATION;
			}
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
		System.out.println(this.mySetting.toString()+"....."+this.myTemperature.toString());

	}

}
