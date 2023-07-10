package com.criscode.singleton;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    private static volatile ChocolateBoiler instance;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getInstance() {
        synchronized (ChocolateBoiler.class) {
            if (instance == null) {
                System.out.println("Creating unique instance of ChocolateBoiler");
                instance = new ChocolateBoiler();
            }
        }
        System.out.println("Returning unique instance of ChocolateBoiler");
        return instance;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            System.out.println("Fill the boiler with a milk/chocolate mixture");
        }
    }

    public void drain() {
        if(!isEmpty() && isBoiled()) {
            empty = true;
            System.out.println("Drain the boiled milk and chocolate");
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
            System.out.println("Bring the contents to a boil");
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
