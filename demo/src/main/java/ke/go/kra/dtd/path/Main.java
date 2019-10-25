package ke.go.kra.dtd.path;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class Main {

	@GetMapping()
	public String getPage() {
		return "index";
	}
}
