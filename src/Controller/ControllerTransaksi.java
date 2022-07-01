/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Models.Pengguna;
import Models.Transaksi;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author user
 */
public class ControllerTransaksi extends AbstractTableModel{
    private List<Transaksi> list = new ArrayList<Transaksi>();
    
    public int getRowCount() {
        return list.size();
    }
    
    public int getColumnCount() {
        return 6;
    }
    
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getIdTransaksi();
            case 1:
                return list.get(rowIndex).getDeskripsiCucian();
            case 2:
                return list.get(rowIndex).getBeratCucian();
            case 3:
                return list.get(rowIndex).getOngkir();
            case 4:
                return list.get(rowIndex).getTotalBayar();
            case 5:
                return list.get(rowIndex).getTglTransaksi();
            default:
                return null;
        }
    }
    
    public String getColumnName(int kolom) {
         switch (kolom) {
            case 0:
                return "ID Transaksi";
            case 1:
                return "Deskripsi";
            case 2:
                return "Berat";
            case 3:
                return "Ongkir";
            case 4:
                return "Total Bayar";
            case 5:
                return "Tanggal Transaksi";
            default:
                return null;
        }
    }
    
    public void add(Transaksi transaksi) {
        list.add(transaksi);
        fireTableRowsInserted(getRowCount(), getColumnCount());
    }
    public void delete(int i, int baris) {
        list.remove(i);
        fireTableRowsDeleted(i, baris);
    }
    public Transaksi get(int baris) {
        return (Transaksi) list.get(baris);
    }
}
