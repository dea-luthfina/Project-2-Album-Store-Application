/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package albumstore.Controller;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
import albumstore.Model.AdminModel;
import albumstore.Query.AdminQuery;
/**
 *
 * @author Prio
 */
public class AdminController extends BaseController {
    AdminQuery query = new AdminQuery();
    
    public boolean create(AdminModel model) throws ParseException {
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, model.getTitle());
        map.put(2, model.getArtist());
        map.put(3, model.getYears());
        map.put(4, model.getPrice());
        map.put(5, model.getStock());
        
        String sql = this.query.create;
        
        return this.preparedStatement(map, sql);
    }
}
