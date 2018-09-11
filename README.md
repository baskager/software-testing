# software-testing

Experimenting and researching software testing for university courses and personal interest

## Reasons for software testing

We test software because software fails. Somewhere, somehow, some time during the evolution of software bugs will occur.

Below is an example of a very expensive failure. The Ariana 5 spacecraft exploded on it's maiden voyage just 39 seconds after take off due a 64 bit float being converted to a 16-bit signed integer in the rocket's Inertial Reference System (the system which tells the rocket if it's pointing up or down).

The value of the 64 bit float was too great to be converted to a 16-bit signed integer. The Intertial Reference System received the wrong data which flipped the rocket 90 degrees. Aerodynamic forces ripped the boosters apart from the main stage at a height of 4km. This caused the self-destruct mechanism to trigger, consuming the spacecraft in a gigantic fireball of liquid hydrogen.

The cost of this failure was $7 billion dollars of investments and $500 milllion dollars of cargo.

![Ariane 5 rocket failure](https://www.oddee.com/wp-content/uploads/_media/imgs/articles2/a98637_oddee_space_ari.jpg)

Software testing is a method that attempts to prevent these failures from happening. Bugs can be expensive for organisations and annoying for your user base. People will rely on your software so it is very important for your software to be reliable.
