//import java.util.Random;
//
//public class Play {
//    public play() {
//        Random rd = new Random();
//        int guess ;
//        int b =rd.nextInt(6)+1;
//
//        Player player = new PlayerComp("zzzz");
//
//        System.out.println("Wylosowana: "+b);
//        System.out.println("Odgadnij wylosowaną liczbę");
//
//        do{
//            System.out.println("Podaj wartość");
//            guess = player.guess();
//
//            System.out.println(player.getImie() + ": " + guess);
//            if (guess==b){
//                System.out.println("Dobrze, podałeś prwidłową wartość");
//            }
//            else{
//                System.out.println("Źle, spróbuj ponownie");
//            }
//        }
//        while (guess!=b);
//    }
//
//}
