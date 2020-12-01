package com.junittest;

public class Calculator {
	CalculatorService cs;
	public int add(int i,int j) {
		return cs.add(i, j);
	}
	public int sub(int i,int j) {
		return cs.sub(i, j);
	}
	public int mult(int i,int j) {
		return cs.mult(i, j);
	}
	public int div(int i,int j) {
		return cs.div(i, j);
	}
}
