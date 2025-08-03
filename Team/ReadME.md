# Team (Problem 231A)

This repository contains a solution to the "Team" problem from Codeforces.

## Problem Statement

Petya, Vasya, and Tonya are three friends who have formed a team for programming contests. They've decided to implement a solution to a problem only if at least two of them are confident in the solution.

You are given the number of problems, `n`, and for each problem, you are told whether each of the three friends is sure about the solution. A `1` indicates confidence, and a `0` indicates a lack of confidence.

Your task is to determine the total number of problems the team will choose to solve.

### Input
- The first line contains a single integer, `n` (1 <= n <= 1000), representing the number of problems.
- The next `n` lines each contain three space-separated integers (`0` or `1`), representing the confidence level of Petya, Vasya, and Tonya, respectively.

### Output
- A single integer representing the number of problems the team will solve.

### Example

**Input:**
```
3
1 1 0
1 1 1
1 0 0
```

**Output:**
```
2
```

## Solution Explanation

The core of the problem is to count how many problems have at least two friends who are sure about the solution. We can approach this by iterating through each problem and checking the condition.

### Algorithm Steps

1. **Read the number of problems:** First, read the integer `n` to know how many problems to process.

2. **Initialize a counter:** Create a variable, for example, `solvedCount`, and initialize it to `0`. This variable will keep track of the total number of problems solved.

3. **Loop through each problem:** Use a loop that runs `n` times. In each iteration, you are processing a new problem.

4. **Check the condition:** Inside the loop, read the three integers for the current problem. A simple way to check the condition is to sum the three integers. Since a `1` represents a "sure" vote and a `0` represents a "not sure" vote, the sum will directly tell you how many friends are confident.

5. **Increment the counter:** If the sum of the three integers is `2` or greater, it means at least two friends are sure. In this case, increment the `solvedCount` variable.

6. **Print the result:** After the loop has finished processing all `n` problems, print the final value of `solvedCount`.

This straightforward approach efficiently solves the problem by using a single loop and a simple conditional check for each problem.
