package Test;

public class test1 {
public static void main(String[] args) {
	int i, j;
	int sum = 0;
	for (i = 1; i <= 49; i++) {
		if (i % 10 == 4) {
		} else if (i >= 40) {
		} else {
			System.out.print(i + " ");
			sum++;
		}
	}
	System.out.println("\n總共有" + sum + "個");
	System.out.println("===========================");
	for (i = 10; i >= 1; i--) {
		for (j = 1; j <= i; j++) {
			System.out.print(j);
		}
		System.out.println();
	}
}
}

