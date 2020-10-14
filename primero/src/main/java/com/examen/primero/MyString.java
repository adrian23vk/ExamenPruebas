package com.examen.primero;

public class MyString {

	String mystring;
	public MyString(String s) {
		this.mystring=s;
	}

	public int compareTo(MyString segundo) {

		int i;
		if(this.mystring.length()<=segundo.mystring.length()) {
			for(i=0;i<this.mystring.length();i++) {
				if((this.mystring.charAt(i)-segundo.mystring.charAt(i))<0) {
					return -1;
				}else if ((this.mystring.charAt(i)-segundo.mystring.charAt(i))>0){
					return 1;
				}
			}
			if (this.mystring.length()< segundo.mystring.length()) {
				return -1;
			}else {
				return 0;
			}

		}else {
			for(i=0;i<segundo.mystring.length();i++) {
				if((this.mystring.charAt(i)-segundo.mystring.charAt(i))<0) {
					return -1;
				}else if ((this.mystring.charAt(i)-segundo.mystring.charAt(i))>0){
					return 1;
				}
			}
			if(this.mystring.length() > segundo.mystring.length()) {
				return 1;
			}else {
				return 0;
			}
		}

	}

	public static void main (String[] args) {
		MyString s = new MyString("hola");
		MyString s2 = new MyString("hola");

		System.out.println(s.compareTo(s2));



	}
}
