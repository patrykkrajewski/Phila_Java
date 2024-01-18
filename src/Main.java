import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Main {




    public static void main(String[] args) {

        new Zawodnik("Tyrese","Maxey","11/4/2000", 0, "playerImage/maxey.png");
        new Zawodnik("Joel","Embiid","3/16/1994", 21, "playerImage/embiid.png");
        new Zawodnik("De'anthony","Melton","5/28/1998", 8,"playerImage/melton.png");

        new Mecz("Minnesota Timberwolves", 113,145,"21/12/2023","teamImage/minnesota.png");
        new Mecz("Blazers", 113,144,"21/12/2023","teamImage/blazers.png");
        new Mecz("Suns", 120, 113, "21/12/2023", "teamImage/suns.png");
        new Mecz("Celtics", 105, 162, "21/12/2023", "teamImage/boston.png");
        new Mecz("Warriors", 118, 101, "21/12/2023", "teamImage/warriors.png");

        new StatystykiZawodnika("Maxey", 22,6,3,49);
        new StatystykiZawodnika("Maxey", 23,16,13,74);
        new StatystykiZawodnika("Maxey", 18,3,10,90);
        new StatystykiZawodnika("Maxey", 50,1,5,81);
        new StatystykiZawodnika("Maxey", 38,11,2,70);

        new StatystykiZawodnika("Embiid", 46,3,9,88);
        new StatystykiZawodnika("Embiid", 70,2,13,45);
        new StatystykiZawodnika("Embiid", 11,11,11,99);
        new StatystykiZawodnika("Embiid", 23,5,22,32);
        new StatystykiZawodnika("Embiid", 44,1,12,88);

        new StatystykiZawodnika("Melton", 11,3,4,22);
        new StatystykiZawodnika("Melton", 6,11,7,40);
        new StatystykiZawodnika("Melton", 9,4,1,70);
        new StatystykiZawodnika("Melton", 19,7,6,90);
        new StatystykiZawodnika("Melton", 3,2,8,19);

        //Player

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ZawodnikUklad.main();
            }
        });

    }
}