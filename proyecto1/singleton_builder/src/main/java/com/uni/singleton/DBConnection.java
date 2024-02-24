package com.uni.singleton;

import java.util.ArrayList;
import java.util.Collection;

public class DBConnection {
    private static Collection<User> users = new ArrayList<>();
    private Encodings encoding;
    private boolean ssl;
    private int port;
    private String dbName;
    private int timeOut;

    private DBConnection(User user, Encodings encoding, boolean ssl, int port, String dbName, int timeOut) {
        DBConnection.users.add(user);
        this.encoding = encoding;
        this.ssl = ssl;
        this.port = port;
        this.dbName = dbName;
        this.timeOut = timeOut;
    }

    public static DBConnection createConnection(User user, Encodings encoding, boolean ssl, int port, String dbName, int timeOut) throws Exception{
        Collection<User> users = DBConnection.users;
        for(User u: users){
            if(u.getName().equals(user.getName())){
                throw new Exception("Conexion previamente creada");
            }
        }
        return new DBConnection(user, encoding, ssl, port, dbName, timeOut);
    }

    public Collection<User> getUsers() {
        return DBConnection.users;
    }

    public Encodings getEncoding() {
        return encoding;
    }

    public void setEncoding(Encodings encoding) {
        this.encoding = encoding;
    }

    public boolean isSsl() {
        return ssl;
    }

    public void setSsl(boolean ssl) {
        this.ssl = ssl;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public int getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(int timeOut) {
        this.timeOut = timeOut;
    }
    @Override
    public String toString() {
        return "DBConnection [encoding=" + encoding + ", ssl=" + ssl + ", port=" + port + ", dbName=" + dbName
                + ", timeOut=" + timeOut + "]";
    }

    public static BuilderDBConnection builder(){
        return new BuilderDBConnection();
    }

    public static class BuilderDBConnection{        
        private User user;
        private Encodings encoding;
        private boolean ssl;
        private int port;
        private String dbName;
        private int timeOut;

        public BuilderDBConnection user(User user) {
            this.user = user;
            return this;
        }
        public BuilderDBConnection encoding(Encodings encoding) {
            this.encoding = encoding;
            return this;
        }
        public BuilderDBConnection ssl(boolean ssl) {
            this.ssl = ssl;
            return this;
        }
        public BuilderDBConnection port(int port) {
            this.port = port;
            return this;
        }
        public BuilderDBConnection dbName(String dbName) {
            this.dbName = dbName;
            return this;
        }

        public BuilderDBConnection timeOut(int timeOut){
            this.timeOut = timeOut;
            return this;
        }

        public DBConnection build() throws Exception{
            return DBConnection.createConnection(user, encoding, ssl, port, dbName, timeOut);
        }

    }
}
