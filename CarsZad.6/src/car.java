import java.util.*;
public class car {
    private String carBrand;
    private String carModel;
    private String carRegNumber;

    // tworze konstruktor
    public car(String carBrand, String carModel, String carRegNumber) {
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.carRegNumber = carRegNumber;
    }

    //porownanie numerow rejestracyjnych jesli sa rowne 0 zwraca prawde a jesli sa z innych klas zwraca 0
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; //sprawdzenie czy to ten sam objekt
        if (obj == null || getClass() != obj.getClass()) return false;
        car car = (car) obj;
        return Objects.equals(carRegNumber, car.carRegNumber);
    }

    // metoda HashCode
    @Override
    public int hashCode() {
        return Objects.hash(carRegNumber);
    }

    //wyswietlenie wynikow w konsoli
    @Override
    public String toString() {
        return "Car   " +
                "brand = '" + carBrand +
                ", model = '" + carModel +
                ", registrationNumber ='" + carRegNumber ;
    }
}
