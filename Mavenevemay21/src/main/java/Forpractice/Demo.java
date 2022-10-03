package Forpractice;

import java.util.ArrayList;

public class Demo {
	public static void main(String[] args) {
		
		ArrayList<Integer>a = new ArrayList<Integer>();
		
		a.add(23);
		a.add(45);
		a.add(47);
		
		int size = a.size();
		for (int i =0; i<size; i++)
		{
			System.out.println(a.get(i));
		}
		
	}

}
