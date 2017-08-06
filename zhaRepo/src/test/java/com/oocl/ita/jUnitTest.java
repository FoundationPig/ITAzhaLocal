package com.oocl.ita;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class jUnitTest {

	@Test
	public void testExcer1() {
		excer1 e = new excer1();
		String[] result = { "one", "two", "three" };
		assertArrayEquals(e.getExcer1Result(), result);
	}

	@Test
	public void testExcer2() {
		excer1 e = new excer1();
		assertEquals(8, e.getExcer2Value());
	}

	@Test
	public void testExcer3() {
		excer1 e = new excer1();
		assertEquals(26, e.getExcer3Value());
	}

	@Test
	public void testExcer4() {
		excer1 e = new excer1();
		assertEquals(4,e.getExcer4Value());
	}
	
	@Test
	public void testExcer6() {
		excer1 e = new excer1();
		Double[] arr = {0.5,0.75,1.0,1.25,0.75,1.0,1.25,1.5,1.0,1.25,1.5,1.75,1.25,1.5,1.75,2.0};
		assertArrayEquals(arr,e.getExcer6Value(4));
	}
	
	@Test
	public void testExcer7() {
		excer1 e = new excer1();
		int[] xs = {62,31,10,2,0,5};
		assertArrayEquals(xs, e.getExcer7Value(60));
	}
	
	@Test
	public void testExcer10a() {
		excer1 e = new excer1();
		String[] x = {"in for:9.0","in for:9.5","in for:10.0","after for10.5"};
		assertArrayEquals(x, e.getExcer10aValue());
	}
	
	@Test
	public void testExcer10b() {
		excer1 e = new excer1();
		String[] x = {"Main before p1: 10","In p1: 100" ,"Main before p2: 100" ,"In p2: 20" ,"Main at the end: 20" ,"-----" ,"Main before p1: 30" ,"In p1: 600" ,"Main before p2: 600" ,"In p2: 120" ,"Main at the end: 120"};
		assertArrayEquals(x,e.getExcer10bValue());
	}
	
	@Test
	public void testExcer10c() {
		excer1 e = new excer1();
		String[] x = {"*","*","*","*","*"};
		assertArrayEquals(x,e.getExcer10cValue());
	}
	
	@Test
	public void testExcer10d() {
		excer1 e = new excer1();
		String[] x = {"true, false, false","true, true, false","false, true, false","false, false, false"};
		assertArrayEquals(x,e.getExcer10dValue());
	}
	
	@Test
	public void testExcer10e() {
		excer1 e = new excer1();
		assertEquals("cartoon",e.getExcer10eValue());
	}
	

}
