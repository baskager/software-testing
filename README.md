# software-testing

Experimenting and researching software testing for university courses and personal interest

## Reasons for software testing

We test software because software fails. Somewhere, somehow, some time during the evolution of software bugs will occur.

Below is an example of a very expensive failure. The Ariana 5 spacecraft exploded on it's maiden voyage just 39 seconds after take off due a 64 bit float being converted to a 16-bit signed integer in the rocket's Inertial Reference System (the system which tells the rocket if it's pointing up or down).

The value of the 64 bit float was too great to be converted to a 16-bit signed integer. The Intertial Reference System received the wrong data which flipped the rocket 90 degrees. Aerodynamic forces ripped the boosters apart from the main stage at a height of 4km. This caused the self-destruct mechanism to trigger, consuming the spacecraft in a gigantic fireball of liquid hydrogen.

The cost of this failure was $7 billion dollars of investments and $500 milllion dollars of cargo.

![Ariane 5 rocket failure](https://www.oddee.com/wp-content/uploads/_media/imgs/articles2/a98637_oddee_space_ari.jpg)

Software testing is a method that attempts to prevent these failures from happening. Bugs can be expensive for organisations and annoying for your user base. People will rely on your software so it is very important for your software to be reliable.

# Causes of software defects (K2)
- Faulty requirements definition
  - If there is a fault in the requirements definition of the software component the component will be faulty by design and possibly exhibit errors in its functionality. The error in the document can be a mistake by the system analyst or the customer.
- Time pressure
  - Deadlines can be too strict which, in turn, makes it impossible to test properly.
- Complex code
  - The organisation or system can be too complex to test properly.
- (Too) many system interactions
- Coding errors
- Complexity of infrastructure
- Changing technologies
- Non compliance with required standards, for example:
  - Compiler standard tests
  - Safety-critical or safety-related (railroad switching, air traffic control, medical equipment etc.)

# Definitions
## Error, fault or failure
A human being can make an error. Errors can be made by programmers, system analysts, designers or even the customer or users.

Some of these errors can add a defect (fault, bug) in the progam code or document.

**Not all mistakes will produce a bug**

A user mistake does not **ADD** a bug to the software. When a defect in code is executed the system **MAY** fail or do something it shouldn't.

Not all defects fail the software and some bugs would only cause the software to fail under very specific circumstances, which might never happen.

**To err is human; To find the errors requires a tester**

# Types of testing

## Static testing

Static testing is software testing where the code is not executed.

## Dynamic testing

In dynamic testing the code is executed with test data.

# ISTQB

The ISTQB is an agency that focusses on software testing. They have seven principles of software testing, these are:

1. Testing shows the presence of bugs
   - "Program testing can be used to show the presence of bugs, but never to show their absence!" ~ Edgar Dijkstra
2. Exhaustive testing is impossible
   - There is a limit to how much you test certain features. You can spend ages testing every tiny thing, this is not productive.
3. Early testing
   - Test as early as possible
4. Defect clustering
   - Not all functionalities in software will have the same frequency of bugs. Usually the most bugs occur in the most complex logic of your code.
5. The pesticide paradox
   - Bugs are like bacteria, they develop resitance to antibiotics. New antibiotics have to be developed.
6. Testing is context dependent
   - A website has a different context than medicial equipment. A simple blog can be offline for a few minutes without any major damage. If medical equipment fails it can cause casualties. The importance of certain tests relies on the context.
7. Absence of errors fallacy
   - "I can't see any bugs so there aren't any bugs" is a huge fallacy. Having tests does not mean your code is perfect.
   
## Certification
There are three levels of ISTQB certification
- Foundation
- Advanced
- Expert

## Foundation certification
My goal for this year is to pass ISTQB certification on foundation level. In the foundation level certification the following subjects are covered:

- Fundamentals of testing
- Testing throughout the software life cycle
- Static techniques
- Testing design techniques
- Test management
- Tool support for testing

## Knowledge levels
Topics of the ISTQB foundation level are classified on their cognitive level of knowledge which range from K1 to K4.

- K1: Renember
  - Recognize, renember and recall a term or concept
- K2: Understand
  - Understand, explain, give reasons, compare, classify, categorize, give examples, summarize
- K3: Apply
  - Select the correct application of a concept or technique and apply it to a given concept.
- K4: Analyze
  - Analyze a document, software or project situation and propose appropriate actions to solve a problem or task

## Exam
The ISQTB Foundation Level Exam is one hour long and consists of 40 multiple-choice questions. Each question has only one correct answer.

26 of the 40 answers (65%) must be correct and the exam can be computer based or paped based
**tips:**
- No negative marks for wrong answers, answer all questions even if you don't know the answer.

# Testing strategy

A testing strategy describes the scope of testing in the software development process.

Subjects that are covered in a testing strategy:

- Goals
- Testing methods
- Time/deadlines
- (Human) resources
- Testing environment
- Risks

## Testing plan

The testing plan is part of the testing strategy and defines how things are tested. What methods will be used and on what level will I test?

### Testing strategies according to ISQTB

- Analytical
  - Risk based
- Model-based
  - Test a model
- Methodical
  - Based on an industry standard (ISO 9126).
- Process - or standard-compliant
  - IEEE 829 standard, XP, SCRUM
- Dynamic
  - Focus on rapid adaptation or known weaknesses in software. Finding as much bugs as possible.
- Consultative or directed
  - Ask the user or developers of the system what to test (typically emphasizes the later stages of testing simply due the lack of recognition of the value of early testing)
- Regression-averse
  - Regression-averse strategies have in common a set of procedures - usually automated - that allow them to detect regression defects.

## Testing levels

- Development tests.
  - Unit tests.
    - Tests one unit, a function for example.
  - Unit integration tests
    - Testing multiple units, like multiple functions that rely on eachother.
- System tests.
  - System tests.
    - Tests one system.
  - System integration tests
    - Test multiple systems that work together.
- Acceptation tests.
  - Functional Acceptation Test (FAT).
    - Does a feature do what I described it to do.
  - User Acceptation Test (UAT).
    - Does a feature do what a user expects it to do.
  - Product Acceptation Test (PAT).

## Software development process V-model

![V-model](https://i.imgur.com/SVbvDgx.png)

# Design by contract

Introduced by the Eiffel programming language by the French computer scientist Bertrand Meyer. Design by Contract is based on the idea of Hoare Logic.

Design by contract allows programmers to build software on top of the software specifications that checks itself in runtime.

It means that software architects have to describe formal, precise and verifyable interface specifications that expand the standard definition of abstract data types with preconditions, postconditions and invariants. These specifcations are called "contracts".

If preconditions are not respected by the client then the service provider should deny the service.

If a postcondition or invariant is violated then this is a problem of the service provider. The problem can be an mistake in the implementation or a mistake in the precondition specification.

![Design by contract diagram](https://upload.wikimedia.org/wikipedia/commons/thumb/e/ea/Design_by_contract.svg/512px-Design_by_contract.svg.png)

## Hoare logic

Hoare logic is a formal system of logic rules that evaluate the correctness of a computer program.

## Hoare Triple

{P} C {Q}
where:

- {P} - Precondition (assertion)
- C - Command
- {Q} - Postcondition (assertion)

## Assertion

An assertion is a declaration that a predicate (function that returns a boolean value) is expected to be true at the moment the code runs.

Assertions are used to test your code.

## Principles

- Do not pollute existing systems
- Software quality principles also apply on test code

## JUNIT4 and JUNIT5 differences
- JUNIT5 does not have test suites, it has introduced 'tags' to replace this.
- 

## Triple (actually quadruple) A system
### Arrange
- Add a newline to the first line of the test case
### Act
- Add a newline before
- Prepare data for the test case
### Assert
- Add a newline before
- Test code for values, types etc.
### After
- Cleanup

## Refactoring
### Applying structure in your code
- Finish this list :)
### Refactoring code according to Object-Oriented rules
- Finish this list :)
### Signals for refactoring
- Using switches is often polymorfism
  - https://refactoring.guru/replace-conditional-with-polymorphism
- Finish this list :)

# Test driven development
https://medium.com/@tahins/the-mindset-behind-test-driven-development-tdd-b02deccbff81
![Tdd cycle](https://cdn-images-1.medium.com/max/1600/0*1DFEyqaiblKhIuoY.png)

## Write a new test and check if it fails
We want to know if the test actually fails when something goes wrong.
## Rewrite the test if it does not fail
The test should be able to fail when something goes wrong, rewrite the test so that it fails
## Write only enough code for the test
Only write code that belongs to the test case, don't touch other unrelated code.
## Check if ALL the tests succeed
The new code can have side-effects, causing other tests to fail.
## When tests fail, correct regressions and update failing tests

## When tests succeed, Refactor some code.

# Assesment