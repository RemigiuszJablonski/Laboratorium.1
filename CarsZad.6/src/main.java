import java.util.*;
public class main {
    public static void main(String[] args) {
car car1 = new car("Mercedes", "W211", "DOA75653");
car car2 = new car("BMW", "E90", "DW35954");
car car3 = new car("Audi", "A8", "DOP34329");
car car4 = new car("Ferrari", "F1", "DOA75653");
car car5 = new car("Renault", "Kangoo", "DOA75653");
car car6 = new car("Fiat", "Punto", "DW35954");
car car7 = new car("Kia", "Sportage", "DP25893");

//tworze hashset i dodaje do niego samochodody
      Set<car> carSet =   new HashSet<>();
        carSet.add(car1);
        carSet.add(car2);
        carSet.add(car3);
        carSet.add(car4);
        carSet.add(car5);
        carSet.add(car6);
        carSet.add(car7);

      //wyswietlenie hashset
        System.out.println("HashSet");
        for(car car : carSet){
            System.out.println(car);
        }
        System.out.println("Mozna zaobserwowac na podstawie danych podanych i tych wypisanych za pomoca hashset, ze wszystkie modele aut dla ktorych powtarza sie rejestracja\n zostaly usuniete, dzieje sie tak dlatego ze dla hasha jest to te samo auto. Zostaje wypisane te auto, ktore zostalo podane jako pierwsze.");
    }
}
