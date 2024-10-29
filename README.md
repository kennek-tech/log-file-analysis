# Challenge: Log File Analysis

## Scenario: 

You work for a company that maintains a web application. The application generates log files with details about user interactions, errors, and system messages. These log files are crucial for monitoring the health of the application, understanding user behaviour, and debugging issues. However, the volume of logs is enormous, making it difficult to analyse the data manually.

Each line in the log file follows this format:
```[Timestamp] [Log Level] [Message]```

For example:
```
2024-03-12 08:21:34 INFO User logged in successfully. 
2024-03-12 08:22:47 WARNING User session expired 
2024-03-12 08:23:53 ERROR Database connection failed.
```

Another engineer has thrown together a simple program that analyses a sample log file and provides some insights into the type of messages logged. You suspect this program has bugs because this engineer was working on 5 different things as once and often raised PRs after midnight.

## Task: 

Your task is to take over this program, address any bugs you discover, and add new features requested from the business. Please make sure you can run this program locally, but **do not** make any changes to it ahead of the interview.


