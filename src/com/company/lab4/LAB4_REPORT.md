# Behavior Design Patterns

### Course: TMPS
### Author: Afteni Daniela

----

## Theory

In software engineering, behavioral design patterns are design patterns that identify common communication patterns between objects and realize these patterns. By doing so, these patterns increase flexibility in carrying out this communication.

## Idea of the project:

The main idea on which is based this laboratory work is a team that does sport.
This team contains multiple players, which are characterized by:surname, name, role (in the team), state (if he is present or not at the training), mediator (he has with other team members the same management system, controlled by coach, trainer).
As we can see in the main program, below is represented how those team members, players are initialised and introduced in the team as constant players

Due to the fact that these players are already assigned to a team, they need to come for the trainings. In thia case, it is required to make use of the parameter - state, which will define if the user came or did not come to this training.
At the training the team members should be present, so as to get the corresponding instructing and agreement from each other for the game that they are going to play.

Taking into account each player's state from the team, then we are going to print some lines about each of them if they are or not at the training.Those will contain member's: surname, name, role and state, depending on which he will get the instructing from others.

After that we are going to make pieces of instructing that will be generated by some players having the same mediator. Those will be represented by an array of commands, consisting of commands from the jucator1 and jucator4. This list will send the instructing and realise them.

Depending on the state that the player has it will get the instructing. In case if he is present at the training then he will do, otherwise he is not going to get it, because it is not possible for an absent person to get any. We are going to realise a different instructing changer for the list that contain commands.

## State 

State is a behavioral design pattern that lets an object alter its behavior when its internal state changes. It appears as if the object changed its class.

### Implementation description

As it is described in the main idea of this project, state means - if the player is present or not at the training and depending on the state he will get the instructing or not. In case if he is present at the training then he will do, otherwise he is not going to get it, because it is not possible for an absent person to get any. 


```
    j    jucator4.aVenit();
         jucator5.aVenit();
         jucator1.aVenit();
         jucator2.aVenit();
         jucator5.aPlecat();
         jucator3.aVenit();
         for (Jucator jucator : teamAntrenor) {
              // Taking into account each player's state from the team, then we are going to print some lines about each of them if they are or not at the training
              // Those will contain member's: surname, name, role and state, depending on which he will get the instructing from others.
              System.out.println("Jucatorul " + jucator.getSurname() + " " + jucator.getName() +
                      " care este " + jucator.getRole() +
                      " este " + jucator.getState() + " la antrenamet.");
         }
```
Having those classes which implements the state interface:
```
public class Plecat implements State{

    @Override
    public void trimiteInstructaj(String instructaj) {
        String inst = "Jucatorul " + jucator.getSurname() + " " + jucator.getName() +
                    " care este " + jucator.getRole() +
                    " nu a venit la antrenament, de aceia nu poate trimite nici un instructaj.";
        System.out.println(inst);
    }

    @Override
    public void primesteInstructaj(String instructaj) {
        String inst = "Jucatorul " + jucator.getSurname() + " " + jucator.getName() +
                    " care este " + jucator.getRole() +
                    " nu a venit la antrenament, de aceia nu poate primi nici un instructaj.";
        System.out.println(inst);
    }

    private Jucator jucator;
    public Plecat(Jucator jucator) { this.jucator = jucator;}
}
```


```
public class Venit implements State{
    @Override
    public void trimiteInstructaj(String instructaj) {
        String inst = "Jucatorul " + jucator.getSurname() + " " + jucator.getName() +
                    " care este " + jucator.getRole() +
                    " a trimis instructajul - '" + instructaj + "'.";
        System.out.println(inst);
        jucator.getMediator().trimiteInstructaj(instructaj, jucator);
    }

    @Override
    public void primesteInstructaj(String instructaj) {
        String inst = "Jucatorul " + jucator.getSurname() + " " + jucator.getName() +
                    " care este " + jucator.getRole() +
                    " a primit instructajul - '" + instructaj + "'.";
        System.out.println(inst);
    }

    private Jucator jucator;
    public Venit(Jucator jucator) {
        this.jucator = jucator;
    }
}
```

## Mediator

Mediator is a behavioral design pattern that lets you reduce chaotic dependencies between objects. The pattern restricts direct communications between the objects and forces them to collaborate only via a mediator object.

### Implementation description

Here AntrenorMediator interface is the main start point, which then is implemented by the TeamAntrenor class. 
This interface has some methods for managing the players and instructing in a team, that is managed by a trainer.
The TeamAntrenor, being its concrete implementation, sends instructing to a list of already assigned players (inscrisi). 

Due to this the behaviour between the players is mediated by the TeamAntrenor, it containing methods for assigning (inscrere) and sends to those pieces of instructing.

```
public interface AntrenorMediator {
    void inscriereaUnuiJucator(Jucator jucator);
    void trimiteInstructaj(String instructaj, Jucator jucator);
}
```

```
    @Override
    public void inscriereaUnuiJucator(Jucator jucator) {
        jucators.add(jucator);
    }

    private List<Jucator> jucators;
    public TeamAntrenor(){ jucators = new ArrayList<>(); }
```
## Strategy

Strategy is a behavioral design pattern that lets you define a family of algorithms, put each of them into a separate class, and make their objects interchangeable.

### Implementation description

By this pattern, there is composed in the InstructajChanger interface, as well as its implementation class InstructajTextChanger. 

The InstructajChanger interface defines a method for changing the input instructing, and gives in return the new instructing, and the InstructajTextChanger mplements it by changing those to upper case letter. 

```
public interface InstructajChanger {
    String changeTheInstructaj(String instructaj);
}
```

```
public class InstructajTextChanger implements InstructajChanger {
    @Override
    public String changeTheInstructaj(String instructaj) { return instructaj.toUpperCase(); }
}
```
```
         Command multipleCommands[] = new Command[2];
         multipleCommands[0] = command;
         multipleCommands[1] = command1;
         for (int i = 0; i < multipleCommands.length; i++) {
              // Depending on the state that the player has it will get the instructing
              // In case if he is present at the training then he will do,
              // otherwise he is not going to get it, because it is not possible for an absent person to get any
              // We are going to realise a different instructing changer for the list that contain commands
              InstructajChanger instructajChanger = new InstructajTextChanger();
              multipleCommands[i].setSuplimentarAntrenatJucator(instructajChanger);
              CommandInvoker commandInvoker = new CommandInvoker();
              commandInvoker.realizeazaInstructaj(multipleCommands[i]);
              System.out.println();
```

## Iterator

Iterator is a behavioral design pattern that lets you traverse elements of a collection without exposing its underlying representation (list, stack, tree, etc.).

### Implementation description

This pattern is implemented as well in the TeamAntrenor class, because it provides an iterator method that returns an iterator for the players, who are assigned to a sport, having a trainer.

```
    @Override
    public Iterator<Jucator> iterator() { return jucators.iterator(); }

    @Override
    public void inscriereaUnuiJucator(Jucator jucator) {
        jucators.add(jucator);
    }

    private List<Jucator> jucators;
    public TeamAntrenor(){ jucators = new ArrayList<>(); }
```


```
         jucator4.aVenit();
         jucator5.aVenit();
         jucator1.aVenit();
         jucator2.aVenit();
         jucator5.aPlecat();
         jucator3.aVenit();
         for (Jucator jucator : teamAntrenor) {
              // Taking into account each player's state from the team, then we are going to print some lines about each of them if they are or not at the training
              // Those will contain member's: surname, name, role and state, depending on which he will get the instructing from others.
              System.out.println("Jucatorul " + jucator.getSurname() + " " + jucator.getName() +
                      " care este " + jucator.getRole() +
                      " este " + jucator.getState() + " la antrenamet.");
         }
```
## Command

Command is a behavioral design pattern that turns a request into a stand-alone object that contains all information about the request. This transformation lets you pass requests as a method arguments, delay or queue a request’s execution, and support undoable operations.

### Implementation description

Not only TrimiteInstructajCommand was used to implement the Command Pattern, but also and CommandInvoker. 

This class determines a specific command for saying an instructing, more specifically it contains a method for saying the instructing to all the players, which are already assigned to a game having a trainer, without taking into account the player who said instructing, while the CommandInvoker executes it (the command). 

Due to this, the command will be allowed to be realized later.

```
         Command command = new TrimiteInstructajCommand(teamAntrenor, "Today we will exercise a lot. So be ready.", jucator1);
         Command command1 =  new TrimiteInstructajCommand(teamAntrenor, "The equipment is ready for usage, thus we can start.", jucator4);
         Command multipleCommands[] = new Command[2];
         multipleCommands[0] = command;
         multipleCommands[1] = command1;
         for (int i = 0; i < multipleCommands.length; i++) {
              // Depending on the state that the player has it will get the instructing
              // In case if he is present at the training then he will do,
              // otherwise he is not going to get it, because it is not possible for an absent person to get any
              // We are going to realise a different instructing changer for the list that contain commands
              InstructajChanger instructajChanger = new InstructajTextChanger();
              multipleCommands[i].setSuplimentarAntrenatJucator(instructajChanger);
              CommandInvoker commandInvoker = new CommandInvoker();
              commandInvoker.realizeazaInstructaj(multipleCommands[i]);
              System.out.println();
         }
```

```
public class TrimiteInstructajCommand implements Command{
    @Override
    public void executareaInstructajlui() {
        String changedInstructaj = instructajChanger.changeTheInstructaj(instructaj);
        mediator.trimiteInstructaj(changedInstructaj, jucator);
    }

    @Override
    public void setSuplimentarAntrenatJucator(InstructajChanger instructajChanger) {
        this.instructajChanger = instructajChanger;
    }
    private String instructaj;
    private Jucator jucator;
    private AntrenorMediator mediator;
    private InstructajChanger instructajChanger;

    public TrimiteInstructajCommand(AntrenorMediator mediator, String instructaj, Jucator jucator) {
        this.jucator = jucator;
        this.mediator = mediator;
        this.instructaj = instructaj;
    }
```


## Conclusions 

In conclusion, due to this laboratory work, I was able to understand the Behavioral Design Patterns. Being capable of understanding those 5 implemented patterns ensures that I am aware of how objects can behave and interact, and that behavioral design patterns are concerned with algorithms and the assignment of responsibilities between objects.  
