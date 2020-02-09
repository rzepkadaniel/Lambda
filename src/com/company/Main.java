package com.company;

public class Main {
    public static void main(String[] args) {
        useLambda(new JawnaImplementacja());
        useLambda(() -> System.out.println("Jawna Implementacja"));

    }
    static void useLambda(MojFunkcyjnyInterfejs myInterface){
        myInterface.go();

    }
}
    @FunctionalInterface
interface MojFunkcyjnyInterfejs {
    void go();


}
    class JawnaImplementacja implements MojFunkcyjnyInterfejs{


        @Override
        public void go() {
            System.out.println("Jawna Implementacja");
        }
    }