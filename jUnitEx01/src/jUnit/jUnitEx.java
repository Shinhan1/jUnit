package jUnit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

// jUnit을 사용하여 테스트
public class jUnitEx {
	@Test
	public void test() {
		Calculator c = new Calculator();
		
		double result = c.sum(10, 20);
		assertEquals(30, result, 0);
		
		// 단정함수 : assertEqual(p1, p2, p3)
		// p1 : 기대값(예상값), p2 : 결과값 변수(실제값), p3: 오차 범위(적용범위) -> 오차범위 시간도 가능
		
		
//		if(result != 30) {
//			System.err.println("err : " + result);
//		}
		
		result = c.sum(1.1, 2);
		assertEquals(3.1, result, 0);
		
//		if(result != 3.1) {
//			System.err.println("err : " + result);
//		}
		
		result = c.sum(1.1, -2);
		assertEquals(-0.9, result, 0.01);
		
//		if(result != -0.9) {
//			System.err.println("err : " + result);
//		}
		
		if(result >= -0.89 && result <= -0.9 ) {
			System.err.println("err : " + result);
		}
		
	}

}
