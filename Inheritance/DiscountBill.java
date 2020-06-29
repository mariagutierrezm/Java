package inheritance;
/*
 * Your class should adjust the amount reported by getTotal for preferred customers. 
 * For example, if the total would have been $80 but a preferred customer is getting 
 * $20 in discounts, then getTotal should report the total as $60 for that customer. 
 * You should also keep track of how many items a customer is getting a non-zero discount 
 * for and the overall discount, both as a total amount and as a percentage of 
 * the original bill. 
 */
public class DiscountBill  extends GroceryBill {

	private boolean preferred;
    private int discountCount = 0;
    private double discountAmount = 0;

    public DiscountBill(Employee clerk, boolean preferred){
        super(clerk);
        this.preferred = preferred;
    }

    public int getDiscountCount(){
        return discountCount;
    }
    
    public double getDiscountAmount(){
        return discountAmount;
    }
    
    public double getTotal(){
        return super.getTotal() - discountAmount;
    }
    
    public double getDiscountPercent(){
        return (discountAmount * 100) / super.getTotal();
    }

    public void add(Item item) {
      super.add(item);
        
      if(preferred && item.getDiscount() > 0) {
            discountCount++;
            discountAmount += item.getDiscount();
        }
    }
    
}
