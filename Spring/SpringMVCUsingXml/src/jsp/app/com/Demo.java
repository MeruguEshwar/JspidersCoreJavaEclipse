package jsp.app.com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Demo 
{
	@RequestMapping("/hello")
	public void hello()
	{
		System.out.println("Welcome....");
	}
}
