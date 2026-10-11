# Lab Sheet-07 - Object Oriented Programming Using Java

**MCA III Semester | COER University**

Solutions for Lab Sheet-07 (Exception Handling, Packages, Multithreading).

## Folder Structure

```
OOP-Java-LabSheet-07/
├── 01_Exceptions/            # Basic: Q1-Q10 (one file per question)
├── 02_Packages/              # Intermediate: Q1-Q10 (each folder = its own source root)
│   ├── Q01_SimplePackage/        mypack/Hello.java + UseHello.java
│   ├── Q02_MultipleClasses/      shapes/{Circle,Rectangle}.java + ShapesDemo.java
│   ├── Q03_DefaultAndPublic/     testpack/{PublicClass,DefaultClass}.java + TestAccess.java
│   ├── Q04_Subpackages/          company/employees/Employee.java, company/main/Main.java
│   ├── Q05_AccessModifiers/      demo/AccessDemo.java + AccessTest.java
│   ├── Q06_ImportVsQualified/    animals/Dog.java + UsingImport.java + UsingQualifiedName.java
│   ├── Q07_WildcardImport/       mypackage/{A,B,C}.java + WildcardDemo.java
│   ├── Q08_BuiltInPackage/       BuiltInPackageDemo.java (java.util)
│   ├── Q09_UtilityPackage/       utils/MathUtils.java + UseMathUtils.java
│   └── Q10_CommandLine/          Student.java, Main.java (package college.students)
└── 03_Threads/               # Advance: Q1-Q10 (one file per question)
```

## How to Run

**Exceptions / Threads** (go into the folder):
```bash
cd 01_Exceptions
javac Q01_DivideByZero.java
java Q01_DivideByZero
```

**Packages** (go into the specific question folder, compile all, run the main class):
```bash
cd 02_Packages/Q04_Subpackages
javac company/employees/Employee.java company/main/Main.java
java company.main.Main
```

| Question | Compile | Run |
|---|---|---|
| Q1  | `javac mypack/Hello.java UseHello.java` | `java UseHello` |
| Q2  | `javac shapes/*.java ShapesDemo.java` | `java ShapesDemo` |
| Q3  | `javac testpack/*.java TestAccess.java` | `java TestAccess` |
| Q4  | `javac company/employees/Employee.java company/main/Main.java` | `java company.main.Main` |
| Q5  | `javac demo/AccessDemo.java AccessTest.java` | `java AccessTest` |
| Q6  | `javac animals/Dog.java UsingImport.java UsingQualifiedName.java` | `java UsingImport` / `java UsingQualifiedName` |
| Q7  | `javac mypackage/*.java WildcardDemo.java` | `java WildcardDemo` |
| Q8  | `javac BuiltInPackageDemo.java` | `java BuiltInPackageDemo` |
| Q9  | `javac utils/MathUtils.java UseMathUtils.java` | `java UseMathUtils` |
| Q10 | `javac -d . Student.java Main.java` | `java college.students.Main` |

## Notes
- Tested with JDK 21 (works on JDK 8+).
- Q3 and Q5: the lines that would cause compile errors are kept **commented** so the program compiles; uncomment them to observe the errors.
- Q8: the race condition is intentional; the exact wrong value changes every run.
- Q5 (threads) priorities are only a hint to the scheduler, so output order is not guaranteed.
