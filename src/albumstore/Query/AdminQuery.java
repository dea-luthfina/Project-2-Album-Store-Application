/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package albumstore.Query;

/**
 *
 * @author Prio
 */

public class AdminQuery {
    
    public String create = "INSERT INTO albums (title, artist, years, type, price, "
     + "stock) VALUES (?, ?, ?, ?, ?, ?)";
    
    public String get = "SELECT * FROM albums";
    public String showById = "SELECT * FROM albums where id_album = ?";
    public String showByTitle = "SELECT * FROM albums where title LIKE ?"; 
    public String showByArtist = "SELECT * FROM albums where artist LIKE ?"; 

    public String update = "UPDATE albums SET title = ?, artist = ?, "
     + "years = ?, type = ?, price = ?, stock = ? WHERE id_album = ?";

    public String updateStock = "UPDATE albums SET stock = ? WHERE id_album = ?";

    public String delete = "DELETE FROM albums WHERE id_album = ?";  

    public String checkAlbum = "SELECT * FROM albums WHERE title LIKE ? AND years = ?";
}
