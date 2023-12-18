<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.*, java.text.*" %>
<%@ page import="Pak.ParseXML" %>
<%@ page import="Pak.Order" %>
<%@ page import="java.io.File" %>
<%@ page import="org.jfree.data.general.DefaultPieDataset" %>
<%@ page import="org.jfree.chart.JFreeChart" %>
<%@ page import="org.jfree.chart.ChartFactory" %>
<%@ page import="org.jfree.chart.plot.PiePlot" %>
<%@ page import="org.jfree.chart.labels.StandardPieSectionLabelGenerator" %>
<%@ page import="org.jfree.chart.ChartPanel" %>
<%@ page import="java.awt.*" %>
<%@ page import="java.util.List" %>
<%@ page import="java.io.IOException" %>
<%@ page import="org.jfree.chart.ChartUtils" %>


<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Добро пожаловать, JSP!</title>
</head>
<body>
<h1>Добро пожаловать!</h1>
<% ParseXML PXML = new ParseXML();
    File F = new File("H:\\Text\\СИТАИРИС\\Лабы\\Lab6\\src\\main\\resources\\OrderList.xml");

    List<Order> objList = new ArrayList<>();
    objList = PXML.parse(F);
    int n = 0, y = 0, mb = 0;
    for (Order order : objList) {
        response.getWriter().print(order.print());
        if (order.getDelivery().equals("Yes")) {
            y++;
        } else if (order.getDelivery().equals("No")) {
            n++;
        } else {
            mb++;
        }
    }
    DefaultPieDataset dataset = new DefaultPieDataset();
    dataset.setValue("No", n);
    dataset.setValue("Yes", y);
    dataset.setValue("No info", mb);
    JFreeChart chart = ChartFactory.createPieChart("Delivery stat", dataset, true, true, false);
    PiePlot plot = (PiePlot) chart.getPlot();
    plot.setLabelGenerator(new StandardPieSectionLabelGenerator("{0}: {1} ({2})"));
    try {
        ChartUtils.saveChartAsPNG(new File("H:\\Apps\\TomCat\\apache-tomcat-9.0.83\\bin\\chart.png"), chart, 500, 300);
    } catch (IOException e) {
        e.printStackTrace();
    }

%>
<img src="chart.png">
</body>
</html>
