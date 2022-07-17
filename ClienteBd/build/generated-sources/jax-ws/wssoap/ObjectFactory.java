
package wssoap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wssoap package. 
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

    private final static QName _BuscarResponse_QNAME = new QName("http://WSSoap/", "buscarResponse");
    private final static QName _ModificaResponse_QNAME = new QName("http://WSSoap/", "modificaResponse");
    private final static QName _Altas_QNAME = new QName("http://WSSoap/", "altas");
    private final static QName _Buscar_QNAME = new QName("http://WSSoap/", "buscar");
    private final static QName _AltasResponse_QNAME = new QName("http://WSSoap/", "altasResponse");
    private final static QName _BajaResponse_QNAME = new QName("http://WSSoap/", "bajaResponse");
    private final static QName _HelloResponse_QNAME = new QName("http://WSSoap/", "helloResponse");
    private final static QName _Baja_QNAME = new QName("http://WSSoap/", "baja");
    private final static QName _Modifica_QNAME = new QName("http://WSSoap/", "modifica");
    private final static QName _Hello_QNAME = new QName("http://WSSoap/", "hello");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wssoap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Altas }
     * 
     */
    public Altas createAltas() {
        return new Altas();
    }

    /**
     * Create an instance of {@link BuscarResponse }
     * 
     */
    public BuscarResponse createBuscarResponse() {
        return new BuscarResponse();
    }

    /**
     * Create an instance of {@link ModificaResponse }
     * 
     */
    public ModificaResponse createModificaResponse() {
        return new ModificaResponse();
    }

    /**
     * Create an instance of {@link Buscar }
     * 
     */
    public Buscar createBuscar() {
        return new Buscar();
    }

    /**
     * Create an instance of {@link BajaResponse }
     * 
     */
    public BajaResponse createBajaResponse() {
        return new BajaResponse();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link AltasResponse }
     * 
     */
    public AltasResponse createAltasResponse() {
        return new AltasResponse();
    }

    /**
     * Create an instance of {@link Baja }
     * 
     */
    public Baja createBaja() {
        return new Baja();
    }

    /**
     * Create an instance of {@link Modifica }
     * 
     */
    public Modifica createModifica() {
        return new Modifica();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSSoap/", name = "buscarResponse")
    public JAXBElement<BuscarResponse> createBuscarResponse(BuscarResponse value) {
        return new JAXBElement<BuscarResponse>(_BuscarResponse_QNAME, BuscarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSSoap/", name = "modificaResponse")
    public JAXBElement<ModificaResponse> createModificaResponse(ModificaResponse value) {
        return new JAXBElement<ModificaResponse>(_ModificaResponse_QNAME, ModificaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Altas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSSoap/", name = "altas")
    public JAXBElement<Altas> createAltas(Altas value) {
        return new JAXBElement<Altas>(_Altas_QNAME, Altas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Buscar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSSoap/", name = "buscar")
    public JAXBElement<Buscar> createBuscar(Buscar value) {
        return new JAXBElement<Buscar>(_Buscar_QNAME, Buscar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSSoap/", name = "altasResponse")
    public JAXBElement<AltasResponse> createAltasResponse(AltasResponse value) {
        return new JAXBElement<AltasResponse>(_AltasResponse_QNAME, AltasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BajaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSSoap/", name = "bajaResponse")
    public JAXBElement<BajaResponse> createBajaResponse(BajaResponse value) {
        return new JAXBElement<BajaResponse>(_BajaResponse_QNAME, BajaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSSoap/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Baja }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSSoap/", name = "baja")
    public JAXBElement<Baja> createBaja(Baja value) {
        return new JAXBElement<Baja>(_Baja_QNAME, Baja.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Modifica }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSSoap/", name = "modifica")
    public JAXBElement<Modifica> createModifica(Modifica value) {
        return new JAXBElement<Modifica>(_Modifica_QNAME, Modifica.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSSoap/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

}
