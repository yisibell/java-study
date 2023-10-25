package demo;

public class Puppy {
  public String name;

  public Puppy(String name) {
    this.name = name;
  }

  public void say(String value) {
    System.out.println(this.name.length());
    System.out.println(this.name + " say: " + value);
  }

}