package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ITreeService;

@RestController
@RequestMapping("/tree")
public class treeSearchController {

	@Autowired
	private ITreeService treeService;
	
	@GetMapping("/new")
	public List<Map<String, Object>> tree(){
		List<Map<String,Object>> list = treeService.tree();
		return list;
	}
	
}
