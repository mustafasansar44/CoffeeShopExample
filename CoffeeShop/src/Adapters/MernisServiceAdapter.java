package Adapters;

import Abstract.CustomerCheckService;
import Entities.Customers;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customers customer) {
		if(!customer.getFirstName().isEmpty()) {
			// Sadece firstname doðrulamasý yaptým.
			return true;
		}else {
			return false;
		}
	}

}
