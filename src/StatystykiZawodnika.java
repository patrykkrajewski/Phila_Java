import java.util.ArrayList;
import java.util.List;

public class StatystykiZawodnika{
int pts=0;
int ast=0;
int reb=0;
int fg=0;
String nazwisko;
static List<StatystykiZawodnika> listaMaxey = new ArrayList<>();
static List<StatystykiZawodnika> listaEmbiid = new ArrayList<>();
static List<StatystykiZawodnika> listaMelton = new ArrayList<>();
static List<StatystykiZawodnika> listaBamba = new ArrayList<>();
static List<StatystykiZawodnika> listaBatum = new ArrayList<>();
static List<StatystykiZawodnika> listaCovington = new ArrayList<>();
static List<StatystykiZawodnika> listaHarris = new ArrayList<>();
static List<StatystykiZawodnika> listaHouse = new ArrayList<>();
static List<StatystykiZawodnika> listaKorkmaz = new ArrayList<>();
static List<StatystykiZawodnika> listaMartin = new ArrayList<>();
static List<StatystykiZawodnika> listaMorris = new ArrayList<>();
static List<StatystykiZawodnika> listaOubre = new ArrayList<>();
static List<StatystykiZawodnika> listaReed = new ArrayList<>();
static List<StatystykiZawodnika> listaSpringer = new ArrayList<>();
static List<StatystykiZawodnika> listaBeverley = new ArrayList<>();

    public StatystykiZawodnika( String nazwisko,int pts, int ast, int reb, int fg) {
        this.nazwisko = nazwisko;
        this.pts = pts;
        this.ast = ast;
        this.reb = reb;
        this.fg = fg;
        if (nazwisko=="Maxey")
            listaMaxey.add(this);
        if (nazwisko=="Embiid")
            listaEmbiid.add(this);
        if (nazwisko=="Melton")
            listaMelton.add(this);
        if (nazwisko.equals("Bamba"))
            listaBamba.add(this);

        if (nazwisko.equals("Batum"))
            listaBatum.add(this);
        if (nazwisko.equals("Beverley"))
            listaBeverley.add(this);
        if (nazwisko.equals("Covington"))
            listaCovington.add(this);

        if (nazwisko.equals("Harris"))
            listaHarris.add(this);

        if (nazwisko.equals("House Jr."))
            listaHouse.add(this);

        if (nazwisko.equals("Korkmaz"))
            listaKorkmaz.add(this);

        if (nazwisko.equals("KJ Martin"))
            listaMartin.add(this);

        if (nazwisko.equals("Marcus Morris Sr."))
            listaMorris.add(this);

        if (nazwisko.equals("Kelly Oubre Jr."))
            listaOubre.add(this);

        if (nazwisko.equals("Paul Reed"))
            listaReed.add(this);

        if (nazwisko.equals("Jaden Springer"))
            listaSpringer.add(this);

    }
    public static double statystykiPTS(int a) {
        switch (a){
            case 0:
                double s_PTS = 0;
                for (int i=0; i<= listaMaxey.size()-1;i++){
                s_PTS = s_PTS + listaMaxey.get(i).pts;}
                double PTS = (s_PTS)/((listaMaxey.size()));
                return PTS;
            case 1:
                double E_PTS = 0;
                for (int i=0; i<= listaEmbiid.size()-1;i++){
                    E_PTS = E_PTS + listaEmbiid.get(i).pts;}
                double ePTS = (E_PTS)/((listaEmbiid.size()));
                return ePTS;
            case 2:
                double M_PTS = 0;
                for (int i=0; i<= listaMelton.size()-1;i++){
                    M_PTS = M_PTS + listaMelton.get(i).pts;}
                double mPTS = (M_PTS)/((listaMelton.size()));
                return mPTS;
            case 3:
                double X_PTS = 0;
                for (int i=0; i<= listaBamba.size()-1;i++){
                    X_PTS = X_PTS + listaBamba.get(i).pts;}
                double xPTS = (X_PTS)/((listaBamba.size()));
                return xPTS;
            case 4:
                double r_PTS = 0;
                for (int i=0; i<= listaBatum.size()-1;i++){
                    r_PTS = r_PTS + listaBatum.get(i).pts;}
                double rPTS = (r_PTS)/((listaBatum.size()));
                return rPTS;
            case 5:
                double y_PTS = 0;
                for (int i=0; i<= listaBeverley.size()-1;i++){
                    y_PTS = y_PTS + listaBeverley.get(i).pts;}
                double yPTS = (y_PTS)/((listaBeverley.size()));
                return yPTS;
            case 6:
                double l_PTS = 0;
                for (int i=0; i<= listaCovington.size()-1;i++){
                    l_PTS = l_PTS + listaCovington.get(i).pts;}
                double lPTS = (l_PTS)/((listaCovington.size()));
                return lPTS;
            case 7:
                double v_PTS = 0;
                for (int i=0; i<= listaHarris.size()-1;i++){
                    v_PTS = v_PTS + listaHarris.get(i).pts;}
                double vPTS = (v_PTS)/((listaHarris.size()));
                return vPTS;
            case 8:
                double V_PTS = 0;
                for (int i=0; i<= listaHouse.size()-1;i++){
                    V_PTS = V_PTS + listaHouse.get(i).pts;}
                double VPTS = (V_PTS)/((listaHouse.size()));
                return VPTS;
            case 9:
                double T_PTS = 0;
                for (int i=0; i<= listaKorkmaz.size()-1;i++){
                    T_PTS = T_PTS + listaKorkmaz.get(i).pts;}
                double TPTS = (T_PTS)/((listaKorkmaz.size()));
                return TPTS;
            case 10:
                double D_PTS = 0;
                for (int i=0; i<= listaMartin.size()-1;i++){
                    D_PTS =D_PTS + listaMartin.get(i).pts;}
                double DPTS = (D_PTS)/((listaMartin.size()));
                return DPTS;
            case 11:
                double f_PTS = 0;
                for (int i=0; i<= listaMorris.size()-1;i++){
                    f_PTS =f_PTS + listaMorris.get(i).pts;}
                double fPTS = (f_PTS)/((listaMorris.size()));
                return fPTS;
            case 12:
                double q_PTS = 0;
                for (int i=0; i<= listaOubre.size()-1;i++){
                    q_PTS =q_PTS + listaOubre.get(i).pts;}
                double qPTS = (q_PTS)/((listaOubre.size()));
                return qPTS;
            case 13:
                double a_PTS = 0;
                for (int i=0; i<= listaReed.size()-1;i++){
                    a_PTS =a_PTS + listaReed.get(i).pts;}
                double aPTS = (a_PTS)/((listaReed.size()));
                return aPTS;
            case 14:
                double b_PTS = 0;
                for (int i=0; i<= listaSpringer.size()-1;i++){
                    b_PTS =b_PTS + listaSpringer.get(i).pts;}
                double bPTS = (b_PTS)/((listaSpringer.size()));
                return bPTS;




            default:
                return 0;
        }

    }
    public static double statystykiREB(int a) {
        switch (a){
            case 0:
                double s_PTS = 0;
                for (int i=0; i<= listaMaxey.size()-1;i++){
                    s_PTS = s_PTS + listaMaxey.get(i).reb;}
                double PTS = (s_PTS)/((listaMaxey.size()));
                return PTS;
            case 1:
                double E_PTS = 0;
                for (int i=0; i<= listaEmbiid.size()-1;i++){
                    E_PTS = E_PTS + listaEmbiid.get(i).reb;}
                double ePTS = (E_PTS)/((listaEmbiid.size()));
                return ePTS;
            case 2:
                double M_PTS = 0;
                for (int i=0; i<= listaMelton.size()-1;i++){
                    M_PTS = M_PTS + listaMelton.get(i).reb;}
                double mPTS = (M_PTS)/((listaMelton.size()));
                return mPTS;
            case 3:
                double X_PTS = 0;
                for (int i=0; i<= listaBamba.size()-1;i++){
                    X_PTS = X_PTS + listaBamba.get(i).reb;}
                double xPTS = (X_PTS)/((listaBamba.size()));
                return xPTS;
            case 4:
                double r_PTS = 0;
                for (int i=0; i<= listaBatum.size()-1;i++){
                    r_PTS = r_PTS + listaBatum.get(i).reb;}
                double rPTS = (r_PTS)/((listaBatum.size()));
                return rPTS;
            case 5:
                double y_PTS = 0;
                for (int i=0; i<= listaBeverley.size()-1;i++){
                    y_PTS = y_PTS + listaBeverley.get(i).reb;}
                double yPTS = (y_PTS)/((listaBeverley.size()));
                return yPTS;
            case 6:
                double l_PTS = 0;
                for (int i=0; i<= listaCovington.size()-1;i++){
                    l_PTS = l_PTS + listaCovington.get(i).reb;}
                double lPTS = (l_PTS)/((listaCovington.size()));
                return lPTS;
            case 7:
                double v_PTS = 0;
                for (int i=0; i<= listaHarris.size()-1;i++){
                    v_PTS = v_PTS + listaHarris.get(i).reb;}
                double vPTS = (v_PTS)/((listaHarris.size()));
                return vPTS;
            case 8:
                double V_PTS = 0;
                for (int i=0; i<= listaHouse.size()-1;i++){
                    V_PTS = V_PTS + listaHouse.get(i).reb;}
                double VPTS = (V_PTS)/((listaHouse.size()));
                return VPTS;
            case 9:
                double T_PTS = 0;
                for (int i=0; i<= listaKorkmaz.size()-1;i++){
                    T_PTS = T_PTS + listaKorkmaz.get(i).reb;}
                double TPTS = (T_PTS)/((listaKorkmaz.size()));
                return TPTS;
            case 10:
                double D_PTS = 0;
                for (int i=0; i<= listaMartin.size()-1;i++){
                    D_PTS =D_PTS + listaMartin.get(i).reb;}
                double DPTS = (D_PTS)/((listaMartin.size()));
                return DPTS;
            case 11:
                double f_PTS = 0;
                for (int i=0; i<= listaMorris.size()-1;i++){
                    f_PTS =f_PTS + listaMorris.get(i).reb;}
                double fPTS = (f_PTS)/((listaMorris.size()));
                return fPTS;
            case 12:
                double q_PTS = 0;
                for (int i=0; i<= listaOubre.size()-1;i++){
                    q_PTS =q_PTS + listaOubre.get(i).reb;}
                double qPTS = (q_PTS)/((listaOubre.size()));
                return qPTS;
            case 13:
                double a_PTS = 0;
                for (int i=0; i<= listaReed.size()-1;i++){
                    a_PTS =a_PTS + listaReed.get(i).reb;}
                double aPTS = (a_PTS)/((listaReed.size()));
                return aPTS;
            case 14:
                double b_PTS = 0;
                for (int i=0; i<= listaSpringer.size()-1;i++){
                    b_PTS =b_PTS + listaSpringer.get(i).reb;}
                double bPTS = (b_PTS)/((listaSpringer.size()));
                return bPTS;




            default:
                return 0;
        }
    }
    public static double statystykiAST(int a) {
        switch (a){
            case 0:
                double s_PTS = 0;
                for (int i=0; i<= listaMaxey.size()-1;i++){
                    s_PTS = s_PTS + listaMaxey.get(i).ast;}
                double PTS = (s_PTS)/((listaMaxey.size()));
                return PTS;
            case 1:
                double E_PTS = 0;
                for (int i=0; i<= listaEmbiid.size()-1;i++){
                    E_PTS = E_PTS + listaEmbiid.get(i).ast;}
                double ePTS = (E_PTS)/((listaEmbiid.size()));
                return ePTS;
            case 2:
                double M_PTS = 0;
                for (int i=0; i<= listaMelton.size()-1;i++){
                    M_PTS = M_PTS + listaMelton.get(i).ast;}
                double mPTS = (M_PTS)/((listaMelton.size()));
                return mPTS;
            case 3:
                double X_PTS = 0;
                for (int i=0; i<= listaBamba.size()-1;i++){
                    X_PTS = X_PTS + listaBamba.get(i).ast;}
                double xPTS = (X_PTS)/((listaBamba.size()));
                return xPTS;
            case 4:
                double r_PTS = 0;
                for (int i=0; i<= listaBatum.size()-1;i++){
                    r_PTS = r_PTS + listaBatum.get(i).ast;}
                double rPTS = (r_PTS)/((listaBatum.size()));
                return rPTS;
            case 5:
                double y_PTS = 0;
                for (int i=0; i<= listaBeverley.size()-1;i++){
                    y_PTS = y_PTS + listaBeverley.get(i).ast;}
                double yPTS = (y_PTS)/((listaBeverley.size()));
                return yPTS;
            case 6:
                double l_PTS = 0;
                for (int i=0; i<= listaCovington.size()-1;i++){
                    l_PTS = l_PTS + listaCovington.get(i).ast;}
                double lPTS = (l_PTS)/((listaCovington.size()));
                return lPTS;
            case 7:
                double v_PTS = 0;
                for (int i=0; i<= listaHarris.size()-1;i++){
                    v_PTS = v_PTS + listaHarris.get(i).ast;}
                double vPTS = (v_PTS)/((listaHarris.size()));
                return vPTS;
            case 8:
                double V_PTS = 0;
                for (int i=0; i<= listaHouse.size()-1;i++){
                    V_PTS = V_PTS + listaHouse.get(i).ast;}
                double VPTS = (V_PTS)/((listaHouse.size()));
                return VPTS;
            case 9:
                double T_PTS = 0;
                for (int i=0; i<= listaKorkmaz.size()-1;i++){
                    T_PTS = T_PTS + listaKorkmaz.get(i).ast;}
                double TPTS = (T_PTS)/((listaKorkmaz.size()));
                return TPTS;
            case 10:
                double D_PTS = 0;
                for (int i=0; i<= listaMartin.size()-1;i++){
                    D_PTS =D_PTS + listaMartin.get(i).ast;}
                double DPTS = (D_PTS)/((listaMartin.size()));
                return DPTS;
            case 11:
                double f_PTS = 0;
                for (int i=0; i<= listaMorris.size()-1;i++){
                    f_PTS =f_PTS + listaMorris.get(i).ast;}
                double fPTS = (f_PTS)/((listaMorris.size()));
                return fPTS;
            case 12:
                double q_PTS = 0;
                for (int i=0; i<= listaOubre.size()-1;i++){
                    q_PTS =q_PTS + listaOubre.get(i).ast;}
                double qPTS = (q_PTS)/((listaOubre.size()));
                return qPTS;
            case 13:
                double a_PTS = 0;
                for (int i=0; i<= listaReed.size()-1;i++){
                    a_PTS =a_PTS + listaReed.get(i).ast;}
                double aPTS = (a_PTS)/((listaReed.size()));
                return aPTS;
            case 14:
                double b_PTS = 0;
                for (int i=0; i<= listaSpringer.size()-1;i++){
                    b_PTS =b_PTS + listaSpringer.get(i).ast;}
                double bPTS = (b_PTS)/((listaSpringer.size()));
                return bPTS;

            default:
                return 0;
        }
    }
    public static double statystykiFG(int a) {
        switch (a){
            case 0:
                double y_PTS = 0;
                for (int i=0; i<= listaMaxey.size()-1;i++){
                    y_PTS = y_PTS + listaMaxey.get(i).fg;}
                double yPTS = (y_PTS)/((listaMaxey.size()));
                return yPTS;
            case 1:
                double E_PTS = 0;
                for (int i=0; i<= listaEmbiid.size()-1;i++){
                    E_PTS = E_PTS + listaEmbiid.get(i).fg;}
                double ePTS = (E_PTS)/((listaEmbiid.size()));
                return ePTS;
            case 2:
                double M_PTS = 0;
                for (int i=0; i<= listaMelton.size()-1;i++){
                    M_PTS = M_PTS + listaMelton.get(i).fg;}
                double mPTS = (M_PTS)/((listaMelton.size()));
                return mPTS;
            case 3:
                double X_PTS = 0;
                for (int i=0; i<= listaBamba.size()-1;i++){
                    X_PTS = X_PTS + listaBamba.get(i).fg;}
                double xPTS = (X_PTS)/((listaBamba.size()));
                return xPTS;
            case 4:
                double r_PTS = 0;
                for (int i=0; i<= listaBatum.size()-1;i++){
                    r_PTS = r_PTS + listaBatum.get(i).fg;}
                double rPTS = (r_PTS)/((listaBatum.size()));
                return rPTS;
            case 5:
                double l_PTS = 0;
                for (int i=0; i<= listaBeverley.size()-1;i++){
                    l_PTS = l_PTS + listaBeverley.get(i).fg;}
                double lPTS = (l_PTS)/((listaBeverley.size()));
                return lPTS;
            case 6:
                double L_PTS = 0;
                for (int i=0; i<= listaCovington.size()-1;i++){
                    L_PTS = L_PTS + listaCovington.get(i).fg;}
                double LPTS = (L_PTS)/((listaCovington.size()));
                return LPTS;
            case 7:
                double v_PTS = 0;
                for (int i=0; i<= listaHarris.size()-1;i++){
                    v_PTS = v_PTS + listaHarris.get(i).fg;}
                double vPTS = (v_PTS)/((listaHarris.size()));
                return vPTS;
            case 8:
                double V_PTS = 0;
                for (int i=0; i<= listaHouse.size()-1;i++){
                    V_PTS = V_PTS + listaHouse.get(i).fg;}
                double VPTS = (V_PTS)/((listaHouse.size()));
                return VPTS;
            case 9:
                double T_PTS = 0;
                for (int i=0; i<= listaKorkmaz.size()-1;i++){
                    T_PTS = T_PTS + listaKorkmaz.get(i).fg;}
                double TPTS = (T_PTS)/((listaKorkmaz.size()));
                return TPTS;
            case 10:
                double D_PTS = 0;
                for (int i=0; i<= listaMartin.size()-1;i++){
                    D_PTS =D_PTS + listaMartin.get(i).fg;}
                double DPTS = (D_PTS)/((listaMartin.size()));
                return DPTS;
            case 11:
                double f_PTS = 0;
                for (int i=0; i<= listaMorris.size()-1;i++){
                    f_PTS =f_PTS + listaMorris.get(i).fg;}
                double fPTS = (f_PTS)/((listaMorris.size()));
                return fPTS;
            case 12:
                double q_PTS = 0;
                for (int i=0; i<= listaOubre.size()-1;i++){
                    q_PTS =q_PTS + listaOubre.get(i).fg;}
                double qPTS = (q_PTS)/((listaOubre.size()));
                return qPTS;
            case 13:
                double a_PTS = 0;
                for (int i=0; i<= listaReed.size()-1;i++){
                    a_PTS =a_PTS + listaReed.get(i).fg;}
                double aPTS = (a_PTS)/((listaReed.size()));
                return aPTS;
            case 14:
                double b_PTS = 0;
                for (int i=0; i<= listaSpringer.size()-1;i++){
                    b_PTS =b_PTS + listaSpringer.get(i).fg;}
                double bPTS = (b_PTS)/((listaSpringer.size()));
                return bPTS;




            default:
                return 0;
        }
}}
