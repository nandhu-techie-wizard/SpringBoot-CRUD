package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.model.reg;
import com.example.demo.service.regservice;

@RestController
public class Regcrud {
	@Autowired
	private regservice regService;
	@RequestMapping("/register")
	public List<reg> getAllRegisters()
	{
		return regService.getAllRegisters();
	}
	@RequestMapping(method= RequestMethod.POST, value="/register")
	public void addRegisters(@RequestBody reg register)
	{
		regService.addRegisters(register);
	}
	@RequestMapping(method= RequestMethod.PUT, value="/register/{s_no}")
	public void updateRegisters(@PathVariable String s_no,@RequestBody reg register )
	{
		regService.updateRegisters(s_no,register);
	}
	@RequestMapping(method= RequestMethod.DELETE, value="/register/{s_no}")
	public void updateRegisters(@PathVariable String s_no )
	{
		regService.deleteRegisters(s_no);
	}
}
