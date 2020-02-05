package zellerg;

public class ZellerG {

    public static void main(String[] args) {
      int d= ZellerG(4, 2, 2020);
        System.out.println(d);
       
        
    }

   private static int   ZellerG(int Day, int Month, int Year) {
        int Zeller;
        Month = (Month + 10) % 12;
        Year = Year - 1 * ((Month > 10)?1:0);
        Zeller = (13 * Month - 1) / 5 + 1 + Year % 100 + (Year % 100) / 4 + (-2 * (Year / 100)) + (Year / 400) % 7;
        Zeller = ((Zeller + Day) % 7 + 6) % 7;
        return Zeller;
    }
}
