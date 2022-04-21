package mtscarneiro.app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CvwebApiApplication

fun main(args: Array<String>) {
	runApplication<CvwebApiApplication>(*args)
}
