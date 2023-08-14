package com.example.demo.service;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.reg;
import com.example.demo.repository.reg_respository;

@Service
public class regservice {
	@Autowired
	public reg_respository regrepo;
	//table Name
	public List<reg> getAllRegisters()
	{
		List<reg> registers =new ArrayList<>();
		regrepo.findAll().forEach(registers::add);
		return registers;
		}
	public void addRegisters(reg register)
	{
		regrepo.save(register);
	}
	public void updateRegisters(String s_no,reg register) {
		regrepo.save(register);
	}
	public void deleteRegisters(String s_no) {
		regrepo.deleteById(s_no);
	}
}