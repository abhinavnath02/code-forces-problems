# Next Round

## Problem Description

This program solves a competitive programming problem where we need to determine how many participants advance to the next round of a contest.

## Problem Statement

Given `n` participants and their scores, find how many participants will advance to the next round. A participant advances if:
1. Their score is positive (> 0)
2. Their score is at least as high as the k-th place finisher's score

## Input Format

- First line: Two integers `n` and `k`
  - `n`: Number of participants (1 ≤ n ≤ 50)
  - `k`: The k-th place position used as reference (1 ≤ k ≤ n)
- Second line: `n` space-separated integers representing participant scores

## Output Format

Single integer: Number of participants who advance to the next round

## Algorithm

1. Read the number of participants `n` and reference position `k`
2. Read all participant scores into an array
3. Find the cutoff score (score of the k-th place finisher)
4. Count participants whose scores are both:
   - Greater than 0
   - Greater than or equal to the cutoff score

## Example

### Input
```
8 5
10 9 8 7 6 5 5 4
```

### Output
```
6
```

### Explanation
- 8 participants, 5th place finisher has score 6
- Participants with scores ≥ 6 and > 0: [10, 9, 8, 7, 6, 6]
- Count: 6 participants advance

## Time Complexity
- **Time**: O(n) - Single pass through the scores array
- **Space**: O(n) - Storage for the scores array



## Notes

- The solution handles the case where multiple participants have the same score as the k-th place finisher
- Only participants with positive scores can advance
- Array indexing uses 0-based indexing internally, so k-1 is used to access the k-th position
