# Java-8-Streams-Interview-Questions
4 + years Java Streams Interview Questions

https://github.com/santoshguggilla

Comparator Class:- (static methods)
1. comparing (static method)
2. reverseOrder


Collections Class: - (static methods)
1. frequency 
2. reverseOrder 
3. nCopies() 

Collectors Class: - (static methods)
1. groupingBy
2. partitioningBy



-----------------------------------------------------------------------------------------------
* If you want to convert the String into streams we need to use chars() method
Example: 

String str="Hello World";

str.chars().mapToObj(s-> Character.toLowerCase((char) s)).forEach(System.out::println);

------------------------------------------------------------------------------------------------
* If you want to convert Arrays into stream we need to use boxed()


Example: 

int[] a={1,3,45,90};

Arrays.stream(a).boxed().min(Integer::compare).get();

-------------------------------------------------------------------------------------------------
