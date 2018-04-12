package com.simplefactory;

public class FruitFactory {
	
	
	public static Fruit factory( String fruitName )  {
		
		if(fruitName.equals("apple")) {
			System.out.println("�Ҵ��˰�װ");
			return new Apple();
		} else if(fruitName.equals("grape")) {
			return new Grape();
		} else {
			return null;
		}
		
		
	}

}
