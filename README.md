# BrothersInBar
 The application can be started by going src/com/company/BrothersInBar.java and running the main.
It is developed using IntelliJ Idea IDE and Java jdk 11.0.3. 
Basically my whole algorithm is centered around comparing the current number to the previous one, and when fulfilling the
required length of consecutive numbers, the previous two and the current one are removed. That is why I am using LinkedList instead of ArrayList, because removing items in a LinkedList is much faster and there are no shifting of elements in comparison to ArrayList removal.
Every time the condition is met, the counting is reset and also current index is reset, thus accounting new rounds being formed.
For testing use the main ,create new arrays and pass them as arguments to the brothersInTheBar method or change the current one.
