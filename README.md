# software-testing

Experimenting and researching software testing for university courses and personal interest

## Reasons for software testing

We test software because software fails. Somewhere, somehow, some time during the evolution of software bugs will occur.

Below is an example of a very expensive failure. The Ariana 5 spacecraft exploded on it's maiden voyage just 39 seconds after take off due a 64 bit float being converted to a 16-bit signed integer in the rocket's Inertial Reference System (the system which tells the rocket if it's pointing up or down).

The value of the 64 bit float was too great to be converted to a 16-bit signed integer. The Intertial Reference System received the wrong data which flipped the rocket 90 degrees. Aerodynamic forces ripped the boosters apart from the main stage at a height of 4km. This caused the self-destruct mechanism to trigger, consuming the spacecraft in a gigantic fireball of liquid hydrogen.

The cost of this failure was $7 billion dollars of investments and $500 milllion dollars of cargo.

![Ariane 5 rocket failure](https://www.oddee.com/wp-content/uploads/_media/imgs/articles2/a98637_oddee_space_ari.jpg)

Software testing is a method that attempts to prevent these failures from happening. Bugs can be expensive for organisations and annoying for your user base. People will rely on your software so it is very important for your software to be reliable.

## Static testing

Static testing is software testing where the code is not executed.

## Dynamic testing

In dynamic testing the code is executed with test data.

## ISQTB

The ISQTB is an agency that focusses on software testing. They have seven principles of software testing, these are:

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

# Testing strategy

A testing strategy describes the scope of testing in the software development process.

Subjects that are covered in a testing strategy:

- Goals
- Testing methods
- Time/deadlines
- (Human) resources
- Testing environment
- Risks

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
