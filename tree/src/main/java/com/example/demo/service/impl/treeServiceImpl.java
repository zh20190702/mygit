package com.example.demo.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.demo.service.ITreeService;

@Service
public class treeServiceImpl implements ITreeService{

	@Override
	public List<Map<String, Object>> tree() {
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		for (int i = 0; i < 10; i++) {
			Map<String, Object> map = new HashMap<>();
			map.put("name", "轻应用管理");
			map.put("url", "welcome1.html");
			Map<String, Object> childrenMap = new HashMap<>();
			for (int  j = 0; j < 4; j++) {
				childrenMap.put("name", "轻应用管理");
				childrenMap.put("url", "welcome1.html");
				childrenMap.put("childrens", null);
			}
			map.put("childrens",childrenMap);
			
		}
		
		return null;
	}

	
	
}
