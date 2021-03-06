package com.clps.jPet.service.Impl;

import com.clps.jPet.dao.ShoppingDao;
import com.clps.jPet.pojo.Cart;
import com.clps.jPet.service.ShoppingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingServiceImpl implements ShoppingService {

    @Autowired
    private ShoppingDao shoppingDao;

    public void saveShopping(Cart cart) {
        shoppingDao.saveShopping(cart);
    }

    public List<Cart> queryShopping(String username, int begin, int end) {
        // TODO Auto-generated method stub
        return shoppingDao.queryShopping(username, begin, end);
    }

    public int deleteShopping(String itemid, String userid) {
        return shoppingDao.deleteShopping(itemid, userid);
    }

    public int updateQuantity(int quantity, String itemid, String userid) {
        return shoppingDao.updateQuantity(quantity, itemid, userid);
    }

    public int queryCountShopping(String itemid, String userid) {
        return shoppingDao.queryCountShopping(itemid, userid);
    }

    public Cart queryOneShopping(String userid, String itemid) {
        return shoppingDao.queryOneShopping(userid, itemid);

    }

    public long count(String itemid, String userid) {
        return shoppingDao.count(itemid, userid);

    }

}
