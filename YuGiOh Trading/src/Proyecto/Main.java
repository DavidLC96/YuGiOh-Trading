package Proyecto;

public class Main {

    public static void main(String[] args) {
      String respuesta = ClienteRest.request("https://www.ygohub.com/api/all_cards");
      System.out.println(respuesta);
    }
    
}
