# assignment3-ArchitecturePatternsAndStyles

## Table of Contents
1) [Background Info on the MVC Pattern](https://github.com/SOFE3650U-CourseGp31/assignment3-ArchitecturePatternsAndStyles#background-info-on-the-mvc-pattern)
    * [Dependencies in the MVC Pattern](https://github.com/SOFE3650U-CourseGp31/assignment3-ArchitecturePatternsAndStyles#dependencies-in-the-mvc-pattern)
2) [The Cash Register Application](https://github.com/SOFE3650U-CourseGp31/assignment3-ArchitecturePatternsAndStyles#the-cash-register-application)
3) [Exercises](https://github.com/SOFE3650U-CourseGp31/assignment3-ArchitecturePatternsAndStyles#exercises)
    * [Question 1](https://github.com/SOFE3650U-CourseGp31/assignment3-ArchitecturePatternsAndStyles/tree/master/Cash%20Register%20-%20Question%201)
    * [Question 2](https://github.com/SOFE3650U-CourseGp31/assignment3-ArchitecturePatternsAndStyles/tree/master/Cash%20Register%20-%20Question%202)
    * [Question 3](https://github.com/SOFE3650U-CourseGp31/assignment3-ArchitecturePatternsAndStyles/tree/master/Cash%20Register%20-%20Question%203)
    * [Question 4](https://github.com/SOFE3650U-CourseGp31/assignment3-ArchitecturePatternsAndStyles#exercises#q4)

## Background Info on the MVC Pattern
The MVC pattern has always been a misunderstood architectural pattern that is implemented in 2 basic approaches. Fundamentally the pattern leverages an interaction pattern as shown in Figure 1. The differences are primarily on how the update to the View is implemented in the 2 approaches and their implied dependencies

<p align="center"><img src="/md/MVCInteractionModel.PNG" /></p>

In some examples the updates are direct calls to the View operators (Dependency from Model to View) and on other examples the Observer pattern is implemented creating a stronger dependency from the View to the Model. 

### Dependencies in the MVC Pattern
The ideal dependency that one wants to achieve in the MVC pattern is from the View and Controller to the Model. The Controller already has a natural dependency from the Controller to the model as the Controller leverages the operators in the Model to update the state of the Model. 

## The Cash Register Application
Going back to the Cash Register Requirements one can define the following significant components: *CashRegister, Display, Keyboard, TicketPrinter, Scanner,* and *ProductDB.*  The responsibilities and operators for each module are listed below:

<p align="center"><img src="/md/CashRegisterRequirements.PNG" /></p>

## Exercises
1) In this first exercise implement a Cash Register Application using the above components that processes input from the *Keyboard* and/or *Scanner* (Controllers) and outputs the product information on the *Display* and *TicketPrinter* (Views) by interacting with the *CashRegister* (Model). This design should follow a standard interaction pattern where the Controllers depend on the *CashRegister* operators and the *CashRegister* depends on the View operators.  In this exercise I will be looking that *CashRegister* calls the operators in *Display* and *TicketPrinter*. [navigate to question 1...](https://github.com/SOFE3650U-CourseGp31/assignment3-ArchitecturePatternsAndStyles/tree/master/Cash%20Register%20-%20Question%201)

2) Create a View interface that the Display and TicketPrinter will inherent from that contains an operator called *displayProduct(Product).* Implement this operator in both *Display* and *TicketPrinter* and modify the *CashRegister* component to leverage this operator. This 2nd implementation uses Interfaces to invert the dependency between the Model and View. [navigate to question 2...](https://github.com/SOFE3650U-CourseGp31/assignment3-ArchitecturePatternsAndStyles/tree/master/Cash%20Register%20-%20Question%202)

3) Modify the original *CashRegister*, *Display* and *TicketPrinter* components from Exercise 1 so that an *Observer* pattern is used where the *Display* and *TicketPrinter* components are Observers to the *CashRegister* components and are notified when the current scanned product’s name and price have been updated. This 3rd implementation uses a Subject / Observer pattern to invert the dependency between the Model and View. [navigate to question 3...](https://github.com/SOFE3650U-CourseGp31/assignment3-ArchitecturePatternsAndStyles/tree/master/Cash%20Register%20-%20Question%203)

4) <p id="#q4"> Comment on the advantages and disadvantages of the 3 approaches.</p>