package Pak;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class ParseXMLTest {
  List<Order> testList = new ArrayList<>();
  File testFile = new File("H:\\Text\\СИТАИРИС\\Лабы\\Lab6\\src\\main\\resources\\OrderList.xml");
  @Test
  void parse() throws ParserConfigurationException, IOException, SAXException {
    ParseXML parseXMLTest = new ParseXML();
    testList= parseXMLTest.parse(testFile);
    Assertions.assertNotNull(testList, "Тест листа на полность");
  }
}
