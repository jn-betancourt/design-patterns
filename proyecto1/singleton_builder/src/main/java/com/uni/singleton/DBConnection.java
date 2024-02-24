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

    /**
     * The function creates a new database connection with the specified parameters after checking if a
     * connection for the user already exists.
     * 
     * @param user A User object 
     * @param encoding Determine by the enum Encodings
     * @param ssl Boolean check to know if connection is encrypted
     * @param port Port number where db is listening
     * @param dbName Name of the db attempting to connect
     * @param timeOut Wait time before to close connection
     * @return An instance of the `DBConnection` class is being returned.
     */
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

    /**
     * The function `builder()` returns a new instance of `BuilderDBConnection`.
     * 
     * @return An instance of the `BuilderDBConnection` class is being returned.
     */
    public static BuilderDBConnection builder(){
        return new BuilderDBConnection();
    }

    /**
     * The `BuilderDBConnection` class is used to construct and configure a `DBConnection` object with
     * specific parameters.
     */
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

        /**
         * The `build` function creates and returns a `DBConnection` object with specified parameters.
         * 
         * @return An instance of the `DBConnection` class is being returned after creating a
         * connection with the specified parameters such as user, encoding, ssl, port, dbName, and
         * timeOut.
         */
        public DBConnection build() throws Exception{
            return DBConnection.createConnection(user, encoding, ssl, port, dbName, timeOut);
        }

    }
}
