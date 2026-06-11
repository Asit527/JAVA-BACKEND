package com.kodewala.interfacee2;

public interface Converter {
void convert(double num1);
static void round(double num2) {
	System.out.println((long)num2);
}
default void convertAndRound(double num3) {
	convert(num3);
	round(num3);
}

}
