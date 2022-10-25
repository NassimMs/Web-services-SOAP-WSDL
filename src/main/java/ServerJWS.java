import jakarta.xml.ws.Endpoint;
import ws.BanqueService;

public class ServerJWS {

    // Creating our Server instead of TomCat
    public static void main(String[] args) {
        // Start a http server in the port 9191 for the specified Web Service
        Endpoint.publish("http://0.0.0.0:9191/",new BanqueService());
        System.out.println("Web service déployé sur http://0.0.0.0:9191/");

        //  ** What is the WSDL ? **
        // It is a XML file that describes of the Web Service Interface


        // Part 3 : Testing We Will use SOAP UI and the WSDL
           // Testing Convert Method
                // Request 1 Input : 777
                // Response : 8189.5799999999

           // Testing getCompte
            // Request 1 Input : 3
            // Response : <solde>2650.4572093793518</solde>

        // Check captures for more details ...

        // JaxBinding
        // JaxB is a library that maps java objects to xml



    }
}
