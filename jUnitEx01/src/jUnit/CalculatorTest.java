package jUnit;

// jUnit을 사용하지 않고 테스트
public class CalculatorTest {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		
		double result = c.sum(10, 20);

//		if(result != 30) {
//			System.err.println("err : " + result);
//		}
		
		result = c.sum(1.1, 2);
		
//		if(result != 3.1) {
//			System.err.println("err : " + result);
//		}
		
		result = c.sum(1.1, -2);
		
		if(result != -0.9) {
			System.err.println("err : " + result);
		}
		
		
		
		
		
	}
}
