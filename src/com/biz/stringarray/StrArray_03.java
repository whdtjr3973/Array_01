package com.biz.stringarray;

public class StrArray_03 {

	public static void main(String[] args) {

		String[] strNations = { "��", "��", "��", "��", "��", "��" };

//		for(int i = 0; i < 6 ; i ++) {
//			System.out.print(strNations[i]);
		
		
		// �迭.length�� �迭�� �����Ǵ� ����
		// �迭 ���ο� �ڵ����� �����Ǵ� �����̴�.
		// �̷��� �������� �Ӽ�(property)��� �θ��⵵ �ϸ�,
		// �迭�� length �Ӽ��� �迭�� ����(ũ��)�� �˼��ִ� �Ӽ��̴�.
		for (int i = 0; i < strNations.length; i++) {
			System.out.print(strNations[i]);
		}
	}

}
