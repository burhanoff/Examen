public class Main {
    public static void main(String[] args) {
        String[] cowsFarm1 = {"Cow1", "Cow2", "Cow3"};
        String[] horsesFarm1 = {"Horse1", "Horse2"};


        Ferm farm1 = new Ferm("Ферма1", cowsFarm1, horsesFarm1, "Эран");

        String[] cowsFarm2 = {"Cow1", "Cow2", "Cow3", "Cow4"};
        String[] horsesFarm2 = {"Horse1", "Horse2", "Horse3"};

        Ferm farm2 = new Ferm("Ферма2", cowsFarm2, horsesFarm2, "Тимурлан");

        // Вывод информации о фермах
        farm1.info();
        farm2.info();
    }
}