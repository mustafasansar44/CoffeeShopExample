package Abstract;

import Entities.Customers;

public class BaseCustomerManager implements Customer{

	@Override
	public void save(Customers customer) {
		System.out.println("Veritabanưna kaydedildi: " + customer.getFirstName());
	}
	
}
