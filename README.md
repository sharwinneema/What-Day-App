# WhatDayApp

Ameya Kasture- 2021A7PS2058G    
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;f20212058@goa.bits-pilani.ac.in

Sharwin Neema- 2021A7PS1442G    
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;f20211442@goa.bits-pilani.ac.in



## Project Description

WhatDayApp is an Android application designed to validate dates and provide the day of the week for valid dates. It handles various types of errors such as invalid years, months, and dates. For instance, it checks if a given date is valid in the specified month and year, including leap year considerations. The app displays appropriate messages for invalid dates and correctly identifies the day of the week for valid dates.

**Note:** While there are mathematical algorithms to calculate the day of the week,  we opted to use the Java `Calendar` API. This decision was made to leverage existing, well-tested functionality provided by the Java library, avoiding the need to reinvent the wheel and ensuring reliable date handling and day calculations.


## Completion of Tasks

1. **Date Validation Logic:**
   - Implemented a `DateModel` class to validate the input dates. The class checks for invalid years, months, and dates, including leap year validation. It uses the `java.util.Calendar` class to determine the maximum days in a month and convert the day of the week to a string.

2. **UI Integration:**
   - Modified the `MainActivity` to integrate the `DateModel` class with the user interface. Implemented functionality to read user inputs from `EditText` fields, trigger validation on button click, and display results in a `TextView`.


## Testing Approach

- **Test-Driven Development (TDD):** 
  - We did not follow a strict TDD approach. Instead, we wrote test cases after implementing the core functionalities to validate their correctness. Writing tests was helpful in identifying issues and ensuring the reliability of the application.
  
- **Testing Methods:**
  - Used Instrumental testing script for UI testing to simulate user interactions and verify the output. We did not use the monkey tool, but we performed manual testing to check for any crashes or unexpected behavior.



## Time Spent

Approximately 5 hours were spent completing this assignment, including coding, testing, and debugging.

## Pair Programming

We would rate the use of pair programming as a 5,as we could compliment each other and develop a bug free application 
## Difficulty Rating

We would rate the difficulty of this assignment as a 5. While the core tasks were manageable, integrating date validation and ensuring accurate day of the week calculations posed a moderate challenge.

