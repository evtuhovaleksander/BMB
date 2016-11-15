package system_class_package.SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQL_Class {

        private   String db="testpr";
        private   String url = "jdbc:mysql://localhost:3306/";
        private   String user = "tu";
        private   String password = "QAz1234567890";


        private  Connection con;
        private  Statement stmt;
        private  ResultSet rs;

    public SQL_Class() {
        url+=db;
    }

    public void closeConnections(){
            try { con.close(); } catch(SQLException se) { /*can't do anything */ }
            try { stmt.close(); } catch(SQLException se) { /*can't do anything */ }
            try { rs.close(); } catch(SQLException se) { /*can't do anything */ }
        }
        public static Object readObject(String query){
            SQL_Class cl = new SQL_Class();
            try {


                cl.con = DriverManager.getConnection(cl.url, cl.user, cl.password);
                // getting Statement object to execute query
                cl.stmt = cl.con.createStatement();

                // executing SELECT query
                cl.rs = cl.stmt.executeQuery(query);
                if(cl.rs.next())return cl.rs.getObject(0);else return null;

            } catch (SQLException sqlEx) {
                sqlEx.printStackTrace();
            } finally {
                cl.closeConnections();
                return null;
            }
        }

        public static int readInt32(String query){
            Object res=readObject(query);
            if(res!=null)return (int)res;else return 0;
        }

    }
