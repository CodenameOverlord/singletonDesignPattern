package org.example.singleTon;

public class ConnectionPool {
    private static ConnectionPool instance = null;
    private ConnectionPool() {
//        this.instance = new ConnectionPool();
    }
    public static ConnectionPool getInstance(){
        if(instance == null){
            synchronized (ConnectionPool.class){
                if(instance == null){
                    instance = new ConnectionPool();
                }
            }

        }
        return instance;
    }
}
