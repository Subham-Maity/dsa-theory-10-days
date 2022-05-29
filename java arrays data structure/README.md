# Introduction to JAVA Arrays
## I cover all aspects of JAVA Array 
# Writer Intro
## I am **Subham Maity.**
**I love Programming. One of the aims I had when I started ```CodeXam``` was to make learning programming easy.**

**At ```CodeXam```, we ask ourselves one question every day: "How do we create awesome learning experiences?"**
### Help us improve this guide - Fork, Pull Requests, Shares and Likes are recommended!




## Chapters 

### Overview(quick revision)
* [**Overview**](#overviewquick-revision)

### Basic
* [**Introduction to Arrays**](#introduction-to-arrays)
* [**1.Instantiating an Array in Java**](#1instantiating-an-array-in-java)
  * [**Type 1(declaring then allocating then initialise)**](#type-1declaring-then-allocating-then-initialise)
  * [**Type 2(declaring + allocating then initialise)**](#type-2declaring--allocating-then-initialise)
  * [**Type 3(declaring + initialise)**](#type-3declaring--initialise)
* [**2.Accessing Java Array Elements using for Loop**](#1instantiating-an-array-in-java)
    * [**Method 1(For Loop)**](#method-1for-loop)
    * [**Method 2(Printing by Index position)**](#method-2printing-by-index-position)
    * [**Method 3(For Each Loop)**](#method-3for-each-loop)
* [**3.Array length**](#3array-length)

### Advance
* [**2D Arrays In Java**](#2d-arrays-in-java)
    * [**1.Creating a 2D Array - with new keyword**](#1creating-a-2d-array---with-new-keyword)
    * [**2.Creating a 3D Array / Multidimensional Array**](#2creating-a-3d-array--multidimensional-array)



### Practice Part

* [**Basic Questions**](#3arrays-basic-question)





# Overview(quick revision)


<p align="center">
        <img src="https://github.com/Subham-Maity/java-arrays-data-structure/blob/master/IMAGES/1D_arrays.png?raw=true"/>
        </p>

<p align="center">
        <img src="https://github.com/Subham-Maity/java-arrays-data-structure/blob/master/IMAGES/2D_arrays.png?raw=true"/>
        </p>

<p align="center">
        <img src="https://github.com/Subham-Maity/java-arrays-data-structure/blob/master/IMAGES/arraylist.png?raw=true"/>
        </p>




# Introduction to Arrays
* An array is a collection of similar types of data having contiguous memory allocation.
* The indexing of the array starts from 0., i.e 1st element will be stored at the 0th index, 2nd element at 1st index, 3rd at 2nd index, and so on.
* The size of the array can not be increased at run time therefore we can store only a fixed size of elements in array.
* Use Case: Storing marks of 5 students

<p align="center">
        <img src="https://api.codewithharry.com/media/videoSeriesFiles/courseFiles/java-tutorials-for-beginners-26/base64.png"/>
        </p>

## 1.Instantiating an Array in Java
### **Type 1**(declaring then allocating then initialise)
```java

int intArray[];    //declaring array
intArray = new int[20];  // allocating memory to array

```
Example
```java

int[] marks ;
        marks = new int[3];
        marks[0] = 97;
        marks[1] = 98;
        marks[2] = 95;


```

### **Type 2**(declaring + allocating then initialise)
```java

int[] intArray = new int[20]; // combining both statements in one


```

Example 
```java

int[] marks = new int[3];
        marks[0] = 97;
        marks[1] = 98;
        marks[2] = 95;


```


### **Type 3**(declaring + initialise)
```java

int[] intArray ={100,25,26,50}; // declaring + initialise

```

Example
```java

int[] marks = {98, 97, 95};

```
## 2.Accessing Java Array Elements using for Loop
### Method 1(For Loop)
#### Example(Taking an array as an input and printing its elements.)
```java

import java.util.*;

public class CodeXam {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        for(int i=0; i<size; i++) {
            numbers[i] = sc.nextInt();
        }

        //print the numbers in array
        for(int i=0; i<numbers.length; i++) {
            System.out.print(numbers[i]+" ");
        }
    }
}


```

### Method 2(Printing by Index position)
#### Example
```java

public class CodeXam {
    public static void main(String args[]){

        int[] marks = new int[3];
        marks[0]=97; // phy
        marks[1]=98; // chem
        marks[2]=95; //eng

        System.out.println(marks [0]);

        System.out.println(marks [1]);

        System.out.println(marks [2]);
    }
}


```
### Method 3(For Each Loop)
```java
 for (int element:Arr){
        System.out.println(element);    //Prints all the elements
        }

```
#### Example 1
```java

public class CodeXam {
    public static void main(String args[]){
        //declaring an array  
        int arr[]={1,2,3,3,4,5};
        //traversing the array with for-each loop  
        for(int i:arr){
            System.out.println(i);
        }
    }
}  
```
#### Example 2(using element)
```java

public class CodeXam {
    public static void main(String args[]){
        //declaring an array
        int arr[]={1,2,3,3,4,5};
        //traversing the array with for-each loop
        for(int element: arr){
            System.out.println(element);
        }
    }
}
```
## 3.Array length 
#### Unlike C/C++, we don't need to use the sizeof() operator to get the length of arrays in Java because arrays are objects in Java therefore we can use the length property.

```java
marks.length //Gives 5 if marks is a reference to an array with 5 elements
```

# 2D Arrays In Java

It is similar to 2D matrices that we studied in 11th and 12th class.



<p align="center">
        <img src="https://github.com/Subham-Maity/java-arrays-concept-for-DSA/blob/master/IMAGES/3D-array.jpg?raw=true"/>
        </p>


## 1.Creating a 2D Array - with new keyword
<p align="center">
        <img src="https://github.com/Subham-Maity/java-arrays-concept-for-DSA/blob/master/IMAGES/2d%20array%20.png?raw=true"/>
        </p>


```java
    int [][] flats = new int[2][3] //A 2-D array of 2 rows + 3 columns
```
We can add elements to this array as follows
```java
        flats[0][0] = 100 
        flats[0][1] = 101
        flats[0][2] = 102
// … & so on!
```

## This 2-D array can be visualized as follows:


|          |  [0]  |   [1] |   [2] |
|----------|:-----:|------:|------:|
|          | Col1  |  Col2 |  Col3 |
| [0] Row1 | {0,0} | {0,1} | {0,2} |
| [0] Row2 | {1,0} | {1,1} | {1,2} |

### Example
```java
public class CodeXam {

    public static void main(String[] args) {
        int [] marks; // A 1-D Array
        int [][] flats; // A 2-D Array
        flats = new int [2][3];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;

        // Displaying the 2-D Array (for loop)
        System.out.println("Printing a 2-D array using for loop");
        for(int i=0;i<flats.length;i++){
            for(int j=0;j<flats[i].length;j++) {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }

    }
}
```
## 2.Creating a 3D Array / Multidimensional Array
```java
    String[][][] data = new String[3][4][2];
```






## 3.Arrays Basic Question

## [Arrays Basic Question](https://github.com/Subham-Maity/java-python-problem-solving-series) 



