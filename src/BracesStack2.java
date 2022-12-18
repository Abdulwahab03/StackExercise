
public class BracesStack2 {

	public static void main(String[] args) {
		
		String goodBraces = "{}{{{}}}{{}}";
		
		System.out.println("Good(should return true):" + 
		BracesStack.bracesString(goodBraces));
		
		String badBraces = "{}{{{}}{{{}{";
		
		System.out.println("Bad(should return false):" +
		BracesStack.bracesString(badBraces));
		
		

	}

}
