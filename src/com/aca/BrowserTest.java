package com.aca;

public class BrowserTest {

	public static void main(String[] args) {

	new BrowserTest().demo();
	new BrowserTest().displayEnum(BrowserType.Chrome);
	
	}

	public void demo(){
		for(BrowserType t : BrowserType.values()){
			System.out.println("Browser: " + t + " Owner: " + t.getOwnerName());
		}
	}
	
	private void displayEnum(BrowserType bt){
		switch(bt){
			case IE:
				System.out.println("throw up...."); break;
			case Chrome:
				System.out.println("Best one out there");break;
			case Firefox: 
				System.out.println("nope"); break;
		}
	}
	
	
	
//	public enum BrowserType { IE("Microsoft"), Chrome("Google"), Firefox();
//
//		private String ownerName;
//		
//		private BrowserType(String ownerName){
//			this.ownerName= ownerName;
//		}                                                                     can have enums and even classes inside of other classes, not recommended though
//		private BrowserType(){
//			ownerName = "Don't Care";
//		}
//
//		public String getOwnerName() {
//			return ownerName;
//		}
//	} 
}
