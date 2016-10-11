# BMI-Calculator
SENG3400 Assignment 2 - BMI Calculator as an apache-tomcat + axis webservice. This repo includes the server files and the client to connect.

by Andrew Parkinson - c3128094

-----

The server was written for JDK 1.7.0_79
This will not run with JDK1.8 due to the documented incompatibility in axis!!

---

Hi Mark,

Thank you for all of you help on friday, getting past that eclipse problem saved me so much.

As far as my testing has gone, every function and exception on the spec should be covered. I'm sure you'll tell me otherwise :)

The client's are bare bones and don't contain error handling, however every function should work provided the arguments are valid.

a little gotcha I came across was when adding a range with the addRange function...
If you want to put * in as the argument, it needs to be surrounded by a "" ie "*"
Not sure how this goes on unix, but windws proceeds to fill the rest of the arguments with a dir listing

-----

Server Setup

Should be standard,

The "Server files" folder contains the server files in the proper directory structure.
You *should* be able to drop these into the tomcat axis folder as is and have it run.

-----

Client

The client files are all as they were when generated.

here are some usage examples, should all be to spec:

java MyBMIAdminClient addRange admin bodymass "*" "20" Underweight false
java MyBMIAdminClient addRange admin bodymass "30" "*" Normal true

java MyBMIServerClient calcBMI 187 103.2

-----
