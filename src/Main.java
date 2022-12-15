import players.PlayerComp;

public class Main {
    public static void main(String[] args) {


        Game game = new Game();
        game.addPlayer(new PlayerComp("xyz"));
        game.addPlayer(new PlayerComp("Stefan"));
        game.addPlayer(new PlayerComp("Marian"));

        game.printPlayers();
//        game.removePlayer("xyz");
        game.printPlayers();

        for (int i=0;i<10;i++){
        game.play();
        }

        game.printStats();

//        List<String> list = new ArrayList();
//        list.add("cos");
//        list.add("cos2");
//        list.add("cos3");
////        list.add(new players.PlayerComp());
////
////        System.out.println(list);
////
////        for (int i=0;i< list.size();i++){
////            System.out.println(list.get(i));
////        }
////        System.out.println("=============");
////
////        for (Object el:list){
////            System.out.println(el);
////        }
////        System.out.println("=============");
////
////        Iterator<String> it = list.iterator();
////        while (it.hasNext()){
////            String el = it.next();
////            System.out.println(el);
////        }
//
//        System.out.println("=============");
//
//        for (Iterator<String> it = list.iterator(); it.hasNext();){
//            System.out.println(it.next());
//        }
//




//            Random rd = new Random();
//            int guess ;
//            int b =rd.nextInt(6)+1;
//
//            players.Player player = new players.PlayerComp("zzzz");
//
////            try {
////                player.setName(null);
////            }
////            catch (IllegalArgumentException ex){
////                System.err.println("Błąd: " + ex.getMessage());
////            }
//
//            System.out.println("Wylosowana: "+b);
//            System.out.println("Odgadnij wylosowaną liczbę");
//
//            do{
//                System.out.println("Podaj wartość");
//                guess = player.guess();
//
//                System.out.println(player.getImie() + ": " + guess);
//                if (guess==b){
//                    System.out.println("Dobrze, podałeś prwidłową wartość");
//                }
//                else{
//                    System.out.println("Źle, spróbuj ponownie");
//                }
//            }
//            while (guess!=b);
        }
}