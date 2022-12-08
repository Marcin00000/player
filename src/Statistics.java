import java.util.HashMap;
import java.util.Map;

public class Statistics {

    private Map<String, Integer> stats = new HashMap<>();

    public void winner(Player player){
        String name = player.getName();
        Integer s = stats.get(name);
//        if (s == null){
//            s = 0;
//        }
//        Integer s = stats.getOrDefault(name,0);
//        s++;
        stats.put(name,stats.getOrDefault(name,0)+1);

//        stats.merge(name, 1, (p1, p2) -> p1 + p2);
    }

    public void print(){
        System.out.println("    ||Statystyka||    ");
        for (String i : stats.keySet()) {
            System.out.println(i +  ";  wynik: " + stats.get(i));
        }

//        stats.forEach((name score ;>));
    }

    public void clear(){

    }


}
