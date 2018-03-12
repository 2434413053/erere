package org.hj001.web;

import java.util.List;

import javax.annotation.Resource;

import org.hj001.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("emp")
public class EmployeeController {
	@Resource
		private EmployeeService es;
	
	@RequestMapping("select")
	@ResponseBody
	public List<?> select(String ename,Integer pid,Integer did,String sex,Integer edid){
		String hql="from Employee where 1=1";
		if(ename !=null && !ename.equals("") ){
			hql+=" and ename like '%"+ename+"%'";
		}
		if(pid !=null && pid != -1){
			hql+=" and pid="+pid;
		}
		if(did != null && pid != -1){
			hql+=" and pid="+pid;
		}
		if(sex != null && !sex.equals("")){
			hql+= " and sex'%"+sex+"%'";
		}
		if(edid != null && edid != -1){
			hql+= " and edid="+edid;
		}
		List<?> list = es.select(hql);
		return list;
	}
	
	
	
}
