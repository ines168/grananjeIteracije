public class Main {
    public static void main(String[] args) {
//Korištenjem petlje while -> Izračunaj zbroj znamenaka unesenog broja. Npr 351 zbroj znamenaka je 9.
        System.out.println("1.Zbroj znamenki");
        int pocetnaVrijednost = 351;
        int broj = pocetnaVrijednost;
        int sumZnamenki = 0;
        while (broj > 0) {
            sumZnamenki += broj % 10;;
            broj /= 10;
        }
        System.out.printf("\tZbroj znamenki broja %d je %d\n", pocetnaVrijednost, sumZnamenki);

        System.out.println();

        //Korištenjem petlje do while izračunaj zbroj brojeva od 1 do 1000 djeljivih sa 7.
        System.out.println("2.Zbroj znamenki");
        int m = 1;
        int zbrojDjelj7 = 0;
        do {
            zbrojDjelj7 = m%7==0 ? zbrojDjelj7 += m : zbrojDjelj7;
            m++;
        } while ( m <= 1000);
        System.out.printf("\tZbroj brojeva do 1000 je %d\n", zbrojDjelj7);
    }
}