package org.example.converter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.example.client.ClientFindInfo;
import org.example.client.ClientInfo;
import org.example.client.Dul;
import org.example.person.FindPersonInfo;
import org.example.person.IdentityCard;
import org.example.person.PersonInfo;
import org.example.person.PersonName;
import org.json.JSONObject;

import java.io.File;
import java.io.IOException;

public class Converter {

    public void transformObjectToJSON(PersonInfo personInfo) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        File file = new File("personInfo");
        mapper.writeValue(file,personInfo);
    }


    public PersonInfo getPersonInfoFromClientInfo(ClientInfo clientInfo) throws IOException {
        ClientFindInfo clientFindInfo = clientInfo.getClientFindInfo();
        Dul dul = clientFindInfo.getDul();
        Integer partyId = clientFindInfo.getPartyId();
        PersonName personName = new PersonName(dul.getLastName(), dul.getFirstName(), dul.getSecondName());
        IdentityCard identityCard = new IdentityCard(dul.getDocumentType(), dul.getSeries(), dul.getNumber());
        FindPersonInfo findPersonInfo = new FindPersonInfo(personName,identityCard,partyId);
        PersonInfo personInfo = new PersonInfo(findPersonInfo);
        JSONObject rootObject= new JSONObject();
        rootObject.put("root",personInfo);
        return personInfo;
    }
    public  ClientInfo transformXmlToClientInfo() throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        ClientInfo clientInfo = xmlMapper.readValue(new File("clientInfo.xml"), ClientInfo.class);
        return clientInfo;
    }
}
