package week8;

public interface TestInterface {
    void go();
    default void back(){
        System.out.println();
    }
}
