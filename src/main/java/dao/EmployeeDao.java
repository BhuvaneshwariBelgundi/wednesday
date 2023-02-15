package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Employee;

public class EmployeeDao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("abc");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public void insert(Employee employee) {
		// TODO Auto-generated method stub
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
		
	}
	public void update(int id,String empname) {
		Employee e=entityManager.find(Employee.class,id);
		e.setEmpname(empname);
		entityTransaction.begin();
		entityManager.merge(e);
		entityTransaction.commit();
		
		
	}

}
