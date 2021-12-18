# Table of Context
- [Spring Core]()
- [Spring JDBC](src/main/java/io/github/sorabh86/spring/jdbc/README.md)


## Java Core 
Reminds & Remember

### Data Types
#### Primitives
A primitive type always have a value.
Integer Type
-----------
1. byte ( -128 to 127 )
```java
byte myNum = 100
```
2. short ( -32768 to 32767 )
```java
short myNum = 5000;
```
3. int ( -2147483648 to 2147483647 )
```java
int myNum = 100000;
```
4. long ( -9223372036854775808 to 9223372036854775807 )
```java
long myNum = 15000000000L;
```

Floating Type
------------
1. float ( 3.4e−038 to 3.4e+038 )
```java
float myNum = 5.75f;
```
2. double ( 1.7e−308 to 1.7e+308 )
```java
double myNum = 19.99d;
```

Other Type
----------
1. boolean ( true or false )
2. char ( single character, single quote )
3. String ( lines of characters, double quote )

#### Non-Primitive (Reference Type)
A non-primitive type can be `null`.
1. Strings
2. Arrays
3. Classes
4. Interface

### Date
java.time
1. LocalDate.now()
2. LocalTime.now()
3. LocalDateTime.now()
4. DateTimeFormatter.ofPattern("your_pattern")
```java
LocalDateTime myDateObj = LocalDateTime.now(); // format yyyy-MM-dd HH:mm:ss:ns
DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"); // set formatter
String formattedDate = myDateObj.format(myFormatObj); // formated datetime
```

### java.util.ArrayList
```java
ArrayList<String> items = new ArrayList<>(); // initialize
items.add("Paper"); // add an item
items.get(0); // get item
items.set(0, "Pen"); // update item
items.remove(0); // remove item
items.clear(); // remove all items
items.size(); // total items in list
Collections.sort(items); // sort list of numberical values
```

### java.util.LinkedList
```java
LinkedList<String> items = new LinkedList<>();
items.add("paper"); // add an item
items.addFirst("pen"); // add an item to the beginning of the list
items.addLast("pencil"); // add an item to the end of the list
items.removeFirst(); // remove an item from the beginning
items.removeLast(); // remove from the end
items.getFirst(); // get the first item
items.getLast(); // get the last item
```

### java.util.HashMap (key-value pair)
```java
HashMap<String, Object> courses = new HashMap<>(); // key-value pair
courses.put("MCA", 12); // add item
courses.get("MCA"); // get item
courses.remove("MCA"); // remove item
courses.clear(); // remove all items
courses.size(); // total items inside
// Print keys and values
for (String i : courses.keySet()) {
  System.out.println("key: " + i + " value: " + courses.get(i));
}
```

### java.util.HashSet (every item is unique)
```java
HashSet<String> items = new HashSet<>();
items.add("Paper"); // add
items.contains("Paper"); // check if item exists
items.remove("Paper"); // remove item
items.clear(); // remove all items
items.size(); // length of items
```

### java.util.Iterator (loop on collection, like ArrayList, HashSet, etc)
```java
ArrayList<Integer> numbers = new ArrayList<Integer>(); // initialize array list
numbers.add(12);    // add item
numbers.add(8);     // add item
numbers.add(2);     // add item
numbers.add(32);    // add item
Iterator<Integer> it = numbers.iterator(); // initialize iterator
while(it.hasNext()) {       // check if list contain more element
    Integer i = it.next();
    System.out.println(i);
    if(i < 10) it.remove(); // remove number greater then 10
}
```

### Wrapper Classes
```java
Byte myByte = 5; // byte
myByte.byteValue(); // get byte value;
Short myShort = 34; // short
myShort.shortValue(); // ge t short value;
Integer myInt = 5; // int
myInt.intValue(); // get int value;
Long myLong = 355; // long
myLong.longValue(); // get long value;
Float myFloat = 355.34; // float
myFloat.floatValue(); // get float value;
Double myDouble = 9494.332; // double
myDouble.doubleValue() // get double value;
Boolean myBoolean = true; // boolean
myBoolean.booleanValue(); // get boolean value;
Character myChar = 'H'; // char
myChar.charValue() // get char value;
```

### Regular Expressions
java.util.regex
1. Pattern : Defines a pattern
2. Matcher : Used to search
3. PatternSyntaxException : Indicates syntax error
```java

```


