public class DateTest {
    public static void main(String[] args) {
        Date date = new Date("06", "07", "2022");
        date.displayDate();
        System.out.println("\n---------------------");
        date.setMes("01");
        date.displayDate();
        System.out.println("\n---------------------");
        date.setDia("02");
        date.displayDate();
        System.out.println("\n---------------------");
        date.setAno("2023");
        date.displayDate();
    }
}
