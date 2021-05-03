package Abstract;

import Entities.Customers;

public interface CustomerCheckService {
	boolean checkIfRealPerson(Customers customer);
}
