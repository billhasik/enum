package com.aca;

public class WinProductTest {

	private WinProduct prod; //could take any of the values defined in WinProduct  ||||| doesn't need to have 'new' on it.
	
	public static void main(String[] args) {

//		WinProduct prod1 = WinProduct.DISH;
//		WinProduct prod2 = WinProduct.HSI;
//		
//		printEnum(prod1);
//		printEnum(prod2);
		
		for(WinProduct p : WinProduct.values()){
			System.out.println("WinProduct value: " + p);
		}
		
		String s = "HSII" ;
		WinProduct w2;
		try {
			w2 = WinProduct.valueOf(s);
		} catch (Exception e) {
			w2 = WinProduct.DISH ;
		}
		System.out.println("WinProduct w2: " + w2);
		
	}

	public static void printEnum(WinProduct x){
		System.out.println("WinProduct: " + x.getItemNumber() + "------->" + x);
	}
}
