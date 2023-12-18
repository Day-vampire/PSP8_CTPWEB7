package Pak;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CalculateStatTest {

  private CalculateStat calculate;
  List<Order> testList = new ArrayList<>();
  @BeforeEach
  void setUp() throws ParserConfigurationException, IOException, SAXException {
    calculate = new CalculateStat();
    File testFile = new File("H:\\Text\\СИТАИРИС\\Лабы\\Lab6\\src\\main\\resources\\OrderList.xml");
    ParseXML testParse = new ParseXML();
    testList = testParse.parse(testFile);
  }
  @Test
  void culculeteMbNullTest(){
    int sum = calculate.culculeteMb(testList);
    Assertions.assertEquals(0 , sum);
  }
  @Test
  void culculeteMbNotNullTest(){
    int sum = calculate.culculeteMb(testList);
    Assertions.assertNotEquals(1,sum);
  }

}
