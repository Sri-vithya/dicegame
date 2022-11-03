import java.util.Random;
import java.util.Scanner;
import java.util.Scanner;
public class Diver {
 public static void main(String args[]) {
	 int numDice=3, trial=3;
	 int playercount=0,computercount=0;
	 Random choose=new Random();
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Choose Your Target Number");
	 int playertarget=sc.nextInt();
	 
	Game player=new Game(numDice,trial) ;
	playercount=player.play("Player",playertarget);
	int computertarget=choose.nextInt(6)+1;
	System.out.println("Computer target "+computertarget);
	Game computer=new Game(numDice,trial) ;
	computercount=computer.play("Computer",computertarget);
	if(playercount>computercount) {
		 System.out.println("You win");
	}
	else if(playercount<computercount) {
		 System.out.println("Computer win");
			}
	else  System.out.println("Draw");
	
	
		sc.close();
 }
}
