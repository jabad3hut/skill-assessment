@RestController
class ThisWillActuallyRun {
	@RequestMapping("/")
	String home() {
		return "Hello Groovy Pigs Live in this World!\n"
}
}
