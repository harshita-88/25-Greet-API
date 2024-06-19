package in.harshita.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.harshita.client.WelcomeClient;

@RestController
public class GreetRestController {
	
	@Autowired
	private WelcomeClient welcomeClient;
	
	@GetMapping("/greet")
	public String getGreetMsg() {
		String welcome = welcomeClient.invokeWelcome();
		String greet = "Good Morning";
		return greet.concat(welcome);
	}

}
