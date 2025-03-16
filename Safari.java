package Assignment3;

public class Safari extends Browser{

	
	public void readerMode() {
		System.out.println("Read Mode");
	}
	public void fullScreenMode() {
	System.out.println("full Screen Mode");	
	}
	
	public static void main(String[] args) {
		Safari s1=new Safari();
	
		s1.openURL();
		s1.readerMode();
		s1.fullScreenMode();
		s1.closeBrowser();
	}
}
