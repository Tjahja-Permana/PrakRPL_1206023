/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;
import javax.swing.JOptionPane;
public class menu {
     public int pilihan()
    {
        int pilih;
        String a=JOptionPane.showInputDialog
        ("\n---------------------------------\n"
        +"           Menu Transaksi\n"
        +"-----------------------------------\n"
        +"-> 1. Info Saldo\n"
        +"-> 2. Tambah Saldo\n"
        +"-> 3. Ambil Saldo\n"
        +"-> 4. Transfer\n"
        +"-> 5. Selesai");
        pilih=Integer.parseInt(a);
        return pilih;
    }

    public int opti()
    {
        int select=pilihan();
        return select;
    }
    
}
