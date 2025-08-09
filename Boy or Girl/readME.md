# Boy or Girl

**Time limit per test:** 1 second  
**Memory limit per test:** 256 megabytes

## Problem Statement

Those days, many boys use beautiful girls' photos as avatars in forums. So it is pretty hard to tell the gender of a user at the first glance. Last year, our hero went to a forum and had a nice chat with a beauty (he thought). After that they talked very often and eventually they became a couple in the game.

But yesterday, he came to see "her" in the real world and found out "she" is actually a guy! Our hero is very sad and he is crying all the time.

To help him, his friend came up with a way to distinguish boys and girls:
- If the number of distinct characters in one's username is **odd**, then he is a **male**.
- If the number of distinct characters in one's username is **even**, then she is a **female**.

You are given a username. Please help our hero's friend to determine the gender of this user by his/her username.

### Input
The first line contains a non-empty string, that contains only lowercase English letters — the username. The length of the username will not exceed 100 characters.

### Output
If it is a female (even number of distinct characters), print "CHAT WITH HER!". Otherwise (odd number of distinct characters), print "IGNORE HIM!".

### Examples

**Example 1:**
```
Input:
wjmzbmr

Output:
CHAT WITH HER!
```

**Example 2:**
```
Input:
xiaodao

Output:
IGNORE HIM!
```

**Example 3:**
```
Input:
sevenkplus

Output:
CHAT WITH HER!
```

## Solution

### Algorithm Explanation

The problem requires us to determine gender based on the number of unique (distinct) characters in a username:

1. **Count distinct characters** in the username
2. **Check if the count is odd or even:**
   - **Odd count** → Male → Print "IGNORE HIM!"
   - **Even count** → Female → Print "CHAT WITH HER!"

### Approach

We use a **HashSet** to automatically handle uniqueness:
1. **Iterate through each character** in the string
2. **Add each character to the HashSet** (duplicates are automatically ignored)
3. **Get the size of the HashSet** (number of distinct characters)
4. **Apply the gender rule** and output the result


### Step-by-Step Examples

**Example 1: "wjmzbmr"**
1. **Characters:** w, j, m, z, b, m, r
2. **Unique characters:** {w, j, m, z, b, r} → 6 distinct characters
3. **6 is even** → Female → "CHAT WITH HER!"

**Example 2: "xiaodao"** 
1. **Characters:** x, i, a, o, d, a, o
2. **Unique characters:** {x, i, a, o, d} → 5 distinct characters  
3. **5 is odd** → Male → "IGNORE HIM!"

**Example 3: "sevenkplus"**
1. **Characters:** s, e, v, e, n, k, p, l, u, s
2. **Unique characters:** {s, e, v, n, k, p, l, u} → 8 distinct characters
3. **8 is even** → Female → "CHAT WITH HER!"

### Why HashSet?

**HashSet advantages:**
- **Automatic uniqueness:** Duplicate characters are ignored
- **O(1) insertion:** Very fast to add elements
- **Easy size calculation:** `.size()` gives us the count directly


### Test Cases

| Username | Unique Characters | Count | Gender | Output |
|----------|-------------------|-------|--------|---------|
| `wjmzbmr` | w,j,m,z,b,r | 6 | Even → Female | "CHAT WITH HER!" |
| `xiaodao` | x,i,a,o,d | 5 | Odd → Male | "IGNORE HIM!" |
| `sevenkplus` | s,e,v,n,k,p,l,u | 8 | Even → Female | "CHAT WITH HER!" |
| `aa` | a | 1 | Odd → Male | "IGNORE HIM!" |
| `ab` | a,b | 2 | Even → Female | "CHAT WITH HER!" |

### Time Complexity
- **O(n)** where n is the length of the username (iterate through each character once)

### Space Complexity
- **O(k)** where k is the number of distinct characters (at most 26 for lowercase English letters)

### Key Insights

1. **HashSet automatically handles duplicates** - no need for manual checking
2. **Enhanced for-loop with toCharArray()** is clean and readable  
3. **Ternary operator** makes the gender determination concise
4. **Modular design** with separate method makes the code testable and reusable

This solution efficiently determines gender based on the unique character count rule using Java's built-in data structures.
