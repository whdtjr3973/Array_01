
package com.biz.stringarray;

public class StrArray_05 {

	public static void main(String[] args) {
	
		String strName = "ȫ�浿";
		String[] strNames = strName.split("");
		
		
		// ���ڿ�.length("") �޼����
		// ���ڿ�(����)�� ��� ���ڿ�����
		// �ѱ��ھ� �����ؼ�
		// ���ڿ� ������ŭ �迭�� �������ش�
		for(int i =0; i < strNames.length; i++) {
			System.out.println(strNames.length);
		}
		int intNum = 10;
		int intNum2 = intNum + 100;
		
	}

	// makeString() �޼����� ���¸� �����
	// ������ ��ü���� ����� �ۼ����� ���� ����
	// �̷� �ڵ带 proto type �̶�� �Ѵ�.
	// ���� proto type�� ���������
	// void ���� �ƴѰ�쿡
	// return���� ������ �ϴµ�
	// return���� �����̸� return 0�̶�� �ۼ��ϰ�
	// �׿� ���� ���� return null�̶�� �ۼ�������.
	public static String[] makeString(String strNations) {

		return null;
	}
}
