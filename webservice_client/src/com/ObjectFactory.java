
package com;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Exception_QNAME = new QName("http://com/", "Exception");
    private final static QName _CustomerId_QNAME = new QName("http://com/", "customerId");
    private final static QName _GetCustomerValidationResponse_QNAME = new QName("http://com/", "getCustomerValidationResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link Zb2BCustInqWrapper }
     * 
     */
    public Zb2BCustInqWrapper createZb2BCustInqWrapper() {
        return new Zb2BCustInqWrapper();
    }

    /**
     * Create an instance of {@link CollectionOfCustInq }
     * 
     */
    public CollectionOfCustInq createCollectionOfCustInq() {
        return new CollectionOfCustInq();
    }

    /**
     * Create an instance of {@link CustInq }
     * 
     */
    public CustInq createCustInq() {
        return new CustInq();
    }

    /**
     * Create an instance of {@link MetaData }
     * 
     */
    public MetaData createMetaData() {
        return new MetaData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "customerId")
    public JAXBElement<String> createCustomerId(String value) {
        return new JAXBElement<String>(_CustomerId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Zb2BCustInqWrapper }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "getCustomerValidationResponse")
    public JAXBElement<Zb2BCustInqWrapper> createGetCustomerValidationResponse(Zb2BCustInqWrapper value) {
        return new JAXBElement<Zb2BCustInqWrapper>(_GetCustomerValidationResponse_QNAME, Zb2BCustInqWrapper.class, null, value);
    }

}
