package Pak;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ParseXML {
  public ParseXML() {
  }
  public List<Order> parse(File f) throws ParserConfigurationException, IOException, SAXException {
    DocumentBuilderFactory var5 = DocumentBuilderFactory.newInstance();
    DocumentBuilder var6 = var5.newDocumentBuilder();
    Document var7 = var6.parse(f);
    Node root = var7.getFirstChild();
    Director director = new Director();
    director.setBuilder(new StandartOrder());
    List<Order> ListOrderObjects = new ArrayList<>();
    List<String> ListStats = new ArrayList<>();
    Node orderStat;
    NodeList orderStats;
    NodeList orderList;

    orderList = root.getChildNodes();
    for (int i = 0; i < orderList.getLength(); ++i) {
      Node order = orderList.item(i);
      if (order.getNodeType() != 3) {
        orderStats = order.getChildNodes();
        for (int j = 0; j < orderStats.getLength(); ++j) {
          orderStat = orderStats.item(j);
          if (orderStat.getNodeType() != 3) {
            ListStats.add(orderStat.getChildNodes().item(0).getTextContent());
          }
        }
        Order ordert = director.buildOrder(ListStats.get(0), ListStats.get(1), ListStats.get(2), ListStats.get(3), ListStats.get(4),
                                           ListStats.get(5));
        ListOrderObjects.add(ordert);
        ListStats.clear();
      }
    }
    return ListOrderObjects;
  }
}
