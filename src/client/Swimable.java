package client;

public interface Swimable {
    double swim ();
    default void sound(){
        System.out.println("Буль-буль");
    }
}
