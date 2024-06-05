import java.util.*;

class ThreadDemo extends Thread{
    @Override
    public void run() {
        super.run();
    }


}

public class Threading {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Mango");
        list.add("Banana");
        list.add("Jackfruit");
        list.add("Water Lily");

        System.out.println(list);

        HashMap<String,String> hash = new HashMap<>();
        hash.put("1","Flower");
        hash.put("2","Bird");
        hash.put("3","Sun");

        System.out.println(hash);

        HashSet<String> set = new HashSet<>();
        set.add("Bus");
        set.add("Car");
        set.add("CNG");

        System.out.println(set);



    }
}
