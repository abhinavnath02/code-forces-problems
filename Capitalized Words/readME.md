# Word Capitalization

**Time limit per test:** 2 seconds  
**Memory limit per test:** 256 megabytes

## Problem Statement

Capitalization is writing a word with its first letter as a capital letter and the remaining letters in lower case. For example, "hELLo" properly capitalized is "Hello".

Given a word, you need to have the first letter as an uppercase letter, and leave the other letters as they are (not necessarily lowercase).

### Input
The first line contains a single word consisting of uppercase and lowercase English letters. The length of the word will not exceed 1000 characters.

### Output
Output the word after making the first letter uppercase. The other letters should remain unchanged.

### Examples

**Example 1:**
```
Input:
hELLo

Output:
HELLo
```

**Example 2:**
```
Input:
wORLD

Output:
WORLD
```

**Example 3:**
```
Input:
HaPpY

Output:
HaPpY
```

## Solution

### Algorithm Explanation

The problem is straightforward - we need to capitalize only the first character of a word while keeping all other characters unchanged:

1. **Read the input word**
2. **Capitalize the first character** using `Character.toUpperCase()`
3. **Keep the rest of the word unchanged** using `substring(1)`
4. **Concatenate and output** the result

### Key Points

- Only the **first character** needs to be capitalized
- **All other characters** remain exactly as they were in the input
- This is different from standard capitalization where remaining letters become lowercase
- The word length can be up to 1000 characters

### Method Breakdown

**`Character.toUpperCase(input.charAt(0))`:**
- Gets the first character at index 0
- Converts it to uppercase
- If already uppercase, remains unchanged

**`input.substring(1)`:**
- Extracts all characters from index 1 to the end
- Keeps them exactly as they appear in the original string

**String Concatenation:**
- Combines the capitalized first character with the unchanged remainder

### Step-by-Step Examples

**Example 1: "hELLo"**
1. First character: `'h'` → `Character.toUpperCase('h')` → `'H'`
2. Remainder: `"ELLo"` → stays `"ELLo"`
3. Result: `"H" + "ELLo"` → `"HELLo"`

**Example 2: "wORLD"**
1. First character: `'w'` → `Character.toUpperCase('w')` → `'W'`
2. Remainder: `"ORLD"` → stays `"ORLD"`
3. Result: `"W" + "ORLD"` → `"WORLD"`

**Example 3: "HaPpY"**
1. First character: `'H'` → `Character.toUpperCase('H')` → `'H'` (no change)
2. Remainder: `"aPpY"` → stays `"aPpY"`
3. Result: `"H" + "aPpY"` → `"HaPpY"`

### Edge Cases

| Input | Output | Explanation |
|-------|--------|-------------|
| `"a"` | `"A"` | Single lowercase letter |
| `"A"` | `"A"` | Single uppercase letter (no change) |
| `"hello"` | `"Hello"` | All lowercase word |
| `"HELLO"` | `"HELLO"` | All uppercase word (no change) |
| `"tEST"` | `"TEST"` | Mixed case word |


### Time Complexity
- **O(n)** where n is the length of the string (due to substring operation)

### Space Complexity
- **O(n)** for creating the new string

### Common Mistakes to Avoid

1. **Don't convert the entire string to lowercase first** - other characters should remain unchanged
2. **Handle single character strings** - make sure substring(1) doesn't cause issues
3. **Remember that if the first character is already uppercase, it stays uppercase**
