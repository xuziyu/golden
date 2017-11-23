package com.share.golden.entity;

public class SysEmployeeRole {
	private String employeeRoleId;

	private String employeeId;

	private String roleId;

	public String getEmployeeRoleId() {
		return employeeRoleId;
	}

	public void setEmployeeRoleId(String employeeRoleId) {
		this.employeeRoleId = employeeRoleId == null ? null : employeeRoleId.trim();
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId == null ? null : employeeId.trim();
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId == null ? null : roleId.trim();
	}
}