package com.biz.stringarray;

public class StrArray_06 {

	public static void main(String[] args) {

		String strName = "ȫ�浿 �̸��� ������ �Ӳ���";

		// ��ĭ(" ") �� �������� strName�� �����ؼ�
		// �迭�� �����϶�
		String[] strNames = strName.split(" ");
		for (int i = 0; i < strNames.length; i++) {
			System.out.println(i + "��° : " + strNames[i]);

		}
	}

}
