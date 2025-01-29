package studio2;

import java.util.Random;

public class Ruin {

	public static void main(String[] args) {
		
		int startAmount = 50;
		int winLimit = 75;
		double winChance = 0.45;
		int totalSimulations = 0;
		
		Random random = new Random();
		while (startAmount >0 && startAmount < 75) {
			totalSimulations++;
			double outcome = random.nextDouble();
			if (outcome < 0.45) {
				startAmount++;
				System.out.println("The " + totalSimulations + "simulation wins 1 dollar, current amout is " + startAmount);
			}else {
				startAmount--;
				System.out.println("The " + totalSimulations + "simulation loses 1 dollar, current amount is " + startAmount);
			}
			if (startAmount == winLimit) {
				System.out.println("Win, simulations in all is " + totalSimulations);
				}else if (startAmount == 0)
					System.out.println("Ruins, simulations in all is " + totalSimulations);
			}
		
			
		}

	}

