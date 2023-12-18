package Pak;

public abstract class OrderBuilder {
  Order order;

  void createOrder() {
    order = new Order();
  }

  ;

  abstract void buidTitle(String title);

  abstract void buidOrderType(String orderType);

  abstract void buidDiscountProcent(String discountProcent);

  abstract void buidDelivery(String delivery);

  abstract void buidCount(String count);

  abstract void buidPrice(String price);

  Order getOrder() {
    return order;
  }

}
