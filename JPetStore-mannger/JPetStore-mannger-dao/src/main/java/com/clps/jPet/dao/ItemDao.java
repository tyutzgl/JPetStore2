  package com.clps.jPet.dao;


  import com.clps.jPet.pojo.Item;

  import java.util.List;

  public interface ItemDao {

      /**
       * Get all item listings
       * @return List<Item>
       */
      List<Item> getItems() ;

      /**
       * Get all item listings
       * @return List<Item>
       */
      List<Item> getItemList() ;
  }
