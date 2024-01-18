import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Mecz {
    String team;
    int enemyPoints;
    int philaPoints;
    String date;
    String image;
    String godzina;
    static List<Mecz> listaMeczy = new ArrayList<>();

    public Mecz(String team, int enemyPoints, int philaPoints, String date, String image) {
        this.team = team;
        this.image=image;
        this.enemyPoints = enemyPoints;
        this.philaPoints = philaPoints;
        this.date = date;
        listaMeczy.add(this);
    }
    public static int ustawKolor(int i) {
        if (Mecz.listaMeczy.get(Mecz.listaMeczy.size()-i).enemyPoints>Mecz.listaMeczy.get(Mecz.listaMeczy.size()-i).philaPoints)
            return 1;
        else return 2;
    }
}
