import java.util.Scanner; 
public class main {
	public static void main(String[] args) {
		boolean guessing = false;
		System.out.println("Please enter a number.");
		Scanner guessNum = new Scanner(System.in);
		int num = guessNum.nextInt();
		double x = Math.random();
		x *= num;
		x = Math.round(x);
		guessing = true;
		if(guessing) {
			System.out.println("Guess a number between 1 and " + num + ".");
			Scanner guess = new Scanner(System.in);
			num = guess.nextInt();
			guessing = false;
		}
		if(num == x) {
			System.out.println("You guessed right!");
		}
		else {
			System.out.println("You guessed wrong.");
			guessing = true;
		}
	}

}