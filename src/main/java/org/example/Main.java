package org.example;

import org.example.client.ClientInfo;
import org.example.converter.Converter;
import org.example.person.PersonInfo;

import java.io.*;

/**Write a program that reads data from the ClientInfo.xml file and records this data to PersonInfo.json file.*/

public class Main {
    public static void main(String[] args) throws IOException {
        Converter converter = new Converter();
        ClientInfo clientInfo = converter.transformXmlToClientInfo();
        PersonInfo personInfo = converter.getPersonInfoFromClientInfo(clientInfo);
        converter.transformObjectToJSON(personInfo);
    }
}
