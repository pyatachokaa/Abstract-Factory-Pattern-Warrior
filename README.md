# Abstract-Factory-Pattern-Warrior
the code implements the Abstract Factory Pattern. how:

Abstract Factory Class: We have an abstract class CharacterFactory which declares abstract methods createCharacter() and createWeapon(). This class serves as the abstract factory for creating character objects and their associated weapons.

Concrete Factory Classes: We have concrete factory classes like WarriorSwordFactory which extend the CharacterFactory class and implement its abstract methods to create specific combinations of character classes and weapon types.

Client Code Using Factory: In the Main class, we use the CharacterCreator class to set a concrete factory (WarriorSwordFactory) and then create a character using that factory. This separation allows the client code to be decoupled from the specific classes of objects it creates.

Creation of Products: The concrete factory classes (WarriorSwordFactory in this case) are responsible for creating concrete instances of Character and Weapon, which represent the products of the factory.
