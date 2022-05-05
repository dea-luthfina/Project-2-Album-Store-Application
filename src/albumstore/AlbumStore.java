/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package albumstore;
import albumstore.Connection.DBConnection;
import albumstore.Frame.AdminFrame;
import albumstore.Frame.MainFrame;
import albumstore.Frame.RegisterFrame;

/**
 *
 * @author Prio
 */
public class AlbumStore {
    public static void main(String[] args) {
        // TODO code application logic here
//        DBConnection con = new DBConnection();
//        System.out.println(con.open());

        MainFrame con = new MainFrame();
        con.setLocationRelativeTo(null);
        con.setVisible(true);
    }
}
