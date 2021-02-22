#How to validate XML against XSD in Java

https://www.journaldev.com/895/how-to-validate-xml-against-xsd-in-java

Java XML Validation API can be used to validate XML against XSD in java program. javax.xml.validation.Validator class is used in this program to validate xml against xsd in java.

###Validate XML against XSD

Here is the program that is used to validate all three XML files against the XSD. The validateXMLSchema method takes XSD and XML file as argument and return true if validation is successful or else returns false.

The benefit of using Java XML validation API is that we don’t need to parse the file and there is no third party APIs used.


###Expected output

    Validate EmployeeRequest.xml against Employee.xsd. Result: true
    Validate EmployeeResponse.xml against Employee.xsd. Result: true
    Validate Employee-bad.xml against Employee.xsd. Result: false
    [Exception: cvc-complex-type.2.4.a: Invalid content was found starting with element 'Employee'. One of '{id}' is expected.]