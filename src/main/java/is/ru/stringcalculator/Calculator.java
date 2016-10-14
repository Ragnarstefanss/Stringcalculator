package is.ru.stringcalculator;
import java.util.*;

public class Calculator {

	public static int add(String text){
	
		if(text.equals("")){
			return 0;
		}
		else if(text.contains(",")){

			return sum(splitNumbers(text));
		}
		else
			return 1;
	}

	private static int toInt(String number){
			return Integer.parseInt(number);
	}

	private static String[] splitNumbers(String numbers){
	   return numbers.split(",|\n");
	}
 	
    private static int sum(String[] numbers){
		int total = 0;
		List negative_numbers = new ArrayList();

	    for(String number : numbers){
	    	int newNumber = toInt(number);
	    	if(newNumber < 0) {
	    		negative_numbers.add(newNumber);
	    	}
	    	else if (newNumber > 0 && newNumber < 1000) {
	    		total += newNumber;
	    	}
		}

		if (negative_numbers.size() > 0){
			System.out.println("Negatives not allowed:" + negative_numbers);
		}
		return total;
    }
}