package kata6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class PersonLoader {

    public static ArrayList read() throws SQLException, ClassNotFoundException {
        ArrayList<Person1> lista = new ArrayList<>();
        System.out.println("LEE");
        Class.forName("org.sqlite.JDBC");
        Connection conect = DriverManager.getConnection("jdbc:sqlite:KATA.sDB");
        Statement state = conect.createStatement();
        ResultSet rs = state.executeQuery("SELECT * FROM PEOPLE");

        while (rs.next()) {
            Integer id = rs.getInt(1);
            String name = rs.getString(2);
            String genero = rs.getString(3);
            String fechaNacimiento = rs.getString(4);
            Float peso = rs.getFloat(5);
            String mail = rs.getString(6);
            
            lista.add(new Person1(id, name, genero, fechaNacimiento, peso, mail));
        }
        System.out.println("TERMINE");
        return lista;
    }
}
