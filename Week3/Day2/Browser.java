package Week3.Day2;


public class Browser {
	
	public void openUrl(String str, String Str1) {
		System.out.println(str + " browser opening " + Str1 + " ....................");
		
		
	}	
public void closeBrowser(String str, String Str1) {
	System.out.println(str + " browser closing " + Str1 + " ....................");
		
	}
public void navigateBack() {
	System.out.println("Navigating back...");
	
}
	

	public static void main(String[] args) {

		
		Chrome chrome = new Chrome();
        chrome.openUrl("chrome","Ver 1.0" );
        chrome.openIncognito();
        chrome.clearCache();
        chrome.navigateBack();
        chrome.closeBrowser("chrome","Ver 1.0");

        System.out.println("-----------------------------");

       
        Edge edge = new Edge();
        edge.openUrl("Edge","Ver 2.0");
        edge.takeSnap();
        edge.clearCookies();
        edge.navigateBack();
        edge.closeBrowser("Edge","Ver 2.0");

        System.out.println("-----------------------------");

      
        Safari safari = new Safari();
        safari.openUrl("Safari","Ver 3.0");
        safari.readerMode();
        safari.fullScreenMode();
        safari.navigateBack();
        safari.closeBrowser("Safari","Ver 3.0");
    }
		 

	}

