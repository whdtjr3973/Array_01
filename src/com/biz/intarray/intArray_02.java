package com.biz.intarray;

public class intArray_02 {

	public static void main(String[] args) {

		// �л����� ������ ������ �ϴ� �����ϴ� �κ�
		// �л����� ������ � ��Ģ�� �ο��Ҽ� �����Ƿ�
		// ��¿������ �ۼ��ؾ� �ϴ� �ڵ�
		// �� �κ� �ڵ�� �����ϰ� �ۼ��ϱⰡ ����� ��ƴ�.
		int intKor_01 = 90 ;
		int intKor_02 = 70 ;
		int intKor_03 = 80 ;
		int intKor_04 = 77 ;
		int intKor_05 = 90 ;
		int intKor_06 = 78 ;
		int intKor_07 = 60 ;
		
		// ������ ����ϴ� �κ���
		// ���� �ڵ尡 �����ѵ�
		// ���� ���� 2�ڸ��� ���ӿ� 1�� �����ǰ� �ִ� ���� Ȯ��
		// �׷��ٸ� �տ� �н��� for ����� �̿��Ͽ� ���ο� �ڵ带
		// �ۼ��Ҽ� ���� ���̴�.
		int intSum = 0;
		for(int i = 1; i <30;i++) {
			//intSum += intKor_i;
		}
		
		String a = "03" ;
		int intNum_03 = 0;
		// �츮�� �����Ҷ�
		// �Ʒ��ڵ�� intNum_03 = 100�̶�� �����ɰ�����
		// �������� ��ǻ�Ͱ� �ν����� ���ϴ� �����̴�.
		//		intNum_a = 100;
		
		// �Ʒ��ڵ� ���� intNum + a �� intNum_03 �̶�� ������ ������
		//�������� ��ǻ�ʹ� �ν����� ���ϴ� �����̴�.
		//		intNum + a = 100;
		
		intSum += intKor_01;
		intSum += intKor_02;
		intSum += intKor_03;
		intSum += intKor_04;
		intSum += intKor_05;
		intSum += intKor_06;
		intSum += intKor_07;
		System.out.println("�������� ���� : " + intSum);
		
		float fAvg = 0;
		fAvg = intSum / 7.0f;
		
		System.out.println("�������� �б���� : " + fAvg);
		
		}

}
