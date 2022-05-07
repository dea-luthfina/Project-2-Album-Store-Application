/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package albumstore.Controller;
import albumstore.Helper.Helper;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
import albumstore.Model.AdminModel;
import albumstore.Query.AdminQuery;
import java.sql.ResultSet;
/**
 *
 * @author Prio
 */
public class AdminController extends BaseController {
    AdminQuery query = new AdminQuery();
    Helper helper = new Helper();
    
    public boolean create(AdminModel model) throws ParseException {
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, model.getTitle());
        map.put(2, model.getArtist());
        map.put(3, model.getYears());
        map.put(4, model.getType());
        map.put(5, model.getPrice());
        map.put(6, model.getStock());
        
        String sql = this.query.create;
        
        return this.preparedStatement(map, sql);
    }

    public ResultSet get() {
        String sql = this.query.get;
        return this.get(sql);
    }
    
    public ResultSet showById(String id_album) {
        String sql = this.query.showById;
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, id_album);
        
        return this.getWithParameter(map, sql);
    }

    public ResultSet showByTitle(String title) {
        String sql = this.query.showByTitle;
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, helper.parseLikeQuery(title));
        
        return this.getWithParameter(map, sql);
    }

    public ResultSet showByArtist(String artist) {
        String sql = this.query.showByArtist;
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, helper.parseLikeQuery(artist));
        
        return this.getWithParameter(map, sql);
    }
    
    public boolean update(String id_album, AdminModel model) throws ParseException {
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, model.getTitle());
        map.put(2, model.getArtist());
        map.put(3, model.getYears());
        map.put(4, model.getType());
        map.put(5, model.getPrice());
        map.put(6, model.getStock());
        map.put(7, id_album);
        
        String sql = this.query.update;
        
        return this.preparedStatement(map, sql);
    }
    
    public boolean delete(String id_album) throws ParseException {
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, id_album);
        
        String sql = this.query.delete;
        
        return this.preparedStatement(map, sql);
    }
}
