
package com.app.thread.generated;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "expenseService", targetNamespace = "http://185.247.139.7:8182/thread-ws-server-application/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    com.app.thread.generated.ObjectFactory.class
})
public interface ExpenseService {


    /**
     * 
     * @param parameters
     * @return
     *     returns _7._139._247._185._8182.thread_ws_server_application.GetExpensesResponse
     */
    @WebMethod(action = "urn:Expenses")
    @WebResult(name = "getExpensesResponse", targetNamespace = "http://185.247.139.7:8182/thread-ws-server-application/", partName = "parameters")
    public com.app.thread.generated.GetExpensesResponse getExpenses(
        @WebParam(name = "getExpensesRequest", targetNamespace = "http://185.247.139.7:8182/thread-ws-server-application/", partName = "parameters")
                com.app.thread.generated.GetExpensesRequest parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns _7._139._247._185._8182.thread_ws_server_application.SaveExpenseResponse
     */
    @WebMethod(action = "urn:Expenses")
    @WebResult(name = "saveExpenseResponse", targetNamespace = "http://185.247.139.7:8182/thread-ws-server-application/", partName = "parameters")
    public com.app.thread.generated.SaveExpenseResponse saveExpense(
        @WebParam(name = "saveExpenseRequest", targetNamespace = "http://185.247.139.7:8182/thread-ws-server-application/", partName = "parameters")
                com.app.thread.generated.SaveExpenseRequest parameters);

}