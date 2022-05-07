/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package albumstore.Model;

import java.util.Date;

/**
 *
 * @author Prio
 */
public class OrderModel {
    private String amount;
    private Date order_date;
    private String total_price;
    private String id_album;
    private String id_user;

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setId_album(String id_album) {
        this.id_album = id_album;
    }

    public void setId_user(String id_user) {
        this.id_user = id_user;
    }

    public void setOrder_date(Date order_date) {
        this.order_date = order_date;
    }

    public void setTotal_price(String total_price) {
        this.total_price = total_price;
    }

    public String getAmount() {
        return amount;
    }

    public String getId_album() {
        return id_album;
    }

    public String getId_user() {
        return id_user;
    }

    public Date getOrder_date() {
        return order_date;
    }

    public String getTotal_price() {
        return total_price;
    }
}
