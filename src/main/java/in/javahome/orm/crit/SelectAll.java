package in.javahome.orm.crit;

import in.javahome.orm.HibUtil;
import in.javahome.orm.entity.Employee;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;


public class SelectAll {
public static void main(String[] args) {
	
	Session session = HibUtil.getSession();
	
	Criteria criteria = session.createCriteria(Employee.class);
	List<Employee> employees = criteria.list();
	
	for (Employee emp : employees) {
		System.out.println(emp.getEmpName());
		System.out.println(emp.getMailId());
		System.out.println("************************************");
	}
}
}
