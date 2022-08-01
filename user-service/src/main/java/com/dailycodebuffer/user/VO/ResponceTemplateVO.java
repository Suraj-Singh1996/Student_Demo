package com.dailycodebuffer.user.VO;

import com.dailycodebuffer.user.entity.Userd;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
 public class ResponceTemplateVO {
	
	private Userd user;
	private Department department;
	
	public Userd getUser() {
		return user;
	}
	public void setUser(Userd user) {
		this.user = user;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	

}
