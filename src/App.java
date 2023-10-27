import demo.*;

import algo.*;

public class App {
  public static void main(String[] args) {

    String javaHome = System.getProperty("java.home");
    System.out.println("Java Home: " + javaHome);
    
    if (args.length > 0) {
      for (int i = 0; i < args.length; i++) {
        System.out.println("command line args" + i + ": " + args[i]);
      }
    }

    LinkedList linkedlist = new LinkedList();
    System.out.println("find: " + linkedlist.find(linkedlist.n0, 5));

    Puppy dog = new Puppy("wang cai", Puppy.AnimalType.DOG);
    dog.say("hello java");

   
  }
}
