# Beautiful Matrix

**Time limit per test:** 2 seconds  
**Memory limit per test:** 256 megabytes

## Problem Statement

You've got a 5×5 matrix, consisting of 24 zeroes and a single one. Let's index the matrix rows by numbers from 1 to 5 from top to bottom, let's index the matrix columns by numbers from 1 to 5 from left to right.

In one move, you are allowed to apply one of the two following changes to the matrix:
1. Swap two neighboring rows of the matrix.
2. Swap two neighboring columns of the matrix.

You've got to find the minimum number of moves needed to make the matrix beautiful. A matrix is beautiful if the single one is located in its middle (at position (3,3) when using 1-based indexing, or (2,2) when using 0-based indexing).

### Input
The input consists of five lines, each line contains five integers `aij` (0 ≤ aij ≤ 1). It's guaranteed that the matrix consists of 24 zeroes and exactly one 1.

### Output
Output a single integer — the minimum number of moves needed to make the matrix beautiful.

### Examples

**Example 1:**
```
Input:
0 0 0 0 0
0 0 0 0 1
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0

Output:
3
```

**Example 2:**
```
Input:
0 0 0 0 0
0 0 0 0 0
0 0 1 0 0
0 0 0 0 0
0 0 0 0 0

Output:
0
```

**Example 3:**
```
Input:
1 0 0 0 0
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0

Output:
4
```

## Solution

### Algorithm Explanation

The key insight is that we need to move the single '1' to the center of the matrix at position (2,2) using 0-based indexing. Since we can only swap adjacent rows or columns, the minimum number of moves is simply the **Manhattan Distance** from the current position to the center.

**Manhattan Distance Formula:**
```
distance = |current_row - target_row| + |current_col - target_col|
```

Where target position is (2,2) in 0-based indexing.

### Step-by-Step Approach

1. **Read the 5×5 matrix** from input
2. **Find the position of '1'** by scanning the entire matrix
3. **Calculate Manhattan distance** from current position to center (2,2)
4. **Return the distance** as the minimum number of moves

### Why This Works

- **Row swaps:** Each adjacent row swap moves the '1' one position up or down
- **Column swaps:** Each adjacent column swap moves the '1' one position left or right
- **Optimal path:** The shortest path is always the Manhattan distance (no diagonal moves possible)
- **No redundant moves:** Each move brings us one step closer to the target


### Step-by-Step Examples

**Example 1:** '1' at position (1,4) → target (2,2)
```
Current position: (1, 4)
Target position:  (2, 2)
Row moves needed: |1 - 2| = 1
Col moves needed: |4 - 2| = 2
Total moves: 1 + 2 = 3
```

**Example 2:** '1' at position (2,2) → target (2,2)
```
Current position: (2, 2) 
Target position:  (2, 2)
Row moves needed: |2 - 2| = 0
Col moves needed: |2 - 2| = 0
Total moves: 0 + 0 = 0
```

**Example 3:** '1' at position (0,0) → target (2,2)
```
Current position: (0, 0)
Target position:  (2, 2)
Row moves needed: |0 - 2| = 2
Col moves needed: |0 - 2| = 2
Total moves: 2 + 2 = 4
```

### Visual Representation

```
Matrix positions (0-based indexing):
(0,0) (0,1) (0,2) (0,3) (0,4)
(1,0) (1,1) (1,2) (1,3) (1,4)
(2,0) (2,1) (2,2) (2,3) (2,4)  ← Center at (2,2)
(3,0) (3,1) (3,2) (3,3) (3,4)
(4,0) (4,1) (4,2) (4,3) (4,4)
```

### Test Cases

| Position of '1' | Coordinates | Distance Calculation | Result |
|-----------------|-------------|----------------------|--------|
| Top-left corner | (0,0) | \|0-2\| + \|0-2\| = 2+2 | 4 |
| Top-right corner | (0,4) | \|0-2\| + \|4-2\| = 2+2 | 4 |
| Bottom-left corner | (4,0) | \|4-2\| + \|0-2\| = 2+2 | 4 |
| Bottom-right corner | (4,4) | \|4-2\| + \|4-2\| = 2+2 | 4 |
| Center | (2,2) | \|2-2\| + \|2-2\| = 0+0 | 0 |
| Middle of top row | (0,2) | \|0-2\| + \|2-2\| = 2+0 | 2 |

### Time Complexity
- **O(1)** - We always scan a 5×5 matrix (constant size)

### Space Complexity
- **O(1)** - Only using a few variables for calculation

### Key Insights

1. **Manhattan Distance is optimal** - No shorter path exists with adjacent swaps only
2. **Matrix scanning is straightforward** - Simple nested loop to find the '1'
3. **Math.abs() handles direction** - Works regardless of which side of center the '1' is on
4. **Problem guarantees exactly one '1'** - No need to handle edge cases
