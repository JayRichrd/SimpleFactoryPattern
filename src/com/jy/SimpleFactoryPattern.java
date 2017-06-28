package com.jy;

import java.util.Scanner;

public class SimpleFactoryPattern {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Operation operation = null;
		// ���������
		int operationType = 0;
		// �����
		String operationStr = null;

		// ��ȡ��һ��������
		System.out.print("�����������A(AΪdouble����):");
		Double numA = scanner.nextDouble();

		// ��ȡ�ڶ���������
		System.out.print("�����������B(BΪdouble����):");
		Double numB = scanner.nextDouble();

		// ��ȡ�����
		System.out.print("���������������(1��ʾ:+��2��ʾ:-��3��ʾ:*��4��ʾ:/):");
		operationType = scanner.nextInt();
		switch (operationType) {
		case 1:
			operationStr = "+";
			break;
		case 2:
			operationStr = "-";
			break;
		case 3:
			operationStr = "*";
			break;
		case 4:
			operationStr = "/";
			break;
		default:
			break;
		}

		// ���ݲ�ͬ���������������ͬ��ʵ��
		operation = OperationFactory.creatOperation(operationStr);
		if (operation == null) {
			scanner.close();
			return;
		}

		operation.mNumA = numA;
		operation.mNumB = numB;
		double result = operation.getResult();

		StringBuilder resultSB = new StringBuilder("������: ");
		resultSB.append(numA + " ");
		resultSB.append(operationStr + " ");
		resultSB.append(numB + " ");
		resultSB.append("= ");
		resultSB.append(result);
		System.out.println(resultSB.toString());

		resultSB = null;
		scanner.close();

	}

}
