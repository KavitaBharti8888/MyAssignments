package Assignment3;

public class Edge extends Browser {

	public void takeSnap() {
		System.out.println("take  snap");
	}
	public void clearCookies() {
		System.out.println("clear cookies");
	}
	public static void main(String[] args) {
		Edge e1=new Edge();
		e1.openURL();
		e1.clearCookies();
		e1.closeBrowser();
		e1.takeSnap();
	
	}
	
}
