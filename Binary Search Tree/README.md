## What is BST ?


![qpsgkhgccjrjn9ybxb6l](https://user-images.githubusercontent.com/97989643/175465238-5df21823-72d6-41ce-9ec8-d7498740a082.gif)



**a. Left Subtree Nodes < Root < Right Subtree Nodes (Binary Search Tree)**

**b. Left & Right Subtree Nodes are also Binary Search Tree with no duplicate values** 

**c. You can see on the image that every node follows the above rules. that left subtree nodes are less than root and right subtree nodes are greater than root.**


### 1. Special Properties of BST

**Inorder Traversal of BST is sorted in ascending order. So, if we traverse BST inorder, we will get sorted array.** 
**Smaller elements are on the left side of the root and larger elements are on the right side of the root.**


### 2. BST Search

#### What is binary search?


![binary-search](https://user-images.githubusercontent.com/97989643/175469644-73df90d5-e475-45cd-ab63-04492bf06d70.gif)

**If key is less than mid-element then that key is in left side now we search for mid of the left side. 
now if key is lesser than mid of the left side then we search in left side.Now if key is matching mid of the left side then we found the key.**


**Steps to find the key with BS**
- Compare x with the middle element.
- If x matches with the middle element, we return the mid-index.
- Else If x is greater than the mid-element, then x can only lie in the right half subarray after the mid-element. So we recur for the right half.
- Else (x is smaller) recur for the left half.

