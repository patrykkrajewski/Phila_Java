import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.round;

public class Zawodnik {
    String imie;
    String nazwisko;
    String dataUrodzenia;
    String zdjecie;
    int numer;
    int[] punkty = {};
    static List<Zawodnik> listaZawodnikow= new ArrayList<>();
    public Zawodnik(String imie, String nazwisko, String dataUrodzenia, int numer, String zdjecie, int[] punkty) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
        this.numer = numer;
        this.zdjecie=zdjecie;
        this.punkty = punkty;
        listaZawodnikow.add(this);
    }
    public Zawodnik(String imie, String nazwisko, String dataUrodzenia, int numer, String zdjecie) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
        this.numer = numer;
        this.zdjecie=zdjecie;
        this.punkty = punkty;
        listaZawodnikow.add(this);
    }
    public static void wiek(){

    }



}



