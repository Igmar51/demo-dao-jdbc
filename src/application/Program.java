package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
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
		 
		 System.out.println("\n=== TEST4 Seller insert =====");
		 Seller newSeller = new  Seller(null," Greg", "greg@gmail.com", new Date(),4000.0 ,department);						
		 sellerDao.insert(newSeller);
		 System.out.println("InsertId numero id; "+ newSeller.getId());
		 
		 System.out.println("\n=== TEST5 Seller updat =====");
		 selle = sellerDao.findById(1);
		 selle.setName("Maria Santos");
		 sellerDao.update(selle);
		 System.out.println("Update completo");
		 
		 System.out.println("\n=== TEST Seller delete =====");
		 System.out.println("Entre com um id");
         int id = sc.nextInt();
         sellerDao.deleteById(id);
         System.out.println("Deletado completo");
         
		 
	//	System.out.println(seller);
		sc.close();
	}
  
}
