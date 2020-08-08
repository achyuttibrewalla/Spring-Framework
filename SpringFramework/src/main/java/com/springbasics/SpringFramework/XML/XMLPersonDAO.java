package com.springbasics.SpringFramework.XML;

public class XMLPersonDAO {

    XMLJdbcConnection XMLJdbcConnection;

    public XMLPersonDAO() {

    }

    public XMLPersonDAO(XMLJdbcConnection XMLJdbcConnection) {
        this.XMLJdbcConnection = XMLJdbcConnection;
    }

    public XMLJdbcConnection getXMLJdbcConnection() {
        return XMLJdbcConnection;
    }

    public void setXMLJdbcConnection(XMLJdbcConnection XMLJdbcConnection) {
        this.XMLJdbcConnection = XMLJdbcConnection;
    }
}
