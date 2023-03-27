package foo.bar.controller;

import java.util.concurrent.atomic.AtomicLong;

import foo.bar.domain.Greeting;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World", required = false) String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

	@PostMapping("/greetings")
	public Greeting greetings(@RequestBody String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
}
