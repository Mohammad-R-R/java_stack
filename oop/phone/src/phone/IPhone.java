package phone;

public  class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    public String ring() {
    	 return "ipone  "+getVersionNumber()+" Says "+getRingTone();    }
    public String unlock() {
    	return "Unlocking via finger print";
    }
    @Override
    public void displayInfo() {
        System.out.println("ipohne "+getVersionNumber()+" from "+getCarrier());
           
    }
}

