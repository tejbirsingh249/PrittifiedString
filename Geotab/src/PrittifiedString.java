
public class PrittifiedString {
	
public static String getNumber(double number) {
		
		// Convert the double number to an integer and then to a string
		String convtString = String.valueOf((int) number);
		
	    // Check if the number is greater than or equal to 1 trillion
		if (number >= 1000000000000D) {
			if(number%1000000000000D==0)
				return String.format("%.0fT",number / 1000000000000D);
			else
			// Format the number divided by 1 trillion to one decimal place followed by "T" for trillion
			return String.format("%.1fT", number / 1000000000000D);
		}
	    // If not a trillion, check if the number is greater than or equal to 1 billion
		else if (number >= 1000000000) {
			if(number%1000000000==0)
				return String.format("%.0fB", number / 1000000000);
	        // Format the number divided by 1 billion to one decimal place followed by "B" for billion
			else
				return String.format("%.1fB", number / 1000000000);
        }
		// If not a billion, check if the number is greater than or equal to 1 million
        else if (number >= 1000000) {
        	if(number%1000000==0)
        		return String.format("%.0fM", number / 1000000);
        	// Format the number divided by 1 million to one decimal place followed by "M" for million
        	else
            return String.format("%.1fM", number / 1000000);
        } 
		
		// If the number is Integer, return the integer representation as a string
        else {
            // No need for formatting if there is Integer number
            return convtString;
        }
    }

	public static void main(String[] args) {
		
		 //truncatedString num = new truncatedString();
	    //num.getNumber(1000000000000D);
	    System.out.println("Prettified String for Trillion " + " "+ getNumber(1000000000000D));
	    System.out.println("Prettified String for Billion " + " "+ getNumber(1123456789));
	    System.out.println("Prettified String for Million " + " "+ getNumber(2500000.34));
	    System.out.println("Prettified String for Integer numbers " + " "+ getNumber(532));


	}

}
