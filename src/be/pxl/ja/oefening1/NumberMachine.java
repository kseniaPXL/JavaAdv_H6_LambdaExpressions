package be.pxl.ja.oefening1;

import java.util.ArrayList;
import java.util.function.BinaryOperator;

public class NumberMachine {

	private ArrayList<Integer> numbers = new ArrayList<>();

	public NumberMachine(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			this.numbers.add(numbers[i]);
		}
	}
	@FunctionalInterface
	public interface NumberFilter{
		public boolean check(int number);
	}
	/// functionale interface binary operator
	public interface BinaryOperator<T>{
		 String convertInteger(int getal);
	}
	//methos opdr3
	public String convertNumbers(BinaryOperator<Integer> convert )  {
		StringBuilder result = new StringBuilder(convert.convertInteger(numbers.get(0)));
		for(int i=1;i<numbers.size();i++) {
			result.append("-");
			result.append(convert.convertInteger(numbers.get(i)));
			}

		return result.toString();
	}

	//TODO: uncomment this method after the NumberFilter interface is created.
	public String processNumbers(NumberFilter filter)  {
		String result = "";
		for(int i=0;i<numbers.size();i++) {
			if(filter.check(numbers.get(i))) {
				if(!result.equals("")) {
					result += "-";
				}
				result += numbers.get(i);
			}
		}
		return result;
	}

}
