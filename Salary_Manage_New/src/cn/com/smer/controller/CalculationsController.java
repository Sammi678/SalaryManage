package cn.com.smer.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.com.smer.dao.dto.Calculations;
import cn.com.smer.dao.dto.Projects;
import cn.com.smer.dtoform.CalculationsForm;
import cn.com.smer.service.CalculationsService;
import cn.com.smer.service.ProjectsService;
import cn.com.smer.service.SalaryProjectsService;
/*
 * 	计算项目
 * 		1.新增
 * 		2.修改
 * 		3.查询
 */
@Controller
@RequestMapping("/calculation")
public class CalculationsController {
	@Autowired
	private CalculationsService calculationsService;
	@Autowired
	private ProjectsService projectsService;
	// 添加产品 表单显示
	@RequestMapping(value = "{id}/create", params = { "form" })
	public String createForm(@PathVariable("id") Long id, Model model) {
		Projects projects =  projectsService.selectByPrimaryKey(id);
		model.addAttribute("projects", projects);
		return "/calculation/calculationAdd";
	}

	// 新建
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String create(CalculationsForm form, Model model) {
		boolean result = calculationsService.insertSelective(form);
		if (result) {
			return "redirect:/projects/create?complete"; // 重定向到另一个业务控制方法
		} else {
			model.addAttribute("AddprojectsResult", "新增工資項目失败!");
		}
		return "/calculation/calculationAdd";
	}

	// 修改员工 表单显示
	@RequestMapping(value = "/{id}/update", params = { "form" })
	public String updateForm(Model model, @PathVariable("id") Long Id) {
		Calculations calculations =  calculationsService.selectByPrimaryKey(Id);
		Projects projects = projectsService.selectByPrimaryKey(calculations.getProjectId());
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("1", "加");
		map.put("2", "减");
		map.put("3", "乘");
		map.put("4", "除");
		model.addAttribute("operatorMap", map);
		model.addAttribute("projects", projects);
		model.addAttribute("calculations", calculations);
		return "/calculation/calculationUpdate";
	}

	// 更新
	@RequestMapping(value = "/{id}/update", params = { "update" }, method = RequestMethod.POST)
	public String updateForm(CalculationsForm form, Model model, @PathVariable("id") Long departmentId) {
		boolean result = calculationsService.updateByPrimaryKeySelective(form);
		if (result) {
			return "redirect:/calculation/{id}/update?complete";
		} else {
			model.addAttribute("updateCalculations", "设置计算方法失败!");
		}

		return "/projects/projectsSelect";
	}

	// 更新成功
	@RequestMapping(value = "/{id}/update", params = { "complete" }, method = RequestMethod.GET)
	public String updateForm(Model model) {
		model.addAttribute("updateCalculations", "设置计算方法成功!");
		return "/projects/projectsSelect";
	}
	
	

}
