package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
	//	Department obj = new Department(1, "Books");
	//     Seller seller = new Seller(21,"Boob", 
	//	"bob@gmail.com",new Date(), 3000.0,obj);
		
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Seller selle = new Seller();
		
		System.out.println("=== TEST1 seller findById =====");
		
		 selle = sellerDao.findById(3);
		 System.out.println(selle);
		 
		 System.out.println("\n=== TEST2 seller findById =====");
		 Department department = new Department(2, null);
		 List<Seller> list = sellerDao.findByDepartment(department);
		 
		 for(Seller obj1 : list) {
			 
			 System.out.println(obj1);
		 }
		 System.out.println("\n=== TEST3 seller findById =====");
		 
		 list = sellerDao.findAll();
		 
		 for(Seller obj : list) {
			 
			 System.out.println(obj);
		 }
	//	System.out.println(seller);
		
	}

}
