import java.util.Random;

public class Main {
    public static void main(String[] args) {

            Random rd = new Random();
            int guess ;
            int b =rd.nextInt(6)+1;

            Player player = new PlayerComp("zzzz");

//            try {
//                player.setName(null);
//            }
//            catch (IllegalArgumentException ex){
//                System.err.println("Błąd: " + ex.getMessage());
//            }

            System.out.println("Wylosowana: "+b);
            System.out.println("Odgadnij wylosowaną liczbę");

            do{
                System.out.println("Podaj wartość");
                guess = player.guess();

                System.out.println(player.getImie() + ": " + guess);
                if (guess==b){
                    System.out.println("Dobrze, podałeś prwidłową wartość");
                }
                else{
                    System.out.println("Źle, spróbuj ponownie");
                }
            }
            while (guess!=b);
        }
}
// 123 test