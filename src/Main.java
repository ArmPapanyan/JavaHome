import jdk.dynalink.Operation;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Nootebook> set = new HashSet<>();
        set.add(new Nootebook("Note 1",8,"Windows10",80000,"ASUS","Black"));
        set.add(new Nootebook("Note 2",64,"Linux",90000,"Lenova","Silver"));
        set.add(new Nootebook("Note 3",32,"Linux",85000,"Lenova","Silver"));
        set.add(new Nootebook("Note 4",16,"Windows10",85000,"HP","White"));

        System.out.println(set);
    }
    }
