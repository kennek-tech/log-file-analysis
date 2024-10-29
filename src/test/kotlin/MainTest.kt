import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe

class MainTest : ShouldSpec(
    {
        context("log report") {
            should("return the total number of log messages") {
                val filePath = "${System.getProperty("user.dir")}/src/main/kotlin/events.log"
                val logs = readLogFile(filePath)

                val report = generateReport(logs)
                report[0] shouldBe 10
            }

            should("return the number of errors") {
                val filePath = "${System.getProperty("user.dir")}/src/main/kotlin/events.log"
                val logs = readLogFile(filePath)

                val report = generateReport(logs)
                report[2] shouldBe 2
            }

            should("return the number of warnings") {
                val filePath = "${System.getProperty("user.dir")}/src/main/kotlin/events.log"
                val logs = readLogFile(filePath)

                val report = generateReport(logs)
                report[0] shouldBe 10
            }

            should("return the number of information") {
                val filePath = "${System.getProperty("user.dir")}/src/main/kotlin/events.log"
                val logs = readLogFile(filePath)

                val report = generateReport(logs)
                report[1] shouldBe 5
            }
        }
    },
)