package ru.otus.heaviest;

// https://www.cbr-xml-daily.ru/daily_utf8.xml

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import ru.otus.heaviest.ext.MailMessage;
import ru.otus.heaviest.ext.MailSender;
import ru.otus.heaviest.ext.MailSenderStub;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Main {
    private static final String XML_FILE_RESOURCE = "daily_utf8.xml";
    private static final String WORKING_CURRENCY = "USD";
    private static final int MAX_DIFF = 3;
    private static final int WAIT_TIMEOUT_MILLIS = 5000;

    @SuppressWarnings({"BusyWait", "InfiniteLoopStatement"})
    public static void main(String[] args) throws Exception {
        Double lastCurrencyValue = null;
        while (true) {
            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            try (InputStream xml = Main.class.getClassLoader().getResourceAsStream(XML_FILE_RESOURCE)) {
                Document document = documentBuilder.parse(xml);
                Node root = document.getDocumentElement();
                for (int i = 0; i < root.getChildNodes().getLength(); i++) {
                    Node currencyNode = root.getChildNodes().item(i);
                    String currencyCode = "";
                    String currencyName = "";
                    String currencyStrValue = "";
                    for (int j = 0; j < currencyNode.getChildNodes().getLength(); j++) {
                        Node currencyPropertyNode = currencyNode.getChildNodes().item(j);

                        if (currencyPropertyNode.getNodeName().equalsIgnoreCase("CharCode")) {
                            currencyCode = currencyPropertyNode.getTextContent();
                        } else if (currencyPropertyNode.getNodeName().equalsIgnoreCase("Name")) {
                            currencyName = currencyPropertyNode.getTextContent();
                        } else if (currencyPropertyNode.getNodeName().equalsIgnoreCase("Value")) {
                            currencyStrValue = currencyPropertyNode.getTextContent();
                        }
                    }

                    if (!currencyCode.equalsIgnoreCase(WORKING_CURRENCY)) {
                        continue;
                    }

                    DecimalFormat df = new DecimalFormat();
                    DecimalFormatSymbols sfs = new DecimalFormatSymbols();
                    sfs.setDecimalSeparator(',');
                    df.setDecimalFormatSymbols(sfs);
                    double currencyValue = df.parse(currencyStrValue).doubleValue();
                    if (lastCurrencyValue != null) {
                        double diff = currencyValue - lastCurrencyValue;
                        if (Math.abs(diff) > MAX_DIFF) {
                            System.out.println("Колебания!!!!");
                            System.out.printf("Валюта: %s %nстарая цена: %s %nновая цена: %s%n%n",
                                    currencyName, lastCurrencyValue, currencyStrValue);
                            String message;
                            if (diff <= 0) {
                                message = String.format("Обнаружены отрицательные колебания %nвалюта:%s %nразница:%s",
                                        currencyName, diff);
                            } else {
                                message = String.format("Обнаружены положительные колебания %nвалюта:%s %nразница:%s",
                                        currencyName, diff);
                            }
                            MailSender mailSender = new MailSenderStub();
                            mailSender.sendMessage(new MailMessage(message));
                        }
                    }
                    lastCurrencyValue = currencyValue;

                }
            }
            Thread.sleep(WAIT_TIMEOUT_MILLIS);
        }
    }
}
