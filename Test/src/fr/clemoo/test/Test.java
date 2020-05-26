package fr.clemoo.test;

public class Test {
	
	public static void main(String[] args) {
		
		System.out.println("Hello world!");
		
		int[]tab = new int[10];
		System.out.println(tab.length);
		for (int i : tab) {
			System.out.println(i);
		}
		String [] tableau = new String[10];
		for (String string : tableau) {
			System.out.println(string);
		}
		
		System.out.println(System.currentTimeMillis());
		
	}

}
