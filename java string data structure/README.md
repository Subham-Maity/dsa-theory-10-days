

## Chapters
### Basic
* [What is String](#what-is-string)
* [Important Note](#important-note)
* [Syntax/Declaration of strings in Java :](#syntaxdeclaration-of-strings-in-java-)
* [Taking Input of strings in Java : ](#taking-input-of-strings-in-java-)
### Method
* [Concatenation (Joining 2 strings)](#concatenation-joining-2-strings)
* [Print length of a String](#print-length-of-a-string)
* [Access characters of a string](#access-characters-of-a-string)
* [Compare 2 strings](#compare-2-strings)
* [Substring](#substring)
* [Value in integer/ParseInt Method of Integer class](#value-in-integerparseint-method-of-integer-class)
* [Value in string format/ToString Method of String class](#value-in-string-formattostring-method-of-string-class)
* [Value for the particular index/char charAt(int index)](#value-for-the-particular-indexchar-charatint-index)
* [String length](#string-length)
* [Formatted string/String.format](#formatted-stringstringformat)
* [Returns true or false after matching the sequence of char value/boolean contains](#returns-true-or-false-after-matching-the-sequence-of-char-valueboolean-contains)
* [Joined string/String.join](#joined-stringstringjoin)
* [isEmpty()/Number of characters contained in a string is zero.](#isemptynumber-of-characters-contained-in-a-string-is-zero)
* [Concatenates the specified string/String concat(String str)](#concatenates-the-specified-stringstring-concatstring-str)
* [Replaces specified char value/String replace(char old, char new)](#replaces-specified-char-valuestring-replacechar-old-char-new)
* [String replace(CharSequence target, CharSequence replacement)](#replaces-all-occurrences-of-the-specified-charsequencestring-replacecharsequence-target-charsequence-replacement)
* [Compare Case/String equalsIgnoreCase()](#compare-casestring-equalsignorecase)
* [Split string matching regex/String[] split(String regex)](#split-string-matching-regexstring-splitstring-regex)
* [Split string matching regex and limit/String split()](#split-string-matching-regex-and-limitstring-split)
* [Canonical representation of string/String intern()](#canonical-representation-of-stringstring-intern)
* [IndexOf(Different Type)](#indexofdifferent-type)
* [String in lowercase/String toLowerCase()](#string-in-lowercasestring-tolowercase)
* [String in uppercase./String toUpperCase()](#string-in-uppercasestring-touppercase)
* [Removes beginning and ending spaces of this string/String trim()](#removes-beginning-and-ending-spaces-of-this-stringstring-trim)
* [Converts given type into string/static String valueOf(int value)](#converts-given-type-into-stringstatic-string-valueofint-value)
* [Returns the last index of the specified character from the given string/ LastIndexOf(“r”)](#returns-the-last-index-of-the-specified-character-from-the-given-string-lastindexofr)
* [Returns true if the name starts with the string “Ha”/ startsWith(“Ha”)](#returns-true-if-the-name-starts-with-the-string-ha-startswithha)
* [Returns true if the name ends with the string “ry”/ endsWith(“ry”)](#returns-true-if-the-name-ends-with-the-string-ry-endswithry)
### String Builder Concept 
* [Declaration](#declaration)
* [Get A Character from Index](#get-a-character-from-index)
* [Set a Character at Index](#set-a-character-at-index)
* [Insert a Character at Some Index](#insert-a-character-at-some-index)
* [Delete char at some Index](#delete-char-at-some-index)
* [Append a char](#append-a-char)
* [Print Length of String](#print-length-of-a-string)
* [Reverse a String (using StringBuilder class)](#reverse-a-string-using-stringbuilder-class)


   
# String in Java

### What is String
```javascript
In Java, string is basically an object that 
represents sequence of char values. 
An array of characters works same as Java string.
In Java, string is basically an object that represents 
sequence of char values. An array of characters works 
same as Java string.
```

### Important Note 

```javascript
1.Strings are immutable and cannot be changed.

2.A string is a sequence of characters.

3.Strings are objects that represent a char array

4.java.lang.String class is used to create a String object

5.The string is a class but can be used as a data type.

6.We use double quotes("") to create string using string literal. 
Before creating a new string instance, JVM verifies if the same 
string is already present in the string pool or not. 
If it is already present, then JVM returns a reference 
to the pooled instance otherwise, a new string instance is created.
```

### Syntax/Declaration of strings in Java :
```java
String <String_name> = "<sequence_of_string>";
```
Example :
In the example, str is a reference, and “SubhamCodexam” is an object.
```java
 String str = "SubhamCodexam";
```

### Taking Input of strings in Java :
```java
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
```
### Concatenation (Joining 2 strings)

```java
        String firstName = "Tony";
        String secondName = "Stark";

        String fullName = firstName + " " + secondName;
        System.out.println(fullName);
```
### Print length of a String


```java
        String firstName = "Tony";
        String secondName = "Stark";

        String fullName = firstName + " " + secondName;
        System.out.println(fullName.length());
```
### Access characters of a string


```java
        String firstName = "Tony";
        String secondName = "Stark";

        String fullName = firstName + " " + secondName;

        for(int i=0; i<fullName.length(); i++) {
        System.out.println(fullName.charAt(i));
        }

```
### Compare 2 strings



```java
public class Strings {
    public static void main(String args[]) {
        String name1 = "Tony";
        String name2 = "Tony";

        if(name1.equals(name2)) {
            System.out.println("They are the same string");
        } else {
            System.out.println("They are different strings");
        }

        //DO NOT USE == to check for string equality
        //Gives correct answer here
        if(name1 == name2) {
            System.out.println("They are the same string");
        } else {
            System.out.println("They are different strings");
        }

        //Gives incorrect answer here
        if(new String("Tony") == new String("Tony")) {
            System.out.println("They are the same string");
        } else {
            System.out.println("They are different strings");
        }

    }
}


```
**Explain**

Case 1:
```java
String str1 = "CodeXam";
String str2 = "CodeXam"
System.out.println(str1 == str2);
```
Output :
```java
True
```
Returns true because str1 and str2 are referencing the same object present in the string constant pool. 
Now, let's see the case of the String object :

Case 2:
```java
String str1 = new String("Keep coding");
String str2 = new String("Keep coding"");
System.out.println(str1 == str2);
```
Output :
```java
False
```
Although the value of both the string object is the same, still false is displayed as output because str1 and str2 are two different string objects created in the heap. That's why it is not considered a good practice two compare two strings using the == operator. Always use the ```equals()``` method to compare two strings in Java.


### Substring
```java
public class Strings {
    public static void main(String args[]) {
        String name = "TonyStark";

        System.out.println(name.substring(0, 4));


    }
}
```
### Value in integer/ParseInt Method of Integer class
```java
public class Strings {
    public static void main(String args[]) {
        String str = "123";
        int number = Integer.parseInt(str);
        System.out.println(number);


    }
}

```
### Value in string format/ToString Method of String class
```java
public class Strings {
    public static void main(String args[]) {
        int number = 123;
        String str = Integer.toString(number);
        System.out.println(str.length());


    }
}
```
### Value for the particular index/char charAt(int index)
```java
public class CharAtExample{
    public static void main(String args[]){
        String name="javatpoint";
        char ch=name.charAt(4);//returns the char value at the 4th index  
        System.out.println(ch);
    }}  
```
###  String length
```java
public class LengthExample{  
public static void main(String args[]){  
String s1="codexam";  
String s2="python";  
System.out.println("string length is: "+s1.length());//10 is the length of codexam string  
System.out.println("string length is: "+s2.length());//6 is the length of python string  
}}  
```
### Formatted string/String.format
```java
public class FormatExample{  
public static void main(String args[]){  
String name="sonoo";  
String sf1=String.format("name is %s",name);  
String sf2=String.format("value is %f",32.33434);  
String sf3=String.format("value is %32.12f",32.33434);//returns 12 char fractional part filling with 0  
  
System.out.println(sf1);  
System.out.println(sf2);  
System.out.println(sf3);  
}}  
```
### Returns true or false after matching the sequence of char value/boolean contains
```java
class ContainsExample{  
public static void main(String args[]){  
String name="what do you know about me";  
System.out.println(name.contains("do you know"));  
System.out.println(name.contains("about"));  
System.out.println(name.contains("hello"));  
}}  
```
### Joined string/String.join
```java
public class StringJoinExample{
    public static void main(String args[]){
        String joinString1=String.join("-","welcome","to","java");
        System.out.println(joinString1);
    }}  
```
### isEmpty()/Number of characters contained in a string is zero.
```java
public class IsEmptyExample{  
public static void main(String args[]){  
String s1="";  
String s2="java";  
  
System.out.println(s1.isEmpty());  
System.out.println(s2.isEmpty());  
}}  
```
###  Concatenates the specified string/String concat(String str)
```java
public class ConcatExample{    
public static void main(String args[]){    
String s1="java string";    
// The string s1 does not get changed, even though it is invoking the method      
// concat(), as it is immutable. Therefore, the explicit assignment is required here.  
s1.concat("is immutable");    
System.out.println(s1);    
s1=s1.concat(" is immutable so assign it explicitly");    
System.out.println(s1);    
}}    
```
### Replaces specified char value/String replace(char old, char new)
```java
public class ReplaceExample1{  
public static void main(String args[]){  
String s1="java is a very good language";  
String replaceString=s1.replace('a','e');//replaces all occurrences of 'a' to 'e'  
System.out.println(replaceString);  
}}  
```
### Replaces all occurrences of the specified CharSequence/String replace(CharSequence target, CharSequence replacement)
```java
public class ReplaceExample2{  
public static void main(String args[]){  
String s1="my name is khan my name is java";  
String replaceString=s1.replace("is","was");//replaces all occurrences of "is" to "was"  
System.out.println(replaceString);  
}}  
```
### Compare Case/String equalsIgnoreCase()
```java
public class EqualsIgnoreCaseExample{  
public static void main(String args[]){  
String s1="java";  
String s2="java";  
String s3="JAVA";  
String s4="python";  
System.out.println(s1.equalsIgnoreCase(s2));//true because content and case both are same  
System.out.println(s1.equalsIgnoreCase(s3));//true because case is ignored  
System.out.println(s1.equalsIgnoreCase(s4));//false because content is not same  
}}  
```

```java
import java.util.ArrayList;
public class EqualsIgnoreCaseExample2 {
    public static void main(String[] args) {
        String str1 = "Mukesh Kumar";
        ArrayList<String> list = new ArrayList<>();
        list.add("Mohan");
        list.add("Mukesh");
        list.add("RAVI");
        list.add("MuKesH kuMar");
        list.add("Suresh");
        for (String str : list) {
            if (str.equalsIgnoreCase(str1)) {
                System.out.println("Mukesh kumar is present");
            }
        }
    }
}  
```
### Split string matching regex/String[] split(String regex)
```java
public class SplitExample{  
public static void main(String args[]){  
String s1="java string split method ";  
String[] words=s1.split("\\s");//splits the string based on whitespace  
//using java foreach loop to print elements of string array  
for(String w:words){  
System.out.println(w);  
}  
}}  
```
### Split string matching regex and limit/String split()
```java
public class SplitExample3 {  
    public static void main(String[] args) {  
        String str = "Javatpointtt";  
        System.out.println("Returning words:");  
        String[] arr = str.split("t", 0);  
        for (String w : arr) {  
            System.out.println(w);  
        }  
        System.out.println("Split array length: "+arr.length);  
    }  
}  
```
### Canonical representation of string/String intern()
```java
public class InternExample{  
public static void main(String args[]){  
String s1=new String("hello");  
String s2="hello";  
String s3=s1.intern();//returns string from pool, now it will be same as s2  
System.out.println(s1==s2);//false because reference variables are pointing to different instance  
System.out.println(s2==s3);//true because reference variables are pointing to same instance  
}}  
```
### IndexOf(Different Type)
#### int indexOf(int ch)
It returns the index position for the given char value
```java
public class IndexOfExample{  
public static void main(String args[]){  
String s1="this is index of example";  
//passing substring  
int index1=s1.indexOf("is");//returns the index of is substring  
int index2=s1.indexOf("index");//returns the index of index substring  
System.out.println(index1+"  "+index2);//2 8  
  
//passing substring with from index  
int index3=s1.indexOf("is",4);//returns the index of is substring after 4th index  
System.out.println(index3);//5 i.e. the index of another is  
  
//passing char value  
int index4=s1.indexOf('s');//returns the index of s char value  
System.out.println(index4);//3  
}}  
```
#### int indexOf(int ch, int fromIndex)
It returns the index position for the given char value and from index
```java
public class IndexOfExample4 {  
    public static void main(String[] args) {          
        String s1 = "This is indexOf method";         
        // Passing char and index from  
        int index = s1.indexOf('e', 12); //Returns the index of this char  
        System.out.println("index of char "+index);       
    }  
}  
```
#### int indexOf(String substring)
It returns the index position for the given substring
```java
public class IndexOfExample2 {  
    public static void main(String[] args) {  
        String s1 = "This is indexOf method";         
        // Passing Substring    
        int index = s1.indexOf("method"); //Returns the index of this substring  
        System.out.println("index of substring "+index);          
    }  
  
}  
```
#### int indexOf(String substring, int fromIndex)
It returns the index position for the given substring and from index
```java
public class IndexOfExample3 {  
    public static void main(String[] args) {      
        String s1 = "This is indexOf method";         
        // Passing substring and index  
        int index = s1.indexOf("method", 10); //Returns the index of this substring  
        System.out.println("index of substring "+index);  
        index = s1.indexOf("method", 20); // It returns -1 if substring does not found  
        System.out.println("index of substring "+index);          
    }  
}  
```

### String in lowercase/String toLowerCase()
```java
public class StringLowerExample{  
public static void main(String args[]){  
String s1="JAVA HELLO stRIng";  
String s1lower=s1.toLowerCase();  
System.out.println(s1lower);  
}}  
```
### String in uppercase./String toUpperCase()
```java
public class StringUpperExample{  
public static void main(String args[]){  
String s1="hello string";  
String s1upper=s1.toUpperCase();  
System.out.println(s1upper);  
}}  
```
### Removes beginning and ending spaces of this string/String trim()
```java
public class StringTrimExample2 {    
    public static void main(String[] args) {    
        String s1 ="  hello java string   ";    
        System.out.println(s1.length());    
        System.out.println(s1); //Without trim()    
        String tr = s1.trim();    
        System.out.println(tr.length());    
        System.out.println(tr); //With trim()    
    }    
}    
```
### Converts given type into string/static String valueOf(int value)
```java
public class StringValueOfExample3 {  
    public static void main(String[] args) {  
        // char to String         
        char ch1 = 'A';    
        char ch2 = 'B';  
        String s1 = String.valueOf(ch1);    
        String s2 = String.valueOf(ch2);  
        System.out.println(s1);  
        System.out.println(s2);  
    }  
}  
```
### Returns the last index of the specified character from the given string/ LastIndexOf(“r”)
```java
public class Main {
  public static void main(String[] args) {
    String myStr = "Hello planet earth, you are a great planet.";
    System.out.println(myStr.lastIndexOf("planet"));
  }
}

```
### Returns true if the name starts with the string “Ha”/ startsWith(“Ha”)
```java
public class Main {
  public static void main(String[] args) {
    String myStr = "Hello";
    System.out.println(myStr.startsWith("Hel"));
    System.out.println(myStr.startsWith("llo"));
    System.out.println(myStr.startsWith("o"));
  }
}
```
### Returns true if the name ends with the string “ry”/ endsWith(“ry”)
```java

public class Main {
  public static void main(String[] args) {
    String myStr = "Hello";
    System.out.println(myStr.endsWith("Hel"));
    System.out.println(myStr.endsWith("llo"));
    System.out.println(myStr.endsWith("o"));
  }
}

```

## String Builder 

### Declaration 
```java

StringBuilder sb = new StringBuilder("Code Xam");
        System.out.println(sb);

```
### Get A Character from Index

```java

StringBuilder sb = new StringBuilder("Tony");
        //Set Char
        System.out.println(sb.charAt(0));

```
### Set a Character at Index
```java
StringBuilder sb = new StringBuilder("Tony");
        //Get Char
        sb.setCharAt(0, 'P');
        System.out.println(sb);

```
### Insert a Character at Some Index

```java
import java.util.*;

public class Strings {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("tony");
        //Insert char
        sb.insert(0, 'S');
        System.out.println(sb);
    }
}


```

### Delete char at some Index

```java
import java.util.*;

public class Strings {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("tony");
        //Insert char
        sb.insert(0, 'S');
        System.out.println(sb);

        //delete char
        sb.delete(0, 1);
        System.out.println(sb);
    }
}


```
### Append a char
Append means to add something at the end.

```java
import java.util.*;
 
public class Strings {
   public static void main(String args[]) {
     StringBuilder sb = new StringBuilder("Tony");
     sb.append(" Stark");
     System.out.println(sb); 
   }
}
```
### Print Length of String

```java
import java.util.*;
 
public class Strings {
   public static void main(String args[]) {
     StringBuilder sb = new StringBuilder("Tony");
     sb.append(" Stark");
     System.out.println(sb); 
 
     System.out.println(sb.length());
   }
}


```
### Reverse a String (using StringBuilder class)

```java
import java.util.*;
 
public class Strings {
   public static void main(String args[]) {
     StringBuilder sb = new StringBuilder("HelloWorld");
    
     for(int i=0; i<sb.length()/2; i++) {
       int front = i;
       int back = sb.length() - i - 1;
 
       char frontChar = sb.charAt(front);
       char backChar = sb.charAt(back);
 
       sb.setCharAt(front, backChar);
       sb.setCharAt(back, frontChar);
     }
 
     System.out.println(sb);
   }
}


```


