/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webserver.parser;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import webserver.pojo.Config;
import webserver.pojo.Details;

/**
 *
 * @author informatica
 */
public class ConfigParser {
    public Config parse(String filename) throws URISyntaxException, JAXBException {     //cerca il file nel classpath
        URL resource = getClass().getClassLoader().getResource(filename);
        File file = new File(resource.toURI());                                         //istanzia il parser
        JAXBContext jaxbContext = JAXBContext.newInstance(Config.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();               //effettua il parse del contenuto del file all'interno di una istanza della classe
        Config config = (Config) jaxbUnmarshaller.unmarshal(file);
        return config;
    }
    public void format() throws JAXBException{
        
        JAXBContext jaxbContext = JAXBContext.newInstance(Details.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        
        File file = new File("WebServer/test.xml");
        jaxbMarshaller.marshal( new Details(), file );        
    }
}
