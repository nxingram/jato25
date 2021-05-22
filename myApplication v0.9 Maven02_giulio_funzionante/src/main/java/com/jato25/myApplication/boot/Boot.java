package com.jato25.myApplication.boot;

import com.jato25.myApplication.controller.App;

public class Boot {

	private static String componentName = Boot.class.getSimpleName();
	
	
	public static void main(String[] args) {
		
		System.out.println("#"+componentName+ " - Started");
		
		App app = new App();
		
		System.out.println("#"+componentName + " - Terminate with exitCode :" + app.exitCode  );
		
	}

}
