package org.company;

import java.util.LinkedHashMap;
import java.util.Map;

public class JavaTask2 {
 
	 public static void main(String[]args) {

			String s = "vinoth kambli vinoth";
			String[] split = s.split("");
			Map<String, Integer> mp =new LinkedHashMap<>();
			for(String c:split) {
				if (mp.containsKey(c)) {
					Integer count = mp.get(c);
					mp.put(c, count+1);
				} else {
                   mp.put(c, 1);
				}
				
			}
			System.out.println(mp);
			}
 
	 }
