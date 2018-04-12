package com.abstractfactory;

public class MercedesFactoryGermany implements MercedesFactory{
	
	@Override
	public BenzA createBenzA() {
		System.out.println("��ʼ���� ���� A ���γ�");
		return new BenzAGermany();
	}

	@Override
	public BenzB createBenzB() {
		System.out.println("��ʼ���� ���� B ���γ� ");
		return new BenzBGermany();
	}
	
}
