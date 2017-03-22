package com.cjl.test;

import java.util.HashMap;
import java.util.Map;


public class TestMap {

	public static Map<String, Object> VersionMap = null;
	
	static {
		
		VersionMap = new HashMap<String, Object>();
		VersionMap.put("isnew", true);
		VersionMap.put("0.0.1", true);
	}

	public static void main(String[] args) {
		boolean isnew = (boolean)TestMap.VersionMap.get("isnew");
		boolean isnew1 = (boolean)TestMap.VersionMap.get("0.0.1");
		boolean isnew2 = (boolean)TestMap.VersionMap.get("0.0.2");
		System.out.println(isnew+" "+isnew1+" "+isnew2);
	}
	
	
}
