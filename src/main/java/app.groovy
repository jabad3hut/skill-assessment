@RestController
class ThisWillActuallyRun {
	@RequestMapping("/")
	String home() {
		return "Hello Groovy Pigs Live in this World!\nAnd another line to see if this thing will actually build\nAnd another change to see if the CI being checked was the thing that kept it from updating"
}
}
