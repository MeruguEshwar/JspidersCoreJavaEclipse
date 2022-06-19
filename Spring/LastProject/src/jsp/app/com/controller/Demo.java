package jsp.app.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jsp.app.com.model.BookEntityClass;
import jsp.app.com.model.CleanCode;
import jsp.app.com.model.UserDetails;



public class Demo 
{
	@Controller
	public class Sample {
		@RequestMapping("/view/us")
		public ModelAndView us(@RequestParam("em") String name, @RequestParam("ps") String pass) 
		{
			String s = "welcome";
			CleanCode c = new CleanCode();
			boolean b = c.login(name, pass);
			ModelAndView mv = new ModelAndView();
			if (b) 
			{
				mv = new ModelAndView("Main.html", "add", s);
				return mv;
			} 
			else 
			{
				mv = new ModelAndView("login.html", "login", s);
				return mv;
			}

		}

		@RequestMapping("/view/add")
		public ModelAndView add(@RequestParam("bt") String tit, @RequestParam("ba") String aut, @RequestParam("be") int eid,
				@RequestParam("bp") double pri, @RequestParam("bty") String typ) 
		{
			CleanCode c1 = new CleanCode();
			c1.addBook(tit, aut, eid, pri, typ);
			String s = "details added";
			ModelAndView mv = new ModelAndView("Result.jsp", "res", s);
			return mv;

		}

		@RequestMapping("/view/search")
		public ModelAndView search(@RequestParam("bt") String title) 
		{
			CleanCode c1 = new CleanCode();
			BookEntityClass b1 = c1.searchBook(title);
			ModelAndView mv = new ModelAndView("Result.jsp", "res", b1);
			return mv;
		}

		@RequestMapping("/view/update")
		public ModelAndView update(@RequestParam("bt") String title, @RequestParam("be") int edi) 
		{
			CleanCode c1 = new CleanCode();
			c1.updateBook(title, edi);
			String s = "Details Updated";
			ModelAndView mv = new ModelAndView("Result.jsp", "res", s);
			return mv;
		}

		@RequestMapping("/view/delete")
		public ModelAndView delete(@RequestParam("bt") String title) 
		{
			CleanCode c1 = new CleanCode();
			c1.removeBook(title);
			String s = "Book Removed";
			ModelAndView mv = new ModelAndView("Result.jsp", "res", s);
			return mv;
		}

		@RequestMapping("/view/check")
		public ModelAndView check(@RequestParam("email") String email) 
		{
			CleanCode c = new CleanCode();
			Boolean b = c.Forgotpass(email);
			if (b) {
				ModelAndView mv = new ModelAndView("UpdatePassword.html", "sim", email);
				return mv;
			} else {
				String s = "wrong email id";
				ModelAndView mv = new ModelAndView("Forgot.html", "sim", s);
				return mv;
			}
		}

		@RequestMapping("/view/updatep")
		public ModelAndView updatep(@RequestParam("psd") String pss, @RequestParam("cps") String cps,
				@RequestParam("email") String email) 
		{
			CleanCode c = new CleanCode();
			String s = c.Updatepass(email, pss, cps);
			if (s.equals("Updated")) 
			{
				ModelAndView mv = new ModelAndView("Login.html", "sim", s);
				return mv;
			} else {
				ModelAndView mv = new ModelAndView("UpdatePassword.html", "sim", s);
				return mv;
			}
		}

		@RequestMapping("/view/signup")
		public ModelAndView signup(@RequestParam("em") String email, @RequestParam("nm") String name,
				@RequestParam("ps") String pass) 
		{
			CleanCode c = new CleanCode();
			String s=c.newUser(email, name, pass);
			ModelAndView mv = new ModelAndView("login.html","sim",s);
			return mv;

		}
	}

}
