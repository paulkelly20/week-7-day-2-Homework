package vehicle;

import customer.Customer;

public interface Sellable {

    double sell(int quantity);

    double getPrice();
}
