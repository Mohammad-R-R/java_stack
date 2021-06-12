package calculator;

public class calculator1 {
private	double setOperandOne;
private	char setOperation;
private	double setOperandTwo;
	
	public calculator1(double setOperandOne, char setOperation, double setOperandTwo) {
	super();
	this.setOperandOne = setOperandOne;
	this.setOperation =  setOperation;
	this.setOperandTwo = setOperandTwo;
}

//public static void main(String[] args) {
//		
//	}

	public double getSetOperandOne() {
		return setOperandOne;
	}


	public void setSetOperandOne(double setOperandOne) {
		
		this.setOperandOne = setOperandOne;
	}


	public double getSetOperation() {
		return setOperation;
	}


	public void setSetOperation(char setOperation) {
		char y ='E';
		if (setOperation=='+'||setOperation=='-') {
			
		}else
			System.out.println("enter the right op");
		this.setOperation = setOperation;
	}


	public double getSetOperandTwo() {
		return setOperandTwo;
	}


	public void setSetOperandTwo(double setOperandTwo) {
		this.setOperandTwo = setOperandTwo;
	}
	
//	public char setOperation(char x ) {
//	char y ='E';
//	if (x=='+'||x=='-') {
//		return x;
//	}else
//		return y;
//}




public double performOperation() {
	double plus =0;
	char x ;
	
	if(getSetOperation()=='+') {
		plus=getSetOperandOne()+getSetOperandTwo();
	}else if (getSetOperation()=='-') {
		plus=getSetOperandOne()-getSetOperandTwo();
		
	}
	return plus;
}

public void getResults() {
	System.out.println(performOperation());
}


}
