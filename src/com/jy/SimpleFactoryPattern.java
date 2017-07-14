package com.jy;

import java.util.Scanner;

public class SimpleFactoryPattern {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Operation operation = null;
		// 运算符类型
		int operationType = 0;
		// 运算符
		String operationStr = null;

		// 获取第一个操作数
		System.out.print("请输入操作数A(A为double类型):");
		Double numA = scanner.nextDouble();

		// 获取第二个操作数
		System.out.print("请输入操作数B(B为double类型):");
		Double numB = scanner.nextDouble();

		// 获取运算符
		System.out.print("请输入操作数符号(1表示:+、2表示:-、3表示:*、4表示:/):");
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

		// 根据不同的运算符来创建不同的实例
		operation = OperationFactory.creatOperation(operationStr);
		if (operation == null) {
			scanner.close();
			return;
		}

		operation.mNumA = numA;
		operation.mNumB = numB;
		double result = operation.getResult();

		StringBuilder resultSB = new StringBuilder("计算结果: ");
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
