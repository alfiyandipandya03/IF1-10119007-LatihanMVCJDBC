/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfiyandi.latihanmvcjdbc.main;

import alfiyandi.latihanmvcjdbc.error.PelangganException;
import alfiyandi.latihanmvcjdbc.view.MainViewPelanggan;

import javax.swing.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * NAMA              : Alfiyandi Pandya K
 * KELAS             : IF1
 * NIM               : 10119007
 */
public class IF10119016LatihanMVCJDBC {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException, PelangganException {
        // TODO code application logic here
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    MainViewPelanggan pelanggan = new MainViewPelanggan();
                    pelanggan.loadDatabase();
                    pelanggan.setVisible(true);
                }catch (SQLException e){
                    
                }catch (PelangganException ex){
                    Logger.getLogger(IF10119016LatihanMVCJDBC.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        });
        
        
    }
    
}
