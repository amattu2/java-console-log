# Introduction
This is only a simple JavaScript -> Java conversion of the console.log command. 

It will convert the following types to a string and output it:
- String (Array, ArrayList)
- Double (Array)
- Integer (Array)

In addition to those, it will also output the native type of:
- String
- Double
- Integer

# Usage
Simple usage:
```
int[] array = new int[5];
int number = 10;

array[0] = 5;
array[3] = 12;
array[4] = 6;

Console.log(array); // 5 0 0 12 6
Console.log(number); // 10
```
