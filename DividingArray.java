import java.util.*;

class DividingArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		while (t != 0) {

			int n = sc.nextInt();
			long[] arr = new long[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextLong();
			}

			Arrays.sort(arr);
			long minDiff = 0;
			for (int i = 0; i < n - 1; ) {
				minDiff += Math.abs(arr[i] - arr[i + 1]);
				i = i + 2;
			}
			long maxDiff = 0;
			for (int i = 0; i < n / 2; i++) {
				maxDiff += Math.abs(arr[i] - arr[n - i - 1]);

			}
			System.out.println(minDiff + " " + maxDiff);

			t--;
		}
	}
}