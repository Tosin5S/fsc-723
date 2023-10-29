# Learning begins at a point ....
# fsc-723
Introduction to Programming... Learning the basics.

## Programming Control Structures

| Type of Control Structure | Description | Example |
|---|---|---|
| Sequential | The statements in the control structure are executed in order, one after the other. | `int a = 1; int b = 2; System.out.println(a + b);` |
| Branching Decision | The statements in the control structure are executed based on the evaluation of a condition. | `if (a > b) { System.out.println("a is greater than b."); } else { System.out.println("b is greater than a."); }` |
| Evening Repetition/Iteration | The statements in the control structure are executed repeatedly, either on fulfilling a condition or for some number of times. | `for (int i = 0; i < 10; i++) { System.out.println(i); }` |

### Java Control Structures

| Type of Control Structure | Syntax | Example |
|---|---|---|
| if/else | `if (condition) { statements to execute if condition is true; } else { statements to execute if condition is false; }` | `int age = 25; if (age >= 18) { System.out.println("You are an adult."); } else { System.out.println("You are not an adult yet."); }` |
| switch | `switch (variable) { case value1: statements to execute if variable equals value1; break; case value2: statements to execute if variable equals value2; break; default: statements to execute if variable does not equal any of the other cases; }` | `String dayOfWeek = "Monday"; switch (dayOfWeek) { case "Monday": System.out.println("It's Monday!"); break; case "Tuesday": System.out.println("It's Tuesday!"); break; default: System.out.println("It's not Monday or Tuesday."); }` |
| for | `for (initialization; condition; increment) { statements to execute repeatedly; }` | `int[] numbers = {1, 2, 3, 4, 5}; for (int i = 0; i < numbers.length; i++) { System.out.println(numbers[i]); }` |
| while | `while (condition) { statements to execute repeatedly while the condition is true; }` | `int i = 0; while (i < 10) { System.out.println(i); i++; }` |
| do/while | `do { statements to execute at least once; } while (condition);` | `int i = 0; do { System.out.println(i); i++; } while (i < 10);` |

### Python Control Structures

| Type of Control Structure | Syntax | Example |
|---|---|---|
| if/else | `if condition: statements to execute if condition is true; else: statements to execute if condition is false;` | `age = 25; if age >= 18: print("You are an adult.") else: print("You are not an adult yet.")` |
| elif | `elif condition: statements to execute if condition is true;` | `dayOfWeek = "Monday"; if dayOfWeek == "Monday": print("It's Monday!") elif dayOfWeek == "Tuesday": print("It's Tuesday!") else: print("It's not Monday or Tuesday.")` |
| for | `for variable in iterable: statements to execute repeatedly;` | `numbers = [1, 2, 3, 4, 5]; for number in numbers: print(number)` |
| while | `while condition: statements to execute repeatedly while the condition is true;` | `i = 0; while i < 10: print(i); i += 1` |
| else | `else: statements to execute after the while loop has exited, even if the condition was never met;` | `i = 0; while i < 10: print(i); i += 1; else: print("The while loop has exited.")`
