import hashmap2.Hashmap2;

public class Main {

    public static void main(String[] args) {

        Hashmap2 hashm = new Hashmap2();

        hashm.put(15, 150L);

        System.out.println(hashm.get(15));

        System.out.println(hashm.size());
    }
}
