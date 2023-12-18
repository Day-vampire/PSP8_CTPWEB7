package Pak;

public class OtherOrder extends OrderBuilder {

  @Override
  void buidTitle(String title) {
    order.setTitle(title);
  }

  @Override
  void buidOrderType(String orderType) {
    order.setOrderType(orderType);
  }

  @Override
  void buidDiscountProcent(String discountProcent) {
    order.setDiscountProcent(discountProcent);
  }

  @Override
  void buidDelivery(String delivery) {
    order.setDelivery(delivery);
  }

  @Override
  void buidCount(String count) {
    order.setCount(count);
  }

  @Override
  void buidPrice(String price) {
    order.setPrice(price);
  }
}
