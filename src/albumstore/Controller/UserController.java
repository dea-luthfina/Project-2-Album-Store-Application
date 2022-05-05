/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package albumstore.Controller;

import albumstore.Model.UserModel;
import albumstore.Query.UserQuery;
import java.sql.ResultSet;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Prio
 */
public class UserController extends BaseController{
     UserQuery uq = new UserQuery();
    
    public ResultSet login (UserModel um) {
        String sql = this.uq.login;
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, um.getUsername());
        map.put(2, um.getPassword());
        
        return this.getWithParameter(map, sql);
    }

    public boolean regist (UserModel um) throws ParseException {
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, um.getName());
        map.put(2, um.getAddress());
        map.put(3, um.getPhone());
        map.put(4, um.getUsername());
        map.put(5, um.getPassword());
        
        String sql = this.uq.regist;
        
        return this.preparedStatement(map, sql);
    }

    public ResultSet get() {
        String sql = this.uq.get;
        return this.get(sql);
    }
    
    public ResultSet showById(String id) {
        String sql = this.uq.showById;
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, id);
        
        return this.getWithParameter(map, sql);
    }
}
