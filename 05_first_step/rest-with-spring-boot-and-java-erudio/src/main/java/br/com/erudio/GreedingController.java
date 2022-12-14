package br.com.erudio;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreedingController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	private static final String request = "Message: %s";

	@RequestMapping("/greeting")
	public Greeding greeding(@RequestParam(value = "name", defaultValue = "data") String name, String indicator) {
		return new Greeding(counter.incrementAndGet(), String.format(template, name), String.format(template, indicator));
	};
	
	@RequestMapping("/data")
	public Greeding chamada(@RequestParam(value = "data", defaultValue = "???") String name, String indicator) {
		return new Greeding(counter.incrementAndGet(), String.format(template, name), String.format(template, indicator));
	};
	
}
