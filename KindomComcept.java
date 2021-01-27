import java.util.*;

class KindomComcept {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			int towers = sc.nextInt();
			long[] xArr = new long[towers];
			long[] yArr = new long[towers];
			
			for (int i = 0; i < towers; i++) {
				xArr[i] = sc.nextLong();
				yArr[i] = sc.nextLong();
			}
		
			Arrays.sort(xArr);
			Arrays.sort(yArr);
			
			long xMax = 0, yMax = 0;
		
			for (int i = 1; i < xArr.length; i++) {
				long tempDiff = xArr[i] - xArr[i - 1] - 1;
				xMax = Math.max(tempDiff, xMax);
				tempDiff = yArr[i] - yArr[i - 1] - 1;
				yMax = Math.max(tempDiff, yMax);
			}

			System.out.println(yMax * xMax);		
	}
}