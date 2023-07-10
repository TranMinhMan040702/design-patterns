package com.criscode.singleton;

public class Database {

    // key "volatile"
    // ensures that the instance variable is correctly published to other threads,
    // and the double-checked locking pattern is used to minimize the overhead of acquiring the lock
    private static volatile Database instance;
    private Database() {}


    // use key "synchronized" because:
    // ensure that the instance hasn't yet been
    // initialized by another thread while this one
    // has been waiting for the lock's release
    public static Database getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                instance = new Database();
                System.out.println("Instance created....");
            }
        }
        System.out.println("Return instance of Database....");
        return instance;
    }

    public void query(String sql) {
        System.out.println(sql);
    }
}
