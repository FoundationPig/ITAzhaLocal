package com.oocl.ita;

import java.util.ArrayList;

public class excer1 {
	static int value = 10;
	static int ctrx = 0;
	static String[] theRes = new String[11];

	public String[] getExcer1Result() {
		String[] result = new String[3];
		int i = 1;
		for (int j = 0; j < 5; j = j + 2) {
			i = (i * i) + j;
		}
		switch (i) {
		case 3:
			System.out.println("zero");
			break;
		case 13:
			result[0] = "one";
		case 175:
			result[1] = "two";
		default:
			result[2] = "three";
		}

		return result;

	}

	public int getExcer2Value() {
		int n;
		int F_0 = 1, F_1 = 1;
		int F_n = 0;
		n = 5;
		for (int i = 1; i < n; i++) {
			F_n = F_0 + F_1;
			F_0 = F_1;
			F_1 = F_n;
		}

		return F_n;
	}

	public int getExcer3Value() {

		int inner = 2, outer = 2;
		int result = 0;
		int i = 0, j = 0;
		while (i < outer) {
			j = 0;
			while (j < inner) {
				result = result * result + 1;
				j++;
			}
			i++;
		}

		return result;
	}

	public int getExcer4Value() {
		int x = 3;
		int y = 10;
		int ctr = 0;
		while (x < y) {
			x = x + 1;
			y = y - 1;
			ctr++;
		}
		return ctr;
	}

	public Double[] getExcer6Value(double n) {
		double result;
		int ctr = 0;
		Double[] ret = new Double[(int) (n * n)];
		for (double i = 1; i <= n; i++) {
			for (double j = 1; j <= n; j++) {
				result = i / n + j / n;
				ret[ctr] = result;
				ctr++;
			}
		}
		return ret;
	}

	public int[] getExcer7Value(int integer_value) {

		int[] xs = new int[6];
		int ctr = 0;
		boolean done = false;
		int count = 1;
		int current = integer_value + 2;
		while (!done) {
			current = current / count;
			xs[ctr] = current;

			if (current % 3 == 0)
				done = true;
			else if (current < 1)
				done = true;
			else {
				count += 1;
				ctr++;
			}

		}
		ctr++;
		xs[ctr] = count;
		return xs;
	}

	public String[] getExcer10aValue() {
		String[] x = new String[4];
		int ctr = 0;
		double count;
		int limit;
		count = 9.0;
		limit = 43 / 4;
		for (; count <= limit; count = count + 0.5) {
			System.out.println("in for:" + count);
			x[ctr] = "in for:" + count;
			ctr++;
		}
		System.out.println("after for" + count);
		x[ctr] = "after for" + count;

		return x;

	}

	public String[] getExcer10bValue() {

		System.out.println("Main before p1: " + value);
		theRes[ctrx] = "Main before p1: " + value;
		ctrx++;
		value = p1(value);
		System.out.println("Main before p2: " + value);
		theRes[ctrx] = "Main before p2: " + value;
		ctrx++;
		value = p2(value);
		System.out.println("Main at the end: " + value);
		theRes[ctrx] = "Main at the end: " + value;
		ctrx++;
		System.out.println("-----");
		theRes[ctrx] = "-----";
		ctrx++;
		int value = 30;
		System.out.println("Main before p1: " + value);
		theRes[ctrx] = "Main before p1: " + value;
		ctrx++;
		value = p1(value);
		System.out.println("Main before p2: " + value);
		theRes[ctrx] = "Main before p2: " + value;
		ctrx++;
		value = p2(value);
		System.out.println("Main at the end: " + value);
		theRes[ctrx] = "Main at the end: " + value;
		ctrx++;

		return theRes;

	}

	static int p1(int input) {
		value = input * value;
		System.out.println("In p1: " + value);
		theRes[ctrx] = "In p1: " + value;
		ctrx++;
		return value;
	}

	static int p2(int input) {
		int value = 5;
		value = input / value;
		System.out.println("In p2: " + value);
		theRes[ctrx] = "In p2: " + value;
		ctrx++;
		return value;
	}

	public static void main(String args[]) {
		boolean a, b, c;
		a = true;
		b = false;
		c = false;
		System.out.println(a + ", " + b + ", " + c);
		do {
			if (b == c)
				b = a;
			else if (a == c)
				b = c;
			else
				a = c;
			System.out.println(a + ", " + b + ", " + c);
		} while (a || b || c);

	}

	public String[] getExcer10cValue() {
		String[] sx = new String[5];
		int ctr = 0;
		int value = 5;
		int value2 = 1;
		while (value2 < 4) {
			for (; value >= value2; value--) {
				System.out.println("*");
				sx[ctr] = "*";
				ctr++;
			}
			value2++;
		}
		return sx;
	}

	public String[] getExcer10dValue() {
		String[] res = new String[4];
		int ctr = 0;
		boolean a, b, c;
		a = true;
		b = false;
		c = false;
		System.out.println(a + ", " + b + ", " + c);
		res[ctr] = a + ", " + b + ", " + c;
		ctr++;
		do {
			if (b == c)
				b = a;
			else if (a == c)
				b = c;
			else
				a = c;
			System.out.println(a + ", " + b + ", " + c);
			res[ctr] = a + ", " + b + ", " + c;
			ctr++;
		} while (a || b || c);

		return res;
	}

	public String getExcer10eValue() {
		int one = 2;
		int two = 2;
		int three = 3;
		String result = "";
		do {
			one++;
			System.out.print("cart");
			result+="cart";
		} while (one < 3);
		for (int i = 0; i < two; i++) {
			System.out.print("o");
			result+="o";

		}
		while (true) {
			three++;
			if (three == 5) {
				break;
			}
			System.out.print("n");
			result+="n";
		}
		
		return result;
	}

}
