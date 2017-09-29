package jdbc;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import lombok.extern.java.Log;

@Log
class PrepearedInsert {
    static void insert(PreparedStatement ps, String name, int phone) {
        try {
            ps.setString(1, name);
            ps.setInt(2, phone);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        log.info("Statement inserted into the data base");
    }
}