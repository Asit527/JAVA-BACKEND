package com.kodewala.switchpratice;

public class CheckVowel {

	public CheckVowel() {
		super();
	}

	public void vowel(char c) {
		switch (c) {
		case 'a':
			System.out.println("vowel");
			break;
		case 'e':
			System.out.println("vowel");
			break;
		case 'i':
			System.out.println("vowel");
			break;
		case 'o':
			System.out.println("vowel");
			break;
		case 'u':
			System.out.println("vowel");
			break;
		case 'A':
			System.out.println("vowel");
			break;
		case 'E':
			System.out.println("vowel");
			break;
		case 'I':
			System.out.println("vowel");
			break;
		case 'O':
			System.out.println("vowel");
			break;
		case 'U':
			System.out.println("vowel");
			break;
		default:
			System.out.println("it is a consonant");
			break;
		}

	}

	public static void main(String[] args) {
		CheckVowel obj1 = new CheckVowel();
		obj1.vowel('f');

	}

}
