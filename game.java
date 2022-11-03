import java.util.Scanner;
import java.util.Random;
public class Game {
	int numDice,trial;
	Random rand;
    Scanner sc;
    public Game(int numDice,int trial) {
    	this.numDice=numDice;
    	this.trial=trial;
    	rand=new Random();
    	sc=new Scanner(System.in);
    }
    	public int play(String who, int target) {
    		int dice[]=new int[numDice];
    		int count=0;
    		for(int i=0;i<trial;i++) {
    			for(int j=0;j<numDice;j++) {
    				dice[j]=rand.nextInt(6)+1;
    			}
    		}
    		System.out.println("Press Enter");
    		sc.nextLine();
    		for (int j: dice) {
    			System.out.println(j+" ")	;	
    		}
    		System.out.println();
    		for(int j=0;j<numDice;j++) {
    			if(dice[j]==target)count++;
    		}
    		System.out.println(who+" gots "+count+" Points");	
 
    	return count;
    }
}
