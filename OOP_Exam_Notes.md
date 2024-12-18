
**Notes for Object Oriented Programming (OOP)**

---

### Philosophy of Object-Oriented Programming (OOP)
- **OOP** is a way of writing programs where we think of everything as objects, like in real life. For example, a "Car" object can have properties like "color" and actions like "drive".
- This style of programming focuses on breaking a problem into smaller parts, called objects, that work together.

**Key Concepts**: Objects (things), Classes (blueprints for objects), Inheritance (passing properties), Polymorphism (many forms of the same thing), Encapsulation (hiding details), and Abstraction (showing only important details).

---

### Advantages of OOP over Structured Programming
1. **Reuse Code**: Once you write a class, you can use it again and again.
2. **Organized Code**: Everything is grouped into objects, making programs easier to manage.
3. **Data Safety**: By hiding unnecessary details, important data is protected.
4. **Easy to Change**: Polymorphism makes it simple to use the same function for different tasks.
5. **Looks Like Real Life**: Objects make it easier to connect programs to real-world scenarios.

---

### Abstraction and Encapsulation
- **Abstraction**: Imagine you use a phone. You only care about calling or texting, not how the circuits work. That’s abstraction—hiding complex stuff and showing only what’s important.
    ```cpp
    class Car {
        public:
            void start() { /* The user doesn’t need to know the internal mechanism */ }
    };
    ```
- **Encapsulation**: Think of a capsule with medicine inside. Encapsulation means keeping data (variables) and actions (methods) together and protecting them.
    ```cpp
    class BankAccount {
    private:
        double balance; // This data is hidden
    public:
        void deposit(double amount) { balance += amount; }
        double getBalance() { return balance; }
    };
    ```

---

### Classes and Objects
- **Class**: A class is like a recipe that tells how to create objects.
- **Object**: An object is made using the class. Think of a "Dog" class as a blueprint and "Buddy" as a real dog created from that.
    ```cpp
    class Dog {
        public:
            string name;
            void bark() { cout << "Woof!"; }
    };

    Dog myDog;
    myDog.name = "Buddy";
    myDog.bark(); // Output: Woof!
    ```

---

### Access Specifiers
1. **Public**: Open to everyone, like a public park.
2. **Private**: Accessible only inside the class, like a personal diary.
3. **Protected**: Shared only with child classes, like family secrets.

---

### Static and Non-Static Members
- **Static Members**: Shared by all objects of the class, like a shared Wi-Fi password.
    ```cpp
    class Counter {
    public:
        static int count; // Static variable
        Counter() { count++; }
    };
    int Counter::count = 0; // Initialize static variable
    ```
- **Non-Static Members**: Each object has its own copy, like individual phone numbers.

---

### Constructors, Destructors, and Copy Constructors
- **Constructor**: Special function that runs when an object is created to set it up.
    ```cpp
    class Person {
        public:
            string name;
            Person(string n) { name = n; } // Constructor
    };
    ```
- **Destructor**: Runs when an object is destroyed to clean up.
    ```cpp
    ~Person() { cout << "Object destroyed"; }
    ```
- **Copy Constructor**: Creates a new object by copying another.
    ```cpp
    Person(const Person &p) { name = p.name; }
    ```

---

### Arrays of Objects, Object Pointers, and Object References
- **Array of Objects**: A list of objects.
    ```cpp
    Person people[2] = {Person("Alice"), Person("Bob")};
    ```
- **Object Pointers**: Points to an object in memory.
    ```cpp
    Person *p = new Person("John");
    ```
- **Object References**: Refers to an object directly.
    ```cpp
    Person &ref = person1;
    ```

---

### Inheritance
- **Single Inheritance**: A child class inherits from one parent class, like a baby inherits traits from its mother.
    ```cpp
    class Animal {
        public:
            void eat() { cout << "Eating"; }
    };
    class Dog : public Animal {
        public:
            void bark() { cout << "Barking"; }
    };
    ```
- **Multiple Inheritance**: A child class inherits from more than one parent class.
    ```cpp
    class A { /*...*/ };
    class B { /*...*/ };
    class C : public A, public B { /*...*/ };
    ```

---

### Polymorphism
1. **Overloading**: Same name but different arguments.
    ```cpp
    void print(int x); // Function 1
    void print(double y); // Function 2
    ```
2. **Overriding**: A child class changes how a parent’s method works.
    ```cpp
    virtual void display() override; // Overriding the base class method
    ```
3. **Abstract Classes and Virtual Functions**: Classes that can’t create objects but can be inherited.
    ```cpp
    class Shape {
        public:
            virtual void draw() = 0; // Pure virtual function
    };
    ```

---

### Exceptions
- Exceptions help deal with errors in the program, like dividing by zero.
    ```cpp
    try {
        int x = 10 / 0; // Risky code
    } catch (exception e) {
        cout << "Error caught"; // Handling the error
    }
    ```

---

### Object-Oriented I/O
- Helps read and write files using objects.
    ```cpp
    ofstream outFile("data.txt");
    outFile << "Hello!";
    outFile.close();
    ```

---

### Template Functions and Classes
- Templates let you write one function for many data types.
    ```cpp
    template <typename T>
    T add(T a, T b) { return a + b; }
    ```

---

### Multi-Threaded Programming
- Run different parts of a program at the same time, like multitasking.
    ```cpp
    #include <thread>
    void task() { cout << "Thread running"; }
    thread t1(task); // Create a thread
    t1.join(); // Wait for it to finish
    ```

---

### Tips for Exam
1. Think of objects as real-world things.
2. Remember key syntax like `class`, `public`, `private`, and `inheritance`.
3. Write small programs to test your understanding.
