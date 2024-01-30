# Question Topic - Populating Next Right Pointers in Each Node II


## Link - https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii/description/?envType=study-plan-v2&envId=top-interview-150

## Description

Given a binary tree

```
struct Node {
  int val;
  Node *left;
  Node *right;
  Node *next;
}
```
Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.

Initially, all next pointers are set to NULL.

## Constraints:

The number of nodes in the tree is in the range [0, 6000].

-100 <= Node.val <= 100
