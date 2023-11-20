package practice1;

public class RemoveSpecific {
	public static void main(String[] args) {  
        String str = "Hi My name is Vidhiya Selvam";  
        System.out.println(charRemoveAt(str, 7));  
     }  
     public static String charRemoveAt(String str, int p) {  
        return str.substring(0, p) + str.substring(p + 1);  
     }  

}
