import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Task3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Введити число\n");
		int num = sc.nextInt();

		int[][] twoD = new int[7][5];
		int i, j, k = 0;
		for (i = 0; i < 7; i++) {
			for (j = 0; j < 5; j++) {
				twoD[i][j] = ThreadLocalRandom.current().nextInt(0, 10);
			}
		}
		System.out.println(Arrays.deepToString(twoD));
		for (i = 0; i < 7; i++) {
			for (j = 0; j < 5; j++) {
				if (twoD[i][j] == num) {
					k++;
				}
			}
		}
		System.out.println("Число " + num + " встречается в матрице " + k + " раз");

	}
}
