public class Person {
  private String name; // private = restricted access

  // Getter // gets the private variable
  public String getName() {
    return name;
  }

  // Setter // sets the private variable
  public void setName(String newName) {
    this.name = newName;
  }
}
