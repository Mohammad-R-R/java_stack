package calculator;

public class calculator_main {

	public static void main(String[] args) {
		calculator1 c =new calculator1(0,'+', 0);
		c.setSetOperandOne(10.5);
		c.setSetOperation('+');
		c.setSetOperandTwo(5.2);
		c.performOperation();
		c.getResults();
		
		
	}

}
