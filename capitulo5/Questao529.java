public class Questao529 {

    public static void main(String[] args) {

        for (int i = 1; i <= 12; i++) {
            imprimirVersoMusica(i);
        }
        
    }

    private static void imprimirVersoMusica(int index) {
        System.out.printf("On the %s day of Christmas,%n", getDia(index));
        System.out.println("my true love sent to me,");
        darPresente(index);
        System.out.println("in a Pear Tree.");
        System.out.println();
    }

    private static String getDia(int index) {
        switch (index) {
            case 1:
                return "first";
            case 2:
                return "second";
            case 3:
                return "third";
            case 4:
                return "fourth";
            case 5:
                return "fifth";
            case 6:
                return "sixth";
            case 7:
                return "seventh";
            case 8:
                return "eighth";
            case 9:
                return "ninth";
            case 10:
                return "tenth";
            case 11:
                return "eleventh";
            case 12:
                return "twelfth";
        }
        return "";
    }

    private static void darPresente(int index) {
        switch (index) {
            case 12:
                System.out.println("Twelve drummers drumming");
            case 11:
                System.out.println("Eleven pipers piping");
            case 10:
                System.out.println("Ten lords a-leaping");
            case 9:
                System.out.println("Nine ladies dancing");
            case 8:
                System.out.println("Eight maids a-milking");
            case 7:
                System.out.println("Seven swans a-swimming");
            case 6:
                System.out.println("Six geese a-laying");
            case 5:
                System.out.println("Five gold rings");
            case 4:
                System.out.println("Four calling birds");
            case 3:
                System.out.println("Three French hens");
            case 2:
                System.out.println("Two turtledoves, and");
            case 1:
                System.out.print("A partridge ");
        }
    }

}