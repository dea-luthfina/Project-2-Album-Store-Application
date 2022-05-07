/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package albumstore.Query;

/**
 *
 * @author Prio
 */
public class OrderQuery {
    public String create = "INSERT INTO orders (amount, total_price, " +
            "id_album, id_user, order_date) VALUES (?, ?, ?, ?, ?)";

    public String get = "SELECT * FROM orders";
    public String showByIdOrder = "SELECT * FROM orders where id_order = ?";
    public String showByIdBuyer = "SELECT * FROM orders where id_user = ?";
    public String showByIdAlbum = "SELECT * FROM orders where id_album = ?";

    public String delete = "DELETE FROM orders WHERE id_order = ?";     
}
