# Recursion

Recursion is where you call a function again and again, within itself. <br><br>
A Recursive function has 2 components.

- Base case - The case that ends recursion
- Recursive case - The case that calls the function again and again

<br>
Recursion helps in solving big problems by splitting the problem into multiple sub problems. <br>
<br>

Using recursion, we only need to know...

- The soltion to the simplest sub problem (base case)
- And how the sub-problems merge together (recursive case)

## How to optimize recursion?

Recursion uses stacks for the function call. The stack memory is limited. Using Iteration over Recursion is recommended.<br> <br>
We can use a Dynamic Programming technique called "Memoization" to speed up the process by not calculating the already calculated sub-problems
