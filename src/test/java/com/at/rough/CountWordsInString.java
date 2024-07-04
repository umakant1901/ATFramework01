package com.at.rough;

import java.util.HashMap;
import java.util.Map;

public class CountWordsInString {

	public static void main(String[] args) {
		String inputStr="I am Umakant and I am doing testing and I am interested in automation testing";

		
		
	}
	
	public static void getWordCountUsingMap(String inputString)
	{
			String[] stringarray=inputString.split(" ");
			
			Map<String, Integer> hashmap=new HashMap<String, Integer>();
			
			if(stringarray.length==0)
			{
				System.out.println("No string found...!");
			}else {
				for(int i=0;i<inputString.length();i++)
				{
					
					int cnt=0;
					if(hashmap.containsKey(stringarray[i]))
					{
						hashmap.put(stringarray[i], hashmap.get(stringarray[i])+1);
					}else {
						hashmap.put(stringarray[i], cnt+1);
					}
									
				}
			}
	}
	
	public static int getHashMapValue(HashMap<String , Integer> hm)
	{
		
		
		
		return 0;
	}
	

}
