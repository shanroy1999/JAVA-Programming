// Old Fashioned Library for Date and Time
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;       // Old library
import java.util.TimeZone;
import java.text.SimpleDateFormat;    // Library used to manipulate format of the Date

// Libraries for File, Object Manipulations
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

// New Libraries for Data and Time
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

// Libraries for Data Structures
import java.util.Arrays;        // Class for Arrays
import java.util.List;          // Class for Lists
import java.util.Map;
import java.util.Optional;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.ArrayDeque;
import java.util.ArrayList;     // Class for ArrayLists
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Iterator;

// For Collecting in Streams
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Hello{
    public static void main(String[] args) throws ClassNotFoundException{
        String str = "Hello World";
        System.out.println(str + "\n");

        System.out.println("OPERATORS: ");
        System.out.println();
        // Logical(Boolean) Operators
        System.out.println("This is the && Logical(Boolean) Operator:");
        int a = 10;
        int b = 20;

        if(a>5 && b<100){
            System.out.println("TRUE" + "\n");
        } else{
            System.out.println("FALSE" + "\n");
        }

        System.out.println("This is the || Logical(Boolean) Operator:");

        if(a>15 || b<100){
            System.out.println("TRUE" + "\n");
        } else{
            System.out.println("FALSE" + "\n");
        }

        // Ternary (Conditional) Operator
        System.out.println("This is the Ternary(Conditional) Operator:");
        int smallerVal = a < b ? a : b;     // If a<b -> return a else return b
        System.out.println(smallerVal + "\n");

        System.out.println("This is the Ternary(Conditional) Operator in String:");
        String name = "Federer";
        String res = name.equals("Federer") ? "Name is Federer" : "Name is not Federer";
        System.out.println(res + "\n");

        System.out.println("Using multiple Ternary Operators to check multiple conditions: ");
        System.out.println(a == 0 ? "Value a is Zero\n" : a < 0 ? "Value a is Negative\n" : "Value a is Positive\n");

        // InstanceOf Operator -> Check whether an object is instance of a class
        System.out.println("Using Type Comparison(InstanceOf) Operator for Class: ");
        
        Cat cat = new Cat();
        if(cat instanceof Animal){
            System.out.println("Cat is instance of Animal Class\n");
        } else{
            System.out.println("Cat is not an instance of Animal Class\n");
        }

        System.out.println("Using Type Comparison(InstanceOf) Operator for Interface: ");

        Dog dog = new Dog();
        if(dog instanceof Mammal){
            System.out.println("Dog is instance of Mammal Class\n");
        } else{
            System.out.println("Dog is not an instance of Mammal Class\n");
        }

        // Autoboxing and Unboxing
        System.out.println("*****************************************");
        System.out.println("*****************************************");
        System.out.println();
        System.out.println("Using Autoboxing to convert Primitive to Wrapper Class Object: ");
        // Autoboxing -> Convert Primitive data type to Wrapper Class Object

        Integer int_obj = Integer.valueOf(100);
        System.out.println("integer primitive type converted to Integer Class Object: " + int_obj);
        System.out.println("Class after conversion: " + int_obj.getClass().getName() + "\n");

        Double double_obj = Double.valueOf(133.213);
        System.out.println("double primitive type converted to Double Class Object: "+ double_obj);
        System.out.println("Class after conversion: " + double_obj.getClass().getName() + "\n");

        // Unboxing -> Convert Wrapper Class Object to Primitive Data Type
        System.out.println("Using Unboxing to convert Wrapper Class Object to Primitive data type: ");
        int i = int_obj;
        System.out.println("Integer Class Object converted to integer primitive type : " + i + "\n");
        System.out.println();
        System.out.println("*****************************************");

        System.out.println("*****************************************");
        System.out.println();
        // Wrapper Classes Methods
        System.out.println("VARIOUS METHODS OF WRAPPER CLASSES: \n");
        System.out.println();
        System.out.println("1) valueOf() :");
        Integer intObj = Integer.valueOf(100);
        System.out.println("Value of Integer Class Object: " + intObj);
        Double doubObj = Double.valueOf(10283.111);
        System.out.println("Value of Double Class Object: " + doubObj);
        Boolean boolObj = Boolean.valueOf("False");
        System.out.println("Value of Boolean Class Object: " + boolObj);
        Character chObj = Character.valueOf('a');
        System.out.println("Value of Character Class Object: " + chObj);

        // Converting Binary Number to its Integer Value
        Integer o = Integer.valueOf("1001", 2);
        System.out.println("binary number '1001' converted to integer: " + o + "\n");

        System.out.println("2) byteValue() / shortValue() / longValue(), etc :");
        System.out.println("Byte value of Integer Class object: " + intObj.byteValue());
        System.out.println("Short value of Integer Class object: " + intObj.shortValue());
        System.out.println("Integer value of Integer Class object: " + intObj.intValue());
        System.out.println("Long value of Integer Class object: " + intObj.longValue());
        System.out.println("Float value of Integer Class object: " + intObj.floatValue());
        System.out.println("Double value of Integer Class object: " + intObj.doubleValue() + "\n");

        // Integer to String Conversion
        System.out.println("3) toString() :");
        System.out.println("Integer Class object converted to String object: " + intObj.toString());
        System.out.println("Double Class object converted to String object: " + doubObj.toString());
        System.out.println("Boolean Class object converted to String object: " + boolObj.toString());
        System.out.println("Character Class object converted to String object: " + chObj.toString() + "\n");

        // Convert String to Integer
        System.out.println("4) parseInt() / parseLong() / parseDouble() / parseFloat() :");
        int j = Integer.parseInt("50");
        System.out.println("String '50' converted to integer data type: " + j);
        long l = Long.parseLong("50");
        System.out.println("String '50' converted to long data type: " + l);
        double d = Double.parseDouble("50");
        System.out.println("String '50' converted to double data type: " + d);
        float f = Float.parseFloat("50");
        System.out.println("String '50' converted to float data type: " + f + "\n");

        // CompareTo() method
        System.out.println("5) CompareTo() :");
        Integer I = 50;
        System.out.println("Integer I=50 compared to integer 9 : " + I.compareTo(9)); // [1 -> greater than]
        System.out.println("Integer I=50 compared to integer 100 : " + I.compareTo(100)); // [-1 -> less than]
        System.out.println("Integer I=50 compared to integer 50 : " + I.compareTo(50) + "\n"); // [0 -> equals]

        Boolean b1 = true;
        Boolean b2 = false;
        Boolean b3 = true;
        System.out.println("Boolean b1=true compared to boolean true : " + b1.compareTo(true));     // [True, True -> 0]
        System.out.println("Boolean b1=true compared to boolean false : " + b1.compareTo(false)); // [True, False -> 1]
        System.out.println("Boolean b2=false compared to boolean b1=true : " + b2.compareTo(b1) + "\n"); // [False, True -> -1]

        // Equals() method
        System.out.println("6) Equals() :");
        Integer I1 = 10;
        Integer I2 = 50;
        System.out.println("Check if I=50 equals I1=10 : " + I.equals(I1));
        System.out.println("Check if I=50 equals I2=50 : " + I.equals(I2) + "\n");

        System.out.println("Check if Boolean b1=true equals b2=false : " + b1.equals(b2));
        System.out.println("Check if Boolean b1=true equals b3=true : " + b1.equals(b3) + "\n");

        // ceil() and floor() method
        System.out.println("7) Ceil() & Floor() :");
        double d1 = 974.22;
        System.out.println("Ceil value of d1=974.22 : " + Math.ceil(d1));
        System.out.println("Floor value of d1=974.22 : " + Math.floor(d1) + "\n");

        // round() method
        System.out.println("8) round() :");
        System.out.println("Rounded value of d1=974.22 : " + Math.round(d1) + "\n");

        // min() and max() methods
        System.out.println("9) min() and max() :");
        double d2 = 966.442;
        System.out.println("Minimum of d1=974.22 and d2=966.442 : "+Math.min(d1, d2));
        System.out.println("Mamimum of d1=974.22 and d2=966.442 : "+Math.max(d1, d2) + "\n");

        // random() method
        System.out.println("10) random() :");
        System.out.println("Random number generated between 0.0 and 1.0 : " + Math.random() + "\n");

        // isLetter() and isDigit() of Character Class
        System.out.println("11) isLetter() and isDigit() for Character Class :");
        Character ch1 = 'u';
        Character ch2 = '4';
        System.out.println("Check if the character ch1='u' is a letter : " + Character.isLetter(ch1));
        System.out.println("Check if the character ch1='u' is a digit : " + Character.isDigit(ch1));
        System.out.println("Check if the character ch2='4' is a letter : " + Character.isLetter(ch2));
        System.out.println("Check if the character ch2='4' is a digit : " + Character.isDigit(ch2) + "\n");

        System.out.println("12) isWhitespace() for Character Class :");
        Character ch3 = ' ';
        System.out.println("Check if the character ch2='4' is a whitespace : " + Character.isWhitespace(ch2));
        System.out.println("Check if the character ch3=' ' is a whitespace : " + Character.isWhitespace(ch3) + "\n");

        // isUpperCase() and isLowerCase() for Character Class
        System.out.println("13) isUpperCase() and isLowerCase() for Character Class :");
        Character ch4 = 'U';
        Character ch5 = 'a';
        System.out.println("Check if the character ch4='U' is an Uppercase : " + Character.isUpperCase(ch4));
        System.out.println("Check if the character ch4='U' is a Lowercase : " + Character.isLowerCase(ch4));
        System.out.println("Check if the character ch5='a' is an Uppercase : " + Character.isUpperCase(ch5));
        System.out.println("Check if the character ch5='a' is a Lowercase : " + Character.isLowerCase(ch5) + "\n");

        // toUpperCase() and toLowerCase() for Character Class
        System.out.println("14) toUpperCase() and toLowerCase() for Character Class :");
        System.out.println("Convert character ch4='U' to Lowercase : " + Character.toLowerCase(ch4));
        System.out.println("Convert character ch5='a' to Uppercase : " + Character.toUpperCase(ch5) + "\n");

        // Use Escape Sequences
        System.out.println("15) Using Escape Sequences in Strings :");
        System.out.println("I have writen this \"Hello World\" using Escape Sequence");
        System.out.println("I have writen this \\Hello World\\ using Escape Sequence");
        System.out.println("I have writen this \t Hello World using Escape Sequence \n");
        System.out.println();
        System.out.println("*****************************************");

        // Monitoring Heap Memory

        /* 
        Every Java Application -> has single instance of class Runtime
        Runtime -> allow application to interface with the environment in which app is running
        Current Runtime -> obtained from 'getRuntime' method
        */

        System.out.println("*****************************************");
        System.out.println();
        System.out.println("MONITORING OF HEAP MEMORY :");
        System.out.println();
        Runtime runtime = Runtime.getRuntime();

        /* get the total memory of runtime
        total memory : Memory currently available for Heap(in Bytes)
        total amount of memory in JVM -> default value chosen at runtime based on system config
        */

        long totalMem = runtime.totalMemory();      // in Bytes
        System.out.println("Heap Memory currently available for use (in Bytes) : " + totalMem + " Bytes");

        // Convert Bytes to Megabytes(MB) -> 1 MB = 1024 * 1024 Bytes
        long MegaBytes = 1024 * 1024;
        System.out.println("Heap Memory currently available for use (in MB) : " + totalMem / MegaBytes + " MB");

        /* get the maximum memory
        maxMemory : Maximum Amount of memory that JVM will attempt to use.
        JVM -> can never go beyond this maxMemory size
        JVM can expand Heap whenever needed but will always be <= maxMemory
        */
        long MaxMemory = runtime.maxMemory();       // in Bytes
        System.out.println("Max Heap Memory that can be used : " + MaxMemory / MegaBytes + " MB");

        /* get the Free Memory
        freeMemory : Amount of memory still available in JVM
        */
        long freeMemory = runtime.freeMemory();     // in Bytes
        System.out.println("Free Memory Avaliable in Heap that can be used : " + freeMemory / MegaBytes + " MB");

        /* calculate the memory in use which is being currently used by JVM */
        long MemoryInUse = totalMem - freeMemory;
        System.out.println("Memory being used : " + MemoryInUse / MegaBytes + " MB" + "\n");
        System.out.println();
        System.out.println("*****************************************");

        System.out.println("*****************************************");
        System.out.println();
        // Constructor Chaining
        System.out.println("USING CONSTRUCTOR CHAINING : ");
        System.out.println();
        House h = new House();
        System.out.println(h.toString() + "\n");
        System.out.println();
        System.out.println("*****************************************");

        System.out.println("*****************************************");
        System.out.println();
        // Method Overloading
        System.out.println("METHOD OVERLOADING : ");
        System.out.println();
        System.out.println(add(177, 298));
        System.out.println(add(2.44, 3.1771));
        System.out.println(add(190, 4204, 5549) + "\n");
        System.out.println();
        System.out.println("*****************************************");

        // Strings
        // 2 ways of declaring -> using String class and using 'new' keyword
        String s1 = "Roger";
        String s2 = "Roger";            
        
        // Both s1 and s2 point to the same string "Roger" stored in String Constant Pool only once

        String s3 = new String("Roger"); // Create one String object in heap as "Roger" already in String Constant Pool
        String s4 = new String("Roger"); // Create second String object "Roger" in Heap outside String Constant Pool
        String s5 = new String("Peter"); // Create String object "Peter" both in the String Constant Pool as well as outside
        System.out.println("*****************************************");
        System.out.println();
        System.out.println("STRING COMPARISON using 2 methods: ");
        System.out.println();

        // == -> whether point to same object
        // .equals -> whether have the same value

        System.out.println(s1==s2);                 // True
        System.out.println("String Comparison s1 and s2 using 'equals' method: " + s1.equals(s2));    // True

        System.out.println(s2==s3);                 // False
        System.out.println("String Comparison s2 and s3 using 'equals' method: " + s2.equals(s3));    // True

        System.out.println(s3==s4);                 // False
        System.out.println("String Comparison s3 and s4 using 'equals' method: " + s3.equals(s4));    // True

        System.out.println(s4==s5);                 // False
        System.out.println("String Comparison s4 and s5 using 'equals' method: " + s4.equals(s5) + "\n");    // False

        // Intern() method in String
        // If String Constant Pool -> already contains a string equal to the string object -> String from Pool returned
        // If string not in the String Constant Pool -> string object added to pool, reference to string object returned
        // Java -> auto interns String literals
        // String s = "abc" -> automatically added to string pool by Java without intern

        // intern method -> used on strings constructed with 'new' keyword -> saves memory

        System.out.println("INTERN METHOD in String: ");
        String s6 = new String("Roger");        // Create a third String object "Roger" in the Heap outside pool

        System.out.println("Before using Intern Method: ");
        System.out.println(s6==s2);         // True
        System.out.println("String Comparison s6 and s2 using 'equals' method: " + s6.equals(s2) + "\n");

        s6 = s6.intern();                       // Intern() method -> adds the string s6 = "Roger" in pool instead of Heap
        // String not added to the Heap and s6 will now also reference to the same "Roger" String object in pool
        // Memory saved
        System.out.println("After using Intern Method: ");
        System.out.println(s6==s2);         // True
        System.out.println("String Comparison s6 and s2 using 'equals' method: " + s6.equals(s2) + "\n");
        System.out.println();
        System.out.println("*****************************************");

        System.out.println("*****************************************");
        System.out.println();
        // .length() method -> return length of the string
        System.out.println("STRING METHODS: ");
        System.out.println();
        String st = "Roger Federer";
        System.out.println("1) Length of the String 'Roger Federer' is: " + st.length());

        String st2 = " is GOAT";
        System.out.println("2) Concatenating String: " + st + st2);
        System.out.println("3) Character at Index 4 in 'Roger Federer': " + st.charAt(4));
        System.out.println("4) Character at Last Index of 'Roger Federer': " + st.charAt(st.length()-1));
        System.out.println("5) Substring using first 5 character: " + st.substring(5));
        System.out.println("6) Substring between index 3 to index 9: "+st.substring(3, 9));
        System.out.println("7) Replacing character 'e' with 'u': "+st.replace('e','u'));
        System.out.println("8) Replacing substring 'ur' with 'er': "+st.replaceAll("ur", "er"));
        System.out.println("9) Removing unnecessary white spaces from ' is GOAT': '" + st2.trim() + "'");
        System.out.print("\n");
        System.out.println();
        System.out.println("*****************************************");
        
        System.out.println("*****************************************");
        System.out.println();
        // StringBuffer and StringBuilder
        System.out.println("RUNTIME OF STRINGBUFFER VS STRINGBUILDER: ");
        System.out.println();
        System.out.println("RUNTIME FOR StringBuffer : ");

        // StringBuffer
        StringBuffer buffer = new StringBuffer();
        long startTime = System.currentTimeMillis();        // start time

        // Appending to StringBuffer
        for(int t=0; t<10000000; t++){
            buffer.append("JAVA");
        }

        long endTime = System.currentTimeMillis();          // end time
        long duration = endTime - startTime;
        System.out.println("Duration for StringBuffer in Milliseconds: " + duration + "\n");

        // StringBuilder
        System.out.println("RUNTIME FOR StringBuilder : ");
        StringBuilder builder = new StringBuilder();
        long startTime2 = System.currentTimeMillis();        // start time

        // Appending to StringBuffer
        for(int t=0; t<10000000; t++){
            builder.append("JAVA");
        }

        long endTime2 = System.currentTimeMillis();          // end time
        long duration2 = endTime2 - startTime2;
        System.out.println("Duration for StringBuilder in Milliseconds: " + duration2 + "\n");

        System.out.println("STRINGBUILDER METHODS: ");
        System.out.println();
        System.out.println("1) append() method: ");
        StringBuilder sb = new StringBuilder("Jaipur City, ");
        sb = sb.append(2021).append(", ").append("Rajasthan, India");
        System.out.println(sb + "\n");

        System.out.println("2) insert() method: ");
        System.out.println(sb);
        sb = sb.insert(0, "This is my Hometown: ");
        System.out.println(sb);
        sb = sb.insert(28, "Pink ");
        System.out.println(sb + "\n");

        System.out.println("3) delete() method: ");
        System.out.println(sb);
        sb = sb.delete(32, 37);
        System.out.println(sb + "\n");

        System.out.println("4) reverse() method: ");
        System.out.println(sb);
        sb = sb.reverse();
        System.out.println(sb + "\n");

        System.out.println("5) Converting StringBuilder to a String using toString() method: ");
        String s = sb.toString();
        System.out.println("StringBuilder Converted to String: " + s + "\n");
        System.out.println();
        System.out.println("*****************************************");

        // Enums
        System.out.println("*****************************************");
        System.out.println();
        System.out.println("ACCESSING VALUES IN ENUM: ");
        System.out.println();
        System.out.println("Friday: " + Day.FRIDAY);

        Day monday = Day.MONDAY;
        System.out.println("Assigning ENUM value to variable 'monday': " + monday + "\n");

        System.out.println("Values present in the enum 'Day': ");
        for(Day day : Day.values()){
            System.out.print(day + " ");
        }
        System.out.println("\n");

        System.out.println("Values present in the enum 'Season': ");
        for(Season season : Season.values()){
            System.out.print(season + " ");
        }
        System.out.println("\n");

        System.out.println("Accessing Enum Constants from Switch Case: ");
        SeasonMethod(Season.AUTUMN);
        System.out.println();
        System.out.println("*****************************************");

        // Date and Time in JAVA
        System.out.println("*****************************************");
        System.out.println();
        System.out.println("USING OLD LIBRARIES FOR DATE AND TIME: ");
        System.out.println();
        Date date = new Date();
        System.out.println("Date: " + date);
        System.out.println("Date converted to String: " + date.toString());        // Convert Date to String

        // formating the date and time
        SimpleDateFormat dateFormat = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a z");
        System.out.println("Formatted Date: " + dateFormat.format(date));

        // Manually Setting random Date
        Calendar calendar = Calendar.getInstance();
        calendar.set(2015, Calendar.JANUARY, 1);            // Selecting a random date
        Date currentDate = calendar.getTime();              // Time will be same as current time, day and date changes
        System.out.println("Manually Setting Random Date using Calendar: "+ currentDate.toString());
        // Time printed even when not specified

        // Adding Days to Dates
        calendar.set(2019, Calendar.OCTOBER, 2);            // Setting random date
        calendar.add(Calendar.DATE, 2);
        System.out.println("Adding 2 Days to Date 2nd October 2019: " + calendar.getTime().toString());

        // Comapare Dates

        // if date > date2 -> 1
        // if date == date2 -> 0
        // if date < date2 -> -1
        Date date2 = calendar.getTime();        // outputs date object
        System.out.println("Comparing Dates: " + date.compareTo(date2));
        System.out.println("Check if Date comes before date2: " + date.before(date2));

        // Setting TimeZone
        TimeZone zone = TimeZone.getDefault();
        String zoneName = zone.getDisplayName();
        System.out.println("Name of the Default TimeZone: " + zoneName);

        System.out.println();
        System.out.println("*****************************************");
        System.out.println("*****************************************");
        System.out.println();

        System.out.println("USING NEW LIBRARIES FOR DATE AND TIME: ");
        System.out.println();
        System.out.println("Current Date: " + LocalDate.now());
        System.out.println("Current Time: " + LocalTime.now());
        System.out.println("Current Date and Time: " + LocalDateTime.now());
        System.out.println("\n");

        // Creating Date and time
        System.out.println("Creating Date and Time : ");
        LocalDate dateA = LocalDate.of(2020, Month.MARCH, 15);
        LocalDate dateB = LocalDate.of(2020, 3, 15);
        System.out.print(" Date A : " + dateA);
        System.out.print("   Date B : " + dateB + " ");

        LocalTime time = LocalTime.of(9, 33, 30);
        System.out.println("  Time Created: " + time);

        // Both Date and Time Together
        LocalDateTime ldt = LocalDateTime.of(2020, Month.MARCH, 15, 9, 33, 30);
        System.out.println("Date and Time Created: " + ldt);
        System.out.println("\n");

        System.out.println("Formatting Date and Time : ");
        DateTimeFormatter shortDate = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        DateTimeFormatter shortTime = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT, FormatStyle.SHORT);

        System.out.println("Short Date: " + dateA.format(shortDate));
        System.out.println("Short Time: " + time.format(shortTime));
        System.out.println("Short Date Time: " + ldt.format(shortDateTime));
        System.out.println("\n");

        // Update Date and Time
        System.out.println("Updating Date and Time : ");
        LocalDate date1 = LocalDate.of(2021, Month.JULY, 15);
        System.out.println("Date Created : " + date1);
        date1 = date1.plusDays(10);
        System.out.println("Date After adding 10 Days : " + date1);
        date1 = date1.withYear(2020);
        System.out.println("Date After Updating year from 2021 to 2020: " + date1);
        System.out.println("\n");

        System.out.println("Method Chaining in Dates: ");
        System.out.println("Before: " + LocalDateTime.of(dateA, time));
        LocalDateTime ldt2 = LocalDateTime.of(dateA, time).minusDays(1).minusHours(12);
        System.out.println("After: " + ldt2);

        System.out.println();
        System.out.println("*****************************************");
        System.out.println("*****************************************");
        System.out.println();

        System.out.println("CONDITIONAL STATEMENTS: ");
        System.out.println();
        System.out.println("Nested If Statement: Finding the Largest Number among 3 numbers");

        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int greatest;

        if(num1 >= num2){
            if(num1 >= num3){
                greatest = num1;
            } else{
                greatest = num3;
            }
        } else{
            if(num2 >= num3){
                greatest = num2;
            } else{
                greatest = num3;
            }
        }
        System.out.println("Greatest among 1, 2, 3: " + greatest + "\n");

        System.out.println("Nested For Loops: ");
        for(int c=0; c<10; c++){
            System.out.println("Outer loop for c index: " + c);
            for(int k=0; k<5; k++){
                System.out.println("c value: "+ c + " k value " + k);
            }
        }
        System.out.println();

        System.out.println("Printing Matrix: ");
        int[][] nums = new int[3][3];
        for(int i1=0; i1<3; i1++){
            for(int j1=0; j1<3; j1++){
                nums[i1][j1] = i1*j1;
            }
        }
        for(int i2=0; i2<3; i2++){
            for(int j2=0; j2<3; j2++){
                System.out.print(nums[i2][j2] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("*****************************************");

        System.out.println("*****************************************");
        System.out.println();

        System.out.println("ARRAYS: ");
        System.out.println();

        // Declaring a 1D Array of integers
        int[] arr = {50, 402, 44, 8829, 91};
        System.out.println("Integer Array: " + Arrays.toString(arr));   // Convert Array to String
        System.out.println("Length of the Array: " + arr.length);

        // Performing Binary Search
        System.out.print("Perform Binary Search to search an item in the Integer Array: ");
        int result = Arrays.binarySearch(arr, 44);
        System.out.print("Index of the element 44 searched: " + result + "\n");

        // Comparing 2 Arrays
        int[] arr3 = {50, 44, 8829, 91, 402};
        int[] arr4 = {50, 402, 44, 8829, 91};
        System.out.println("Comparing arr and arr3: " + Arrays.equals(arr, arr3));
        System.out.println("Comparing arr and arr4: " + Arrays.equals(arr, arr4));

        // Modifying array using user-defined function that takes array as argument
        modify(arr);
        System.out.println("Modified Integer Array by User Defined Function: " + Arrays.toString(arr));

        // Anonymous Array
        modify(new int[] {1, 2, 3, 4});

        // Sort the Integer Array
        Arrays.sort(arr);
        System.out.println("Sorted Integer Array: " + Arrays.toString(arr));

        // Copy Array elements into another Array
        int[] arr5 = Arrays.copyOf(arr, 3);
        System.out.println("Copy first 3 elements of arr in another array: " + Arrays.toString(arr5));

        // Filling the Integer Array
        Arrays.fill(arr, 10);
        System.out.println("Fill all elements of Integer Array with 10: " + Arrays.toString(arr));
        System.out.println("\n");

        // Declaring a 1D Array of Strings
        String[] arr2 = {"Aman", "Akbar", "Anthony", "Zelda", "Narnia"};
        System.out.println("String Array: " + Arrays.toString(arr2));

        // Performing Binary Search
        System.out.print("Perform Binary Search to search an item in the String Array: ");
        int result2 = Arrays.binarySearch(arr2, "Anthony");
        System.out.print("Index of the element 'Anthony' searched: " + result2 + "\n");

        // Sort the String Array
        Arrays.sort(arr2);
        System.out.println("Sorted String Array: " + Arrays.toString(arr2));

        // Filling the String Array
        Arrays.fill(arr2, "Prince");
        System.out.println("Fill all elements of String Array with 'Prince': " + Arrays.toString(arr2) + "\n");

        // Declaring 2D Arrays
        int[][] arr2d = new int[3][4];    // 3 rows and 4 columns -> all intial values = 0

        for(int ct=0; ct<3; ct++){              // for rows
            for(int dt=0; dt<4; dt++){          // for columns
                arr2d[ct][dt] = ct+dt;              // fill values for each row and col index (0,0), (0,1), (0,2)
            }
        }

        // Creating 2D array by adding numbers using For Loop
        System.out.println("Creating 2D Array using for loop : ");
        for(int ct=0; ct<3; ct++){
            for(int dt=0; dt<4; dt++){
                System.out.print(arr2d[ct][dt] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Change an item of the 2D array -> random access -> O(1) runtime complexity
        arr2d[2][2] = 50;

        System.out.println("After changing item of the 2D array : ");
        for(int ct=0; ct<3; ct++){
            for(int dt=0; dt<4; dt++){
                System.out.print(arr2d[ct][dt] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Creating 2D Array manually adding numbers without for loop
        int[][] arr2d2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};     // 3 rows and 3 columns
        System.out.println("Creating 2D Array without for loop : ");
        for(int ct=0; ct<3; ct++){
            for(int dt=0; dt<3; dt++){
                System.out.print(arr2d2[ct][dt] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Creating a Jagged Array
        System.out.println("Creating Jagged Array: ");
        int[][] arr_jagged = {{1, 2, 3, 4}, {5, 6}, {7, 8, 9}};
        for(int[] n: arr_jagged){
            for(int k : n){
                System.out.print(k + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("*****************************************");

        System.out.println("*****************************************");
        System.out.println();

        System.out.println("UISNG VARAGS ARGUMENTS IN FUNCTION: ");
        System.out.println();
        // Calling function which has Varags arguments
        System.out.println("Implementing Function which uses Varargs Arguments: ");
        sum(1, 2, 10, 394);
        System.out.println();
        System.out.println("*****************************************");

        System.out.println("*****************************************");
        System.out.println();

        System.out.println("ARRAY LISTS: ");
        System.out.println();

        // Creating ArrayList
        List<String> lst = new ArrayList<>();

        // Add Items to the ArrayList
        // added item -> added at the end of the list
        lst.add("Naruto");
        lst.add("Bleach");
        lst.add("DBZ");
        lst.add("DBS");
        lst.add("Goku");
        lst.add("Gohan");

        // toArray() method -> convert ArrayList to 1D Array
        System.out.println("ArrayList Created: "+ Arrays.toString(lst.toArray()));

        // remove items by name from the ArrayList
        lst.remove("Naruto");
        lst.remove("Gohan");
        System.out.println("ArrayList After Removal of items by name: "+ Arrays.toString(lst.toArray()));

        // remove items by index from the ArrayList
        lst.remove(1);
        System.out.println("ArrayList After Removal of items by index: "+ Arrays.toString(lst.toArray()));

        // Adding Items to Array List at Specified Index
        lst.add(2, "Beyblade");
        System.out.println("ArrayList After Adding items at specified index 2: "+ Arrays.toString(lst.toArray()));

        // Updating Item in ArrayList at a Specified Index
        lst.set(2, "Prince of Tennis");
        System.out.println("ArrayList After Updating items at specified index 2: "+ Arrays.toString(lst.toArray()));

        // Size of the ArrayList
        System.out.println("Size of the ArrayList: "+ lst.size());

        // Check if the ArrayList is Empty
        System.out.println("Check if ArrayList is Empty: " + lst.isEmpty());

        // Comparing two ArrayLists
        List<String> lst2 = new ArrayList<>();
        lst2.add("Sasuke");
        lst2.add("Sakura");
        lst2.add("Boruto");
        lst2.add("Naruto");
        lst2.add("Prince of Tennis");

        System.out.println("Check if lst and lst2 are equal: "+lst.equals(lst2));

        List<String> lst3 = new ArrayList<>();
        lst3.add("Bleach");
        lst3.add("DBS");
        lst3.add("Prince of Tennis");
        lst3.add("Goku");

        System.out.println("Check if lst and lst3 are equal: "+lst.equals(lst3));

        // Sorting the ArrayList -> uses MergeSort O(NLogN)
        Collections.sort(lst);
        System.out.println("Sorted Array List: "+lst);
        System.out.println();
        System.out.println("*****************************************");

        System.out.println("*****************************************");
        System.out.println();

        System.out.println("GENERICS: ");
        System.out.println();

        // Generics used in ArrayList
        ArrayList<String> arr1 = new ArrayList<>();
        arr1.add("Leander");
        // arr1.add(12);           // Will give an error because it can only take String Argument
        String fname = arr1.get(0);
        System.out.println("Accessing the String stored in arraylist with specified generics: " + fname + "\n");

        // Accessing the Generic Method printArray
        // using String type array
        String[] tennis = {"Federer", "Nadal", "Djokovic", "Tsitsipas", "Zverev"};
        System.out.println("Accessing the Generic method printArray using String array arguments: ");
        printArray(tennis);
        System.out.println("\n");

        // Using Integer type array
        Integer[] grand_slams = {20, 20, 19, 0, 0};
        System.out.println("Accessing the Generic method printArray using Integer array arguments: ");
        printArray(grand_slams);
        System.out.println("\n");

        // Using both String and Integer in same generic method
        System.out.println("Accessing the Generic method printArray2 using both Integer array and String Array arguments: ");
        printArray2(tennis, grand_slams);
        System.out.println("\n");

        System.out.println("Creating an object of the generic class 'Box' : ");
        Box<Integer> box1 = new Box<>(100);
        System.out.println("Accessing the Integer class object using getElement generic method: " + box1.getElement());

        Box<String> box2 = new Box<>("One Hundred");
        System.out.println("Accessing the String class object using getElement generic method: " + box2.getElement());
        System.out.println("\n");

        List<Double> doub = new ArrayList<>();
        doub.add(3.17);
        doub.add(944.2333);
        doub.add(99.111);
        System.out.println("-> Using Upper Bounded Wildcard Generic: ");
        System.out.println("1) For Double subclass datatype: ");
        print(doub);
        System.out.println("\n");

        List<Integer> intg = new ArrayList<>();
        intg.add(1);
        intg.add(2);
        intg.add(3);
        System.out.println("2) For Integer subclass datatype: ");
        print(intg);
        System.out.println("\n");

        List<Number> numb = new ArrayList<>();
        numb.add(60);
        numb.add(90);
        System.out.println("-> Using Lower Bounded Wildcard Generic: ");
        System.out.println("1) For Number superclass datatype: ");
        addAndPrint(numb);
        System.out.println();

        List<Object> obj = new ArrayList<>();
        obj.add("Ground");
        obj.add(100);
        System.out.println("2) For Object superclass datatype: ");
        addAndPrint(obj);
        System.out.println();

        List<Integer> intg1 = new ArrayList<>();
        intg1.add(60);
        intg1.add(90);
        System.out.println("3) For same Integer class datatype: ");
        addAndPrint(intg1);
        System.out.println();

        List<String> stng = new ArrayList<>();
        stng.add("Jaby");
        stng.add("Achara");
        System.out.println("-> Using UnBounded Wildcard Generic: ");
        System.out.println("1) For String class datatype: ");
        unBound(stng);

        System.out.println("\n");
        System.out.println("*****************************************");

        System.out.println("*****************************************");
        System.out.println();

        System.out.println("ARRAY LISTS AND LINKED LISTS : ");
        System.out.println();

        // Creating ArrayLists
        List<String> AL = new ArrayList<>();
        
        // add elements to arraylist
        AL.add("Kakashi");
        AL.add("Jiraiya");
        AL.add("Sunade");

        // iterating through ArrayLists
        Iterator<String> ALIter = AL.iterator();
        System.out.print("Iterating through ArrayList Elements using Iterator : ");
        while(ALIter.hasNext()){
            System.out.print(ALIter.next() + " ");
        }
        System.out.println();

        // Creating LinkedLists
        List<String> LL = new LinkedList<>();

        // Adding Elements to LinkedList
        LL.add("Harry");
        LL.add("Hermoine");
        LL.add("Ron");

        System.out.print("Iterating through LinkedList Elements using for Loop : ");
        for(String cnt : LL){
            System.out.print(cnt + " ");
        }
        System.out.println("\n");
        System.out.println("*****************************************");

        System.out.println("*****************************************");
        System.out.println();

        System.out.println("QUEUE, DEQUEUE AND PRIORITY QUEUE : ");
        System.out.println("\n");
        Queue<AccessCard> queue = new PriorityQueue<>();

        // Add AccessCard items to the priority queue
        queue.add(new AccessCard("Ramesh", 15));
        queue.add(new AccessCard("Suresh", 20));
        queue.add(new AccessCard("Mahesh", 25));

        System.out.println("1) QUEUE & PRIORITY QUEUE: ");
        System.out.println();

        System.out.print("Elements added in the Queue : ");
        for(AccessCard ac : queue){
            System.out.print(ac + " ");
        }
        System.out.println();
        System.out.println("Size of the Queue : " + queue.size());
        System.out.println("Check if the Queue is Empty : " + queue.isEmpty());
        System.out.println("Top Element of Queue (not removed) : " + queue.element());
        System.out.println("Size of the Queue : " + queue.size());
        System.out.println("Top Element of Queue (removed) : " + queue.poll());
        System.out.println("Size of the Queue after removal of top element : " + queue.size());
        System.out.print("Elements added in the Queue after Removal : ");
        for(AccessCard ac : queue){
            System.out.print(ac + " ");
        }
        System.out.println();
        System.out.println("\n");

        // Declaring a Dequeue
        Deque<Integer> deque = new ArrayDeque<>();

        // Adding Element to Dequeue
        deque.add(100);
        deque.add(200);
        deque.add(300);

        System.out.println("2) DEQUEUE: "); 
        System.out.println();
        System.out.print("Elements added in the Dequeue: ");
        for(Integer ig : deque){
            System.out.print(ig + " ");
        }
        System.out.println();

        // Adding Elements to the beginning of Dequeue
        deque.offerFirst(1);
        deque.offerFirst(-2);
        deque.offerFirst(-3);
        System.out.print("Elements added to the Beginning in the Dequeue: ");
        for(Integer ig : deque){
            System.out.print(ig + " ");
        }
        System.out.println();

        // Adding Elements to the End of Dequeue
        deque.offerLast(12);
        deque.offerLast(-20);
        deque.offerLast(-300);
        System.out.print("Elements added to the End in the Dequeue: ");
        for(Integer ig : deque){
            System.out.print(ig + " ");
        }
        System.out.println();

        // Removing from Beginning and End of the Dequeue 
        deque.removeFirst();
        deque.removeLast();
        System.out.print("Elements removed from end and beginning in the Dequeue: ");
        for(Integer ig : deque){
            System.out.print(ig + " ");
        }
        System.out.println("\n");
        System.out.println("*****************************************");

        System.out.println("*****************************************");
        System.out.println();

        System.out.println("HASHSET, LINKED HASHSET, TREE SET : ");
        System.out.println();

        System.out.println("1) HASHSET : ");
        // Declaring a Hashset
        Set<Integer> set = new HashSet<>();

        // Adding Elements to the HashSet
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);

        System.out.print("Elements added in the HashSet: ");
        for(Integer el : set){
            System.out.print(el + " ");
        }
        System.out.println();
        System.out.println("Check if the Set contains element 100: " + set.contains(100));
        System.out.println("Check if the Set contains element 10: " + set.contains(10));

        set.add(10);
        System.out.print("Set after removal of element 10: ");
        for(Integer el : set){
            System.out.print(el + " ");
        }
        System.out.println("\n");

        // LinkedHashSet
        System.out.println("2) LINKED HASH SET : ");
        Set<Integer> LHSet = new LinkedHashSet<>();

        // Adding Elements to Linked Hash Set
        LHSet.add(10);
        LHSet.add(20);
        LHSet.add(30);
        LHSet.add(40);

        System.out.print("Elements added in the LinkedHashSet: ");
        for(Integer lh : LHSet){
            System.out.print(lh + " ");
        }
        System.out.println("\n");

        System.out.println("3) TREE SET : ");
        Set<Integer> treeSet = new TreeSet<>();

        // Adding Elements to Tree Set
        treeSet.add(100);
        treeSet.add(40000);
        treeSet.add(1);
        treeSet.add(-29);

        System.out.print("Elements added in the Tree Set: ");
        for(Integer ts : treeSet){
            System.out.print(ts + " ");
        }
        System.out.println("\n");
        System.out.println("*****************************************");

        System.out.println("*****************************************");
        System.out.println();

        System.out.println("HASHMAP, LINKED HASHMAP, TREE MAP : ");
        System.out.println();

        System.out.println("1) HASHMAP : ");
        Map<Integer, String> map = new HashMap<>();

        // Adding Key, Value Pairs to the HashMap
        map.put(1, "Djokovic");
        map.put(8, "Federer");
        map.put(7, "Rublev");
        map.put(4, "Tsitsipas");
        map.put(53, "Nishkori");
        map.put(26, "Evans");

        System.out.print("Elements added in the HashMap: ");
        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.print(entry.getKey() + "-" + entry.getValue() + "  ");
        }
        System.out.println("\n");

        System.out.println("2) LINKED HASHMAP : ");
        Map<Integer, String> lmap = new LinkedHashMap<>();

        // Adding Key, Value Pairs to the Linked HashMap
        lmap.put(1, "Djokovic");
        lmap.put(8, "Federer");
        lmap.put(7, "Rublev");
        lmap.put(4, "Tsitsipas");
        lmap.put(53, "Nishkori");
        lmap.put(26, "Evans");

        System.out.print("Elements of Linked Hash Map: ");
        for(Map.Entry<Integer, String> entry3 : lmap.entrySet()){
            System.out.print(entry3.getKey() + "-" + entry3.getValue() + "  ");
        }
        System.out.println("\n");

        System.out.println("3) TREE HASHMAP : ");
        Map<Integer, String> tmap = new TreeMap<>(map);

        System.out.print("HashMap converted to Tree Map: ");
        for(Map.Entry<Integer, String> entry2 : tmap.entrySet()){
            System.out.print(entry2.getKey() + "-" + entry2.getValue() + "  ");
        }
        System.out.println("\n");
        System.out.println("*****************************************");

        System.out.println("*****************************************");
        System.out.println();

        System.out.println("1) LOCAL INNER CLASS : ");

        System.out.print("Accessing the Local Inner Class created inside the method of Outer Class: ");
        OuterClass out = new OuterClass();
        out.outerMethod();
        System.out.println();

        System.out.println("2) MEMBER INNER CLASS : ");

        System.out.print("Accessing the Member Inner Class created inside Outer Class but outside method: ");
        OuterClass2 out2 = new OuterClass2();
        OuterClass2.InnerClass2 inner2 = out2.new InnerClass2();
        inner2.showMessage();
        System.out.println();

        System.out.println("3) STATIC NESTED CLASS : ");
        System.out.print("Accessing the Static Nested Class created inside the Outer Class with static keyword : ");
        
        // Instatiating Static Nested Class without instantiating the OuterClass object
        OuterClass3.Nested nested = new OuterClass3.Nested();
        nested.showMessage();
        System.out.println();

        System.out.println("4) ANONYMOUS INNER CLASS : ");
        System.out.print("Accessing the Anonymous Inner Class created inside the Abstract Class by overriding : ");

        // Implementing, Overriding the showMessage() method inside the Abstract class
        AbstractClass abs = new AbstractClass(){
            @Override
            void showMessage(){
                System.out.println("Message Overriden for the Abstract Class....");
            }
        };
        abs.showMessage();      // Can access the abstract class method
        System.out.println("\n");
        System.out.println("*****************************************");

        System.out.println("*****************************************");
        System.out.println();

        System.out.println("EXCEPTION HANDLING");
        System.out.println();

        System.out.println("MULTIPLE EXCEPTION HANDLING: ");
        Scanner scan = new Scanner(System.in);

        // Try-Catch Block -> makes sure application does not freezes -> Exception Handled
        // Try Block
        try{
            System.out.println("Enter a Number: ");
            int n = Integer.parseInt(scan.nextLine());
            System.out.println(20 / n);
        }

        // Catch Block
        // If divided by 0
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception found: " + e);
        }

        // If any other data type entered other than number
        catch(NumberFormatException ex){
            System.out.println("Number Format Exception found: " + ex);
        }

        scan.close();
        System.out.println();

        System.out.println("NESTED EXCEPTION HANDLING: ");

        // outer try block
        try{
            int arrTry[] = {1, 2, 3, 4, 5};
            System.out.println(arrTry[9]);          // accessing out of bounds index

            // inner try block
            try{
                int x = arrTry[2] / 0;
                System.out.println("Result of division" + x);
            } catch (ArithmeticException e2){
                System.out.println("Arithmetic Exception found: "+e2);
            }
        } catch(ArrayIndexOutOfBoundsException e3){
            System.out.println("Array Index Out of Bound Exception Found: " + e3);
        }
        System.out.println("\n");
        System.out.println("*****************************************");

        System.out.println("*****************************************");
        System.out.println();

        System.out.println("INHERITANCE: ");
        System.out.println();

        // Creating the Child Class Object
        Child child = new Child();
        System.out.print("Accessing Parent Method using Child Class : ");
        child.parentMethod();
        System.out.print("Accessing the Child Class Method : ");
        child.childMethod();
        System.out.println();

        // Creating the Grand Child Object
        GrandChild gc = new GrandChild();
        System.out.println("Accessing Child, Parent and GrandChild Methods using GrandChild Class : ");
        System.out.println();
        gc.childMethod();
        gc.parentMethod();
        gc.grandChildMethod();

        System.out.println("\n");
        System.out.println("*****************************************");

        System.out.println("*****************************************");
        System.out.println();

        System.out.println("SERIALIZATION : ");
        System.out.println();

        // Creating object of Car class which uses serializability
        Car car = new Car("Ferari", 1126590, "Red");

        // Steps for Implementing Searialization
        try{

            // Transform an object into Stream of bytes using fileOutputStream
            FileOutputStream fileOutput = new FileOutputStream("serialization.txt");

            // New File serialization.txt created in the directory => not a human readable file
            // file -> contain all the information required to deserialize the object
            // file -> contains the Car object

            // Using objectOutputStream to serialize the object
            ObjectOutputStream objOutput = new ObjectOutputStream(fileOutput);
            objOutput.writeObject(car);         // Object Serialized

            // Close the objectOutputStream
            objOutput.close();

            // Close the fileOutput Stream
            fileOutput.close();

            System.out.println("Car Object Serialized Successfully....");
        } 
        catch(IOException e){
            e.printStackTrace();
        }

        System.out.println();
        System.out.println("DE-SERIALIZATION : ");
        System.out.println();

        try{

            // Transform an Stream of bytes into an using fileInputStream
            FileInputStream fileInput = new FileInputStream("serialization.txt");

            // New File serialization.txt created in the directory => not a human readable file
            // file -> contain all the information required to deserialize the object
            // file -> contains the Car object

            // Using objectOutputStream to serialize the object
            ObjectInputStream objInput = new ObjectInputStream(fileInput);

            Car deserializedCar = (Car) objInput.readObject();      // De-Serialized object
            // Exception handled by throws classNotFoundException in Main method

            // Close the objectInputStream
            objInput.close();

            // Close the fileInput Stream
            fileInput.close();

            System.out.print("Deserialized Car Object : ");
            System.out.print(deserializedCar);
            System.out.println();

            System.out.println("Car Object De-Serialized Successfully....");
        } 
        catch(IOException e){
            e.printStackTrace();
        }

        System.out.println("\n");
        System.out.println("*****************************************");

        System.out.println("*****************************************");
        System.out.println();

        System.out.println("LAMBDA EXPRESSIONS : ");
        System.out.println();

        // using the Sum interface
        Sum sum = new Sum(){

            // Ovverriding method for the interface
            @Override
            public int addition(int a, int b){
                return a + b;
            }
        };
        System.out.println("Addition using Sum Interface(without Lambda Expression) : " + sum.addition(10, 20));

        // Without using Sum interface
        // Using Lambda Expression for add function(with 2 parameters) of Sum interface
        Sum sum1 = (int nm1, int nm2) -> {return nm1+nm2;};
        System.out.println("Addition using Sum Interface(using Lambda Expression) : " + sum1.addition(10, 20));
        System.out.println();

        // Lambda Expression for sayHello(with no parameters) function of Greetings interface
        Greetings gg = () -> System.out.println("This is Lambda Expression for sayHello method of Greetings Interface");
        gg.sayHello();

        Greetings2 gg2 = msg -> System.out.println("This is Lambda Expression for sayHello2 method of Greetings2 Interface : " + msg);
        gg2.sayHello2("This is the Message");

        // Chaining of Lambda Expression
        System.out.print("Chaining of Lambda Expressions to perform multiple operations : ");
        Sum sum3 = (r1, r2) -> addition(r1, increment(r2));
        System.out.println(sum3.addition(10, 20));

        // Using forEach function along with lambda expression
        System.out.print("Using forEach() function with Lambda expressions in case of Collections : ");
        List<String> aL = new ArrayList<>();
        aL.add("Itachi");
        aL.add("Vegeta");
        aL.add("Orochimaru");
        aL.add("Yuno");
        aL.add("Light");

        // using lambda expression to apply function / iterate to each member of the collection
        aL.forEach(ss -> System.out.print(ss + " "));

        System.out.println("\n");
        System.out.println("*****************************************");

        System.out.println("*****************************************");
        System.out.println();

        System.out.println("FUNCTIONAL INTERFACE : ");
        System.out.println();

        // Lambda Expression for Functional Interface FI
        FI fun = (nb1, nb2) -> nb1 + nb2;
        System.out.println("Addition using Lambda Function for Functional Interface FI : " + fun.add(10, 40));

        System.out.println("\n");
        System.out.println("*****************************************");

        System.out.println("*****************************************");
        System.out.println();

        System.out.println("METHOD REFERENCES : ");
        System.out.println();

        // Reference to a Static Method
        System.out.print("Accessing the staticGreetings() static method using method reference with functional interface : ");
        FunctionalInter fi = Hello::staticGreetings;
        fi.show();

        // Reference to an Instance Method of a Particular Object
        System.out.print("Accessing the instanceGreetings() instance method using method reference with functional interface : ");
        Hello objHello = new Hello();
        FunctionalInter fi2 = objHello :: instanceGreetings;
        fi2.show();

        // Reference to an Instance Method of an arbitrary object of a Particular Type
        System.out.print("Accessing the compareToIgnoreCase() method of String class using method reference to sort : ");
        String[] names = {"Djokovic", "Nadal", "Federer", "Murray", "Agassi", "Sampras"};
        // Sorting  the Array of Strings lexicographically ignoring Case(upper/lower)
        Arrays.sort(names, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(names));

        // Reference to a Constructor
        System.out.print("Accessing the constructor of MessageClass using method reference with functional interface : ");
        FunctionalInter2 fi3 = MessageClass::new;           // Call the constructor of Message Class
        fi3.showMessage("This is Message using constructor....");

        // Using forEach function along with method references
        System.out.print("Using forEach() function with Method References in case of Collections : ");
        aL.forEach(System.out :: print);

        System.out.println("\n");
        System.out.println("*****************************************");

        System.out.println("*****************************************");
        System.out.println();

        System.out.println("OPTIONALS : ");
        System.out.println();

        Person person = new Person("Roger Federer");

        // Create an Empty Optional for the Person object
        Optional<Person> personEmpty = Optional.empty();
        System.out.println("Empty Optional Created for Person object : " + personEmpty);

        // Create an Optional to store the Person object using of() method
        Optional<Person> personStored = Optional.of(person);
        // If person=null -> get Exception in .of() method

        System.out.println("Optional with Person object stored : " + personStored);
        System.out.println("Peron Object stored in Optional : " + personStored.get());
        System.out.println("Name of the Person object stored in Optional : " + personStored.get().getName());

        // Create Optional to store Person Object using ofNullable() method which can store null values too
        Optional<Person> personNullable = Optional.ofNullable(person);
        if(personNullable.isPresent()){         // Check if there is value present inside the Optional
            System.out.println("The object stored in Optional 'person' is not Null with value : " + personNullable.get());
        } else{
            System.out.println("The object stored in Optional 'person' is Null (using ofNullable())");
        }

        // Storing null value in Optional
        Person person2 = null;
        Optional<Person> personNullable2 = Optional.ofNullable(person2);
        if(personNullable2.isPresent()){         // Check if there is value present inside the Optional
            System.out.println("The object stored in Optional 'person2' is not Null with value : " + personNullable2.get());
        } else{
            System.out.println("The object stored in Optional 'person2' is Null (using ofNullable())");
        }

        Optional<Person> op = Optional.ofNullable(null);
        Person p = op.orElse(new Person("The null object is now replaced"));
        System.out.println("Replacing the object value if the object stored in Optional is Null : " + p);
        System.out.println();

        System.out.println("MAPPING USING OPTIONALS : ");
        System.out.println();
        
        /* 
        Without using Optionals : 
        Stamp stamp = new Stamp("Switzerland");
        Passport pass = new Passport(stamp);
        Traveller traveller = new Traveller("Drake", pass);

        // If anything is not null
        // System.out.println(traveller.getName() + "-" + traveller.getPassport().getStamp().getStampOfCountry());
        */

        // Possibility -> stamp / passport might be null value

        // Using Optionals :
        Optional<Stamp> stamp = Optional.ofNullable(new Stamp("Switzerland"));
        Optional<Passport> pass = Optional.ofNullable(new Passport(stamp));
        Optional<Traveller> travel = Optional.ofNullable(new Traveller("Drake", pass));

        // Using Map, FlatMap to perform Operations
        // Passport -> doesnt give value of Stamp -> instead returns optional
        // FlatMap -> used when function returns Optional 
                // -> flattens the multi-level Optionals into single one optional
        // Map -> used when function returns object

        String stampOfCountry = travel.flatMap(Traveller :: getPassport).flatMap(Passport :: getStamp).map(Stamp :: getStampOfCountry).orElse("Unknown");
        System.out.println("Stamp of Country (using Map and FlatMap with Optionals) : " + stampOfCountry);

        // If null Value input in Stamp
        Optional<Stamp> stamp2 = Optional.ofNullable(new Stamp(null));
        Optional<Passport> pass2 = Optional.ofNullable(new Passport(stamp2));
        Optional<Traveller> travel2 = Optional.ofNullable(new Traveller("Drake", pass2));

        String stampOfCountry2 = travel2.flatMap(Traveller :: getPassport).flatMap(Passport :: getStamp).map(Stamp :: getStampOfCountry).orElse("Unknown");
        System.out.println("Stamp of Country (if Null) : " + stampOfCountry2);

        System.out.println("\n");
        System.out.println("*****************************************");

        System.out.println("*****************************************");
        System.out.println();

        System.out.println("STREAMS : ");
        System.out.println();

        List<String> soccer = Arrays.asList("Messi", "Ronaldo", "Ronaldinho", "Zidane", "Kaka", "Acensio");

        // Filetering the arraylist using stream()
        List<String> filteredSoccer = soccer.stream().filter(player -> player.startsWith("R")).collect(Collectors.toList());
        
        System.out.print("Players Filtered and Collected using stream() from the list : ");
        // Print each of the members of filteredSoccer List
        filteredSoccer.forEach(pl -> System.out.print(pl + " "));
        System.out.println();

        // Storing Result in a Stream
        Stream<String> stream = soccer.stream().filter(player -> player.startsWith("R"));
        System.out.println("Stream Created after filtering : " + stream);
        System.out.print("Stream Items : "); 
        stream.forEach(item -> System.out.print(item + " "));
        System.out.println();

        // Count number of elements in Stream
        List<String> tennisP = Arrays.asList("Federer", "Nadal", "Djokovic", "Murray", "Ferrer", "Gasquet", "Isner", "Karlovic", "Tsonga");
        System.out.print("Number of Items present in the Stream starting with 'F' : " + tennisP.stream().filter(play -> play.startsWith("F")).count());
        System.out.println();

        // Stream of numbers from 1 to 10
        Stream<Integer> numbs = Stream.iterate(1, n->n+1).limit(10);        // limit() -> number of integers to print
        System.out.print("Stream of Numbers from 1 to 10 : ");
        numbs.forEach(n -> System.out.print(n + " "));
        System.out.println();

        // Generate Stream of 5 random numbers between 0 and 1
        Stream<Double> rand = Stream.generate(Math :: random).limit(5);
        System.out.print("Stream of 5 Random Numbers generated : ");
        rand.forEach(n -> System.out.print(n + " "));
        System.out.println();

        // Concatenate Array of String using Stream
        String[] games = {"Football", "Basketball", "Volleyball", "Tennis", "Cricket"};
        Stream<String> stream3 = Arrays.stream(games);
        Optional<String> outp = stream3.reduce((word1, word2) -> word1 + "-" + word2);
        System.out.println("Concatenation of Array of String using Streams : " + outp.get());

        // Converting ArrayList items to UpperCase
        System.out.print("ArrayList Items converted to UpperCase using Stream : ");
        List<String> pus = Arrays.asList("Washington", "Clinton", "Trump", "Obama", "Lincoln");
        pus.stream().map(String :: toUpperCase).collect(Collectors.toList()).forEach(pres -> System.out.print(pres + " "));
        System.out.println();

        // Converting List of Lists into a Stream
        System.out.print("List of List converted to Stream : ");
        List<String> bat = Arrays.asList("Sachin", "Dravid", "Dhoni", "Dhawan", "Yuvraj", "Kohli");
        List<String> bowl = Arrays.asList("Ishant", "Harbhajan", "Zaheer", "Jadeja", "Chahal");
        List<List<String>> team = Arrays.asList(bat, bowl);
        team.stream().flatMap(list->list.stream()).collect(Collectors.toList()).forEach(ply -> System.out.print(ply + " "));;
        System.out.println();

        // Filtering Map using Stream
        System.out.print("Filtered Values from the Map using Stream : ");
        Map<String, Integer> trophies = new HashMap<>();
        trophies.put("Federer", 20);
        trophies.put("Nadal", 20);
        trophies.put("Djokovic", 19);
        trophies.put("Sampras", 14);

        Map<String, Integer> resultMap = trophies.entrySet().stream().filter(n -> n.getValue()>15).skip(1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(resultMap);
        System.out.println();

        System.out.println("SEQUENTIAL VS PARALLEL STREAMS : ");
        System.out.println();
        System.out.println("1) Sequential");

        long start = System.currentTimeMillis();
        // returns count of sequential stream from start index to end which are even
        long c = IntStream.rangeClosed(0, 1000000).filter(sq->sq%2==0).count();
        long dur = System.currentTimeMillis()-start;           // duration between the start and end of operation
        System.out.println("Counted : " + c + " in Duration : " + dur + " ms");
        System.out.println();

        System.out.println("2) Parallel");

        long start_p = System.currentTimeMillis();
        // returns count of sequential stream from start index to end which are even
        long c_p = IntStream.rangeClosed(0, 1000000).parallel().filter(pl->pl%2==0).count();
        long dur_p = System.currentTimeMillis()-start_p;           // duration between the start and end of operation
        System.out.println("Counted : " + c_p + " in Duration : " + dur_p + " ms");

        System.out.println("\n");
        System.out.println("*****************************************");

        System.out.println("*****************************************");
        System.out.println();

        // Threading and Multithreading
        System.out.println("THREADING : ");
        System.out.println();
        Thread th1 = new Thread(new ThreadExample());
        th1.start();            // Start the Thread -> begin execution

        // Instatiating and Running mutliple threads
        int num_threads = 6;
        for(int thread=0; thread<num_threads; thread++){
            Thread t = new Thread(new ThreadExample());     // Create 6 new threads
            t.start();                                      // Start all the 6 threads created
        }
    }

    // Method Overloading
    static int add(int num1, int num2){
        System.out.println("Adding 2 integers : ");
        return num1+num2;
    }

    static double add(double num1, double num2){
        System.out.println("Adding 2 doubles : ");
        return num1+num2;
    }

    static int add(int num1, int num2, int num3){
        System.out.println("Adding 3 integers : ");
        return num1+num2+num3;
    }

    // Creating an enum Class consisting of unchageable values(constants)
    public enum Season{
        SUMMER,
        AUTUMN,
        MONSOON,
        WINTER
    }

    // Using Enum in Switch Case
    public static void SeasonMethod(Season season){
        switch(season){
            case SUMMER:
                System.out.println("This is the Summer Season");
                break;
            case AUTUMN:
                System.out.println("This is the Autumn Season");
                break;
            case MONSOON:
                System.out.println("This is the Monsoon Season");
                break;
            case WINTER:
                System.out.println("This is the Winter Season");
                break;
            default:
                System.out.println("No Season");
                break;
        }
    }

    // Passing Arrays as an argument in function
    // Arrays -> called by reference and not by value
    private static void modify(int[] nums){
        for(int i=0; i<nums.length; i++){
            nums[i] = nums[i]*10;
        }
    }

    // Using Varags arguments for passing variable number of arguments in a method
    // Cannot use 2 types of varags arguments in same method -> error [sum (int...nums, String...s) => error]
    public static void sum(int ... nums){
        int tot = 0;
        for(int i=0; i<nums.length; i++){
            tot+=nums[i];
        }
        System.out.println("Sum of the Variable number of arguments entered is: " + tot);
    }

    // Creating Generic Method
    public static <T> void printArray(T[] t){
        for(T value : t){
            System.out.print(value + " ");
        }
    }

    // Using 2 generic types in a method
    public static <T, V> void printArray2(T[] t, V[] v){
        for(T value : t){
            System.out.print(value + " ");
        }
        for(V value : v){
            System.out.print(value + " ");
        }
    }

    // Using Upper Bounded Wildcards in Generic Methods
    public static void print(List<? extends Number> t){     
        // will not handle list of strings as datatype must be subclass of Number only

        for(Number value : t){
            System.out.print(value + " ");
        }
    }

    // Using Lower Bounded Wildcards in Generic Methods
    public static void addAndPrint(List<? super Integer> t){     
        // will not handle list of strings as datatype must be superclass of Integer only
        // superclass of Integer -> Number, Object
        t.add(10);
        t.add(20);
        System.out.println(Arrays.toString(t.toArray()));
    }

    // Using Unbounded Wildcards in Generic Methods
    public static void unBound(List<?> t){
        for(Object item : t){
            System.out.print(item + " ");
        }
    }

    // Creating a static method
    public static void staticGreetings(){
        System.out.println("This is a Static Greeting Method.....");
    }

    // Creating an Instance method for object
    public void instanceGreetings(){
        System.out.println("This is an Instance Greeting Method.....");
    }

    public static int addition(int a1, int b1){
        return a1 + b1;
    }

    public static int increment(int a){
        a = a+10;
        return a;
    }
}

// Creating a Functional Interface
interface FunctionalInter{
    public void show();
}

interface FunctionalInter2{
    MessageClass showMessage(String str);
}