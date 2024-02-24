package com.uni.singleton;

public class Main {
    public static void main(String[] args) {
        try{
            User user = new User("Juan");
            DBConnection conn = DBConnection.builder()
            .user(user)
            .port(9000)
            .dbName("Students")
            .build();
            System.out.println(conn);
            /*
             * Caso de error por no ser unica conexion
             */
            // DBConnection conn2 = DBConnection.builder()
            // .user(user)
            // .timeOut(5)
            // .build();
            User user2 = new User("Diego");
            DBConnection conn2 = DBConnection.builder()
            .user(user2)
            .timeOut(5)
            .build();
            System.out.println(conn2);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}