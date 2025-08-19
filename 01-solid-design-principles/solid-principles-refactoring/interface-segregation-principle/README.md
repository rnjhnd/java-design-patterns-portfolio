### The following design has an Interface Segregation Principle problem:
  * The **SmartPhone** interface defines methods for making calls, sending SMS, browsing the web, and taking pictures.
  * While  smartphones (**iPhone** and **Samsung**) can utilize all functionalities, a basic phone (**BasicPhone**) only needs calling and SMS capabilities.
  * Forcing the **BasicPhone** class to implement unused methods (**browseWeb** and **takePicture**) violates ISP.

<img width="664" height="479" alt="image" src="https://github.com/user-attachments/assets/28af81a7-b0e7-4e48-87e4-47d834052479" />

Show your solution in codes on how to remove the problem. 
