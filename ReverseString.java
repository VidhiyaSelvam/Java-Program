package practice1;
//Reverse the String Using Loop
public class ReverseString {

	public static String reverseString(String str){  
	    char arr[]=str.toCharArray();  
	    String rev="";  
	    for(int i=arr.length-1;i>=0;i--){  
	        rev+=arr[i];  
	    }  
	    return rev;  
	}

} 

