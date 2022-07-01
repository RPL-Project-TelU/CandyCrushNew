/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Models.Jasa;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author user
 */
public class ControllerJasa extends AbstractTableModel{
    private List<Jasa> list = new ArrayList<Jasa>();

    public ControllerJasa() {
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }
    
    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getNamaJasa();
            case 1:
                return list.get(rowIndex).getDeskripsiJasa();
            case 2:
                return list.get(rowIndex).getHarga();
            default:
                return null;
        }
    }
    
    @Override
    public String getColumnName(int kolom) {
         switch (kolom) {
            case 0:
                return "Nama Jasa";
            case 1:
                return "Deskripsi";
            case 2:
                return "Harga";
            default:
                return null;
        }
    }
    public void add(Jasa jasa) {
        list.add(jasa);
        fireTableRowsInserted(getRowCount(), getColumnCount());
    }
    public void delete(int i, int baris) {
        list.remove(i);
        fireTableRowsDeleted(i, baris);
    }
    public Jasa get(int baris) {
        return (Jasa) list.get(baris);
    }
}
