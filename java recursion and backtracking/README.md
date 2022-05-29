## Chapter List
*******
[Recursion](#recursion) 

[**Basic**](#basic)  
   * [*What is recursion ?*](#what-is-recursion-)
   * [*Syntax ?*](#syntax-)
   * [*Note*](#note)

[**Level 1(Problems)**](#level-1problems)
* [**1. Print Numbers from 5 to 1**](#1-print-numbers-from-5-to-1)
* [**2. Print Numbers from 1 to 5**](#2-print-numbers-from-1-to-5)
* [**3. Print sum of first n natural numbers**](#3-print-sum-of-first-n-natural-numbers)
* [**4. Print Factorial of a number n**](#4-print-factorial-of-a-number-n)
* [**5. Print the fibonacci sequence till nth term**](#5-print-the-fibonacci-sequence-till-nth-term)
* [**6. Print x<sup>n (stack height = n)**](#6-print)
* [**7. Print x<sup>n (stack height = logn))**](#7-print)

[**Level 2(Problems)**]()
* [**8. Tower of Hanoi**](#8-tower-of-hanoi)
* [**9. print a string in reverse**](#9-print-a-string-in-reverse)
* [**10. Find the occurrence of the first and last occurrence of an element using recursion.**](#10-find-the-occurrence-of-the-first-and-last-occurrence-of-an-element-using-recursion)
* [**11. Check if an array is sorted (strictly increasing) - O(n)**](#11-check-if-an-array-is-sorted-strictly-increasing---on)
* [**12. Move all ‘x’ to the end of the string - O(n)**](#12-move-all-x-to-the-end-of-the-string---on)
* [**13. Remove duplicates in a string.**](#13-remove-duplicates-in-a-string)
* [**14. Print all the subsequences of a string.**](#14-print-all-the-subsequences-of-a-string)
* [**15. Print all unique subsequences of a string.**](#15-print-all-unique-subsequences-of-a-string)
* [**16. Print Keypad Combinations.**](#16-print-keypad-combinations)

[**Level 3(Problems)**]()
* [**17.print all permutations of a given string**](#17-print-all-the-permutations-of-a-string)
* [****](#)
* [****](#)
* [****](#)
* [****](#)

# Recursion

## Basic 
### What is recursion ?
```javascript
Recursion in java is a process in which a method calls itself continuously. 
A method in java that calls itself is called recursive method.
It makes the code compact but complex to understand.
```
<p align="center">
        <img src="https://github.com/Subham-Maity/java-recursion-and-backtracking/blob/master/image(ignore)/1.jpg?raw=true"/>
        </p>


### Syntax ?
```javascript
returntype methodname(){  
//code to be executed  
methodname();//calling same method  
}  
```
### Note
```javascript
1.when you write a recursion in a formula that is called recurance relation

2.Our program will never end without base case, and it will throw an error due to memory full, 
known as stack overflow
```
## Level 1(Problems)

### 1. Print Numbers from 5 to 1
```java
public class CodeXam {
    public static void printNumb(int n) {

        if (n == 0) {
            return;

        }
        System.out.println(n);
        printNumb(n - 1);
    }

    public static void main(String args[]) {
        int n = 5;
        printNumb(n); // n=5
    }
}
```
#### Internal Work in Stack

<p align="center">
        <img src="https://github.com/Subham-Maity/java-recursion-and-backtracking/blob/master/image(ignore)/2.jpg?raw=true"/>
        </p>

### 2. Print Numbers from 1 to 5
```java
//Type 1
public class CodeXam {
    public static void printNumbers(int n) {
        if(n == 6) {
            return;
        }
        System.out.println(n);
        printNumbers(n+1);
    }

    public static void main(String args[]) {
        int n = 1;
        printNumbers(n); // n=1
    }
}
```
```java
//Type 2
public class CodeXam {
    public static void printNumbers(int n) {
        if(n == 5) {
            System.out.println(5);
            return;
        }
        System.out.println(n);
        printNumbers(n+1);
    }

    public static void main(String args[]) {
        int n = 1;
        printNumbers(n); // n=1
    }
}
```
#### Internal Work in Stack

<p align="center">
        <img src="https://github.com/Subham-Maity/java-recursion-and-backtracking/blob/master/image(ignore)/3.jpg?raw=true"/>
        </p>

### 3. Print sum of first n natural numbers

```java
//Type 1
public class CodeXam {
    public static void printSum(int n, int sum) {
        if(n == 0) {
            System.out.println(sum);
            return;
        }
        sum += n;
        printSum(n-1, sum);
    }
    public static void main(String args[]) {
        printSum(5, 0);
    }
}
```
```java
//Type 2
public class CodeXam {
    public static void printSum (int i, int n, int sum) {
        if(i==n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        printSum (i+1, n, sum);
    }

    public static void main(String args []) {
        printSum(1, 5, 0);
    }
}
```
##### different Type
```java
//Approach 2
public class CodeXam {

    public static void main(String args[]) {
        int sum = printSum(5);
        System.out.println(sum);
    }

    static int printSum(int n) {
        if (n == 0) {
            return 1;
        }
        return n + printSum(n-1);
    }
}
```
<p align="center">
        <img src="https://github.com/Subham-Maity/java-recursion-and-backtracking/blob/master/image(ignore)/5.png?raw=true"/>
        </p>

#### Internal Work in Stack

<p align="center">
        <img src="https://github.com/Subham-Maity/java-recursion-and-backtracking/blob/master/image(ignore)/4.jpeg?raw=true"/>
        </p>


### 4. Print Factorial of a number n
```javascript
Factorial 

n! = nx(n-1)x(n-2).....x1

3! = 3 x 2 x 1 = 6

2! = 2 x 1 = 2

1! = 1

0! = 0
```

```javascript
n! = nx(n-1)x(n-2).....x1

3! = 3 x 2 x 1 = 6

we can write 
3! = 3 x 2! = 6

3! = 3 x (3-1)! = 6
```



```java
public class CodeXam {
    public static void printFactorial(int n, int fact) {
        if(n == 0) {
            System.out.println(fact);
            return;
        }
        fact *= n;
        printFactorial(n-1, fact);
    }
    public static void main(String args[]) {
        printFactorial(5, 1);
    }
}
```

##### different Type
```java
//Approach 2
public class CodeXam {
    static int factorial(int n){
        if (n == 0)
            return 1;
        else
            return(n * factorial(n-1));
    }
    public static void main(String args[]){
        int n=3;//It is the number to calculate factorial
        System.out.println(factorial(n));
    }
}
```
<p align="center">
        <img src="https://github.com/Subham-Maity/java-recursion-and-backtracking/blob/master/image(ignore)/6.png?raw=true"/>
        </p>

#### Internal Work in Stack

<p align="center">
        <img src="https://github.com/Subham-Maity/java-recursion-and-backtracking/blob/master/image(ignore)/7.jpeg?raw=true"/>
        </p>



### 5. Print the fibonacci sequence till nth term

<p align="center">
        <img src="https://github.com/Subham-Maity/java-recursion-and-backtracking/blob/master/image(ignore)/fib.gif?raw=true"/>
        </p>

**What is fibonacci series?**

<p align="center">
        <img src="https://github.com/Subham-Maity/java-recursion-and-backtracking/blob/master/image(ignore)/7.png?raw=true"/>
        </p>

```javascript
Supppose we want 7th index position fibonacci so here 7 is our nth postion
now 13 is the 7th fibonachhi you can see on the picture
so n = 7 and result will be 13
 
 explain:
 
fib(n-1) means fib(7-1) = fib 6th position index 
so, 6th position index is 8

fib(n-2) means fib(7-2) = fib 5th position index 
so, 5th position index is 5


now,
  fib(n-1)+fib(n-2)

  fib(7-1)+fib(7-2)
   
       8  +  6  
       
     =   13
 ```


##### If index position start from 1 (like 1 2 3 4 5 6 7 8)

```java
public class CodeXam {
    public static int fib(int n) {
        if(n == 1|| n==2)
            return n-1;
        else
            return fib(n-1)+fib(n-2);
    }
    public static void main(String args[]) {
        System.out.println(fib(8));
    }
}
```

##### If index position start from 0 like picture (like 0 1 2 3 4 5 6 7 8)
```java
//Approach 2
public class CodeXam {
    public static int fib(int n) {
        if(n == 0||n == 1)
            return n;
        else
            return fib(n-1)+fib(n-2);
    }
    public static void main(String args[]) {
        System.out.println(fib(8));
    }
}
```
#### Tree Visualize
<p align="center">
        <img src="https://github.com/Subham-Maity/java-recursion-and-backtracking/blob/master/image(ignore)/fibtrees.jpg?raw=true"/>
        </p>


### 6. Print  
## x<sup>n (stack height = n)

#### Approach
#####   x<sup>n
##### = x<sup>n-1</sup>  * x
##### = x<sup>n-1+1</sup>
##### =  x<sup>n
```javascript
x = 2 and then n = 5 then n = 4 then n= 3 then 2 then 1 then 0,
          and finally it reaches to the base case
         ----------------------------------------
         now x=2 and n = 1
         so xPower = 1 and xn =2
         
         now x = 2 and n=2
         so, xPower = 2 and xn =4
         
         now x = 2 and n=3
         so, xPower = 4 and xn =8
         
         now x = 2 and n=4
         so, xPower = 8 and xn =16
         
         now x = 2 and n=5
         so, xPower = 16 and xn =32

```


```java
public class CodeXam { 
    public static int printPower(int x, int n) {
            if(n == 0) { //x raise to pow 0 is always 1
                return 1;
            }
            if(x == 0) { //0 raise to pow anything is always 0
                return 0;
            }
        /** x = 2 and then n = 5 then n = 4 then n= 3 then 2 then 1 then 0,
          and finally it reaches to the base case
         ----------------------------------------
         now x=2 and n = 1
         so xPower = 1 and xn =2
         
         now x = 2 and n=2
         so, xPower = 2 and xn =4
         
         now x = 2 and n=3
         so, xPower = 4 and xn =8
         
         now x = 2 and n=4
         so, xPower = 8 and xn =16
         
         now x = 2 and n=5
         so, xPower = 16 and xn =32
         */
            int xPower = printPower(x, n-1);
            int xn = x * xPower;
            return xn;
        }
        public static void main(String args[]) {
        System.out.println(printPower(2, 5));
        }
}
```
<p align="center">
        <img src="https://github.com/Subham-Maity/java-recursion-and-backtracking/blob/master/image(ignore)/stackheight.jpeg?raw=true"/>
        </p>

### 7. Print  
## x<sup>n (stack height = logn))


#### Approach
#####   x<sup>n
##### = x<sup>n/2</sup>  * x<sup>n/2</sup> ( if n is even here)
##### = x<sup>n/2</sup>  * x<sup>n/2</sup> * x ( if n is odd here)
##### =  x<sup>n
So,
Example (even)
<p align="center">
        <img src="https://github.com/Subham-Maity/java-recursion-and-backtracking/blob/master/image(ignore)/7prob.png?raw=true"/>
        </p>

```javascript
Here height is 3 beacuse of the level of the tree is 3
```
Example (odd)
<p align="center">
        <img src="https://github.com/Subham-Maity/java-recursion-and-backtracking/blob/master/image(ignore)/7probodd.png?raw=true"/>
        </p>

```javascript
Here height is 3 beacuse of the level of the tree is 3
```
So,
<p align="center">
        <img src="https://github.com/Subham-Maity/java-recursion-and-backtracking/blob/master/image(ignore)/stackheight3.png?raw=true"/>
        </p>
<p align="center">
        <img src="https://github.com/Subham-Maity/java-recursion-and-backtracking/blob/master/image(ignore)/stackheight4.png?raw=true"/>
        </p>





```java
public class CodeXam {
    public static int printPower(int x, int n) {
        if(n == 0) {
            return 1;
        }
        if(n % 2 == 0) {//if n is even
            return printPower(x, n/2) * printPower(x, n/2);
        }
        else {//if n is odd
            return x * printPower(x, n/2) * printPower(x, n/2);
        }
    }
    public static void main(String args[]) {
        int x = 2, n = 5;
        int output = printPower(x, n);
        System.out.println(output);
    }
}
```

<p align="center">
        <img src="https://github.com/Subham-Maity/java-recursion-and-backtracking/blob/master/image(ignore)/stackheight2.jpeg?raw=true"/>
        </p>

## Level 2(Problems)

### 8. Tower of Hanoi 
**Tower of Hanoi is a mathematical puzzle where we have three rods and n disks. The objective of the puzzle is to move the entire stack to another rod, obeying the following simple rules:**
```javascript
1.Only one disk can be moved at a time.

2.Each move consists of taking the upper disk from one of the stacks and placing
 it on top of another stack i.e. a disk can only be moved if it is the uppermost disk on a stack.
 
3.No disk may be placed on top of a smaller disk.
```

#### Algorithm


Step 1:
If we have only one disk we considered it as n =1 so 
transferring process will easy in this process 
one is **Source(S)** and 2nd one is **Head(H)** and then last one is **Destination(D)**

<p align="center">
        <img src="https://github.com/Subham-Maity/java-recursion-and-backtracking/blob/master/image(ignore)/th1.png?raw=true"/>
        </p>

Step 2:
If we have only two disk we considered it as n =2 so
transferring process will easy in this process
one is **Source(S)** and 2nd one is **Head(H)/Auxiliary** and then last one is **Destination(D)**

<p align="center">
        <img src="https://github.com/Subham-Maity/java-recursion-and-backtracking/blob/master/image(ignore)/towerofhanoi2.gif?raw=true"/>
        </p>

Step 3:
If we have only three disk we considered it as n = 3 so
transferring process will easy in this process
one is **Source(S)** and 2nd one is **Head(H)/Auxiliary** and then last one is **Destination(D)**

```javascript

Let rod 1 = 'A', rod 2 = 'B', rod 3 = 'C'.
An example with 2 disks :
Step 1 : Shift first disk from 'A' to 'B'.

Step 2 : Shift second disk from 'A' to 'C'.

Step 3 : Shift first disk from 'B' to 'C'.
An example with 3 disks :
Step 1 : Shift first disk from 'A' to 'C'.
Step 2 : Shift second disk from 'A' to 'B'.
Step 3 : Shift first disk from 'C' to 'B'.

Step 4 : Shift third disk from 'A' to 'C'.

Step 5 : Shift first disk from 'B' to 'A'.
Step 6 : Shift second disk from 'B' to 'C'.
Step 7 : Shift first disk from 'A' to 'C'.

(Notice the gaps)
The pattern here is :
 - Shift 'n-1' disks from 'A' to 'B', using C.
 - Shift last disk from 'A' to 'C'.
 - Shift 'n-1' disks from 'B' to 'C', using A.
```
<p align="center">
        <img src="https://github.com/Subham-Maity/java-recursion-and-backtracking/blob/master/image(ignore)/stackheight3.jpeg?raw=true"/>
        </p>

**Code Remember Tips** 
```javascript
main format for getting parameters -> src, helper, dest
call -> n-1 transfet ->  src, dest, helper
print -> ("disk " + n + " from " + src + " to " + helper);
call -> n-1 transfet -> dest, helper, src
Passing parameters -> src,  dest , helper
```

```java
public class CodeXam {
    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        if(n == 0) {
            return;
        }
    /*1. Imagine that one disk is present in the tower of hanoi, so once that disk passes directly from the source to the destination
    (as seen in the first image you can check it out.)
    2. In the first place, you can see that I'm stating here n-1 disk transfer source to helper, which means we're assuming we have three disks.
    Now remain one disk in the source, and already we transfer two disks to the helper so both are ours (n-1) [n-1 = 2 because 1 disk + (n-1) disk = n disk]
    and (it may be possible in that case there have been many steps taken in that transfer process) you can check the image below -> step 4
    * */
// top n-1 from src to helper using dest as 'helper'
        towerOfHanoi(n-1, src, dest, helper);
//transfer nth from src to dest
        System.out.println("transfer disk " + n + " from " + src + " to " + helper);
//transfer n-1 from helper to dest using src as 'helper'
        towerOfHanoi(n - 1, dest, helper, src);
    }
    public static void main(String args[]) {
        int n = 3;
        towerOfHanoi(n, "S", "D", "H");
    }
}
```


Output:

```javascript
transfer disk 1 from S to D
transfer disk 2 from S to H
transfer disk 1 from D to H
transfer disk 3 from S to D
transfer disk 1 from H to S
transfer disk 2 from H to D
transfer disk 1 from S to D

```

<p align="center">
        <img src="https://github.com/Subham-Maity/java-recursion-and-backtracking/blob/master/image(ignore)/towerofhanoi.png?raw=true"/>
        </p>

**Time Complexity** 
<p align="center">
        <img src="https://github.com/Subham-Maity/java-recursion-and-backtracking/blob/master/image(ignore)/timecomplexity%20.jpg?raw=true"/>
        </p>


### [Details Tower of Hanoi](https://github.com/Subham-Maity/tower-of-hanoi)

### 9. Print a string in reverse 

```java
//Approach 1
public class CodeXam {
    public static void printRev(String str, int idx) { //we need only two parameter: RF:below image
        if (idx == 0) { //base case for terminate
            System.out.println(str.charAt(idx));//print character according to the index
            return; //return
        }
        System.out.print(str.charAt(idx));////print character according to the index
        printRev(str, idx - 1);//call index -1 for traverse back like image
    }

    public static void main(String args[]) {
        String str = "abcd";
        printRev(str, str.length() - 1);//call (str.length-1 is our last index)  
    }
}



```
```java
//Approach 2

public class CodeXam  {
        public static String revString(String str) {
            if(str.length() == 1) {
                return str;
            }
            char currChar = str.charAt(0);
            String nextString = revString(str.substring(1));
            return nextString + currChar;
        }
        public static void main(String args[]) {

            String str = "abcd";
            String reversed = revString(str);
            System.out.println(reversed);
        }
    }
```
<p align="center">
        <img src="https://github.com/Subham-Maity/java-recursion-and-backtracking/blob/master/image(ignore)/reverse.png?raw=true"/>
        </p>


### Time-complexity :- 
```javascript
time complexity is the equivalent of our length so 
O(n)
```

### 10. Find the occurrence of the first and last occurrence of an element using recursion.

```java
public class CodeXam {
    public static int first = -1;
    public static int last = -1;
    public static void getIndices(String str, char element, int idx) {
        if(idx == str.length()) { //base case
            return;
        }
        char currentChar = str.charAt(idx);
        if(currentChar == element) {
            if(first == -1) { //if the value of the first element is -1 update first index
                first = idx;
            } else { // else update always last element
                last = idx; // continue this until our value will index == length of the string
            }
        }
        getIndices(str, element, idx+1);
    }
    public static void main(String args[]) {
        String str = "tabcdfghijakkk";
        char el = 'a';
        getIndices(str, el, 0);
        System.out.println("First occurrence : " + first);
        System.out.println("Last occurrence : " + last);
    }
}
```

### Time-complexity :-
```javascript
time complexity is the equivalent of our length (we traverse only one time so n is our length)
O(n)
```
### 11. Check if an array is sorted (strictly increasing) - O(n)
Suppose let assume that 1 2 3 4 5 6 it's the form of sorted array but  1 2 3 4 4 it's sorted but not following the strictly increasing rule so just return false else return true
# Approach 
```javascript 
1.We are making an idx variable for tracking all element 

2.Check sort or not - > is our current element is smaller than
next element(idx+1) if yes then sorted for that position and move on to 
the next one and make the next element as a current one 

3.now again we compare current element with next element 

4.When we reach to the last element just return true 

5.if next element is not greater than last one just return false and
stop traversing 
```



```java
public class CodeXam {
   /* public static boolean checkIfIncreasing(int arr[], int idx) {

            if(idx == arr.length-1) {
                return true;
            }
            if(!checkIfIncreasing(arr, idx+1)) {
                return false;
            }
            return arr[idx] < arr[idx + 1]; //first we check is idx < idx +1
        }
        public static void main(String args[]) {
            int arr1[] = {1, 2, 3, 4, 5};
            int arr2[] = {1, 6, 3, 4, 5};
            if(checkIfIncreasing(arr2, 0)) {
                System.out.println("Strictly Increasing");
            } else {
                System.out.println("NOT Strictly Increasing");
            }
        }
    } */

    public static boolean isSorted (int arr[], int idx) {
        if (idx == arr.length - 1) {
            return true;
        }
// //same as below just modified one
//           if (arr[idx] < arr[idx + 1]) {
//               //array is sorted till now
//               return isSorted(arr, idx + 1);
//           } else {
//               return false ;
//           }
//       }
        if (arr[idx] >= arr[idx + 1]) {
            //array is unsorted
            return false;
        }
        return isSorted(arr, idx + 1);
    }

    public static void main (String args []){
        int arr[] = {1, 3, 5};
        System.out.println(isSorted(arr, 0));
    }
}
```

### Time-complexity :-
```javascript
time complexity is the equivalent of our length (we traverse only one time so n is our length)
O(n)
```

### 12. Move all ‘x’ to the end of the string - O(n)

suppose we have this string "axbсxxd" and the output will be abcdxxx


### Approach 

<p align="center">
        <img src="https://github.com/Subham-Maity/java-recursion-and-backtracking/blob/master/image(ignore)/xtransfer.png?raw=true"/>
        </p>


```java
public class CodeXam {
  /*  //to add all 'x' to the end of the string
    public static String addX(int count) {
        String newStr = "x";
        for(int i=1;i<count; i++) {
            newStr += 'x';
        }
        return newStr;
    }
    public static String moveAllX(String str, int idx, int count) {
        if(idx == str.length()) {
            return addX(count);
        }
        if(str.charAt(idx) == 'x') {

            return moveAllX(str, idx+1, count+1);
        } else {
            String nextStr = moveAllX(str, idx+1, count);
            return str.charAt(idx) + nextStr;
        }
    }
       public static void main(String args[]) {
          String str = "abcdefxghxixjxxxk";
          int count = 0;
          String newStr = moveAllX(str, 0, count);
          System.out.println(newStr);
                    }
                        }*/

    public static void moveAllX(String str, int idx, int count, String newString) {//three parameter like approach
        if (idx == str.length()) { //base case just return newString
            for (int i=0;i<count;i++){
                newString += 'x';// we need to add x how many times we count the x we add that much x
            }
            System.out.println(newString);
            return;
            }
            char currChar = str.charAt(idx);//taking currChar from string
            if (currChar == 'x') { //if our currChar is equal to x
                count++; //just increase our count
                moveAllX(str, idx + 1, count, newString);//call moveall
            } else {
                newString += currChar; //newString = newString + currChar //abcd..so on except x
                moveAllX(str, idx + 1, count, newString);
            }
        }
        public static void main (String args[]){
            String str = "axbcxxd";
            moveAllX(str, 0, 0, "");
        }
    }


```

### Time-complexity :-
```javascript
lenght = n and we use a loop for counting x so n times run the loop 
so, O(n+n) 
O(2n) = O(n) (according to asymptotic notation)
Time Complexity -> O(n) 
```

### 13. Remove duplicates in a string.

suppose we have this string ""abcadbcefghabi"" and the output will be "abcdefghi"


### Approach

<p align="center">
        <img src="https://github.com/Subham-Maity/java-recursion-and-backtracking/blob/master/image(ignore)/maprecursion.png?raw=true"/>
        </p>


```java
public class CodeXam {
    /*    //same as below
            public static String removeDuplicates(String str, int idx, boolean present[]) {
                if(idx == str.length()) {
                    return "";
                }
                char curr = str.charAt(idx);
                if(present[curr-'a']) {
                    return removeDuplicates(str, idx+1, present);
                } else {
                    present[curr-'a'] = true;
                    return curr + removeDuplicates(str, idx+1, present);
                }
            }
            public static void main(String args[]) {
                String str = "abcadbcefghabi";
                boolean present[] = new boolean[str.length()];
                System.out.println(removeDuplicates(str, 0, present));
            }
        }
    */
    public static boolean[] map = new boolean[26];//map array and size is 26 (26 letters so)
    public static void removeDuplicates(String str, int idx, String newString) { //duplicate remove function  //we don't need to set parameter as map we can access this map because we set this as static
        if (idx == str.length()) {//base case for last index
            System.out.println(newString);//print the new string
            return;
        }
        char currChar = str.charAt(idx);//first we calculate our current character which is str.chatAt(idx)
        //if (map[currChar - 'a'] == true)
        if (map[currChar - 'a'] ) {//if it's true then don't store it in our newString(no need to use true it's by default true, but I use for understanding)
            removeDuplicates(str, idx + 1, newString);//call our method with passing idx+1
        } else {//if false
            newString += currChar; //we are going to add this character to our newString
            map[currChar - 'a'] = true;//and make the character true for avoid repeating the character
            removeDuplicates(str, idx + 1, newString);//again call this method
        }
    }
    public static void main (String args []){
        String str = "abbccda";//our string
        removeDuplicates(str, 0, "");//call the method 0 is our first index and pass blank string
    }
}


```

### Time-complexity :-
```javascript
lenght = n so
Time Complexity -> O(n) 
```

### 14. Print all the subsequences of a string.


<p align="center">
        <img src="https://github.com/Subham-Maity/java-recursion-and-backtracking/blob/master/image(ignore)/SS.png?raw=true"/>
        </p>

### Approach
```javascript
1. We take newString 
2.call 1 -> newString + currChar(pair)
3.call 2 -> newString(not paired)
```
```java
public class CodeXam {

    /* //same as below
    public static void printSubseq(String str, int idx, String res) {
            if(idx == str.length()) {
                System.out.println(res);
                return;
            }
//choose
            printSubseq(str, idx+1, res+str.charAt(idx));
//don't choose
            printSubseq(str, idx+1, res);
        }
        public static void main(String args[]) {
            String str1 = "abc";
            String str2 = "aaa";
            printSubseq(str1, 0, "");
        }
    }
*/

    public static void subSeq(String str , int idx , String newString )
    {
        if (idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        subSeq(str , idx +1 , newString+currChar); //choose
        subSeq(str , idx +1 , newString); ////don't choose
    }

    public static void main(String[]args){
        String str = "abc" ;
        subSeq(str,0,"");

    }
}

```

### Time-complexity :-
O(2^n)
<p align="center">
        <img src="https://github.com/Subham-Maity/java-recursion-and-backtracking/blob/master/image(ignore)/SSTC.png?raw=true"/>
        </p>

### 15. Print all unique subsequences of a string.


<p align="center">
        <img src="https://github.com/Subham-Maity/java-recursion-and-backtracking/blob/master/image(ignore)/sssp.png?raw=true"/>
        </p>

### Approach
```javascript
1. We take newString 
2.call 1 -> newString + currChar(pair)
3.call 2 -> newString(not paired)
4.Use hashset for unique subsequences
```
<p align="center">
        <img src="https://github.com/Subham-Maity/java-recursion-and-backtracking/blob/master/image(ignore)/16.png?raw=true"/>
        </p>

```java
import java.util.HashSet;
public class CodeXam {
    public static void printSubSeqences(String str, int idx, String newString, HashSet<String>set) {
        if(idx == str.length()) {
            if(set.contains(newString)) {//if our new string is already present in our set just return
                return;
            }
            else
                set.add(newString);//if not then add new string to our set
            System.out.println(newString);

            return;
        }

//choose
        printSubSeqences(str, idx+1, newString+str.charAt(idx), set);//now adding set
//don't choose
        printSubSeqences(str, idx+1, newString, set);//adding set
    }
    public static void main(String args[]) {
        String str1 = "abc"; //for abc remain same
        String str2 = "aaa"; //for aaa only unique subsequences
        HashSet<String> set = new HashSet<>(); //declare
        printSubSeqences(str2, 0, "", set); //passing as a set
        printSubSeqences(str1, 0, "", set); //passing as a set
    }
}
```

### 16. Print Keypad Combinations.


<p align="center">
        <img src="https://media.geeksforgeeks.org/wp-content/cdn-uploads/Mobile-keypad.png"/>
        </p>

```javascript
Input number: 234
Output:
adg adh adi aeg aeh aei afg afh 
afi bdg bdh bdi beg beh bei bfg 
bfh bfi cdg cdh cdi ceg ceh cei 
cfg cfh cfi
Explanation: All possible words which can be 
formed are (Alphabetical order):
adg adh adi aeg aeh aei afg afh 
afi bdg bdh bdi beg beh bei bfg 
bfh bfi cdg cdh cdi ceg ceh cei 
cfg cfh cfi
If 2 is pressed then the alphabet
can be a, b, c, 
Similarly, for 3, it can be 
d, e, f, and for 4 can be g, h, i. 

Input number: 5
Output: j k l
Explanation: All possible words which can be
formed are (Alphabetical order):
j, k, l, only these three alphabets
can be written with j, k, l.

```
### Approach
```javascript
1.Map the number with its string of probable alphabets, 
i.e 2 with “abc”, 3 with “def” etc.


2.Create a recursive function which takes the following parameters, 
output string, number array, current index, and length of number array


3.If the current index is equal to the length of the number array then print the output string.


4.Extract the string at digit[current_index] from the Map, 
where the digit is the input number array.


5.Run a loop to traverse the string from start to end


6.For every index again call the recursive function with the output 
string concatenated with the ith character of the string and the current_index + 1
```

<p align="center">
        <img src="https://github.com/Subham-Maity/java-recursion-and-backtracking/blob/master/image(ignore)/16.2.png?raw=true"/>
        </p>


```java

import java.util.HashSet;

public class CodeXam {
    /* //same as below
public static String keypad[] = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs",
"tu", "vwx", "yz"};
public static void printKeypadCombination(String number, int idx, String res) {
if(idx == number.length()) {
System.out.println(res);
return;
}

for(int i=0; i<keypad[number.charAt(idx)-'0'].length(); i++) {
char curr = keypad[number.charAt(idx)-'0'].charAt(i);
printKeypadCombination(number, idx+1, res+curr);
}
}
*/
    public static String keypad[] = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"}; //according to the keypad phone map this
    public static void printComb (String str, int idx, String combination) { //str is our string and idx means that's our index position
        if (idx == str.length()) {//base case
            System.out.println(combination);
            return;
        }
        char currChar = str.charAt(idx);//current character is stored in which index so suppose this is 2
        String mapping = keypad[currChar - '0']; //suppose current character is 2 means 2-0 so mapping will be "def"
        for (int i = 0; i < mapping.length(); i++) { //traverse to mapping length means loops on the mapping "def"
            printComb(str, idx + 1, combination + mapping.charAt(i));//call to the 2nd lvl and adding first "d" then "e" then "f"
        }
    }
    public static void main(String args []) {
        String str = "23";//23
        printComb(str, 0, "");
    }
}
```

Time Complexity 
```javascript
Time Complexity: O(4n), where n is a number of digits in the input number. 
Each digit of a number has 3 or 4 alphabets, so it can be said that each digit has 4 alphabets as options. If there are n digits then there are 4 options for the first digit and for each alphabet of the first digit there are 4 options in the second digit, i.e for every recursion 4 more recursions are called (if it does not match the base case). So the time complexity is O(4n).
Space Complexity:O(1). 
```

## Level 3(Problems)

### 17. Print all the permutations of a string.



<p align="center">
        <img src="https://github.com/Subham-Maity/java-recursion-and-backtracking/blob/master/image(ignore)/17.png?raw=true"/>
        </p>


### Approach
```javascript
            //"abc" -> "ab" (if choose c)
            //"abc" -> "bc" (if choose a)
            //"abc" -> "ac" (if choose b)

            //suppose we choose b as a current character
            //suppose str.substring(0,i) where i = 1 means it runs 0-1 so here only print 0th index not 1st index
```


```java
class CodeXam {
    public static void printPermutation(String str, String perm) {
        if(str.length() == 0) {//base case 
            System.out.println(perm);
            return;
        }

        for(int i=0; i<str.length(); i++) { //traverse to string length
            char currChar = str.charAt(i); //current character


            //"abc" -> "ab" (if choose c)
            //"abc" -> "bc" (if choose a)
            //"abc" -> "ac" (if choose b)

            //suppose we choose b as a current character
            //suppose str.substring(0,i) where i = 1 means it runs 0-1 so here only print 0th index not 1st index


            String newStr = str.substring(0, i) + str.substring(i+1); //(0,i suppose it's a (ab) cz current character is now b) + (i+1 means our character is now b+1 = c)
            printPermutation(newStr, perm+currChar);
        }
    }
    public static void main(String args[]) {
        String str = "abc";
        printPermutation(str, "");
    }
}

```

<p><strong>Time Complexity:</strong> O(n*n!) The time complexity is the same as the above approach, i.e. there are n! permutations and it requires O(n) time to print a permutation.<p><strong>Auxiliary Space: </strong>O(|s|)