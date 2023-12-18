package Pak;

public class Order {
  private String Title;
  private String OrderType;
  private String DiscountProcent;
  private String Delivery;
  private String Count;
  private String Price;

  public String print() {
    return "\nНазвание: " + Title +
      "\nТип заказа: " + OrderType +
      "\nСкидка (%): " + DiscountProcent +
      "\nДоставка  : " + Delivery +
      "\nКоличество: " + Count +
      "\nСтоимость : " + Price + "";
  }


  public void setTitle(String title) {
    Title = title;
  }

  public void setOrderType(String orderType) {
    OrderType = orderType;
  }

  public void setDiscountProcent(String discountProcent) {
    DiscountProcent = discountProcent;
  }

  public void setDelivery(String delivery) {
    Delivery = delivery;
  }

  public void setCount(String count) {
    Count = count;
  }

  public void setPrice(String price) {
    Price = price;
  }

  public void getTitle() {
    System.out.println(Title);
  }

  public void getOrderType() {

    System.out.println(OrderType);
  }

  public void getDiscountProcent() {
    System.out.println(DiscountProcent);

  }

  public String getDelivery() {
    return Delivery;
  }

  public void getCount() {

    System.out.println(Count);
  }

  public void getPrice() {
    System.out.println(Price);
  }

}
