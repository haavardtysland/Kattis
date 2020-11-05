import java.util.Scanner;

public class SimonSays {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int testcases = scan.nextInt();
scan.nextLine();

for (int i = 0; i < testcases; i++)
	{
	String str = scan.nextLine();
	
	if (str.startsWith("Simon says"))
		System.out.println(str.substring(10));
	}

scan.close();
	}
}