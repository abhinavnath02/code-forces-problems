# A. Watermelon

**Time limit per test:** 1 second  
**Memory limit per test:** 64 megabytes

## Problem Statement

One hot summer day Pete and his friend Billy decided to buy a watermelon. They chose the biggest and the ripest one, in their opinion. After that the watermelon was weighed, and the scales showed *w* kilos. They rushed home, dying of thirst, and decided to divide the berry, however they faced a hard problem.

Pete and Billy are great fans of even numbers, that's why they want to divide the watermelon in such a way that each of the two parts weighs even number of kilos, at the same time it is not obligatory that the parts are equal. The boys are extremely tired and want to start their meal as soon as possible, that's why you should help them and find out, if they can divide the watermelon in the way they want. For sure, each of them should get a part of positive weight.

### Input
The first (and the only) input line contains integer number *w* (1 ≤ *w* ≤ 100) — the weight of the watermelon bought by the boys.

### Output
Print YES, if the boys can divide the watermelon into two parts, each of them weighing even number of kilos; and NO in the opposite case.

### Example

**Input:**
```
8
```

**Output:**
```
YES
```

**Note:**
For example, the boys can divide the watermelon into two parts of 2 and 6 kilos respectively (another variant — two parts of 4 and 4 kilos).

## Solution

### Problem Analysis

The key insight is that we need to divide a watermelon of weight `w` into two parts where:
1. Both parts have even weights
2. Both parts have positive weights (greater than 0)

Let's think about this mathematically:
- If we have two even numbers `a` and `b`, their sum `a + b` is always even
- So if `w` is odd, it's impossible to divide it into two even parts
- If `w` is even and `w > 2`, we can always find a valid division
- If `w = 2`, the only division would be `1 + 1`, but 1 is odd, so it's invalid

### Algorithm

The solution is surprisingly simple:
1. Check if `w` is even AND greater than 2
2. If yes, print "YES"
3. Otherwise, print "NO"

### Why This Works

- **Case 1: w is odd** → Impossible (sum of two even numbers cannot be odd)
- **Case 2: w = 2** → Only division is 1+1, but 1 is odd → Impossible
- **Case 3: w is even and w > 2** → Always possible
  - Example: w = 4 → 2 + 2 ✓
  - Example: w = 6 → 2 + 4 ✓
  - Example: w = 8 → 2 + 6 or 4 + 4 ✓

### Test Cases

| Input | Output | Explanation |
|-------|--------|-------------|
| 8 | YES | Can be divided as 2+6 or 4+4 |
| 2 | NO | Only division is 1+1, but 1 is odd |
| 3 | NO | Odd number cannot be sum of two even numbers |
| 4 | YES | Can be divided as 2+2 |

### Time Complexity
- **O(1)** - Simple arithmetic operations

### Space Complexity
- **O(1)** - Only using a few variables
