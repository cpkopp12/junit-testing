package com.in28minutes.juint;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.in28minutes.junit.MyMath;

class MyMathTest {
	
	private MyMath math = new MyMath();

	@Test
	void calculateSum_ThreeMemberArray() {
		assertEquals(6, math.calculateSum(new int[] {1,2,3}));
	}
	
	@Test
	void calculateSum_ZeroLenthArray() {
		assertEquals(0, math.calculateSum(new int[] {}));
	}
	
	

}
