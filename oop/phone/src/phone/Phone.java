package phone;

public abstract class Phone {
    private String versionNumber;
    private int batteryPercentage;
    private String carrier;
    private String ringTone;
    public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone){
        this.versionNumber = versionNumber;
        this.batteryPercentage = batteryPercentage;
        this.carrier = carrier;
        this.ringTone = ringTone;
    }
    public String getVersionNumber() {
		return versionNumber;
	}
	
	public int getBatteryPercentage() {
		return batteryPercentage;
	}
	
	public String getCarrier() {
		return carrier;
	}

	
	public String getRingTone() {
		return ringTone;
	}
	
	// abstract method. This method will be implemented by the subclasses
    public abstract void displayInfo();
    // getters and setters removed for brevity. Please implement them yourself
	public String unlock() {
		// TODO Auto-generated method stub
		return null;
	}
	public String ring() {
		// TODO Auto-generated method stub
		return null;
	}
}

