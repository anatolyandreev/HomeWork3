import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		int i, j, k = 0;
		int temp;

		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите номера строк, подлежащих перестановке\n");
		int str1 = sc.nextInt();
		int str2 = sc.nextInt();

		int[][] twoD = new int[7][5];

		for (i = 0; i < 7; i++) {
			for (j = 0; j < 5; j++) {
				twoD[i][j] = k;
				k++;
			}
		}
		System.out.println(Arrays.deepToString(twoD));
		for (j = 0; j < 5; j++) {
			temp = twoD[str1][j];
			twoD[str1][j] = twoD[str2][j];
			twoD[str2][j] = temp;
		}

		System.out.println(Arrays.deepToString(twoD));
	}
}
