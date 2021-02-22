package com.journaldev.xml;

public class App {
    public static final String RESOURCES_PATH = "src/main/resources/";

    public static void main(String[] args) {
        XMLValidation.checkXml("EmployeeRequest.xml", "Employee.xsd");
        XMLValidation.checkXml("EmployeeResponse.xml", "Employee.xsd");
        XMLValidation.checkXml("Employee-bad.xml", "Employee.xsd");
    }
}
