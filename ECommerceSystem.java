import java.util.*;
class Customer {
    int id;
    String name;
    int loyaltyPoints;
    public Customer(int id, String name, int loyaltyPoints) {
        this.id = id;
        this.name = name;
        this.loyaltyPoints = loyaltyPoints;
    }
    public String toString() {
        return "Customer[ID=" + id + ", Name=" + name + ", Points=" + loyaltyPoints + "]";
    }
}

class Product {
    int id;
    String name;
    double price;
    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public String toString() {
        return "Product[ID=" + id + ", Name=" + name + ", Price=" + price + "]";
    }
}

class Order {
    int orderId;
    int customerId;
    Date deliveryDate;
    public Order(int orderId, int customerId, Date deliveryDate) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.deliveryDate = deliveryDate;
    }
    public String toString() {
        return "Order[OrderID=" + orderId + ", CustomerID=" + customerId + ", DeliveryDate=" + deliveryDate + "]";
    }
}

// Compare to sort
class ProductPriceComparator implements Comparator<Product> {
    public int compare(Product p1, Product p2) {
        return Double.compare(p1.price, p2.price);
    }
}

// Compare to sort 
class CustomerLoyaltyComparator implements Comparator<Customer> {
    public int compare(Customer c1, Customer c2) {
        return Integer.compare(c2.loyaltyPoints, c1.loyaltyPoints);
    }
}

public class ECommerceSystem {
    public static void main(String[] args) {
      
        ArrayList<Customer> customerList = new ArrayList<>();
        ArrayList<Product> productList = new ArrayList<>();
        ArrayList<Order> orderList = new ArrayList<>();

        HashMap<Integer, Customer> customerMap = new HashMap<>();
        HashMap<Integer, Product> productMap = new HashMap<>();

        HashSet<Product> uniqueProducts = new HashSet<>();

        TreeSet<Product> sortedProducts = new TreeSet<>(new ProductPriceComparator());
        TreeSet<Customer> sortedCustomers = new TreeSet<>(new CustomerLoyaltyComparator());

        // Sample Data
        Customer c1 = new Customer(1, "Alice", 120);
        Customer c2 = new Customer(2, "Bob", 150);
        Product p1 = new Product(101, "Laptop", 800.00);
        Product p2 = new Product(102, "Phone", 500.00);
        Order o1 = new Order(1001, 1, new Date());

        //collections
        customerList.add(c1);
        customerList.add(c2);
        customerMap.put(c1.id, c1);
        customerMap.put(c2.id, c2);

        productList.add(p1);
        productList.add(p2);
        productMap.put(p1.id, p1);
        productMap.put(p2.id, p2);

        uniqueProducts.add(p1);
        uniqueProducts.add(p2);

        sortedProducts.add(p1);
        sortedProducts.add(p2);

        sortedCustomers.add(c1);
        sortedCustomers.add(c2);

        orderList.add(o1);

        System.out.println("Customers:");
        for (Customer c : sortedCustomers) {
            System.out.println(c);
        }

        System.out.println("\nProducts:");
        for (Product p : sortedProducts) {
            System.out.println(p);
        }

        System.out.println("\nOrders:");
        for (Order o : orderList) {
            System.out.println(o);
        }
    }
}
