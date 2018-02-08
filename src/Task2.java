import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Task2 {

	public static void main(String[] args) {
		int[][] twoD = new int[7][5];
		int i, j, k = 0;
		for (i = 0; i < 7; i++) {
			for (j = 0; j < 5; j++) {
				twoD[i][j] = ThreadLocalRandom.current().nextInt(0, 1000);
			}
		}
		System.out.println(Arrays.deepToString(twoD));
		for (j = 0; j < 5; j++) {
			int max = 0;
			for (i = 0; i < 7; i++) {
				if (twoD[i][j] > max) {
					max = twoD[i][j];
				}
			}
			System.out.println(max);
		}
	}
}
