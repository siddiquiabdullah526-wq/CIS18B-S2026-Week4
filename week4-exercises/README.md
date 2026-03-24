# Week 4 Exercises: Exceptions, Debugging, and Error Handling

This package contains 10 assignments for you to complete on the topic of Exceptions, Debugging, and Error Handling.

Each assignment has its own folder, starter code, and local README.

## Suggested package naming
Use the package names already included in the starter files.

## General submission expectations
- Complete the TODOs in each assignment.
- Keep class names and package names unchanged unless your instructor says otherwise.
- Make sure each assignment compiles before submission.
- For Mini 10, make sure the tests run with `mvn test`.

## Folders
1. `mini01-built-in-exceptions`
2. `mini02-finally-cleanup`
3. `mini03-custom-exception`
4. `mini04-fail-fast-validation`
5. `mini05-debugging-lab`
6. `mini06-exception-translation`
7. `mini07-alert-service`
8. `mini08-observer-pattern`
9. `mini09-decorator-pattern`
10. `mini10-junit-exception-testing`


REFLECTION QUESTIONS:
1) The main difference between checked and unchecked exceptions is the way in which they are handled by the compiler, and when they usually occur. Checked exceptions are exceptions that the compiler makes you either declare using the 'throws' keyword or by utilizing a try-catch block. On the other hand, unchecked exceptions aren't checked at the time of compiling and they don't require explicit handling.

2) You should create a custom exception when a program faces an error condition that is unique to your application's domain and cannot be meaningfully represented by the existing built-in exceptions. Custom exceptions enhance the readability and maintainability of your code by providing clear, descriptive names that explain what went wrong.

3) Exception translation is useful in layered systems because it stops low level implementation details from being exposed or leaked into higher layers of the application. As a result, this makes the system easier to maintain and understand.

4) The Observer pattern improves error reporting by enabling various components to be automatically informed when an error or event takes place, without creating a tight coupling to the error's source. Rather than having a single system manage all error responses, different observers can respond in their own way when an alert is triggered. This makes error handling much more flexible and scalable.
