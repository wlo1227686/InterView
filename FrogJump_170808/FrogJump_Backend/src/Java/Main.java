package Java;

//德義資訊 Java SW Engineer 
//(全端工程師吧，依照說的工作內容來下結論)
//作答方式:考卷加A4答案紙,未提供電腦。
/*
請寫出一段程式printStar(int width)印出依寬度為width的三角形width為傳入變數。

<例如>
當width傳入3時 printStar(width)印出

*
**
***
**
*

當width傳入4時 printStar(width)印出

*
**
***
****
***
**
*

程式寫好後，請輸入width為1到100的任5個數字，測試是否正確。
*/

public class Main {
	static StringBuffer sb = new StringBuffer();
	public static void main(String[] args) {
		printStar(0);
	}
	// 專門用來印星星  index/每行
	private static void drowStar(int index) {
		for (int j = 1; j <= index; j++) {
			sb.append("*");
		}
		sb.append("\r\n");
	}
	private static void printStar(int width) {
		for (int i = 0; i < width * 2 - 1; i++) {
			//運算公式網路上抄來的
			drowStar(
					java.lang.Math.abs(
							(i + 1) / width * width - (i + 1) % width
							)
					);
		}
		System.out.println(sb.toString());
	}

}










