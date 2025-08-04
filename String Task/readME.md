# String Task - Codeforces Problem

## Problem Description

This program solves a string manipulation problem where we need to transform a given string by removing vowels and adding dots before consonants.

## Problem Statement

Given a string, perform the following transformations:
1. Convert the string to lowercase
2. Remove all vowels (a, e, i, o, u, y)
3. Insert a dot '.' before each remaining consonant

## Input Format

- Single line: A string containing English letters

## Output Format

- Single line: The transformed string

## Algorithm

1. Read the input string
2. Convert it to lowercase
3. Iterate through each character:
   - If it's a vowel (a, e, i, o, u, y), skip it
   - If it's a consonant, add '.' followed by the character to result
4. Output the transformed string

## Example

### Input
```
tour
```

### Output
```
.t.r
```

### Explanation
- Original: "tour"
- Lowercase: "tour"
- Remove vowels 'o' and 'u': "tr"
- Add dots before consonants: ".t.r"

## Implementation Details

The solution uses:
- `Scanner` for input reading
- `StringBuilder` for efficient string building
- `isVowel()` helper method to check if a character is a vowel
- Character-by-character processing in a loop


## Time Complexity
- **Time**: O(n) - Single pass through the input string
- **Space**: O(n) - For the StringBuilder to store the result


Then provide the input string.

## Test Cases

| Input | Output |
|-------|--------|
| tour | .t.r |
| Codeforces | .c.d.f.r.c.s |
| aaaaaa | (empty string) |
| bcdfg | .b.c.d.f.g |

## Notes

- The problem treats 'y' as a vowel (along with a, e, i, o, u)
- The output may be an empty string if the input contains only vowels
- Case conversion is handled before vowel checking
- StringBuilder is used for efficient string concatenation
