package com.biz.intarray;

import java.util.Random;

public class intArray_05 {

	public static void main(String[] args) {

		int[] intKor = new int[30];
		
		// ������ ���ڸ� �����ϱ� ���� Ŭ����
		Random rnd = new Random();
		
		// �迭�� �Բ� ����ϴ� for ��ɹ���
		// ���۰��� 0 
		// ���ᰪ�� �迭�� ũ�� - 1 ���� ����� �Ѵ�.
		for(int i = 0; i < 30; i++) {
			// 0���� 49���� ������ ���ڸ� 1�� �����ϰ�
			// �ű⿡ 51�� ���Ͽ�
			// �����δ� 51 ~ 100���� ���ڸ� ����� 
			// intKor�� i ��° ��ġ�� ����(�Ҵ�,����)
			intKor[i] = rnd.nextInt(50) + 51;
		}
		for(int i = 0; i < 30; i++) {
			System.out.print(intKor[i]);
			if((i + 1) % 5 == 0) {
				System.out.println();
			} else {
				System.out.print(", ");
			}
				
		}
	}

}
