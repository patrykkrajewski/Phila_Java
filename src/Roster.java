//Generated by GuiGenie - Copyright (c) 2004 Mario Awad.
//Home Page http://guigenie.cjb.net - Check often for new versions!

import java.awt.*;
import javax.swing.*;

public class Roster extends JPanel {
    private JButton naziwso;
    private JButton zdjecie;
    private JButton imie;
    private JButton butt_pop;
    private JButton but_nas;
    private JButton ppg;
    private JButton ppg_n;
    private JButton apg;
    private JButton apg_n;
    private JButton rpg;
    private JButton rpg_n;
    private JButton numer;
    private JButton fg;
    private JButton fg_n;
    private JButton but_tab;
    private JButton but_mecz;
    private JButton but_ros;
    private JButton but_sta;
    private JButton but_apl;
    private JList jcomp20;

    public Roster() {
        //construct preComponents
        String[] jcomp20Items = {"Item 1", "Item 2", "Item 3"};

        //construct components
        naziwso = new JButton ("Embiid");
        zdjecie = new JButton ("img");
        imie = new JButton ("Jole");
        butt_pop = new JButton ("Poprzedni");
        but_nas = new JButton ("Następny");
        ppg = new JButton ("PPG");
        ppg_n = new JButton ("11.3");
        apg = new JButton ("APG");
        apg_n = new JButton ("4.2");
        rpg = new JButton ("RPG");
        rpg_n = new JButton ("6.8");
        numer = new JButton ("#21");
        fg = new JButton ("FG%");
        fg_n = new JButton ("80%");
        but_tab = new JButton ("Tabela");
        but_mecz = new JButton ("Mecze");
        but_ros = new JButton ("Roster");
        but_sta = new JButton ("Statystyki");
        but_apl = new JButton ("O aplikacji");
        jcomp20 = new JList (jcomp20Items);

        //adjust size and set layout
        setPreferredSize (new Dimension (564, 842));
        setLayout (null);

        //add components
        add (naziwso);
        add (zdjecie);
        add (imie);
        add (butt_pop);
        add (but_nas);
        add (ppg);
        add (ppg_n);
        add (apg);
        add (apg_n);
        add (rpg);
        add (rpg_n);
        add (numer);
        add (fg);
        add (fg_n);
        add (but_tab);
        add (but_mecz);
        add (but_ros);
        add (but_sta);
        add (but_apl);
        add (jcomp20);

        //set component bounds (only needed by Absolute Positioning)
        naziwso.setBounds (30, 185, 210, 60);
        zdjecie.setBounds (345, 30, 200, 215);
        imie.setBounds (30, 120, 210, 60);
        butt_pop.setBounds (185, 725, 100, 25);
        but_nas.setBounds (320, 725, 100, 25);
        ppg.setBounds (50, 255, 60, 50);
        ppg_n.setBounds (110, 255, 60, 50);
        apg.setBounds (170, 255, 60, 50);
        apg_n.setBounds (230, 255, 60, 50);
        rpg.setBounds (290, 255, 60, 50);
        rpg_n.setBounds (350, 255, 60, 50);
        numer.setBounds (240, 185, 85, 60);
        fg.setBounds (410, 255, 60, 50);
        fg_n.setBounds (470, 255, 60, 50);
        but_tab.setBounds (250, 780, 100, 50);
        but_mecz.setBounds (150, 780, 100, 50);
        but_ros.setBounds (50, 780, 100, 50);
        but_sta.setBounds (350, 780, 100, 50);
        but_apl.setBounds (450, 780, 100, 50);
        jcomp20.setBounds (50, 310, 480, 390);
    }



}
