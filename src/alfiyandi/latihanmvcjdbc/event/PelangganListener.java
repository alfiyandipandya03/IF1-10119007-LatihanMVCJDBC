/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfiyandi.latihanmvcjdbc.event;

import alfiyandi.latihanmvcjdbc.entity.Pelanggan;
import alfiyandi.latihanmvcjdbc.model.PelangganModel;

/*
 * NAMA              : Alfiyandi Pandya K
 * KELAS             : IF1
 * NIM               : 10119007
 */
public interface PelangganListener {
    
    public void onChange(PelangganModel model);
    
    public void onInsert(Pelanggan pelanggan);
    
    public void onDelete();
    
    public void onUpdate(Pelanggan pelanggan);
    
}
