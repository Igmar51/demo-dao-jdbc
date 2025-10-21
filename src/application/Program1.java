package application;

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
		
		sc.close();
	}

}
