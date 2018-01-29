  package com.clps.jPet.dao.Impl;

  import com.clps.jPet.dao.ItemDao;
  import com.clps.jPet.pojo.Item;
  import org.apache.commons.logging.Log;
  import org.apache.commons.logging.LogFactory;
  import org.hibernate.Query;
  import org.hibernate.Session;
  import org.hibernate.SessionFactory;
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.stereotype.Repository;

  import java.util.List;

  @Repository
  public class ItemDaoImpl implements ItemDao {

  //	@Autowired
  //	private HibernateTemplate hibernateTemplate;

      private static Log log = LogFactory.getLog(ItemDaoImpl.class);

      @Autowired
      private SessionFactory sessionFactory;

      public List<Item> getItems() {
          Session session = sessionFactory.openSession();
          String hql = "FROM Item";
          Query query = session.createQuery(hql);
          List<Item> items = query.list();
          log.info(items.get(1).getItemid());
          session.close();
          // List<Item> items = (List<Item>) hibernateTemplate.find("from item");
          return items;
      }

      public List<Item> getItemList() {
          Session session = sessionFactory.openSession();
          String hql = "FROM Item";
          Query query = session.createQuery(hql);
          List<Item> items = query.list();
          log.info(items.get(1).getItemid());
          session.close();
          // List<Item> items = (List<Item>) hibernateTemplate.find("from item");
          return items;
      }
  }
