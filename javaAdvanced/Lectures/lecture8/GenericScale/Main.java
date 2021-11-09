package lecture8.GenericScale;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scale<>(13, 42).getHeavier());
        System.out.println(new Scale<>("A", "Z").getHeavier());
        System.out.println(new Scale<>(13.5, 42.5).getHeavier());
        System.out.println(new Scale<>(13.5, 42.5).getHeavier());


    }

    public static <T extends Comparable<T>>T getGreater(T first, T second){
        int result = first.compareTo(second);
        return result >= 0 ? first : second;
    }
}
