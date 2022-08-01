package com.dailycodebuffer.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.dailycodebuffer.user.VO.Department;
import com.dailycodebuffer.user.VO.ResponceTemplateVO;
import com.dailycodebuffer.user.entity.Userd;
import com.dailycodebuffer.user.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RestTemplate restTamplate;
	
	public Userd saveUser(Userd user) {
		
		return userRepository.save(user);
	}

	public ResponceTemplateVO getUserWithDepartment(long userId) {

		ResponceTemplateVO vo = new ResponceTemplateVO();
		Userd user = userRepository.findByUserId(userId);
		Department department = restTamplate.getForObject("http://DEPARTMENT-SERVICE/department/" +user.getDepartmentId(), Department.class);
		vo.setUser(user);
		vo.setDepartment(department);
		
		return vo;
	}
	
}
