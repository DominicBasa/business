import java.util.ArrayList;

// pair programmed with Rochelle

/**
 * CafeUtil
 */
public class CafeUtil {
/**
 * @param Weeks
 * @return
 */
  // first 
  // public int getStreakGoal() {
  //   int sum = 0;
  //   for (int i = 1; i <= 10; i++) {
  //     sum += i;
  //   }
  //   return sum;
  // }
  // ninja bonus
  public int getStreakGoal(int numWeeks) {
    int sum = 0;
    for (int i = 1; i <= numWeeks; i++) {
      sum += i;
    }
    return sum;
  }

  /**
   * double getOrderTotal()
   */
  public double getOrderTotal(double[] prices) {
    double sum = 0;
    // iterate through prices in array
    for (double price : prices) { 
    // add each price to the sum
      sum += price;
    }
    // return total
    return sum;
  }

  public void displayMenu(ArrayList<String> menuItems) {
    for (int i=0; i < menuItems.size(); i++) {
      System.out.printf("Index: %d, Menu Item: %s %n", i, menuItems.get(i));
    }
  }

  public ArrayList<String> addCustomer(ArrayList<String> customers) {
    // System.out.println("Please enter your name");
    
    String userName = System.console().readLine("Please enter your name: ");
    System.out.printf("Hello, %s %n", userName);
    System.out.printf("There are %d people in front of you ", customers.size());

    customers.add(userName);

    return customers;
  }
}
