/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package albumstore.Controller;

import albumstore.Helper.Helper;
import albumstore.Model.OrderModel;
import albumstore.Query.OrderQuery;
import java.sql.ResultSet;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Prio
 */
public class OrderController extends BaseController{
OrderQuery oq = new OrderQuery();
OrderModel om = new OrderModel();
Helper helper = new Helper();

    public ResultSet get() {
        String sql = this.oq.get;
        return this.get(sql);
    }
    
    public ResultSet showByIdOrder(String id_order) {
        String sql = this.oq.showByIdOrder;
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, id_order);
        
        return this.getWithParameter(map, sql);
    }

    public ResultSet showByIdBuyer(String id_buyer) {
        String sql = this.oq.showByIdBuyer;
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, helper.parseLikeQuery(id_buyer));
        
        return this.getWithParameter(map, sql);
    }

public boolean create(OrderModel om) throws ParseException {
        String order_date = helper.parseDateToString(om.getOrder_date());

        Map<Integer, Object> map = new HashMap<>();
        map.put(1, om.getAmount());
        map.put(2, om.getTotal_price());
        map.put(3, om.getId_album());
        map.put(4, om.getId_user());
        map.put(5, order_date);
        
        String sql = this.oq.create;
        
        return this.preparedStatement(map, sql);
    }
}
