package Pak;

public class Director {
  OrderBuilder builder;

  public void setBuilder(OrderBuilder builder) {
    this.builder = builder;
  }

  Order buildOrder(String title,
                   String orderType,
                   String discountProcent,
                   String delivery,
                   String count,
                   String price) {
    builder.createOrder();
    builder.buidTitle(title);
    builder.buidOrderType(orderType);
    builder.buidDiscountProcent(discountProcent);
    builder.buidDelivery(delivery);
    builder.buidCount(count);
    builder.buidPrice(price);
    Order order = builder.getOrder();
    return order;
  }
}
