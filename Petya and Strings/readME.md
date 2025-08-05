# Petya and Strings

Little Petya loves to present flowers to his mother, but this problem is actually about string comparison.

Given two strings, we need to compare them lexicographically (dictionary order), ignoring case:
- If the first string is lexicographically smaller, return -1
- If the first string is lexicographically larger, return 1  
- If the strings are equal (ignoring case), return 0

### Input
- Two lines, each containing a string consisting of uppercase and/or lowercase English letters
- The length of each string is at most 100 characters

### Output
- Print -1, 0, or 1 depending on the lexicographical comparison result

### Examples

**Example 1:**
```
Input:
aaaa
aaaA

Output:
0
```

**Example 2:**
```
Input:
abs
Abz

Output:
-1
```

**Example 3:**
```
Input:
abcdefg
AbCdEfF

Output:
1
```

## Solution

### Algorithm Explanation

The problem requires case-insensitive lexicographical comparison of two strings:

1. **Read two strings** from input
2. **Compare them lexicographically** while ignoring case
3. **Output the result:**
   - `-1` if first string < second string
   - `0` if first string = second string  
   - `1` if first string > second string

### Key Concepts

**Lexicographical Order:** Similar to dictionary ordering where strings are compared character by character from left to right. For example:
- "apple" < "banana" (because 'a' < 'b')
- "cat" < "catch" (because "cat" is a prefix of "catch")

**Case-Insensitive:** 'A' and 'a' are treated as the same character.


### Method Explanation

**`compareToIgnoreCase()`** method:
- Returns negative integer if first string is lexicographically less than second
- Returns positive integer if first string is lexicographically greater than second  
- Returns 0 if strings are equal (ignoring case)

Since the problem requires exactly -1, 0, or 1, we normalize the result using conditional statements.

### Test Cases

| First String | Second String | Expected Output | Explanation |
|--------------|---------------|-----------------|-------------|
| "aaaa" | "aaaA" | 0 | Equal when ignoring case |
| "abs" | "Abz" | -1 | 's' < 'z' lexicographically |
| "abcdefg" | "AbCdEfF" | 1 | 'g' > 'f' lexicographically |
| "Hello" | "hello" | 0 | Equal when ignoring case |
| "abc" | "abd" | -1 | 'c' < 'd' lexicographically |

### Time Complexity
- **O(min(n, m))** where n and m are the lengths of the two strings

### Space Complexity  
- **O(1)** additional space (not counting input storage)

