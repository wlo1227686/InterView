package solution;
import java.util.TreeSet;

public class All_Combo {
	/* 輸入n個字母,請排出所有的可能且各組合與字母都不可重複 */
	public static void main(String[] args) {
		String[] test1 = { "A", "c", "A", "D", "B", "e", "d" };
		System.out.println(Combo(test1));
		String[] test2 = { "E", "f", "g", "H" };
		System.out.println(Combo(test2));
		String[] test3 = { "Z", "x", "d", "o" };
		System.out.println(Combo(test3));
	}

	public static String Combo(String[] input) {
		StringBuffer ans = new StringBuffer();
		// your code
		/* 1.先整理輸入的值(排除重複的字母與排序) */
		TreeSet<String> tss = new TreeSet<>();
		for (String a : input) {
			tss.add(a.toUpperCase());
		}
		System.out.println(tss.toString());
		/* 2.TreeSet 轉成 String陣列 */
		String[] inputbuffer = tss.toArray(new String[tss.size()]);
		StringBuffer buff = new StringBuffer();
		/* 3.buff=(n-1個0)+(n個1)+(n-1個0) */
		buff.append(Integer.toBinaryString((int) Math.pow(2, tss.size())).subSequence(1, tss.size()));
		buff.append(Integer.toBinaryString((int) Math.pow(2, tss.size()) - 1));
		buff.append(Integer.toBinaryString((int) Math.pow(2, tss.size())).subSequence(1, tss.size()));
		// System.out.println(buff.toString());
		for (int i = 0; i < tss.size() * 2 - 1; i++) {
			String buffer1 = (String) buff.toString().subSequence(buff.toString().length() - tss.size() - i,
					buff.toString().length() - i);
			/* 4. buffer1整理出不重複的組合 */
			char[] bits = buffer1.toCharArray();
			/* 5. 將該組合轉換為輸入的元素 */
			for (int j = 0; j < bits.length; j++) {
				if (bits[j] == '1') {
					ans.append(inputbuffer[j]);
				}
			}
			ans.append("\r\n");
		}
		// your code
		return ans.toString();
	}
}
