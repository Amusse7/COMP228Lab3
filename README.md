# COMP228 - LAB3 ASSIGNMENT

This Java application comprises three exercises focusing on implementing different types of insurance policies, game tester management, and mortgage tracking for a fictional organization. Below is a breakdown of each exercise and its implementation details:

## Exercise 1: Insurance Management

### Overview:
- Implement various types of insurance policies (health and life) for employees of an organization.
- Utilizes object-oriented principles like inheritance and polymorphism.

### Classes:
1. **Insurance**: Abstract superclass defining basic properties and methods for insurance policies.
2. **Health**: Subclass representing health insurance.
3. **Life**: Subclass representing life insurance.
4. **InsuranceTest**: Driver class to test the hierarchy and manage insurance objects.

### Implementation Details:
- The `Insurance` class includes instance variables to describe the type of insurance and monthly cost.
- Abstract methods `setInsuranceCost()` and `displayInfo()` are declared in the `Insurance` class.
- `Health` and `Life` classes implement specific methods for setting insurance cost and displaying information.
- A polymorphic screen manager iterates through an array of insurance objects, setting costs, and displaying information.

## Exercise 2: Game Tester Management

### Overview:
- Introduces an abstract class `GameTester` representing game testers with different employment statuses.

### Classes:
1. **GameTester**: Abstract class with properties for the name and employment status of game testers.
2. **FullTimeGameTester**: Subclass representing full-time game testers.
3. **PartTimeGameTester**: Subclass representing part-time game testers.
4. **GameTesterApp**: Console application demonstrating the creation of game tester objects.

### Implementation Details:
- `GameTester` class includes a method to determine the salary, with subclasses implementing specific salary calculations.
- Demonstrates inheritance and abstraction principles in object-oriented programming.

## Exercise 3: Mortgage Tracking

### Overview:
- Manages mortgages for individuals and businesses, ensuring compliance with predefined constraints.

### Classes:
1. **Mortgage**: Abstract class implementing mortgage-related functionalities.
2. **MortgageConstants**: Interface defining constants for mortgage terms and maximum amount.
3. **BusinessMortgage**: Subclass representing mortgages for businesses.
4. **PersonalMortgage**: Subclass representing mortgages for individuals.
5. **ProcessMortgage**: Main class handling mortgage creation and management.

### Implementation Details:
- `Mortgage` class enforces constraints on mortgage amount and term.
- Utilizes interfaces and inheritance to organize and manage mortgage types efficiently.

## How to Run:
- Compile all Java files in your preferred IDE or command line.
- Execute the respective driver classes (`InsuranceTest.java`, `GameTesterApp.java`, `ProcessMortgage.java`) to test each exercise.
