package com.kodewala.calculator;

import com.kodewala.corecalculator.*;

public class Calculation {
	public static void main(String[] args) {
		Addition ad = new Addition();

		Substraction sb = new Substraction();

		Multiplication ml = new Multiplication();

		Division dv = new Division();

		System.out.println(ad.add(2, 2));
		System.out.println(sb.subdtraction(2, 2));
		System.out.println(ml.multiplication(2, 2));
		System.out.println(dv.division(2, 2));


	}
}
