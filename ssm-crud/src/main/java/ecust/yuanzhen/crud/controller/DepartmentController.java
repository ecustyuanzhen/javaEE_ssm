package ecust.yuanzhen.crud.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ecust.yuanzhen.crud.bean.Department;
import ecust.yuanzhen.crud.bean.Msg;
import ecust.yuanzhen.crud.service.DepartmentService;

/**
 * ����Ͳ����йص�����
 * @author lfy
 *
 */
@Controller
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	/**
	 * �������еĲ�����Ϣ
	 */
	@RequestMapping("/depts")
	@ResponseBody
	public Msg getDepts(){
		//��������в�����Ϣ
		List<Department> list = departmentService.getDepts();
		return Msg.success().add("depts", list);
	}

}

