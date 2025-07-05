/**
 * 
 */
package oop_encapsulation;

/**
 * 
 */
public class Browser {

	public void launchBrowser() {
		System.out.println("Launch Browser");
		checkBrowserVersion();
		checkOSCompatible();
		checkRAMSize();
		checkUpgrade();
		System.out.println("Browser Launched: ");
	}
	
	private void checkBrowserVersion() {
		System.out.println(" checkBrowserVersion ");
	}
	
	private void checkOSCompatible() {
		System.out.println(" checkOSCompatible");
	}
	
	private void checkRAMSize() {
		System.out.println(" checkRAMSize ");
	}
	
	private void checkUpgrade() {
		System.out.println(" checkUpgrade ");
	}
	
}
