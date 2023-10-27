package demo;

public class Puppy {
  public static enum AnimalType {
    DOG,
    CAT
  }

  public String name;
  public AnimalType type;

  public Puppy(String name, AnimalType type) {
    this.name = name;
    this.type = type;
  }

  public void say(String value) {
    System.out.println(this.name.length());
    System.out.println("The " + this.type + " " + this.name + " say: " + value);
  }



}