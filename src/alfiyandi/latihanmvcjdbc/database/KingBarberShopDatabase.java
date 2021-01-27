/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfiyandi.latihanmvcjdbc.database;

import alfiyandi.latihanmvcjdbc.impl.PelangganDaoImpl;
import alfiyandi.latihanmvcjdbc.service.PelangganDao;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.SQLException;
/*
 * NAMA              : Alfiyandi Pandya K
 * KELAS             : IF1
 * NIM               : 10119007
*/
public class KingBarberShopDatabase {
    
    private static Connection connection;
    private static PelangganDao pelangganDao;
    
    public static Connection getConnection()throws SQLException{
        if (connection==null){
            
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setURL("jdbc:mysql://localhost:3306/kingbarbershop");
            dataSource.setUser("root");
            dataSource.setPassword("");
            connection = (Connection) dataSource.getConnection();
        }
        return connection;
        
    }
    
    public static PelangganDao getPelangganDao() throws SQLException{
        if (pelangganDao==null){
            pelangganDao = new PelangganDaoImpl(getConnection());
        }
        return pelangganDao;
        
    }
}
