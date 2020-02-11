package zellerg;
//1-1-2015     J         Correcto  J 
//1-1-2018     M                   L
//1-1-2017     L                   D

public class ZellerG {

    public static void main(String[] args) {
        String[] dia = {"L", "M", "X", "J", "V", "S", "D"};
        int day=1, month=1, year=2017;
       // int day=10, month=2, year=2020; 
        
        int d = ZellerG(day, month, year);
        System.out.println(dia[d]);
        //  modificamos el programa para visualizar el dia Lunes, martes ....
        d = Zeller2(day, month, year);
        System.out.println(dia[d]);

        d= getZeller(day, month, year);
        System.out.println(dia[d]);
        
    }

    private static int ZellerG(int Day, int Month, int Year) {
        int Zeller;
        Month = (Month + 10) % 12;
        Year = Year - 1 * ((Month > 10) ? 1 : 0);
        Zeller = (13 * Month - 1) / 5 + 1 + Year % 100 + (Year % 100) / 4 + (-2 * (Year / 100)) + (Year / 400) % 7;
        Zeller = ((Zeller + Day) % 7 + 6) % 7;
        return Zeller;
    }

    private static int getZeller(int day, int Month, int Year) {
        int ZMonth, ZYear, Zeller;
        Zeller = 1;
        ZMonth = (Month + 10) % 12;
        if (ZMonth > 10) {

            ZYear = Year - 1;

        } else {

            ZYear = Year;

        }

        Zeller = (13 * ZMonth - 1) / 5 + 1 + ZYear % 100 + (ZYear % 100) / 4 + (-2 * (ZYear / 100)) + (ZYear / 400) % 7;

        Zeller = ((Zeller + day) % 7 + 6) % 7;

        return Zeller;

    }

    private static int Zeller2(int dia, int mes, int anno) {

        int h, K, J;

        //Tenemos en cuenta el caso de enero y febrero 
        if (mes <= 2) {

            mes = mes + 12;

            dia++;

            //anno = anno +1 ; 
        } else {

            mes = mes - 2;

        }

        //Calculamos K y J. 
        K = anno % 100;

        J = anno / 100;

        //Aplicamos la fórmula. 
        h = ((700 + ((26 * mes - 2) / 10) + dia + K + (K / 4) + ((J / 4) + 5 * J)) % 7);

        //Retornamos el resultado. 
        return (h);

    }
}
