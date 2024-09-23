# Java Basics Learning

This repository contains a series of Java programs that cover fundamental concepts such as variable declaration, arithmetic operations, and variable reassignment. Each program serves as a learning exercise to understand these basic principles.

## Program Summaries

### 1. **Simple Variable Declaration**
- This program demonstrates the declaration of a variable `cats` with a value of 7 and prints it to the console.
```java
int cats;
cats = 7;
System.out.println(cats);
```

### 2. **Variable Addition**
- Here, the program initializes variables `cats` and `dogs`, calculates their sum, and prints the total.
```java
int cats = 7;
int dogs = 5;
int total = cats + dogs;
System.out.println(total);
```

### 3. **Multiple Variables Addition**
- Extending from the previous program, this one introduces a new variable `rats`, calculates the total number of animals, and displays individual counts.
```java
int cats = 7;
int dogs = 5;
int rats = 3;
int total = cats + dogs + rats;
System.out.println("Number of cats: " + cats);
System.out.println("Number of dogs: " + dogs);
System.out.println("Number of rats: " + rats);
System.out.println("Total number of animals: " + total);
```

### 4. **Double Variable Usage**
- This program showcases the usage of double data type with a variable `height` set to 1.8 and prints it.
```java
double height = 1.8;
System.out.println("Height is: " + height);
```

### 5. **Arithmetic Operations**
- Various arithmetic operations like addition, division, multiplication, and subtraction are performed and their results are printed.
```java
System.out.println(7 + 3);
System.out.println(9/3);
System.out.println(10/3);
System.out.println(10.0/3.0);
System.out.println(9/4.0);
System.out.println(3 * 4);
System.out.println(3 - 4);
```

### 6. **Variable Reassignment**
- Demonstrates how variables `dogs` and `cats` are assigned values and then reassigned, showcasing the impact on the output.
```java
int dogs = 8;
int cats = 3;
System.out.println("1. Dogs: " + dogs);
System.out.println("1. Cats: " + cats);

dogs = cats;
cats = 10;

System.out.println("2. Dogs: " + dogs);
System.out.println("2. Cats: " + cats);
```

### 7. **Height Calculation**
- A program calculating the total height based on a person's height and a flagpole's height, showcasing basic arithmetic operations in Java.
```java
public static void main(String[] args) {
    double personHeight = 1.67;
    double flagpoleHeight = 2.0;
    double totalHeight = (personHeight * 7) + flagpoleHeight;
    System.out.println(totalHeight);
}
```

## What I Learned
- Basic variable declaration and initialization in Java.
- Arithmetic operations such as addition, subtraction, multiplication, and division.
- Understanding the differences between integer and floating-point calculations.
- Variable reassignment and its effects on the program output.

