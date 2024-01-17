package com.useacabeça.capitulo1;

public class Main {

	public static void main(String[] args) {
		int berrNum = 99;
		String word = "bottles";
		while (berrNum >0){
			if (berrNum == 1){
				word = "bootle";
			}
			System.out.println(berrNum +" "+ word + " of beer on the wall");
			System.out.println(berrNum +" "+ word + " of beer.");
			System.out.println(berrNum +" Take one down");
			System.out.println(berrNum + " Pass it around");
			berrNum = berrNum - 1;
			if (berrNum > 0){
				System.out.println(berrNum +" "+ word + " of beer on the wall");
			}else {
				System.out.println("No more bottles of beer on the wall");
			}
		}

	}

}

