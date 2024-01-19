import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Main {




    public static void main(String[] args) {
        new Zawodnik("Tyrese","Maxey","11/4/2000", 0, "playerImage/maxey.png", new int[]{5, 6});
        new Zawodnik("Joel","Embiid","3/16/1994", 21, "playerImage/embiid.png");
        new Zawodnik("De'anthony","Melton","5/28/1998", 8,"playerImage/melton.png");
        new Zawodnik("Mo","Bamba","12/5/1998", 7,"playerImage/bamba.png");
        new Zawodnik("Nicolas","Batum","12/5/1998", 40,"playerImage/batum.png");
        new Zawodnik("Robert","Covington","12/5/1998", 33,"playerImage/covington.png");
        new Zawodnik("Tobias","Harris","12/5/1998", 12,"playerImage/harris.png");
        new Zawodnik("Danuel","House Jr.","12/5/1998", 25,"playerImage/house.png");
        new Zawodnik("Furkan","Korkmaz","12/5/1998", 30,"playerImage/korkmaz.png");
        new Zawodnik("KJ","Martin","12/5/1998", 1,"playerImage/martin.png");
        new Zawodnik("Marcus","Morris Sr.","12/5/1998", 22,"playerImage/morris.png");
        new Zawodnik("Kelly","Oubre Jr.","12/5/1998", 9,"playerImage/oubre.png");
        new Zawodnik("Paul","Reed","12/5/1998", 44,"playerImage/reed.png");
        new Zawodnik("Jaden","Springer","12/5/1998", 11,"playerImage/springer.png");

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

        new StatystykiZawodnika("Bamba", 18, 3, 10, 90);
        new StatystykiZawodnika("Bamba", 22, 5, 12, 88);
        new StatystykiZawodnika("Bamba", 20, 4, 11, 89);
        new StatystykiZawodnika("Bamba", 16, 2, 9, 91);
        new StatystykiZawodnika("Bamba", 19, 3, 10, 87);

        new StatystykiZawodnika("Batum", 20, 3, 10, 90);
        new StatystykiZawodnika("Batum", 17, 9, 2, 78);
        new StatystykiZawodnika("Batum", 9, 3, 3, 59);
        new StatystykiZawodnika("Batum", 0, 0, 0, 0);
        new StatystykiZawodnika("Batum", 0, 0, 0, 0);

        new StatystykiZawodnika("Beverley", 24, 13, 10, 50);
        new StatystykiZawodnika("Beverley", 11, 9, 1, 78);
        new StatystykiZawodnika("Beverley", 4, 7, 3, 11);
        new StatystykiZawodnika("Beverley", 3, 2, 1, 15);
        new StatystykiZawodnika("Beverley", 2, 5, 2, 26);

        new StatystykiZawodnika("Covington", 0, 0, 0, 0);
        new StatystykiZawodnika("Covington", 0, 0, 0, 0);
        new StatystykiZawodnika("Covington", 10, 1, 1, 89);
        new StatystykiZawodnika("Covington", 6, 0, 9, 91);
        new StatystykiZawodnika("Covington", 5, 2, 10, 87);

        new StatystykiZawodnika("Harris", 19, 5, 3, 80);
        new StatystykiZawodnika("Harris", 25, 3, 10, 78);
        new StatystykiZawodnika("Harris", 12, 7, 9, 39);
        new StatystykiZawodnika("Harris", 22, 10, 5, 61);
        new StatystykiZawodnika("Harris", 35, 11, 8, 62);

        new StatystykiZawodnika("House Jr.", 3, 0, 0, 30);
        new StatystykiZawodnika("House Jr.", 2, 0, 2, 68);
        new StatystykiZawodnika("House Jr.", 10, 0, 1, 79);
        new StatystykiZawodnika("House Jr.", 3, 2, 3, 90);
        new StatystykiZawodnika("House Jr.", 0, 1, 2, 0);

        new StatystykiZawodnika("Korkmaz", 0, 0, 0, 0);
        new StatystykiZawodnika("Korkmaz", 0, 0, 0, 0);
        new StatystykiZawodnika("Korkmaz", 0, 0, 0, 0);
        new StatystykiZawodnika("Korkmaz", 0, 0, 0, 0);
        new StatystykiZawodnika("Korkmaz", 13, 1, 0, 67);

        new StatystykiZawodnika("KJ Martin", 8, 0, 4, 90);
        new StatystykiZawodnika("KJ Martin", 2, 0, 0, 100);
        new StatystykiZawodnika("KJ Martin", 0, 0, 0, 0);
        new StatystykiZawodnika("KJ Martin", 1, 1, 1, 50);
        new StatystykiZawodnika("KJ Martin", 1, 1, 3, 17);

        new StatystykiZawodnika("Marcus Morris Sr.", 18, 2, 5, 40);
        new StatystykiZawodnika("Marcus Morris Sr.", 12, 5, 0, 78);
        new StatystykiZawodnika("Marcus Morris Sr.", 10, 4, 1, 59);
        new StatystykiZawodnika("Marcus Morris Sr.", 6, 2, 3, 31);
        new StatystykiZawodnika("Marcus Morris Sr.", 9, 0, 2, 27);

        new StatystykiZawodnika("Kelly Oubre Jr.", 18, 0, 4, 24);
        new StatystykiZawodnika("Kelly Oubre Jr.", 22, 0, 5, 83);
        new StatystykiZawodnika("Kelly Oubre Jr.", 20, 1, 1, 100);
        new StatystykiZawodnika("Kelly Oubre Jr.", 16, 1, 9, 91);
        new StatystykiZawodnika("Kelly Oubre Jr.", 19, 0, 2, 67);

        new StatystykiZawodnika("Paul Reed", 8, 0, 1, 90);
        new StatystykiZawodnika("Paul Reed", 2, 4, 3, 88);
        new StatystykiZawodnika("Paul Reed", 0, 1, 11, 89);
        new StatystykiZawodnika("Paul Reed", 6, 2, 8, 91);
        new StatystykiZawodnika("Paul Reed", 9, 0, 5, 87);

        new StatystykiZawodnika("Jaden Springer", 3, 3, 2, 70);
        new StatystykiZawodnika("Jaden Springer", 0, 1, 1, 28);
        new StatystykiZawodnika("Jaden Springer", 10, 2, 1, 89);
        new StatystykiZawodnika("Jaden Springer", 5, 0, 4, 31);
        new StatystykiZawodnika("Jaden Springer", 1, 0, 3, 57);



        //Player

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ZawodnikUklad.main();

            }
        });

    }
}