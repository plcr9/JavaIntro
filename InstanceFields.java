public class InstanceFields {
  String productType;

  public InstanceFields() {
    System.out.println("I am inside the constructor method.");
  }

  public static void main(String[] args) {
    System.out.println("This code is inside the main method.");

    InstanceFields lemonadeStand = new InstanceFields();

    System.out.println(lemonadeStand);
  }
}
