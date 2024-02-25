package evault.evault;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NextPage {

    @GetMapping("/next-page")
    public String showNextPage() {
        return "next-page"; // This will return the name of the HTML page
    }
}
