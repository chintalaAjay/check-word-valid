# Check If Word Is Valid After Substitutions

## Problem Link
https://leetcode.com/problems/check-if-word-is-valid-after-substitutions/

## Description
Given a string `s`, determine whether it is valid.

A string is considered valid if it can be formed by repeatedly inserting the substring `"abc"` into an empty string any number of times.

Return `true` if the string is valid; otherwise, return `false`.

---

## Approach

I used a **Stack** to simulate the removal of the substring `"abc"`.

- Traverse each character in the string.
- If the current character is not `'c'`, push it onto the stack.
- When `'c'` is encountered:
  - Check whether there are at least two characters in the stack.
  - Pop the top two characters.
  - Verify that they are `'b'` and `'a'` respectively.
  - If not, return `false`.
- After processing all characters, the stack should be empty for the string to be valid.

This approach effectively removes every occurrence of `"abc"` as it appears.

---

## Algorithm

1. Create an empty stack.
2. Traverse each character in the string.
3. If the character is not `'c'`, push it onto the stack.
4. If the character is `'c'`:
   - Check if the stack contains at least two characters.
   - Pop two characters from the stack.
   - Verify they form `"ab"` before the current `'c'`.
   - If not, return `false`.
5. After traversal, return `true` if the stack is empty; otherwise return `false`.

---

## Complexity Analysis

- **Time Complexity:** O(n)
- **Space Complexity:** O(n)

where `n` is the length of the string.

---

## Java Solution

```java
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char x : s.toCharArray()) {
            if (x != 'c') {
                stack.push(x);
            } else {
                if (stack.size() >= 2) {
                    char pop1 = stack.pop();
                    char pop2 = stack.pop();

                    if (pop1 != 'b' || pop2 != 'a') {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
```

---

## Example

### Input
```
"abcabc"
```

### Output
```
true
```

### Input
```
"abccba"
```

### Output
```
false
```

---

## Concepts Used

- Stack
- String Traversal
- Pattern Matching
- Character Processing

---

## Author

Ajay Chintala

GitHub: https://github.com/chintalaAjay
