
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.practicum56library.ArrayOfProduct;
import org.datacontract.schemas._2004._07.practicum56library.Product;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
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

    private final static QName _GetAllBoughtProductsResponseGetAllBoughtProductsResult_QNAME = new QName("http://tempuri.org/", "GetAllBoughtProductsResult");
    private final static QName _GeneratePasswordUsername_QNAME = new QName("http://tempuri.org/", "username");
    private final static QName _CheckCredentialsPassword_QNAME = new QName("http://tempuri.org/", "password");
    private final static QName _GetProductStockProduct_QNAME = new QName("http://tempuri.org/", "product");
    private final static QName _GetAllProductsResponseGetAllProductsResult_QNAME = new QName("http://tempuri.org/", "GetAllProductsResult");
    private final static QName _RegisterCustomerResponseRegisterCustomerResult_QNAME = new QName("http://tempuri.org/", "RegisterCustomerResult");
    private final static QName _GetProductResponseGetProductResult_QNAME = new QName("http://tempuri.org/", "GetProductResult");
    private final static QName _GeneratePasswordResponseGeneratePasswordResult_QNAME = new QName("http://tempuri.org/", "GeneratePasswordResult");
    private final static QName _PostNoteNote_QNAME = new QName("http://tempuri.org/", "note");
    private final static QName _PostNoteFrom_QNAME = new QName("http://tempuri.org/", "from");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuyProduct }
     * 
     */
    public BuyProduct createBuyProduct() {
        return new BuyProduct();
    }

    /**
     * Create an instance of {@link GetProductStockResponse }
     * 
     */
    public GetProductStockResponse createGetProductStockResponse() {
        return new GetProductStockResponse();
    }

    /**
     * Create an instance of {@link FillDBResponse }
     * 
     */
    public FillDBResponse createFillDBResponse() {
        return new FillDBResponse();
    }

    /**
     * Create an instance of {@link GetAllBoughtProductsResponse }
     * 
     */
    public GetAllBoughtProductsResponse createGetAllBoughtProductsResponse() {
        return new GetAllBoughtProductsResponse();
    }

    /**
     * Create an instance of {@link FillDB }
     * 
     */
    public FillDB createFillDB() {
        return new FillDB();
    }

    /**
     * Create an instance of {@link GetAllBoughtProducts }
     * 
     */
    public GetAllBoughtProducts createGetAllBoughtProducts() {
        return new GetAllBoughtProducts();
    }

    /**
     * Create an instance of {@link RegisterCustomer }
     * 
     */
    public RegisterCustomer createRegisterCustomer() {
        return new RegisterCustomer();
    }

    /**
     * Create an instance of {@link GetBalance }
     * 
     */
    public GetBalance createGetBalance() {
        return new GetBalance();
    }

    /**
     * Create an instance of {@link GeneratePassword }
     * 
     */
    public GeneratePassword createGeneratePassword() {
        return new GeneratePassword();
    }

    /**
     * Create an instance of {@link CheckCredentialsResponse }
     * 
     */
    public CheckCredentialsResponse createCheckCredentialsResponse() {
        return new CheckCredentialsResponse();
    }

    /**
     * Create an instance of {@link IsUsernameAvailable }
     * 
     */
    public IsUsernameAvailable createIsUsernameAvailable() {
        return new IsUsernameAvailable();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link PostNote }
     * 
     */
    public PostNote createPostNote() {
        return new PostNote();
    }

    /**
     * Create an instance of {@link GetProductResponse }
     * 
     */
    public GetProductResponse createGetProductResponse() {
        return new GetProductResponse();
    }

    /**
     * Create an instance of {@link GetBalanceResponse }
     * 
     */
    public GetBalanceResponse createGetBalanceResponse() {
        return new GetBalanceResponse();
    }

    /**
     * Create an instance of {@link PostNoteResponse }
     * 
     */
    public PostNoteResponse createPostNoteResponse() {
        return new PostNoteResponse();
    }

    /**
     * Create an instance of {@link GetAllProductsResponse }
     * 
     */
    public GetAllProductsResponse createGetAllProductsResponse() {
        return new GetAllProductsResponse();
    }

    /**
     * Create an instance of {@link GetProductStock }
     * 
     */
    public GetProductStock createGetProductStock() {
        return new GetProductStock();
    }

    /**
     * Create an instance of {@link GetAllProducts }
     * 
     */
    public GetAllProducts createGetAllProducts() {
        return new GetAllProducts();
    }

    /**
     * Create an instance of {@link CheckCredentials }
     * 
     */
    public CheckCredentials createCheckCredentials() {
        return new CheckCredentials();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link IsUsernameAvailableResponse }
     * 
     */
    public IsUsernameAvailableResponse createIsUsernameAvailableResponse() {
        return new IsUsernameAvailableResponse();
    }

    /**
     * Create an instance of {@link BuyProductResponse }
     * 
     */
    public BuyProductResponse createBuyProductResponse() {
        return new BuyProductResponse();
    }

    /**
     * Create an instance of {@link GeneratePasswordResponse }
     * 
     */
    public GeneratePasswordResponse createGeneratePasswordResponse() {
        return new GeneratePasswordResponse();
    }

    /**
     * Create an instance of {@link RegisterCustomerResponse }
     * 
     */
    public RegisterCustomerResponse createRegisterCustomerResponse() {
        return new RegisterCustomerResponse();
    }

    /**
     * Create an instance of {@link GetProduct }
     * 
     */
    public GetProduct createGetProduct() {
        return new GetProduct();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetAllBoughtProductsResult", scope = GetAllBoughtProductsResponse.class)
    public JAXBElement<ArrayOfProduct> createGetAllBoughtProductsResponseGetAllBoughtProductsResult(ArrayOfProduct value) {
        return new JAXBElement<ArrayOfProduct>(_GetAllBoughtProductsResponseGetAllBoughtProductsResult_QNAME, ArrayOfProduct.class, GetAllBoughtProductsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "username", scope = GeneratePassword.class)
    public JAXBElement<String> createGeneratePasswordUsername(String value) {
        return new JAXBElement<String>(_GeneratePasswordUsername_QNAME, String.class, GeneratePassword.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "username", scope = IsUsernameAvailable.class)
    public JAXBElement<String> createIsUsernameAvailableUsername(String value) {
        return new JAXBElement<String>(_GeneratePasswordUsername_QNAME, String.class, IsUsernameAvailable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "password", scope = CheckCredentials.class)
    public JAXBElement<String> createCheckCredentialsPassword(String value) {
        return new JAXBElement<String>(_CheckCredentialsPassword_QNAME, String.class, CheckCredentials.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "username", scope = CheckCredentials.class)
    public JAXBElement<String> createCheckCredentialsUsername(String value) {
        return new JAXBElement<String>(_GeneratePasswordUsername_QNAME, String.class, CheckCredentials.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "password", scope = Login.class)
    public JAXBElement<String> createLoginPassword(String value) {
        return new JAXBElement<String>(_CheckCredentialsPassword_QNAME, String.class, Login.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "username", scope = Login.class)
    public JAXBElement<String> createLoginUsername(String value) {
        return new JAXBElement<String>(_GeneratePasswordUsername_QNAME, String.class, Login.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Product }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "product", scope = GetProductStock.class)
    public JAXBElement<Product> createGetProductStockProduct(Product value) {
        return new JAXBElement<Product>(_GetProductStockProduct_QNAME, Product.class, GetProductStock.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetAllProductsResult", scope = GetAllProductsResponse.class)
    public JAXBElement<ArrayOfProduct> createGetAllProductsResponseGetAllProductsResult(ArrayOfProduct value) {
        return new JAXBElement<ArrayOfProduct>(_GetAllProductsResponseGetAllProductsResult_QNAME, ArrayOfProduct.class, GetAllProductsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "username", scope = RegisterCustomer.class)
    public JAXBElement<String> createRegisterCustomerUsername(String value) {
        return new JAXBElement<String>(_GeneratePasswordUsername_QNAME, String.class, RegisterCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "username", scope = GetAllBoughtProducts.class)
    public JAXBElement<String> createGetAllBoughtProductsUsername(String value) {
        return new JAXBElement<String>(_GeneratePasswordUsername_QNAME, String.class, GetAllBoughtProducts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RegisterCustomerResult", scope = RegisterCustomerResponse.class)
    public JAXBElement<String> createRegisterCustomerResponseRegisterCustomerResult(String value) {
        return new JAXBElement<String>(_RegisterCustomerResponseRegisterCustomerResult_QNAME, String.class, RegisterCustomerResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Product }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "product", scope = BuyProduct.class)
    public JAXBElement<Product> createBuyProductProduct(Product value) {
        return new JAXBElement<Product>(_GetProductStockProduct_QNAME, Product.class, BuyProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "username", scope = BuyProduct.class)
    public JAXBElement<String> createBuyProductUsername(String value) {
        return new JAXBElement<String>(_GeneratePasswordUsername_QNAME, String.class, BuyProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Product }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetProductResult", scope = GetProductResponse.class)
    public JAXBElement<Product> createGetProductResponseGetProductResult(Product value) {
        return new JAXBElement<Product>(_GetProductResponseGetProductResult_QNAME, Product.class, GetProductResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GeneratePasswordResult", scope = GeneratePasswordResponse.class)
    public JAXBElement<String> createGeneratePasswordResponseGeneratePasswordResult(String value) {
        return new JAXBElement<String>(_GeneratePasswordResponseGeneratePasswordResult_QNAME, String.class, GeneratePasswordResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "username", scope = GetBalance.class)
    public JAXBElement<String> createGetBalanceUsername(String value) {
        return new JAXBElement<String>(_GeneratePasswordUsername_QNAME, String.class, GetBalance.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "note", scope = PostNote.class)
    public JAXBElement<String> createPostNoteNote(String value) {
        return new JAXBElement<String>(_PostNoteNote_QNAME, String.class, PostNote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "from", scope = PostNote.class)
    public JAXBElement<String> createPostNoteFrom(String value) {
        return new JAXBElement<String>(_PostNoteFrom_QNAME, String.class, PostNote.class, value);
    }

}
