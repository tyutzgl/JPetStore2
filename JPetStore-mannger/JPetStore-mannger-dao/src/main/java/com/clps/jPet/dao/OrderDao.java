package com.clps.jPet.dao;

import com.clps.jPet.pojo.*;

import java.util.List;


public interface OrderDao {

    /**
     * query account by user's id
     *
     * @param userid
     * @return
     */
    Account queryAccount(String userid);

    /**
     * save order
     *
     * @param orders
     */
    void saveOrder(Orders orders);

    /**
     * save item's line number
     *
     * @param lineitem
     */
    void saveLineitem(Lineitem lineitem);

    /**
     * save order's status
     *
     * @param orderstatus
     */
    void saveOrderstatus(Orderstatus orderstatus);

    /**
     * query order listings by user's id
     *
     * @param userid
     * @param begin
     * @param end
     * @return
     */
    List<Orders> queryOrder(String userid, int begin, int end);

    /**
     * Query order by order's id
     *
     * @param orderid
     * @return
     */
    Orders queryOrdersOne(int orderid);

    /**
     * Query inventory listings
     *
     * @return List<Inventory>
     */
    List<Inventory> queryInventory();

    /**
     * update item's inventory
     *
     * @param inventory
     */
    void updateInventory(Inventory inventory);

}
