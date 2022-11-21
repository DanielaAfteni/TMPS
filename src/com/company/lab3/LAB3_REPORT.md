# Structural Design Patterns

### Course: TMPS
### Author: Afteni Daniela

----

## Theory

Structural design patterns are concerned with how classes and objects can be composed, to form larger structures.

The structural design patterns simplifies the structure by identifying the relationships.

These patterns focus on, how the classes inherit from each other and how they are composed from other classes.


## Idea of the project:

The main idea is based on the PBL project
Each PBL group has its members, where each of them should have a:

Status:
* Frontend Developer
* Backend Developer

Experience:
* Junior
* Senior

Each of the PBL groups has its leader, which anyway is as well a junior/senior developer at Frontend/Backend

Each developer has its name, surname, status, experience and group(of other members)

## Bridge

Bridge is a structural design pattern that lets you split a large class or a set of closely related classes into two separate hierarchies—abstraction and implementation—which can be developed independently of each other.

### Implementation description

The main object is the Developer. Having the abstract class Developer it also contains an attribute of type IDeveloper - which is an interface that is used to differentiate the types of people (what they can implement: Frontend/Backend) by their experience (senior/junior). 

The Dev class extends Developer class, where it includes some attributes + with the basic information about the developer:
* developerName
* developerSurname
* groupMembers
* seniorOrJunior
* pblProject


We are having the IDeveloper interface separated from the Developer class by not implementing it, but using a reference to that interface. 
This reference is protected variable iDeveloper, which is then used in the Dev class - which is the bridge between the implementation and the abstract class. 
In the implementation, depending on the experience of the developer there are two classes which implement the method from the interface: 
* SeniorDeveloper
```
public class SeniorDeveloper implements IDeveloper {

    @Override
    public void instructions(String sport) {
        if (sport.equalsIgnoreCase("Frontend")) {
            System.out.println("Use the already learned React.");
        } else {
            System.out.println("Use the already learned programming language, and start implementing.");
        }
    }
}
```

* JuniorDeveloper
```
public class JuniorDeveloper implements IDeveloper {

    @Override
    public void instructions(String sport) {
        if (sport.equalsIgnoreCase("Frontend")) {
            System.out.println("Inform yourself about React, and try to learn it.");
        } else {
            System.out.println("Inform yourself about any language, and try to learn it how to implement backend.");
        }
    }
}
```

## Adapter

Adapter is a structural design pattern that allows objects with incompatible interfaces to collaborate.

### Implementation description


The Adapter was implemented using two classes: 
* DevBuilder - where firstly we take a look if the developer is implementing frontend or backend (one of those), then we create the adapter and execute the specific methods from it devAdapter.implementPBLProject().

```
public class DevBuilder {
    void build(String pblProject, String seniorOrJunior) {
        if (pblProject.equalsIgnoreCase("Frontend") || pblProject.equalsIgnoreCase("Backend"))
        {
            DevAdapter devAdapter = new DevAdapter(pblProject, seniorOrJunior);
            devAdapter.implementPBLProject();
        } else {
            System.out.println("This PBL project does not include this part.");
        }
    }
}
```
* DevAdapter -  where based on implementing part (frontend or backend) we initialize an object of one of the specialized classes according to their implementation (BackendDeveloper/FrontendDeveloper)
```
   public class DevAdapter extends Dev {
    private Dev dev;

    DevAdapter(String pblProject, String seniorOrJunior) {
        if (pblProject.equalsIgnoreCase("Frontend"))
        {
            dev = new FrontendDeveloper(seniorOrJunior.equalsIgnoreCase("senior") ? new JuniorDeveloper() : new SeniorDeveloper());
        } else {
            dev = new BackendDeveloper(seniorOrJunior.equalsIgnoreCase("senior") ? new JuniorDeveloper() : new SeniorDeveloper());
        }
    }

    void implementPBLProject() {dev.implement();}
}
```
## Composite

Composite is a structural design pattern that lets you compose objects into tree structures and then work with these structures as if they were individual objects.

### Implementation description

In the Dev class, which extends Developer abstract class, there is one attribute which represents the group of this developer, that includes a list of other members. 

This list is used for the Composite Pattern, especially when we need a specific way to treat the whole group of developers in a specific way. 

By this pattern, there is composed another entity which is the PBL group using as a base the object Developer.


```
    List<Dev> getGroupMembers() {
        return this.groupMembers;
    }
    void addTeammate(Dev player) { this.groupMembers.add(player); }
    void removeTeammate(Dev player) { this.groupMembers.remove(player); }

    @Override
    public void implement() {
        System.out.println("He is implementing.");
    }
```
## Decorator

Decorator is a structural design pattern that lets you attach new behaviors to objects by placing these objects inside special wrapper objects that contain the behaviors.

### Implementation description

This pattern is implemented by the DeveloperDecorator abstract class which then is extended by Leader class, where it has been specified who is the leader of this PBL Project.

```
    public abstract class DeveloperDecorator extends Developer {
    Developer developer;
    DeveloperDecorator(Dev player) {
        this.developer = player;
    }

    @Override
    public String printInfoAboutDeveloper() {
        return this.developer.toString();
    }
}
```

## Facade

Facade is a structural design pattern that provides a simplified interface to a library, a framework, or any other complex set of classes.

### Implementation description

DeveloperFacade was used to implement the Facade Pattern, which has as the main attributes: private IDeveloper juniorDeveloper;
private IDeveloper seniorDeveloper; 

```
    private IDeveloper juniorDeveloper;
    private IDeveloper seniorDeveloper;
    private String pblProject;

    public String getPblProject() {
        return pblProject;
    }

    public DeveloperFacade() {
        this.seniorDeveloper = new SeniorDeveloper();
        this.juniorDeveloper = new JuniorDeveloper();
    }

    public void stepsForSeniors(String pblProject) {
        this.seniorDeveloper.instructions(pblProject);
    }

    public void stepsForJuniors(String pblProject) {
        this.juniorDeveloper.instructions(pblProject);
    }
```


## Conclusions 

In conclusion, due to this laboratory work, I was able to understand the Structural Design Patterns. Being capable of understanding those 5 implemented patterns ensures that I am aware of how classes and objects can be composed, to form larger structures and how those simplify the structure by identifying the relationships.   

