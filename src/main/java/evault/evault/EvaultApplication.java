package evault.evault;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class EvaultApplication {

	public static void main(String[] args) {
		SpringApplication.run(EvaultApplication.class, args);
	}

}

@RestController
class HelloController {

	@GetMapping("/")
	public String hello() {
		return "index";
	}

	// @GetMapping("/next-page")
	// public String navigateToNextPage(Model model) {
	// return "redirect:/next-page";
	// }
}