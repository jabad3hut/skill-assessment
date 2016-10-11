@RestController
class ThisWillActuallyRun {
	@RequestMapping("/")
	String home() {
		return "Hello Groovy World!\n"
}
}
