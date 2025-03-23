# solid
The SOLID principles are a set of five design principles in object-oriented programming that help make software more maintainable and scalable. Let’s demonstrate each principle using a Car example in an object-oriented programming (OOP) approach.
🔥 Summary of SOLID in Car Example
|  Principle                    |  Key Idea                                                          |  Example  |
|  ---------                    |  --------                                                          |  -------  |
|  SRP (Single Responsibility)  |  Class should have only one reason to change                       |  Separate Car and FuelStation classes  |
|  OCP (Open/Closed)            |  Open for extension, closed for modification                       |  Use Engine interface instead of if-else  |
|  LSP (Liskov Substitution)    |  Subtypes must be replaceable without breaking behavior            |  ElectricCar and PetrolCar both extend Car properly  |
|  ISP (Interface Segregation)  |  No class should implement methods it doesn't need                 |  Driveable, Refuelable, and Chargeable interfaces  |
|  DIP (Dependency Inversion)   |  High-level modules depend on abstractions, not concrete classes   |  Car depends on Engine interface  |
