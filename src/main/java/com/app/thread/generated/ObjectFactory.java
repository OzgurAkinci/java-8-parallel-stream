
package com.app.thread.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the _7._139._247._185._8182.thread_ws_server_application package. 
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

    private final static QName _GetExpensesRequest_QNAME = new QName("http://185.247.139.7:8182/thread-ws-server-application/", "getExpensesRequest");
    private final static QName _SaveExpenseResponse_QNAME = new QName("http://185.247.139.7:8182/thread-ws-server-application/", "saveExpenseResponse");
    private final static QName _GetExpensesResponse_QNAME = new QName("http://185.247.139.7:8182/thread-ws-server-application/", "getExpensesResponse");
    private final static QName _SaveExpenseRequest_QNAME = new QName("http://185.247.139.7:8182/thread-ws-server-application/", "saveExpenseRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: _7._139._247._185._8182.thread_ws_server_application
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetExpensesResponse }
     * 
     */
    public GetExpensesResponse createGetExpensesResponse() {
        return new GetExpensesResponse();
    }

    /**
     * Create an instance of {@link com.app.thread.generated.SaveExpenseRequest }
     * 
     */
    public com.app.thread.generated.SaveExpenseRequest createSaveExpenseRequest() {
        return new com.app.thread.generated.SaveExpenseRequest();
    }

    /**
     * Create an instance of {@link SaveExpenseResponse }
     * 
     */
    public SaveExpenseResponse createSaveExpenseResponse() {
        return new SaveExpenseResponse();
    }

    /**
     * Create an instance of {@link GetExpensesRequest }
     * 
     */
    public GetExpensesRequest createGetExpensesRequest() {
        return new GetExpensesRequest();
    }

    /**
     * Create an instance of {@link com.app.thread.generated.Expense }
     * 
     */
    public com.app.thread.generated.Expense createExpense() {
        return new com.app.thread.generated.Expense();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetExpensesRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://185.247.139.7:8182/thread-ws-server-application/", name = "getExpensesRequest")
    public JAXBElement<GetExpensesRequest> createGetExpensesRequest(GetExpensesRequest value) {
        return new JAXBElement<GetExpensesRequest>(_GetExpensesRequest_QNAME, GetExpensesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveExpenseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://185.247.139.7:8182/thread-ws-server-application/", name = "saveExpenseResponse")
    public JAXBElement<SaveExpenseResponse> createSaveExpenseResponse(SaveExpenseResponse value) {
        return new JAXBElement<SaveExpenseResponse>(_SaveExpenseResponse_QNAME, SaveExpenseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetExpensesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://185.247.139.7:8182/thread-ws-server-application/", name = "getExpensesResponse")
    public JAXBElement<GetExpensesResponse> createGetExpensesResponse(GetExpensesResponse value) {
        return new JAXBElement<GetExpensesResponse>(_GetExpensesResponse_QNAME, GetExpensesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link com.app.thread.generated.SaveExpenseRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://185.247.139.7:8182/thread-ws-server-application/", name = "saveExpenseRequest")
    public JAXBElement<com.app.thread.generated.SaveExpenseRequest> createSaveExpenseRequest(com.app.thread.generated.SaveExpenseRequest value) {
        return new JAXBElement<com.app.thread.generated.SaveExpenseRequest>(_SaveExpenseRequest_QNAME, com.app.thread.generated.SaveExpenseRequest.class, null, value);
    }

}
