package com.abhinay.switch$programs;

public class Switch_Case_Example_Using_Enum {
	/*
	 * Enum or enumerator’s purpose is to represent a group, a set of known
	 * constants. For example, 4 seasons in a year, planets in the solar system or
	 * house numbers in a gated colony.
	 * 
	 * In Java, enums can also have methods, constructors and variables and they can
	 * be declared inside or outside the Main class.
	 */

	public enum Fruits {
		Apple, Banana, Ber, Orange, Pineapple;
	}

	public static void main(String[] args) {
		Fruits favouriteFruit = Fruits.Orange;
		switch (favouriteFruit) {
		case Apple:
			System.out.println("Your Favourite Fruit is ----> " + favouriteFruit);
			break;
		case Banana:
			System.out.println("Your Favourite Fruit is ----> " + favouriteFruit);
			break;
		case Ber:
			System.out.println("Your Favourite Fruit is ----> " + favouriteFruit);
			break;
		case Orange:
			System.out.println("Your Favourite Fruit is ----> " + favouriteFruit);
			break;
		case Pineapple:
			System.out.println("Your Favourite Fruit is ----> " + favouriteFruit);
			break;
		default:
			System.out.println("You do not have any Favourite Fruit.");
			break;
		}
	}
}
