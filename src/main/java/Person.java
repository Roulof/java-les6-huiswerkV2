import java.util.*;

//Person klasse met alle klassen en attributen
public class Person {

    private String name;
    private String middleName;
    private String lastName;
    private String sex;
    private int age;
    private Person mother;
    private Person father;
    private List<Person> siblings = new ArrayList<>();
    private List<Person> children = new ArrayList<>();
    private List<Pet> pets = new ArrayList<>();
}

// Constructor zonder middleName
public Person(String name, String lastName, int age, String sex) {
    this.name = name;
    this.lastName = lastName;
    this.age = age;
    this.sex = sex;
}

// Constructor met middleName
public Person(String name, String middleName, String lastName, int age, String sex) {
    this(name, lastName, age, sex);
    this.middleName = middleName;
}

// Getters & setters
public String getName() { return name; }
public void setName(String name) { this.name = name; }

public String getMiddleName() { return middleName; }
public void setMiddleName(String middleName) { this.middleName = middleName; }

public String getLastName() { return lastName; }
public void setLastName(String lastName) { this.lastName = lastName; }

public String getSex() { return sex; }
public void setSex(String sex) { this.sex = sex; }

public int getAge() { return age; }
public void setAge(int age) { this.age = age; }

public Person getMother() { return mother; }
public void setMother(Person mother) { this.mother = mother; }

public Person getFather() { return father; }
public void setFather(Person father) { this.father = father; }

// Add functies
public List<Person> getSiblings() { return siblings; }
public void addSibling(Person sibling) { this.siblings.add(sibling); }

public List<Person> getChildren() { return children; }
public void addChild(Person child) { this.children.add(child); }

public List<Pet> getPets() { return pets; }
public void addPet(Pet pet) { this.pets.add(pet); }


// For loop voor het toevoegen van grandchildren
public List<Person> getGrandChildren() {
    List<Person> grandChildren = new ArrayList<>();
    for (Person child : children) {
        grandChildren.addAll(child.getChildren());
    }
    return grandChildren;
}
