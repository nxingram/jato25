package com.jato25.myApplication;

public class Boot {

	// variabile privata
	private static String componentName = "Boot";
	
	public static void main(String[] args) {
		
		System.out.println("#" + componentName + " - Initializing...");
		
		App app = new App();

		System.out.println("#" + componentName + " - Started " + app.toString());
	}

}
