package solution;
import java.util.TreeSet;

/*輸入n個數字，求該數列的最大公因數*/
public class GCD_for_N_Number {
	public static void main(String[] args) {
		int[] a1 = new int[] { 0, 12, 18, 20736, 248832, 36 };
		System.out.println(gcd(a1));
		int[] a2 = new int[] { 20736, 248832 };
		System.out.println(gcd(a2));
	}

	public static int gcd(int[] input) {
		// your code
		/* 1.先整理輸入的值(排除重複的數字與排序) */
		TreeSet<Integer> tsi = new TreeSet<>();
		for (int a : input) {
			if (a != 0) {
				tsi.add(a);
			}
		}
		System.out.println(tsi.toString());
		/* toArray(Object ) */
		Integer[] buf = tsi.toArray(new Integer[tsi.size()]);
		/* 2.求最大公因數:能把n個數整除的必定為該數列的因數(商業邏輯) */
		int buferans = 0;
		for (int i = 1; i < buf[0]; i++) {
			Boolean trick = true;
			for (int j = 0; j < buf.length; j++) {
				if (buf[j] % i != 0) {
					trick = false;
				}
			}
			if (trick) {
				buferans = i;
			}
		}
		// your code
		return buferans;
	}
}
