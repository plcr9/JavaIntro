public class AssigningValuesToInstanceFields {
  String productType;

  public AssigningValuesToInstanceFields(String product) {
    productType = product;
  }

  public static void main(String[] args) {
    AssigningValuesToInstanceFields lemonadeStand = new AssigningValuesToInstanceFields("lemonade");
    System.out.println(lemonadeStand.productType);
  }
}
