import java.util.*;

public class QuadrantSelection {
	public static void main(String[] args) {
		Scanner values = new Scanner(System.in);
		int x = values.nextInt();
		int y = values.nextInt();

		if (x > 0 && y > 0) {
			System.out.println("1");
		} else if (x < 0 && y > 0) {
			System.out.println("2");
		} else if (x < 0 && y < 0) {
			System.out.println("3");
		} else {
			System.out.println("4");

		}
	}
}