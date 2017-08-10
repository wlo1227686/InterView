package ch01;

import java.util.ArrayList;
import java.util.List;

//伈創資訊後端考題   成功率聽考官說只有4成

//請改寫List<String>的toString，變更列印結果

//原[a,b,c]改為{'A','B','C'}
//原[a]改為{'A'}
//原[D,e]改為{'D','E'}
//原[a,B,c]改為{'A','B','C'}
//原[1,2,3]改為{'1','2','3'}
//原[h,E,l,l,o]改為{'H','E','L','L','O'}
public class Main {
	public static void main(String[] args) {
		List<String> ma = new myArray<String>();
		ma.add("[a,b,c]");ma.add("[a]");
		ma.add("[D,e]");ma.add("[a,B,c]");
		ma.add("[1,2,3]");ma.add("[h,E,l,l,o]");
		System.out.println(ma);
	}
}

class myArray<E> extends ArrayList<E> {

	private static final long serialVersionUID = -6649958883356491912L;
	StringBuilder sb = new StringBuilder();

	public myArray() {
	}

	@Override
	public String toString() {
		return sb.toString();
	}

	@Override
	public boolean add(E e) {
		String[] buffer = ((String) e).toUpperCase().
				replaceAll("\\[", "").replaceAll("\\]", "").split(",");
		sb.append("{");
		int size = buffer.length;
		for (String s : buffer) {
			sb.append("'" + s + "'");
			if (--size != 0) {
				sb.append(",");
			}
		}
		sb.append("}\r\n");
		return super.add(e);
	}
}































