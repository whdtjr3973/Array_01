package com.biz.intarray;

public class intArray_03 {
	
	public static void main(String[] args) {
		
		/*
		 * ���� ���� �����Ҽ� �ִ� ��� ������ 30�� ����
		 * �� �������� ��ǥ�̸� intKor�� �ٿ���
		 * ==> int��(type) �迭 30���� �����
		 * ��ǥ�̸����� intKor�� �ٿ���
		 * 
		 * ==> 30���� ���ӵ� �������� �����ϰ�,
		 * ó������ ������ 0�� �����Ͽ�
		 * �� ������ 10���� ������ �ּҰ��� �ٿ�������.
		 * 
		 */
		int[] intKor = new int[30]; // �迭
									// intKor��� ���� ������ ����
									// new �ڿ� int[30]�� ������ŭ ����
		
		intKor[0] = 90;
		intKor[1] = 80;
		intKor[2] = 70;
		intKor[3] = 89;
		intKor[4] = 88;
		intKor[5] = 90;
		
		// �迭�� �Ϲ� ������ �޸�
		// �� �迭�� Ȱ���Ҷ� for �ݺ����� ����Ҽ��ִ� Ư¡���ִ�.
		int intSum = 0;
		for(int i = 0; i < 5; i++) {
			intSum += intKor[i];
		}
		
		intSum = 0;
		intSum += intKor[0];
		intSum += intKor[1];
		intSum += intKor[2];
		intSum += intKor[3];
		intSum += intKor[4];
		intSum += intKor[5];
		System.out.println(intSum);
	}

}
