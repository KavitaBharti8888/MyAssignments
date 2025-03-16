package Assignment3;

public class Chrome extends Browser{

	
	public void openIncongnito() {
		System.out.println("--Open the broswer in incognito mode--");
	}
	public void clearCache() {
		System.out.println("clear the cache");
	}
	public static void main(String[] args) {
		Chrome c1=new Chrome();
		c1.clearCache();
		c1.closeBrowser();
		c1.openIncongnito();
		c1.clearCache();
		c1.navigateBack();
		System.out.println(c1.broswrName);
		System.out.println(c1.browserVersion);
	}
	
}
