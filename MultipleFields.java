public class MultipleFields {
  String productType;
  int inventoryCount;
  double inventoryPrice;

  public MultipleFields(String product, int count, double price) {
    productType = product;
    inventoryCount = count;
    inventoryPrice = price;
  }

  public static void main(String[] args) {
    MultipleFields cookieShop = new MultipleFields("cookies", 12, 3.75);
  }
}
