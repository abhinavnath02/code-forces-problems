# Helpful Maths

**Time limit per test:** 2 seconds  
**Memory limit per test:** 256 megabytes

## Problem Statement

Xenia the beginner mathematician is a third year student at elementary school. She is now learning the addition operation.

The teacher has written down the sum of multiple numbers. Pupils should calculate the sum. To make the calculation easier, the sum only contains numbers 1, 2 and 3. Still, that isn't enough for Xenia. She is only beginning to count, so she can calculate a sum only if the summands follow in non-descending order. For example, she can calculate sums 1+1+3 or 1+2+2+3, but she cannot calculate sums 1+3+2 or 3+1+1+2.

You are given the sum that teacher wrote on the blackboard. Help Xenia, rearrange the summands in non-descending order so that she can calculate the sum.

### Input
The first line contains a single string `s` (1 ≤ |s| ≤ 100), containing the sum of numbers written in the format "a1+a2+...+an" where `ai` ∈ {1, 2, 3}.

### Output
Print the sum with summands rearranged in non-descending order in the same format.

### Examples

**Example 1:**
```
Input:
3+2+1

Output:
1+2+3
```

**Example 2:**
```
Input:
1+1+3+1+3

Output:
1+1+1+3+3
```

**Example 3:**
```
Input:
2

Output:
2
```

## Solution

### Algorithm Explanation

The problem asks us to rearrange the numbers in a mathematical expression so they appear in non-descending (ascending) order:

1. **Parse the input:** Extract all numbers from the string (ignoring the '+' signs)
2. **Sort the numbers:** Arrange them in ascending order
3. **Reconstruct the expression:** Join the sorted numbers with '+' signs
4. **Output the result**

### Approach Breakdown

1. **Remove '+' signs:** Use `replaceAll("\\+", "")` to get just the digits
2. **Store in a list:** Add each character (digit) to an ArrayList
3. **Sort the list:** Use `Collections.sort()` to arrange in ascending order
4. **Build result string:** Use StringBuilder to reconstruct the expression with '+' between numbers


### Step-by-Step Example

For input `"3+2+1"`:

1. **Remove '+':** `"321"`
2. **Convert to list:** `['3', '2', '1']`
3. **Sort:** `['1', '2', '3']`
4. **Rebuild with '+':** `"1+2+3"`

### Test Cases

| Input | Output | Explanation |
|-------|--------|-------------|
| `3+2+1` | `1+2+3` | Sorted: 1, 2, 3 |
| `1+1+3+1+3` | `1+1+1+3+3` | Multiple 1s and 3s grouped |
| `2` | `2` | Single number unchanged |
| `3+3+3` | `3+3+3` | Already sorted |
| `1+2+3` | `1+2+3` | Already in non-descending order |

### Time Complexity
- **O(n log n)** where n is the number of summands, due to sorting

### Space Complexity
- **O(n)** for storing the characters in the list

### Key Points
- The problem only involves digits 1, 2, and 3
- Non-descending means ascending order (≤ not just <)
- StringBuilder is efficient for string construction
- `Collections.sort()` handles the sorting automatically
