package com.coding.java8;

interface del{
    String interfaceSample(String str);
}

 public class newspaper 
{
	 static del str1 = str -> str.replace(',', '*');
	 
	 public static void main(String[] args) {
		 Java c = new Java();
		    c.subject("Hi");
		    c.subject(20);
	 }
	 
}
 
  class Java<S>{
	    public void subject(S arg){
	        System.out.println(arg);
	    }
	}