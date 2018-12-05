import java.util.Scanner; 
public class main {
	public static void main(String[] args) {
		boolean guessing = false;
		System.out.println("Please enter a highest number.");
		Scanner guess = new Scanner(System.in);
		int x = Math.round(Math.random()* guess.nextInt());
		guessing = true;
		while(guessing) {
			System.out.println("Guess a number between 1 and " + x + ".");
			num = guess.nextInt();
			if(num == x) {
				System.out.println("You guessed right!");
				guessing = false;
			}
			else {
				System.out.println("You guessed wrong.");
			}
		}
	}

}
