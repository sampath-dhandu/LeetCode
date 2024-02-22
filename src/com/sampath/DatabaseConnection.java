package com.sampath;

public class DatabaseConnection {
    ;
    private static volatile DatabaseConnection instance;

    private String databaseURL;

    private DatabaseConnection(String databaseURL) {
        if (instance != null) {
            throw new IllegalStateException("Instance already created");
        }
        this.databaseURL = databaseURL;
    }

    public static DatabaseConnection getInstance() {

        if (instance == null) {
            synchronized (DatabaseConnection.class) {
                if (instance == null) {
                    instance = new DatabaseConnection("jdbc:mysql://localhost:3306/mydatabase");
                }
            }
        }
        return instance;
    }
}
