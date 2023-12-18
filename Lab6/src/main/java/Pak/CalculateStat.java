package Pak;

import java.util.List;

public class CalculateStat {
  int culculeteYes(List<Order> list){
    int count=0;
    for (Order order : list) {
      if (order.getDelivery().equals("Yes")) {
        count++;
  }}
      return count;
}
  int culculeteNo(List<Order> list){
    int count=0;
    for (Order order : list) {
      if (order.getDelivery().equals("No")) {
        count++;
      }}
    return count;
  }
  int culculeteMb(List<Order> list){
    int count=0;
    for (Order order : list) {
      if (order.getDelivery().equals("No information")) {
        count++;
      }}
    return count;
  }
}
