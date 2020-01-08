/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webserver.pojo;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author informatica
 */
@XmlRootElement

public class Config {
    private String path;
    private String port;


    public void setPath(String path) {
        this.path = path;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getPath() {
        return path;
    }

    public String getPort() {
        return port;
    }

    @Override
    public String toString() {
        return "Config{" + "path=" + path + ", port=" + port + '}';
    }
    
}