import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.round;

public class Zawodnik {
    String imie;
    String nazwisko;
    String dataUrodzenia;
    String zdjecie;
    int numer;
    static List<Zawodnik> listaZawodnikow= new ArrayList<>();
    public Zawodnik(String imie, String nazwisko, String dataUrodzenia, int numer, String zdjecie) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
        this.numer = numer;
        this.zdjecie=zdjecie;
        listaZawodnikow.add(this);
    }



}



