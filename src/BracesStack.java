import java.util.Stack;

public  class BracesStack {
	
	// We first create a boolean method with String parameter
	public static boolean bracesString (String curlyBraces) {
		
		// Create a Stack which consists of character
		
		Stack<Character> curlStacks = new Stack<>();
		
		// Create a for loop and push 
		
		int length = curlyBraces.length();
		int i;
		
		for(i = 0; i< length; i++) {
			
			switch (curlyBraces.charAt(i)) {
			
			case '{':
				curlStacks.push(curlyBraces.charAt(i));
				break;
				
			case '}':
				
				 if(curlStacks.isEmpty()){
				
				return false;
					
			}
			
			curlStacks.pop();
			
			break;
			default: return false;
				
			
		}
		
		
	}
		return curlStacks.empty();

}
	
}
	
