package client;

public interface Cearable {
    void care();
    default void action(){
        System.out.println("кормлю кроликов");
    }
}
