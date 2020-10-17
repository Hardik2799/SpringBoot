package com.Project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.Project.Model.RegVO;
import com.Project.Service.RegService;

@Controller
public class RegController {

	@Autowired
	RegService regService;
	

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView reg() {

		return new ModelAndView("register", "data", new RegVO());

	}

	@RequestMapping(value = "/insertData", method = RequestMethod.POST)
	public ModelAndView addData(@ModelAttribute RegVO regVO) {

		System.out.println(regVO);
		this.regService.reginsert(regVO);
		return new ModelAndView("register", "data", new RegVO());
	}
	
	@RequestMapping(value="/search",method=RequestMethod.GET)
	public ModelAndView Search()
	{
		System.out.println("in search");
		List<?> searchList=this.regService.search();
		System.out.println("search"+searchList.size());
		return new ModelAndView("search","data",searchList);	
	}	
	@RequestMapping(value="/delete",method=RequestMethod.GET)
	public ModelAndView Delete(@RequestParam int id,@ModelAttribute RegVO regVO)
	{
		regVO.setId(id);
		
		List<?> ls=this.regService.searchbyid(regVO);
		RegVO v2=(RegVO)ls.get(0);
		v2.setStatus(false);
		
		this.regService.reginsert(v2);
		
		return new ModelAndView("redirect:/search");
		
		
	}
	
	@RequestMapping(value="/edit",method=RequestMethod.GET)
	public ModelAndView Edit(@RequestParam int id,@ModelAttribute RegVO regVO)
	{
		regVO.setId(id);
		
		List<?> ls=this.regService.searchbyid(regVO);
		
		return new ModelAndView("register","data",(RegVO)ls.get(0));
		
		
	}
	
}