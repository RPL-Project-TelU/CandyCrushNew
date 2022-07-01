/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Models.Pengguna;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author user
 */
public class ControllerPengguna extends AbstractTableModel{
    private List<Pengguna> list = new ArrayList<Pengguna>();

    @Override
    public int getRowCount() {
        return list.size();
    }
    
    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getUsername();
            case 1:
                return list.get(rowIndex).getNoHP();
            case 2:
                return list.get(rowIndex).getAlamatPengguna();
            case 3:
                return list.get(rowIndex).getEmail();
            case 4:
                return list.get(rowIndex).getKataSandi();
            default:
                return null;
        }
    }
    
    @Override
    public String getColumnName(int kolom) {
         switch (kolom) {
            case 0:
                return "Nama Pengguna";
            case 1:
                return "No. Telp";
            case 2:
                return "Alamat";
            case 3:
                return "Email";
            default:
                return null;
        }
    }
    public void add(Pengguna pengguna) {
        list.add(pengguna);
        fireTableRowsInserted(getRowCount(), getColumnCount());
    }
    public void delete(int i, int baris) {
        list.remove(i);
        fireTableRowsDeleted(i, baris);
    }
    public Pengguna get(int baris) {
        return (Pengguna) list.get(baris);
    }
}
