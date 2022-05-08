/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package albumstore.Query;

/**
 *
 * @author Prio
 */
public class UserQuery {
    public String regist = "INSERT INTO users (name, address, phone, " +
            "username, password) VALUES (?, ?, ?, ?, ?)";
    public String login = "SELECT * FROM users WHERE "
            + "username = ? AND password = ?"; 

    public String create = "INSERT INTO product (name, product_type, " + 
            "stock, price, expired) VALUES (?, ?, ?, ?, ?)";
    
    public String get = "SELECT * FROM users";
    public String showById = "SELECT * FROM users WHERE id_user = ?";  
    public String showByType = "SELECT * FROM users WHERE type = ?";

    public String checkUsername = "SELECT * FROM users WHERE username LIKE ?";
}

