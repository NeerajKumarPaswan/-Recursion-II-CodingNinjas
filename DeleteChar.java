package advance_recursion;

public class DeleteChar {

	
	public static String removeX(String input){
		// Write your code here
             if(input.length()==0) {
            	 return input;
             }
             
             String smallOutput= removeX(input.substring(1));
             if(input.charAt(0)=='x') {
            	 return ""+smallOutput;
             }else {
            	 return input.charAt(0)+smallOutput;
             }
	}
	public static void main(String[] args) {
		String s="xfbkdbvxxkvxvxvyz";
		System.out.println(removeX(s));
	}

}
