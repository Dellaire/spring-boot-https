package de.clumsystuff.spring_boot_https;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/resources")
public class ResourceController {

	@GetMapping
	public String getResource() {
		
		return "This was sent via HTTPS!";
	}
}
