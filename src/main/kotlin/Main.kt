import java.io.File

fun main() {
    val filePath = "${System.getProperty("user.dir")}/src/main/kotlin/events.log"
    val logs = readLogFile(filePath)

    val report = generateReport(logs)

    println("=== Log file report ===")
    println("Information: ${report[1]}")
    println("Error: ${report[2]}")
    println("Warning: ${report[3]}")
}

fun readLogFile(filePath: String): List<String> {
    return File(filePath).readLines()
}

fun generateReport(logs: List<String>): List<Int> {
    var total = logs.size
    var warning = logs.count { log -> log.contains("INFO")}
    var information = logs.count { log -> log.contains("INFO")}
    var error = logs.count { log -> log.contains("ERROR")}

    return listOf(total, information, error, warning)
}
