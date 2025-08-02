# A. Way Too Long Words

**Time limit per test:** 1 second  
**Memory limit per test:** 256 megabytes

## Problem Statement

Sometimes some words like "localization" or "internationalization" are so long that writing them many times in one text is quite tiresome.

Let's consider a word *too long*, if its length is **strictly more** than 10 characters. All too long words should be replaced with a special abbreviation.

This abbreviation is made like this: we write down the first and the last letter of a word and between them we write the number of letters between the first and the last letters. That number is in decimal system and doesn't contain any leading zeroes.

Thus, "localization" will be spelt as "l10n", and "internationalization" will be spelt as "i18n".

You are suggested to automatize the process of changing the words with abbreviations. At that all too long words should be replaced by the abbreviation and the words that are not too long should not undergo any changes.

### Input
The first line contains an integer *n* (1 ≤ *n* ≤ 100). Each of the following *n* lines contains one word. All the words consist of lowercase Latin letters and possess the lengths of from 1 to 100 characters.

### Output
Print *n* lines. The *i*-th line should contain the result of replacing of the *i*-th word from the input data.

### Example

**Input:**
```
4
word
localization
internationalization
pneumonoultramicroscopicsilicovolcanoconiosis
```

**Output:**
```
word
l10n
i18n
p43s
```

## Solution

### Algorithm Explanation

The solution involves checking each word's length and applying the abbreviation rule when necessary:

1. **Read the number of words** `n`
2. **For each word:**
   - If the word length is ≤ 10 characters, keep it unchanged
   - If the word length is > 10 characters, create abbreviation:
     - Take the first character
     - Calculate the number of characters between first and last (length - 2)
     - Take the last character
     - Combine them as: `first + count + last`

### Key Points

- **Condition Check:** Words with length > 10 characters are abbreviated
- **Abbreviation Format:** `first_letter + middle_count + last_letter`
- **Middle Count Calculation:** `word.length() - 2` (excluding first and last characters)
- **Edge Cases:** Words with 10 or fewer characters remain unchanged

### Time Complexity
- **O(n)** where n is the number of words, as we process each word once

### Space Complexity
- **O(1)** additional space, not counting input storage

This solution efficiently handles the word abbreviation requirements and works within the given constraints.
