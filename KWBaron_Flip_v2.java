/*
Kevin Baron
12/20/12
Flip
*/

import java.util.Random;

public class KWBaron_Flip_v2 {
	
	public static void main(String[] args) {
		Random r = new Random();
		flip(r, 2);
		flip(r, 4);
	}//eo main
	
	public static void flip(Random r, int n) {
		System.out.print("flips:");
		int headCount = 0;
		int hOrT;
		while (headCount < n) {
			hOrT = r.nextInt(2);
			if (hOrT == 0) {
				System.out.print(" T");
				headCount = 0;
			} else {
				System.out.print(" H");
				headCount++;
			}//eo if else
		}//eo while
		System.out.println();
	}//eo flip
	
}//eo class