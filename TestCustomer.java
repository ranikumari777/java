// Custom exception class for invalid inputs
class InvalidInputException extends Exception {
    // Constructor to pass message to the Exception
    public InvalidInputException(String message) {
        super(message);
    }
}

// Customer class with validation logic
class Customer {
    // Instance variables
    private String custNo;
    private String custName;
    private String category;

    // Parameterized constructor
    public Customer(String custNo, String custName, String category) throws InvalidInputException {
        // Validate custNo: must start with 'C' or 'c'
        if (!(custNo.startsWith("C") || custNo.startsWith("c"))) {
            throw new InvalidInputException("Customer number must start with 'C' or 'c'.");
        }
        
        // Validate custName: must be at least 4 characters
        if (custName.length() < 4) {
            throw new InvalidInputException("Customer name must be at least 4 characters.");
        }

        // Validate category: must be either 'Platinum', 'Gold', or 'Silver'
        if (!(category.equalsIgnoreCase("Platinum") || category.equalsIgnoreCase("Gold") || category.equalsIgnoreCase("Silver"))) {
            throw new InvalidInputException("Category must be either 'Platinum', 'Gold', or 'Silver'.");
        }

        // If all validations pass, initialize instance variables
        this.custNo = custNo;
        this.custName = custName;
        this.category = category;
    }

    // Getter methods
    public String getCustNo() {
        return custNo;
    }

    public String getCustName() {
        return custName;
    }

    public String getCategory() {
        return category;
    }
}

// Main class to test Customer class
import java.util.*;

public class TestCustomer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for customer details
        System.out.print("Enter Customer Number (starting with 'C' or 'c'): ");
        String custNo = scanner.nextLine();

        System.out.print("Enter Customer Name (at least 4 characters): ");
        String custName = scanner.nextLine();

        System.out.print("Enter Customer Category ('Platinum', 'Gold', 'Silver'): ");
        String category = scanner.nextLine();

        try {
            // Create customer object and perform validations
            Customer customer = new Customer(custNo, custName, category);
            
            // If validation passes, print customer details
            System.out.println("\nCustomer Details:");
            System.out.println("Customer Number: " + customer.getCustNo());
            System.out.println("Customer Name: " + customer.getCustName());
            System.out.println("Category: " + customer.getCategory());
            
        } catch (InvalidInputException e) {
            // Handle invalid input by printing error message
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
