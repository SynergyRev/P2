package productDAO;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.Session;

import com.revature.utilities.HibernateUtil;

import models.Products;
import models.product;

public class productdao {
	private List <product> items;
	
	public List<product> getAllProducts() {
		Session ses = HibernateUtil.getSession();
		items = ses.createQuery("FROM product").list();
		HibernateUtil.closeSession();
		return items;
	}
	public void addItem(product p) {
		Session ses = HibernateUtil.getSession();
		ses.save(p);
		HibernateUtil.closeSession();
	}
	public product getproductByID(int id) {
		Session ses = HibernateUtil.getSession();
		product p = ses.get(product.class,id);
		HibernateUtil.closeSession();
		return p;
	}
	public void removeItem(int index) {
		Session ses = HibernateUtil.getSession();
		ses.remove(index);
		HibernateUtil.closeSession();
	}
	
}
