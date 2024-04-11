// Step 1: Define the Character class
class Character {
    String name;
    String characterClass;
    Weapon weapon;
    int health;
    int mana;
}

// Step 2: Define the Weapon class
class Weapon {
    String type;
    int damage;
    int speed;
    int range;
}

// Step 3: Define an abstract CharacterFactory class
abstract class CharacterFactory {
    abstract Character createCharacter();
    abstract Weapon createWeapon();
}

// Step 4: Create concrete CharacterFactory classes
class WarriorSwordFactory extends CharacterFactory {
    @Override
    public Character createCharacter() {
        Character warrior = new Character();
        warrior.characterClass = "Warrior";
        warrior.health = 100;
        warrior.mana = 50;
        return warrior;
    }

    @Override
    public Weapon createWeapon() {
        Weapon sword = new Weapon();
        sword.type = "Sword";
        sword.damage = 20;
        sword.speed = 10;
        sword.range = 2;
        return sword;
    }
}

// Similar factories for Mage and Archer with different weapons

// Step 5: Define the ConcreteCharacter and ConcreteWeapon classes
// Not needed in this example since we're using the Character and Weapon classes directly.

// Step 6: Create a CharacterCreator class
class CharacterCreator {
    private CharacterFactory factory;

    public void setFactory(CharacterFactory factory) {
        this.factory = factory;
    }

    public Character createCharacter() {
        return factory.createCharacter();
    }
}

// Step 7: Use the CharacterCreator and concrete factories
class Test {
    public static void main(String[] args) {
        CharacterCreator creator = new CharacterCreator();
        CharacterFactory warriorSwordFactory = new WarriorSwordFactory();
        creator.setFactory(warriorSwordFactory);

        Character warrior = creator.createCharacter();
        Weapon sword = warriorSwordFactory.createWeapon();

        System.out.println("Warrior created with class: " + warrior.characterClass);
        System.out.println("Weapon type: " + sword.type);
    }
}

