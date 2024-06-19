package in.harshita.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "24-Welcome-API")
public interface WelcomeClient {
	@GetMapping("/welcome")
	public String invokeWelcome();
		
	}


