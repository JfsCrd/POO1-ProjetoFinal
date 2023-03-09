package Contrest;

import Interface.Login;
import java.util.ArrayList;
import java.util.List;

public class Contrest {

    public static Login login;
    public static List<Calca> ListaCalca;
    public static List<Camiseta> ListaCamiseta;
    public static List<Camiseta> ListaVendaCamiseta;
    public static List<Calca> ListaVendaCalca;
    
    public static void main(String[] args) {
        
       
        ListaCalca = new ArrayList<>();
        ListaCamiseta = new ArrayList<>();
        ListaVendaCamiseta = new ArrayList<>();
        ListaVendaCalca = new ArrayList<>();
        
        Login Login = new Login();
        Login.setVisible(true);
                      
    }
}
