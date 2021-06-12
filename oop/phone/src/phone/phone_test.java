package phone;

public class phone_test {

	public static void main(String[] args) {
		Galaxy s9 = new Galaxy("s9", 99, "verizon", "tun tun tun !!");
		IPhone iphoneten = new IPhone("X", 100, "ATA&T", "zing!");
		s9.displayInfo();
		System.out.println(s9.ring());
		System.out.println(s9.unlock());
		
		iphoneten.displayInfo();
		System.out.println(iphoneten.ring());
		System.out.println(iphoneten.unlock());
		
	}

}
