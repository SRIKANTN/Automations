package Qsp;

import java.util.ArrayList;
import java.util.List;

public class Java
{
	public static void main(String[] args) 
	{
		List<String> al =  new ArrayList<>();
		al.add("a");
		al.add("b");
		al.add("a");
		al.add(null);
		
		int count = al.size();
		System.out.println(count);
		for(int i=0; i<count; i++)
		{
			String text = al.get(i);
			System.out.println(text);
		}
		
	}

}
