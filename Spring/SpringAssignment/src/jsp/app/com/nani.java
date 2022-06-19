package jsp.app.com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class nani 
{
	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("ab") String ufrt,@RequestParam("cd")  String uSec)
	{
		double sum=Double.parseDouble(ufrt) + Double.parseDouble(uSec);
		
		ModelAndView modelAndView=new ModelAndView("result","nani",sum);
		return modelAndView;
		
	}
	
	@RequestMapping("/sub")
	public ModelAndView sub(@RequestParam("x") double ufrts,@RequestParam("y") double uSecs)
	{
		double sub=ufrts-uSecs;
		
		ModelAndView modelAndView=new ModelAndView("result","nani",sub);
		return modelAndView;
	}
	
	@RequestMapping("/mul")
	public ModelAndView mul(@RequestParam("e") double ufrtm,@RequestParam("f") double uSecm)
	{
		double mul=ufrtm*uSecm;
		
		ModelAndView modelAndView=new ModelAndView("result","nani",mul);
		return modelAndView;
	}
	
	@RequestMapping("/div")
	public ModelAndView div(@RequestParam("l") double ufrtd,@RequestParam("v") double uSecd)
	{
		double div=ufrtd/uSecd;
		
		ModelAndView modelAndView=new ModelAndView("result","nani",div);
		return modelAndView;
	}
}
