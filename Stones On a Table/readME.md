# Stones on the Table

A Java solution for the Codeforces problem "Stones on the Table" from Round 163 (Div. 2), Problem A.

## Problem Description

You have `n` stones arranged in a row on a table. Each stone has a color represented by a character ('R' for red, 'G' for green, 'B' for blue, etc.). The goal is to find the minimum number of stones that need to be recolored so that no two adjacent stones have the same color.

### Constraints
- 1 ≤ n ≤ 50
- Each stone's color is represented by a lowercase English letter

### Input Format
```
n
string_of_colors
```

### Output Format
```
minimum_changes_needed
```

## Examples

### Example 1
**Input:**
```
6
RGBRGR
```
**Output:**
```
0
```
*No changes needed as no adjacent stones have the same color.*

### Example 2
**Input:**
```
4
RRGG
```
**Output:**
```
2
```
*Need to change 2 stones: one R and one G to make it valid (e.g., RBRG).*

## Algorithm

The solution uses a simple linear scan approach:

1. Read the number of stones `n` and the color string
2. Validate that the input length matches the declared number of stones
3. Iterate through the string starting from the second character
4. Count each occurrence where a stone has the same color as its previous neighbor
5. Return the total count

## Code Structure

```java
public class stonesOnATable {
    public static void main(String[] args) {
        // Input validation and processing
        // Linear scan to count adjacent duplicates
        // Output the minimum changes needed
    }
}
```

## Key Features

- **Input Validation**: Checks if the declared number of stones matches the actual string length
- **Efficient Algorithm**: O(n) time complexity with single pass through the string
- **Memory Efficient**: Uses minimal extra space
- **Error Handling**: Provides feedback for invalid input

## Usage

1. Compile the Java file:
   ```bash
   javac stonesOnATable.java
   ```

2. Run the program:
   ```bash
   java stonesOnATable
   ```

3. Enter the number of stones followed by the color string:
   ```
   5
   RRBRR
   ```

## Implementation Notes

- The `Stack<Character>` import is included but not used in the current implementation
- The solution prioritizes simplicity and readability over complex data structures
- Input validation ensures program robustness against malformed input

## Time & Space Complexity

- **Time Complexity**: O(n) - single pass through the string
- **Space Complexity**: O(1) - only using a few variables for counting
