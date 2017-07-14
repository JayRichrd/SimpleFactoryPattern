package com.jy;

public class OperationFactory {
	public static Operation creatOperation(String operationStr) {
		Operation operation = null;
		switch (operationStr) {
		case "+":
			operation = new OperationAdd();
			break;
		case "-":
			operation = new OperationSub();
			break;
		case "*":
			operation = new OperationMul();
			break;
		case "/":
			operation = new OperationDiv();
			break;
		default:
			break;
		}
		return operation;
	}
}
