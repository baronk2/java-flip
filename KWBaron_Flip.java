/*
Kevin Baron
12/20/12
Has Midpoint
*/

import java.util.Random;

public class KWBaron_Flip {
	
	public static void main(String[] args) {
		Random r = new Random();
		flip(r, 2);
		flip(r, 4);
	}//eo main
	
	public static void flip(Random r, int n) {
		int headCount = 0;
		int hOrT;
		while (headCount < n) {
			hOrT = r.nextInt(2);
			if (hOrT == 0) {
				System.out.print("T ");
				headCount = 0;
			} else {
				System.out.print("H ");
				headCount++;
			}//eo if else
		}//eo while
	}//eo flip
	
}//eo class