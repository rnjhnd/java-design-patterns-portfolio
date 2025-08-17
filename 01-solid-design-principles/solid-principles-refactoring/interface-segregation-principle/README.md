### The following design has a Interface Segregation Principle problem:
  * The **SmartPhone** interface defines methods for making calls, sending SMS, browsing the web, and taking pictures.
  * While  smartphones (**iPhone** and **Samsung**) can utilize all functionalities, a basic phone (**BasicPhone**) only needs calling and SMS capabilities.
  * Forcing the **BasicPhone** class to implement unused methods (**browseWeb** and **takePicture**) violates ISP.

![image](https://github.com/user-attachments/assets/b3b36cb8-1bd6-42e0-b848-cb61988bd9e9)

Show your solution in codes on how to remove the problem. 
