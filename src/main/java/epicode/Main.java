package epicode;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Product p1 = new Product(1L,"Il piccolo principe","Books",120.0);
        Product p2 = new Product(2L,"Il signore delle mosche","Books",80.0);
        Product p3 = new Product(3L,"Il profumo","Books",20.0);
        Product p4 = new Product(4L,"Ciuccio","Baby",10.0);
        Product p5 = new Product(5L,"Pistola giocattolo","Boys",30.0);

        Customer c1 = new Customer(1L, "Pippo",4);
        Customer c2 = new Customer(2L, "Paperino",3);
        Customer c3 = new Customer(3L, "Pluto",2);
        Customer c4 = new Customer(4L, "Topolino",5);
        Customer c5 = new Customer(5L, "Topolina",1);

        Order o1 = new Order(1L, "In preparazione", LocalDate.now(), LocalDate.now().plusDays(3), List.of(p1,p2), c1);
        Order o2 = new Order(2L, "In consegna", LocalDate.now(), LocalDate.now().plusDays(1), List.of(p4,p5), c2);
        Order o3 = new Order(3L, "In consegna", LocalDate.now(), LocalDate.now().plusDays(2), List.of(p1,p3), c3);

        System.out.println(o1.toString());
    }
}