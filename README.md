# Calculator

Small Java 17 Maven calculator with JUnit 5 tests.

Build and test with Maven installed:

```
mvn clean package
```

Run:

```
java -jar target/calculator-1.0.0.jar 10 + 5
java -jar target/calculator-1.0.0.jar 10 - 5
java -jar target/calculator-1.0.0.jar 10 x 5
java -jar target/calculator-1.0.0.jar 10 / 5
```

Supports decimals and negative numbers. Multiplication accepts x or *, but use x to avoid shell wildcard expansion. Invalid input and division by zero print an error and exit with status 1.
