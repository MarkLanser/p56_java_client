
package org.tempuri;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import org.datacontract.schemas._2004._07.practicum56library.ArrayOfProduct;
import org.datacontract.schemas._2004._07.practicum56library.Product;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IChatService", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    com.microsoft.schemas._2003._10.serialization.ObjectFactory.class,
    org.datacontract.schemas._2004._07.practicum56library.ObjectFactory.class,
    org.tempuri.ObjectFactory.class
})
public interface IChatService {


    /**
     * 
     * @param note
     * @param from
     */
    @WebMethod(operationName = "PostNote", action = "http://tempuri.org/IChatService/PostNote")
    @RequestWrapper(localName = "PostNote", targetNamespace = "http://tempuri.org/", className = "org.tempuri.PostNote")
    @ResponseWrapper(localName = "PostNoteResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.PostNoteResponse")
    public void postNote(
        @WebParam(name = "from", targetNamespace = "http://tempuri.org/")
        String from,
        @WebParam(name = "note", targetNamespace = "http://tempuri.org/")
        String note);

    /**
     * 
     */
    @WebMethod(operationName = "FillDB", action = "http://tempuri.org/IChatService/FillDB")
    @RequestWrapper(localName = "FillDB", targetNamespace = "http://tempuri.org/", className = "org.tempuri.FillDB")
    @ResponseWrapper(localName = "FillDBResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.FillDBResponse")
    public void fillDB();

    /**
     * 
     * @param password
     * @param username
     */
    @WebMethod(operationName = "CheckCredentials", action = "http://tempuri.org/IChatService/CheckCredentials")
    @RequestWrapper(localName = "CheckCredentials", targetNamespace = "http://tempuri.org/", className = "org.tempuri.CheckCredentials")
    @ResponseWrapper(localName = "CheckCredentialsResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.CheckCredentialsResponse")
    public void checkCredentials(
        @WebParam(name = "username", targetNamespace = "http://tempuri.org/")
        String username,
        @WebParam(name = "password", targetNamespace = "http://tempuri.org/")
        String password);

    /**
     * 
     * @param username
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "RegisterCustomer", action = "http://tempuri.org/IChatService/RegisterCustomer")
    @WebResult(name = "RegisterCustomerResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "RegisterCustomer", targetNamespace = "http://tempuri.org/", className = "org.tempuri.RegisterCustomer")
    @ResponseWrapper(localName = "RegisterCustomerResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.RegisterCustomerResponse")
    public String registerCustomer(
        @WebParam(name = "username", targetNamespace = "http://tempuri.org/")
        String username);

    /**
     * 
     * @param username
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod(operationName = "IsUsernameAvailable", action = "http://tempuri.org/IChatService/IsUsernameAvailable")
    @WebResult(name = "IsUsernameAvailableResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "IsUsernameAvailable", targetNamespace = "http://tempuri.org/", className = "org.tempuri.IsUsernameAvailable")
    @ResponseWrapper(localName = "IsUsernameAvailableResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.IsUsernameAvailableResponse")
    public Boolean isUsernameAvailable(
        @WebParam(name = "username", targetNamespace = "http://tempuri.org/")
        String username);

    /**
     * 
     * @param username
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GeneratePassword", action = "http://tempuri.org/IChatService/GeneratePassword")
    @WebResult(name = "GeneratePasswordResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GeneratePassword", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GeneratePassword")
    @ResponseWrapper(localName = "GeneratePasswordResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GeneratePasswordResponse")
    public String generatePassword(
        @WebParam(name = "username", targetNamespace = "http://tempuri.org/")
        String username);

    /**
     * 
     * @param password
     * @param username
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod(operationName = "Login", action = "http://tempuri.org/IChatService/Login")
    @WebResult(name = "LoginResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Login", targetNamespace = "http://tempuri.org/", className = "org.tempuri.Login")
    @ResponseWrapper(localName = "LoginResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.LoginResponse")
    public Boolean login(
        @WebParam(name = "username", targetNamespace = "http://tempuri.org/")
        String username,
        @WebParam(name = "password", targetNamespace = "http://tempuri.org/")
        String password);

    /**
     * 
     * @param username
     * @return
     *     returns java.lang.Double
     */
    @WebMethod(operationName = "GetBalance", action = "http://tempuri.org/IChatService/GetBalance")
    @WebResult(name = "GetBalanceResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetBalance", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetBalance")
    @ResponseWrapper(localName = "GetBalanceResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetBalanceResponse")
    public Double getBalance(
        @WebParam(name = "username", targetNamespace = "http://tempuri.org/")
        String username);

    /**
     * 
     * @return
     *     returns org.datacontract.schemas._2004._07.practicum56library.ArrayOfProduct
     */
    @WebMethod(operationName = "GetAllProducts", action = "http://tempuri.org/IChatService/GetAllProducts")
    @WebResult(name = "GetAllProductsResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetAllProducts", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetAllProducts")
    @ResponseWrapper(localName = "GetAllProductsResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetAllProductsResponse")
    public ArrayOfProduct getAllProducts();

    /**
     * 
     * @param id
     * @return
     *     returns org.datacontract.schemas._2004._07.practicum56library.Product
     */
    @WebMethod(operationName = "GetProduct", action = "http://tempuri.org/IChatService/GetProduct")
    @WebResult(name = "GetProductResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetProduct", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetProduct")
    @ResponseWrapper(localName = "GetProductResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetProductResponse")
    public Product getProduct(
        @WebParam(name = "id", targetNamespace = "http://tempuri.org/")
        Integer id);

    /**
     * 
     * @param product
     * @return
     *     returns java.lang.Integer
     */
    @WebMethod(operationName = "GetProductStock", action = "http://tempuri.org/IChatService/GetProductStock")
    @WebResult(name = "GetProductStockResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetProductStock", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetProductStock")
    @ResponseWrapper(localName = "GetProductStockResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetProductStockResponse")
    public Integer getProductStock(
        @WebParam(name = "product", targetNamespace = "http://tempuri.org/")
        Product product);

    /**
     * 
     * @param username
     * @return
     *     returns org.datacontract.schemas._2004._07.practicum56library.ArrayOfProduct
     */
    @WebMethod(operationName = "GetAllBoughtProducts", action = "http://tempuri.org/IChatService/GetAllBoughtProducts")
    @WebResult(name = "GetAllBoughtProductsResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetAllBoughtProducts", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetAllBoughtProducts")
    @ResponseWrapper(localName = "GetAllBoughtProductsResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetAllBoughtProductsResponse")
    public ArrayOfProduct getAllBoughtProducts(
        @WebParam(name = "username", targetNamespace = "http://tempuri.org/")
        String username);

    /**
     * 
     * @param product
     * @param username
     */
    @WebMethod(operationName = "BuyProduct", action = "http://tempuri.org/IChatService/BuyProduct")
    @RequestWrapper(localName = "BuyProduct", targetNamespace = "http://tempuri.org/", className = "org.tempuri.BuyProduct")
    @ResponseWrapper(localName = "BuyProductResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.BuyProductResponse")
    public void buyProduct(
        @WebParam(name = "product", targetNamespace = "http://tempuri.org/")
        Product product,
        @WebParam(name = "username", targetNamespace = "http://tempuri.org/")
        String username);

}
