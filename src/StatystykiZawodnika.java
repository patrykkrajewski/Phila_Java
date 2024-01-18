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
            default:
                return 0;
        }
    }
    public static float statystykiFG(int a) {
        switch (a){
            case 0:
                double s_PTS = 0;
                for (int i=0; i<= listaMaxey.size()-1;i++){
                    s_PTS = s_PTS + listaMaxey.get(i).fg;}
                double PTS = (s_PTS)/((listaMaxey.size()));
                return (float) PTS;
            case 1:
                double E_PTS = 0;
                for (int i=0; i<= listaEmbiid.size()-1;i++){
                    E_PTS = E_PTS + listaEmbiid.get(i).fg;}
                double ePTS = (E_PTS)/((listaEmbiid.size()));
                return (float) ePTS;
            case 2:
                double M_PTS = 0;
                for (int i=0; i<= listaMelton.size()-1;i++){
                    M_PTS = M_PTS + listaMelton.get(i).fg;}
                double mPTS = (M_PTS)/((listaMelton.size()));
                return (float) mPTS;
            default:
                return 0;
        }
}}
