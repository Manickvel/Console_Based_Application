import java.util.Random;
import java.util.Scanner;

class RandomNumberGenerator{
	int RandomNumber;
	Random rand = new Random();
	int RandNum() {
		RandomNumber = rand.nextInt(100);
		return RandomNumber;
	}
}
class RandomNumberUserInput{
	Scanner sc = new Scanner(System.in);
	int UserGuessedNumber;
	int UserNumber() {
		UserGuessedNumber=sc.nextInt();
		return UserGuessedNumber;
	}
}
class NumberChecker{
	RandomNumberGenerator rng = new RandomNumberGenerator();
	RandomNumberUserInput rni = new RandomNumberUserInput();
	Scanner sc = new Scanner(System.in);
	int chance,rannumg,usergnum,RoundWon=0;
	void checker() {
		System.out.println("How Many Chance you Want to guess a Number from 1 to 100");
		chance = sc.nextInt();
		rannumg=rng.RandNum();
		for(int i=0;i<chance;i++) {
			System.out.println("Please Enter Your Guessing Number");
			usergnum = rni.UserNumber();
			if(rannumg==usergnum) {
				System.out.println("CONGRATULATIONS!!! You Guessed the Correct Number and the Number is " + rannumg + " and You Guessed in "+ (i+1) + " Chance");
				RoundWon++;
				break;
			}
			else if(usergnum>rannumg){
				System.out.println("Your Guessed Number is TOO HIGH and TRY with the Some SMALL Number");
			}
			else if(usergnum<rannumg) {
				System.out.println("Your Guessed Number is TOO SMALL and TRY with the Some BIG Number");
			}
		}
		System.out.println("The Number that need To be Guessed is " + rannumg);
		
	}
}
class PlayingGame{
	NumberChecker nc = new NumberChecker();
	Scanner sc = new Scanner(System.in);
	int Round=0;
	char Playing(char m) {
		while( m == 'Y' || m =='y' ){
			nc.checker();
			System.out.println("You Want to Play a Another Game [Y/N] ");
			Round++;
			char option = sc.next().charAt(0);
			return Playing(option);
		}
		return 'N';
	}
}
public class NumberGame {

	public static void main(String[] args) {
		PlayingGame pg = new PlayingGame();
		Scanner sc = new Scanner(System.in);
		System.out.println("You Want to Play a Guessing Number Game [Y/N] ");
		char option = sc.next().charAt(0);
		pg.Playing(option);
		System.out.printf("You Played %d Round and You Won %d Round\nThanks for Playing My Game...",pg.Round,pg.nc.RoundWon);
		sc.close();
	}

}
