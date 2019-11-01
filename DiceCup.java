import java.util.*;

public class DiceCup {
	public static void main(String[] args) {

		Scanner face = new Scanner(System.in);

		int n = face.nextInt();
		int m = face.nextInt();

		if (n == m) {
			int z = n + 1;
			System.out.println(z);
		} else if (n < m) {
			for (int i = ++n; i <= (m + 1); i++) {
				System.out.println(i);
			}
		} else {
			for (int i = ++m; i <= (n + 1); i++) {
				System.out.println(i);
			}
		}

	}
}
