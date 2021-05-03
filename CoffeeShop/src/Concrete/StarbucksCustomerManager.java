package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Adapters.MernisServiceAdapter;
import Entities.Customers;


public class StarbucksCustomerManager extends BaseCustomerManager{

	CustomerCheckService checkService;

	public StarbucksCustomerManager(CustomerCheckService checkService) {
		this.checkService = checkService;
	}
	
	@Override
	public void save(Customers customer) {
		if(checkService.checkIfRealPerson(customer)) {
			super.save(customer);
		}else {
			System.out.println("Bilgilerinde hata var.");
		}
	}


}
