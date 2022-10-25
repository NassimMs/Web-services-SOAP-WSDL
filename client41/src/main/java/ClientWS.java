import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService stub = new BanqueWS().getBanqueServicePort();  // MiddleWare to communicate with the web service
        //System.out.println(stub.convert(777));  // Client that sends the request using the middleware
        Compte cp = stub.getCompte(3);
        System.out.println("Compte code : "+cp.getCode());
        System.out.println("Solde :"+cp.getSolde());
    }
}
