public class Finanzas {
    public static void main(String[] args) {
        final int YEARS=5;
        int initValue=0;
        double rate=0.0;
        int month=0, year=0;
        double amount=0.0;
        int[][]table=new int[12][5];

        initValue=Integer.parseInt(args[0]);
        rate=Double.parseDouble(args[1]);

        table[0][0]=initValue;
        amount=initValue;
        for(year=0; year<YEARS; year++){
            for(month=0; month<12; month++){
                table[month][year]=1.0;
            }
        }
        for(year=0; year<YEARS; year++){
            for(month=0; month<12; month++){
                amount*=(1+rate);
                table[month][year]=amount;
            }
            rate+=.05;
        }
        for(month=0; month<12; month++){
            for(year=0; year<YEARS; year++){
                System.out.print(table[month][year]+", ");
            }
            System.out.println();
        }
    }
}
