package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;


public class Program1 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao =  DaoFactory.creaDepartmentDao();
		
		
		
		System.out.println("===== Test1 findBy; ");
		Department dep = departmentDao.findById(1);
		System.out.println(dep);
		
		 
	 System.out.println("\n=== TEST2 Department findById =====");
		 Department department = new Department(2, null);
		 List<Department> list = departmentDao.findAll();
		 
		 for(Department obj1 : list) {
			 
			 System.out.println(obj1);
		 } /*
		 System.out.println("\n=== TEST3 Department findById =====");
		 
		 list = departmentDao.findAll();
		 
		 for(Department obj : list) {
			 
			 System.out.println(obj);
		 } */
		
		 System.out.println("\n=== TEST4 Department insert =====");
		 Department newDepartment = new  Department(null,"Mesa");						
		 departmentDao.insert(newDepartment);
		 System.out.println("InsertId numero id; "+ newDepartment.getName());
		
	     System.out.println("\n=== TEST5 Department update =====");
		Department dep1 = departmentDao.findById(6);
		 dep1.setName("Cadeira");
		 departmentDao.update(dep1);
		 System.out.println("Update completo");
		 
		 System.out.println("\n=== TEST Department delete =====");
		 System.out.println("Entre com um id");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Deletado completo");
        
		 
		sc.close();
	}

}
