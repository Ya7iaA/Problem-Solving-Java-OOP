# Assignment OOP

01- First Assignment

Create 
- the base class Person:
- Fields: name (String), age (int)
- Constructor to initialize all fields
- Method: introduce() → prints name and age

Create
- the class Employee that extends Person:
- Additional fields: salary (double), role (String)
- Constructor to initialize all fields (including Person fields)
- Method: work() → prints a general message about employee's role

Create
- Chef class extends Employee:
- Override work() to print something like: "Chef [name] is preparing dishes"

Create
- Waiter class extends Employee:
- Override work() to print something like: "Waiter [name] is serving customers"

B- Second Assignment

Create
- Convert the Employee class into an abstract class
- Make the method `work() abstract inside it

Create
- interface called Eatable
- It should have one method: void eat()

- Have both Chef and Waiter implement the interface Eatable
- In Chef, make eat() print: "Chef [name] is tasting the food"
- In Waiter, make eat() print: "Waiter [name] is having a quick meal break"