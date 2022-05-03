/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package albumstore.Model;

/**
 *
 * @author Prio
 */
public class AdminModel {
    private String title;
    private String artist;
    private String years;
    private String type;
    private String price;
    private String stock;

    public String getArtist() {
        return artist;
    }

    public String getPrice() {
        return price;
    }

    public String getStock() {
        return stock;
    }

    public String getTitle() {
        return title;
    }

    public String getYears() {
        return years;
    }

    public String getType() {
        return type;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYears(String years) {
        this.years = years;
    }   

    public void setType(String type) {
        this.type = type;
    }    
}
