package com.company;

public class Main {
    public static void main(String[] args) {
        JawnaImplementacja implementacja = new JawnaImplementacja();
        useLambdaWithParam(implementacja, "String do wyswietlenia");
        useLambdaWithParam((s)-> System.out.println(s), "String do wyswietlenia");
    }
    static void useLambdaWithParam(MojFunkcyjnyInterfejs interfejs, String s) {
        interfejs.go(s);
    }
}
@FunctionalInterface
interface MojFunkcyjnyInterfejs {
    void go(String s);
}
class JawnaImplementacja implements MojFunkcyjnyInterfejs {
    @Override
    public void go(String s) {
        System.out.println(s);
    }
}