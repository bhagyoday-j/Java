1) Create an abstract base class → Person

Purpose: Store common data and force child classes to define type

Consists of:

Data members

name

rollNo

Constructor

Initializes default values (NA, 0)

Member functions

inputStudent(BufferedReader) → take input from keyboard

inputStudent(String, int) → overloaded method

displayType() → abstract method (must be implemented by child)

 Used concepts: abstract, this, method overloading

2️⃣ Create a derived class → Student (extends Person)

Purpose: Represent a general student with marks & grading

Consists of:

Data members

m1, m2, m3

Constructor

Uses super() to call parent constructor

Member functions

inputMarks() → read marks

readMarks() → private validation method

total() → final method

calculateGrade() → grade logic

displayType() → overrides abstract method

📌 Used concepts: extends, super, final, overriding, encapsulation

3️⃣ Create Subclass 1 → UGStudent (extends Student)

Purpose: Undergraduate student with different grading rules

Consists of:

Overridden methods

displayType() → calls super.displayType()

calculateGrade() → different grade criteria

📌 Used concepts: method overriding, super method call, runtime polymorphism

4️⃣ Create Subclass 2 → PGStudent (extends Student)

Purpose: Postgraduate student

Consists of:

Overridden methods

displayType() → accesses super.name

calculateGrade() → stricter grading logic

📌 Used concepts: super keyword, inheritance, overriding

5️⃣ Create Main class → MainApp

Purpose: Program execution and object creation

Consists of:

main() method

Takes number of students

Uses parent reference (Student[])

Creates objects based on user choice

Calls methods using runtime polymorphism

📌 Used concepts: dynamic object creation, polymorphism, arrays of objects

6️⃣ Overall Concept Map 🧠
Person (abstract)
   ↓
Student
   ↓
UGStudent
PGStudent

7️⃣ How YOU can practice building similar code 🛠️

Create an abstract base class (e.g., Employee)

Add common data + abstract method

Create a middle class (e.g., PermanentEmployee)

Create 2–3 child classes

Override methods differently

Use array of parent type

Apply this, super, final, overloading, overriding