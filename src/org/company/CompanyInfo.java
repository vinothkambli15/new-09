package org.company;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class CompanyInfo {
 public static void main (String []args) {
String s="java is java not a test ng";
String[] split = s.split("");
Map<String, Integer>mp=new LinkedHashMap<>();
for (String c : split) {
	if(mp.containsKey(c)) {
		Integer count = mp.get(c);
		mp.put(c, count+1);
	}else {
		mp.put(c, 1);
	}
	
}
System.out.println(mp);

Set<Entry<String, Integer>> S = mp.entrySet();
for (Entry<String, Integer> entry : S) {
	if(entry.getValue()>1) {
		String key = entry.getKey();
		System.out.println(key);
	}
}
 }
}