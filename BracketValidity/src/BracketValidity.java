
public class BracketValidity {
	
	public static void main(String[] args){
		BracketValidity test = new BracketValidity();
		System.out.print(test.isBalanced("{[(())]()}")); //should return true
		System.out.print("\n");
		System.out.print(test.isBalanced("{[(()])()}")); //should return false
		System.out.print("\n");
		System.out.print(test.isBalanced("()")); //should return true
		System.out.print("\n");
		System.out.print(test.isBalanced("")); //should return true
		System.out.println();
		
	}
	
	
	
	public boolean isBalanced(String input){
		boolean temp = true;
		String tempStr = "";
		// create a custom stack with values for each type of bracket, add to end when a new open bracket is shown
		//and take from end when a close bracket is shown
		
		for (int i = 0; i < input.length(); i++){
			//start by adding the symbols to a temporary string which I am treating as a stack
			if (input.charAt(i) == '{'){
				tempStr = tempStr + "{";
			}
			if (input.charAt(i) == '['){
				tempStr = tempStr + "[";
			}
			if (input.charAt(i) == '('){
				tempStr = tempStr + "(";
			}
			
			if (input.charAt(i) == '}'){
				if (tempStr.charAt(tempStr.length()-1) != '{'){
					
					temp = false;
				
				}
				else{
					tempStr = tempStr.substring(0, tempStr.length()-1);
				}
					
			}
			if (input.charAt(i) == ']'){
				if (tempStr.charAt(tempStr.length()-1) != '['){
					
					temp = false;
				
				}
				else{
					tempStr = tempStr.substring(0, tempStr.length()-1);
				}
				
			}
			if (input.charAt(i) == ')'){
				if (tempStr.charAt(tempStr.length()-1) != '('){
					
					temp = false;
				
				}
				else{
					tempStr = tempStr.substring(0, tempStr.length()-1);
				}
			}
			
		}
		//if tempStr isnt empty then its invalid
		
		if (!(tempStr.isEmpty())){
			temp = false;
		}
		
		
		
		
		
		return temp;
	}
}
