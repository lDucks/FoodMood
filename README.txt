# FoodMood
FoodMood application for IST 412 (Haynes)

-Code Refactoring Notes-

Based on the feedback provided to us by team: during the critique assignment, 
our group made a number of significant changes in order to refactor and improve
our code. To begin, our group went through and deleted a large amount of code
that had been deemed unnecessary. Redundant method coding and implementation was
 fixed and or removed along with a number of unused imports that were used 
throughout the application. Although these issues were not crippling to the
 project, it always helps to have clean code to help the application run/load 
faster and make it easier to make changes to the code down the line. Along with 
removing the unused code, our group made a number of changes and improvements to
 the core code of the application. Dangerous issues regarding overriding and 
incorrect implementation in the code were removed to help prevent errors in the 
future. Additionally, changes were made to improve the look and consistency of 
the application. One such change was to fix the inconstant window size and 
ensure that window size would stay the same when a user was interacting with the
application. These are small changes that may not seem extremely important, but 
keeping interfaces consistent is a very important part of making an application 
feel professional and keeping users coming back. Overall, our group made a 
number of changes to the code that will ultimately help improve user experience 
and make further additions to the code easier for our in the future.
 

Dylan Straffon:

Design Pattern: The design pattern I selected earlier (search filters) is not
relevant to the use cases that we have implemented so far. In place of search
filters I have implemented confirmation messages within the FoodList and
MoodList to ensure users know when they have successfully added a food or mood
to the application. These help users get a better understanding of how well the
application is working.

Object Oriented Pattern: My object oriented pattern of a singleton class is 
implemented within the userList of the application. This is done to prevent
multiple different users from creating accounts with the same username, 
preventing login and storage issues.  


Alex Roeum

Design Pattern: I selected Fill in the blanks for my design pattern. Fill in the
blanks plays a huge role in how our app functions for users to input information.
What I worked on for this sprint was the login UI and the food UI. both involve 
the user entering information in the app to process like user's login and new foods
consummed. The app will be able to process that information and make it usable for
the user.

Object Oriented Pattern: The object oriented design pattern I selected was factories.
I implemented factories for food creation. The app has a class within food that pulls
information from the food ui to create new foods. THe new object can be viewed, edited,
deleted, etc.

Justin Rosenthal:

Design Pattern: The design pattern that I selected was an input placeholder. 
We used this design pattern for the food input form. Inside the text box we provide
more context to the user explaining what we are looking for.

Object-Oriented Pattern: The OO pattern that I picked was not ready for the current 
stage of the project. Therefore, we implemented an iterator for user registration in order
to make sure that we are not registering a user who already exists.

Jacob Chorney

Design Pattern: My design pattern that I chose is the decorator pattern. This pattern could not
be implemented in anything so far but is going to be used for our larger panels, such as food/mood history.
This is due to the decorator pattern pertaining to features such as a scroll bar. The screens implemented so
far have been to small to use a scroll bar.

Object Oriented Pattern: The object oriented design pattern I selected was the interator pattern.
This pattern is good at scanning through lists and choosing certain information and will be used for our
Food/Mood history. Since we have yet to implement these parts we have yet to use these patterns.
