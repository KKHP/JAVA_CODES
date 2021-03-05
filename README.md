## JAVA codes 
### hariprasad

### [assignment 1](https://github.com/KKHP/java_codes/tree/main/HARI-DA/da1)
1) Write a program to identify common elements or numbers between two given
arrays. You should not use any inbuilt methods are list to find common values.
[click to view code](https://github.com/KKHP/java_codes/blob/main/HARI-DA/da1/commonArrayElements.java)
---
2) Find out the duplicate number in an array and display the resultant array.
[click here to view code](https://github.com/KKHP/java_codes/blob/main/HARI-DA/da1/duplicateInArray.java)
---
3) Develop a program to simulate a Simple Banking System in which the initial
balance and the rate of interest are read from the keyboard and these values are
also initialized using the constructor. The program should consist of the following
methods:
a) To initialize the balance and the rate of interest using constructor.
b) create an interface called getinterest() to calculate the compound and simple
interest.
b) To find the compound interest. The Formula to find the compound interest is given
below
c) To calculate the simple interest and display the balance amount
[click to view code](https://github.com/KKHP/java_codes/blob/main/HARI-DA/da1/bankApplication.java)
---

4) Research several car-pooling websites: 
Create an application that calculates your daily driving cost, so that you can estimate
how much money could be saved by carpooling, which also has other advantages such
as reducing carbon emissions and reducing traffic congestion. The application should
input the following information and display the user’s cost per day of driving to work:
a)Total miles driven per day.
b)Cost per gallon of gasoline.
c)Average miles per gallon.
d)Parking fees per day.
e)Tolls per day.

---

5. Create a complex class with data members as real and imaginary. Overload three
constructors to initialize the data members (i.e. default, normal, and through object
initialization).Provide methods which returns object of the complex class as the result
for addition, subtraction, multiplication of two complex numbers.
[click here to view code](https://github.com/KKHP/java_codes/blob/main/HARI-DA/da1/complexClass.java)
---

6. Write a program to maintain the office database using single inheritance. Super
class is Employee that contain the information as follows- Emp_code, Emp_name,
Address, Ph_no, Da-10%, Hra-20%. Create three subclasses as Manager, Typist,
officer where each class having their own basic pay & da, hra remain same. Get the
details of at least 3 record of each subclasses

---

7. Write a program to declare & instantiate an 2D-array to hold marks obtained by
students in different subjects in a class. Assume that there are up to 10 students in a
class & there are 5 subjects. Find out the best student according to average marks of
all subjects and display all the marks of him/her.

---

8. Create a super class Point with two instance variable x and y which indicate the xy coordinates of the point. It contains a default constructor which initializes a point
in origin and a parameterized constructor which initializes a user-specified point.
Create a sub class Line that extends Point class. The constructor of Line class,
should create a new Point object to denote the end point of the line The starting
point of the line is automatically created when it extends the Point class.
A new class Triangle inherits the Line class.
Write a program to create the triangle from the origin and another triangle which
takes input from the user. Now change the Point class to abstract class. Call the
methods using the object of triangle class.

---

### [assignment2](https://github.com/KKHP/java_codes/blob/main/HARI-DA/da2/VL2020210504667_AST02.pdf)

1) Write an inheritance hierarchy for classes Quadrilateral, Trapezoid, Parallelogram,
Rectangle and Square. Use Quadrilateral as the superclass of the hierarchy. Create and
use a Point class to represent the points in each shape. Make the hierarchy as deep
(i.e., as many levels) as possible. Specify the instance variables and methods for each
class. The private instance variables of Quadrilateral should be the x-y coordinate
pairs for the four endpoints of the Quadrilateral. Write a program that instantiates
objects of your classes and outputs each object’s area (except Quadrilateral). 

---

2) . College offers a course that prepares students for the state licensing exam for real
estate brokers. Last year, ten of the students who completed this course took the
exam. The college wants to know how well its students did on the exam. You’ve been
asked to write a program to summarize the results. You’ve been given a list of these
10 students. Next to each name is written a 1 if the student passed the exam or a 2 if
the student failed. Your program should analyze the results of the exam as follows:
* Input each test result (i.e., a 1 or a 2). Display the message “Enter result” on the
screen each time the program requests another test result. 

* Count the number of test results of each type.

* Display a summary of the test results, indicating the number of students who passed
and the number who failed.

* If more than eight students passed the exam, print the message “Bonus to
instructor!”

---

3) Write an abstract class with an abstract method double Process (double P, double R).
Create a subclass Discount and implement the Process() method with the following formula:
net=P-P*R/100. Return the net value. Create another subclass Tax and implement the
Process() method with the following formula: total=P+P*R/100. Return the total. 

---

4) Create an interface IList having the following methods orderedInset (item) and
insertAtpos int pos , item).setElementAtpos(int pos , item),DeleteAtpos(int post) and
deleteElement( (item).
Create a class LList [The class LList implements the interface IList...]
The List is used to store the names of employees.
* Create a constructor that constructs a list of a given size.
* Create a constructor that copies one list object into another.
* Create a constructor that constructs and initializes a list of given size.
* Call all the above defined functions.
* Write the code to implement LList. 

---

5)  Create a new class Car with the following methods:
 public void start()
 public void stop()
 public int drive(int howlong)
a) The method drive() has to return the total distance driven by the car for
the specified time. Use the following formula to calculate the distance:
Distance = howlong* 60;
b) Write another class CarOwner and that creates an instance of the
object Car and call its methods. The result of each method call has to
be printed using System. out.println().
c) Create a subclass of Car named JamesBondCar and override the method
drive() there. Use the following formula to calculate the distance:
Distance = howlong* 180;
d) Be creative, print some funny messages!!!

---


### [assignment3](https://github.com/KKHP/java_codes/blob/main/HARI-DA/da3/VL2020210504667_AST03.pdf)

1) 1. Create a class Book with the following members:
Accession number, Name of the author, Title of the book, Year of Publication,
Publisher’s Name, Cost of the book and availability.
Create a class Membership with the following members:
Member id, Name, Maxbooks
Derive a class Library information_system from Book and Membership.
Include thefollowing member functions:
 a. Issue a book after checking member id, book id, availability of the book
 and Maxbooks available for the member.
 b. Update availability of book and Maxbooks after each transaction.
 c. Display the member’s information given member id .
 d. Display the book’s information given the accession number. 

---

2) Write a PhoneBook class that manages a collection of Person objects. A
PhoneBook will allow a person to add, delete, or search for a Person object in
the address book.
i) The add method should add a person object to the PhoneBook. Make sure
the add method does not add duplicate person objects to the PhoneBook.
ii) The delete method should remove the specified person object from the
PhoneBook.
iii) The search method that searches the PhoneBook for a specified person and
returns the list of persons matching the specified criteria. The search can be
done either by first name, last name or person id. 

---

3) . Write a java program, by creating a base class number with a method calculate() to
get the sum of the given digits. Derive the base class to a subclass quadratic, to find
the real and imaginary solutions for the given quadratic equation by overriding the
method calculate(). Again derive the base class number , to another subclass called
sos , to find the sum of square of the given number by overriding the method
calculate(). [click to view solution](https://github.com/KKHP/java_codes/blob/main/HARI-DA/da3/calculateOveride.java)

---

4)  Assume that you have written some classes. Belatedly, you decide that they should
be split into package, as listed in the table below. Furthermore, assume that the
classes are currently in the default package (they have no package statements).

Package   Name Class Name
Mynumber Palindrome, Amstrong

implement the check for palindrome and check for Amstrong number in the considered classes

---

5)  Develop a class TelephoneIndex with two String objects as members. One for
should hold people’s name and the other should hold their phone number. The
class should have appropriate constructor, input and display methods. Create array
of objects for TelephoneIndex and do the following:
a. Your program should ask the user to enter a name or the first few
characters of a name to search for it in the array.
b. The program should display all of the names that match the user’s
input and their corresponding phone numbers.

---

