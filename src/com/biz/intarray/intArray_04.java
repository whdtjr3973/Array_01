package com.biz.intarray;

import java.util.Random;

public class intArray_04 {

	public static void main(String[] args) {

		int[] intKor = new int[30];
		
		// ������ ���ڸ� �����ϱ� ���� Ŭ����
		Random rnd = new Random();
		
		// �迭�� �Բ� ����ϴ� for ��ɹ���
		// ���۰��� 0 
		// ���ᰪ�� �迭�� ũ�� - 1 ���� ����� �Ѵ�.
		for(int i = 0; i < 30; i++) {
			// 0���� 49���� ������ ���ڸ� 1�� �����ؼ�
			// intKor�� i ��° ��ġ�� ����(�Ҵ�,����)
			intKor[i] = rnd.nextInt(50);
		}
		for(int i = 0; i < 30; i++) {
			System.out.println(intKor[i]);
		}
	}

}
