import java.util.*;

class DeepakAndHisJourney {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t != 0) {
			int pp = sc.nextInt();
			long[] cost = new long[pp];
			long[] petrol = new long[pp];

			for (int i = 0; i < pp; i++) {
				cost[i] = sc.nextLong();
			}
			for (int i = 0; i < pp; i++) {
				petrol[i] = sc.nextLong();
			}

			long min_cost = cost[0];
			long total = min_cost * petrol[0];
			for (int i = 1; i < pp; i++) {
				if (min_cost > cost[i]) {
					min_cost = cost[i];
					total += min_cost * petrol[i];
				}
				else {
					total += min_cost * petrol[i];
				}
 			}
 			System.out.println(total);
 			t--;
		}
	}
}