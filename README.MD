# algorithms

# 1. Fundamentals

## 1.1  Programming Model

### Primitive data types

| Data Type         | Size                    | Example                    |
| --------------- | ------------------------------ |------------------------------ |
| `byte`   | 1 byte   | byte myByte = 5;   |
| `short`     | 2 byte         | short myShort = 5;   |
| `int`     | 4 byte         | int myNum = 5;   |
| `float`     | 4 byte         | float myFloatNum = 1.1f;   |
| `double`     | 8 byte         | double myDoubleNum = 19.99;   |
| `long`     | 8 byte         | long myLong = 5;   |
| `char`     | 2 byte         |  char myChar = 'e';   |
| `boolean`     | 1 byte         |  boolean myBool = true;   |

### Non-Primitive data types


| Data Type         |When and Why?| Example 1                    | Example 2                   | Example 3 | Example 4 | Example 5 |
| --------------- | ------------------------------ |------------------------------ |------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `String`   | | `String myString = new String("Hello, world!");`   | `String myString2 = "Hello, world!";`   |
| `ArrayList`     |for storing and accessing data | `ArrayList<String> cars = new ArrayList<String>();`   |
| `LinkedList`     |for manipulate data, Implementing a queue or a stack | `LinkedList<String> tractors = new LinkedList<String>();` |
| `HashMap`     | storing user information with their unique user IDs as keys | `HashMap<String, String> capitals = new HashMap<String, String>();`   |
| `HashSet`     |keeping a set of unique tags associated with a blog post| `HashSet<String> cars = new HashSet<String>();`   |      
| `Array`     | | `String[] myCars = {"Volvo", "BMW", "Ford", "Mazda"};`   | `String[] myPhones = new String[10];` | `int[] myNumbers = {10, 20, 30, 40};` | `String[][] myLovers = new String[3][5];` | `String[][] myGames = { {"The Witcher 3: Wild Hunt", "Gta 5", "Forza Horizon 5", "60 Seconds"}, {"Brawl Stars", "Clash Of Clans", "Clash Royale"} };`|
| `Vector` | | `Vector<String> cars = new Vector<String>();` |

### Type conversion

#### ----------------------- Primitive Data Types and String -----------------------

####  `floating point number` to `int`

```java
int myNumber = (int) 10.9; //converted to 10
```

#### `boolean` to `int`

```java
boolean myCondition = false;
int myNumber = myCondition ? 1: 0; //converted to 1 or 0
```

#### `int` to `boolean`

```java
int myInt = 0;
boolean myBoolean = (myInt == 1) ? true : false;
```

#### `char` to `int`

```java
char myChar = 't';
int myNumber = (int) myChar; // converted to 116
```
#### `int` to `char`

```java
int myInt = 65; // ASCII code for 'A'
char myChar = (char) myInt;
```

#### `char` to `String`

```java
char myChar = 't';
String myString = "" + myChar;
```

```java
char myChar = 't';
String myString = String.valueOf(myChar);
```

```java
char myChar = 't';
String myString = Character.toString(myChar);
```

#### `String` to `char`

```java
String myString = "Hello";
char myChar = myString.charAt(0);
```

#### `int` to `String`

```java
int myInt = 10;
String myString  = Integer.toString(myInt);
```

```java
int myInt = 10;
String myString  = String.valueOf(myInt);
```

```java
int myInt = 10;
String myString  = "" + myInt;
```

```java
int myInt = 10;
String myString  = String.format("%02d", myInt);
```

#### `String` to `int`

```java
String myString = "10";
int myInt  = Integer.parseInt(myString);
```

```java
String myString = "10";
int myInt  = Integer.valueOf(myString);
```

#### ----------------------- Array and String -----------------------

#### `String` to `Array (char)`

```java
String myString = "Hello";
char[] myCharArray = myString.toCharArray();
```

#### `Array (char)` to `String`

```java
char[] myCharArray = {'H','e','l','l','o'};
String myString = new String(myCharArray);
```

#### ----------------------- Array and List -----------------------

#### `Array` to `ArrayList`

```java
String[] myStringArray = {"apple", "banana", "orange"};
List<String> myArrayList = new ArrayList<>();
for (String element : myStringArray) {
myArrayList.add(element);
}
```

```java
String[] myStringArray = {"apple", "banana", "orange"};
List<String> myArrayList = new ArrayList<>(Arrays.asList(myStringArray));
```


#### `ArrayList` to `Array`

```java
ArrayList<String> myArrayList = new ArrayList<String>();
myArrayList.add("apple");
myArrayList.add("banana");
myArrayList.add("orange");

String[] myStringArray = new String[myArrayList.size()];

myStringArray = myArrayList.toArray(myStringArray);
System.out.println("Array: " + Arrays.toString(myStringArray));
```
