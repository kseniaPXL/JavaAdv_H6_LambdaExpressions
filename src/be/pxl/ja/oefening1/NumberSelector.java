package be.pxl.ja.oefening1;

public class NumberSelector  {
	private  NumberMachine numberMachine;

	public NumberSelector(NumberMachine numberMachine) {
		this.numberMachine = numberMachine;
	}

	public String showEvenNumbers() {
		NumberMachine.NumberFilter filter = (int number) -> {return number % 2 == 0;};
		return numberMachine.processNumbers(filter);
		//throw new UnsupportedOperationException("Implement this method");
	}

	public String printHexNumbers() {
		NumberMachine.BinaryOperator<Integer> convert = Integer::toHexString;
		return numberMachine.convertNumbers(convert);
		//throw new UnsupportedOperationException("Implement this method");
	}

	public String showNumbersAbove(int number) {
		NumberMachine.NumberFilter filter = (int number1) -> {return number < number1;};
		return numberMachine.processNumbers(filter);
		//throw new UnsupportedOperationException("Implement this method");
	}





}
