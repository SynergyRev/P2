package productDAO;

import java.util.List;

import models.Users;
import models.product;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.Session;

import com.revature.utilities.HibernateUtil;

@Entity 
@Table (name = "cart")
public class cartDAO {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "cart_id")
Users user;
List<product> products;
public void addItem(product item) {
	Session ses = HibernateUtil.getSession();
	ses.save(item);
	HibernateUtil.closeSession();
}
public product getcartByID(int id) {
	Session ses = HibernateUtil.getSession();
	product c = ses.get(product.class,id);
	HibernateUtil.closeSession();
	return c;
}
public void removeItem(int index) {
	Session ses = HibernateUtil.getSession();
	ses.remove(index);
	HibernateUtil.closeSession();
}
public List<product> getAllProducts() {
	Session ses = HibernateUtil.getSession();
	products = ses.createQuery("FROM cart").list();
	HibernateUtil.closeSession();
	return products;
}
}
