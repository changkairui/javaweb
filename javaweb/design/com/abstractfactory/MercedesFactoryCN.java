package com.abstractfactory;

public class MercedesFactoryCN implements MercedesFactory{

	@Override
	public BenzA createBenzA() {
		System.out.println("��ʼ���� ���� A ���γ� .");
		return new BenzACN();
	}

	@Override
	public BenzB createBenzB() {
		System.out.println("��ʼ���� ���� B������ .");
		return new BenzBCn();
	}

}