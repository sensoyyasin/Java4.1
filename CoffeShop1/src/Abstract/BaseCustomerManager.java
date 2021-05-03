package Abstract;
import Entities.Customer;
public abstract class BaseCustomerManager implements CustomerService {
	@Override
    public void saveToDb(Customer customer) throws Exception {
        System.out.println("M��teri veri taban�na ba�ar�yla eklendi : " + customer.getFirstName());
        System.out.println("M��teri veri taban�na ba�ar�yla eklendi : " + customer.getLastName());
	}
}
