@RestController
class ThisWillActuallyRun {
	@RequestMapping("/")
	String home() {
		return "Hello Groovy Jeff World!\n"
}
}
