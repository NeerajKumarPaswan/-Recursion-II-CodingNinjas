package advance_recursion;

public class FindAndReplace {

	public static String replaceChar(String s,char x,char y) {
		if(s.length()==0) {
			return s;
		}
	    String smallOutput=	replaceChar(s.substring(1), x, y);
		if(s.charAt(0)==x) {
			return y+smallOutput;
		}else {
			return s.charAt(0)+smallOutput;
		}
	}
	public static void main(String[] args) {
	
	String s="abcd";
	String finalresult =replaceChar(s,'a','x');
	System.out.println(finalresult);
}
}
