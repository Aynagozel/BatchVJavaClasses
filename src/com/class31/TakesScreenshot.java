package com.class31;

	public interface  TakesScreenshot {
		
		void openBrowser();

		void closeBrowser();

		void maximazeWindow();

		void findElement();
	}

	abstract class Browser {

		String name;
		public abstract void refresh();
	}
	