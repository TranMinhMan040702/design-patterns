package com.criscode.singleton;

public class Main {
    public static void main(String[] args) {
        Database foo = Database.getInstance();
        foo.query("SELECT.......foo");

        Database bar = Database.getInstance();
        bar.query("SELECT.......bar");
    }
}
