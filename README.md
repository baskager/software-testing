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
