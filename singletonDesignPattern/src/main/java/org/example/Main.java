package org.example;

import org.example.singleTon.ConnectionPool;

public class Main {
    public static void main(String[] args) {
        ConnectionPool connectionPool1 = ConnectionPool.getInstance();
        System.out.println(connectionPool1);
        ConnectionPool connectionPool2 = ConnectionPool.getInstance();
        System.out.println(connectionPool2);
    }
}