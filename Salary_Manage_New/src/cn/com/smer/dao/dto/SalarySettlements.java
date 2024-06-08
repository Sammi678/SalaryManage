package cn.com.smer.dao.dto;

import java.util.Date;

public class SalarySettlements {
	private Long salarySettlementId;

	private Long employeeId;

	private Long departmentId;

	private Long state_status;

	private Date importDate;

	private Date payDate;

	private Long trueSalary;

	public Long getSalarySettlementId() {
		return salarySettlementId;
	}

	public void setSalarySettlementId(Long salarySettlementId) {
		this.salarySettlementId = salarySettlementId;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	public Long getState() {
		return state_status;
	}

	public void setState(Long state_status) {
		this.state_status = state_status;
	}

	public Date getImportDate() {
		return importDate;
	}

	public void setImportDate(Date importDate) {
		this.importDate = importDate;
	}

	public Date getPayDate() {
		return payDate;
	}

	public void setPayDate(Date payDate) {
		this.payDate = payDate;
	}

	public Long getTrueSalary() {
		return trueSalary;
	}

	public void setTrueSalary(Long trueSalary) {
		this.trueSalary = trueSalary;
	}

	@Override
	public String toString() {
		return "SalarySettlements [salarySettlementId=" + salarySettlementId + ", employeeId=" + employeeId
				+ ", departmentId=" + departmentId + ", state_status=" + state_status + ", importDate=" + importDate + ", payDate="
				+ payDate + ", trueSalary=" + trueSalary + "]";
	}

}