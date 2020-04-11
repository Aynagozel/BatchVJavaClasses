package com.class20;

public class AccesModifier {
	private String privateAcces() {
		String str="private";
		return str;
	}
	String defaultAccess() {
		String str="default";
		return str;
	}
	protected String protectedAccess() {
		String str="protected";
		return str;
	}
	public String publicAccess() {
		String str="public";
		return str;
	}
	public static void main(String[] args) {
		 AccesModifier main=new  AccesModifier();
		 System.out.println(main.privateAcces()+" ,"+main.defaultAccess()+" ,"+main.protectedAccess()+" ,"+main.publicAccess());
	}
}
