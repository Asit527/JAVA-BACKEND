package com.kodewala.abstractclass1;

abstract class Electronic {

	void itemName() {
		System.out.println("Product :A");
		System.out.println("Product :B");
		System.out.println("Product :C");
	}

	abstract double totalPrice();
}

abstract class Grocery {

	void itemName() {
		System.out.println("Item :A");
		System.out.println("Item :B");
		System.out.println("Item :C");
	}

	abstract double totalPrice();

}

class ElectronicPriceCalculator extends Electronic {

	char[] totalItemsList;
	double totalPrice = 0;

	double totalPrice() {
		for (int i = 0; i < totalItemsList.length; i++) {
			switch (totalItemsList[i]) {
			case 'A':
				
				break;
			case 'B':

				break;
			case 'C':

				break;

			default:
				System.out.println("Eneter a valid Product");
				break;
			}
		}
		return 0;
	}
}

class GroceryPriceCalculator extends Grocery {
	char[] totalItems;

	double totalPrice() {

		return 0;
	}
}

class PriceCalculator {
	public static void main(String[] args) {
		ElectronicPriceCalculator obj1 = new ElectronicPriceCalculator();
		obj1.totalPrice();
		ElectronicPriceCalculator obj2 = new ElectronicPriceCalculator();

	}

}
