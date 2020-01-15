/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webserver.pojo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author informatica
 */

@XmlRootElement
public class Details {
    @XmlElement
    private String name="Andrea";
    @XmlElement
    private String surname="Petrucci";

    
}