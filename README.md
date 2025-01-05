# Improper Exception Re-throwing in Java

This repository demonstrates a common, yet subtle error in Java exception handling: improperly re-throwing an exception. The original code contains a `try-catch` block that attempts to handle an `ArithmeticException`. Instead of gracefully handling the exception or logging it, it wraps it in a `RuntimeException`, losing valuable diagnostic information. This makes debugging more challenging.

The solution provided focuses on appropriate exception handling techniques.  It shows better ways to manage the `ArithmeticException`, enabling more robust and informative error handling.