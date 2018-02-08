import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Task4 {

	public static void main(String[] args) {
		int[][] twoD = new int[7][5];
		int i, j, k = 0;
		for (i = 0; i < 7; i++) {
			for (j = 0; j < 5; j++) {
				twoD[i][j] = ThreadLocalRandom.current().nextInt(0, 199);
			}
		}
		System.out.println(Arrays.deepToString(twoD));
		int cifra, sumCifra;
		for (i = 0; i < 7; i++) {
			for (j = 0; j < 5; j++) {
				if (twoD[i][j] > 9 && twoD[i][j] < 99) {
					if (twoD[i][j] % 10 == 0) {
						sumCifra = twoD[i][j] / 10;
					} else {
						sumCifra = twoD[i][j]/10 + twoD[i][j] % 10;
						if (sumCifra % 2 == 0) {
							System.out.println("Сумма цифр равна = " + sumCifra + " номер элемента массива [" + i + "] [" + j + "]");
							k++;
						}
					}
				}
			}
		}
		System.out.println("\nколичество цифр " + k);
	}
}
