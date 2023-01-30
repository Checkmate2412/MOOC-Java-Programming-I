
public class PaymentTerminal {
    private double money; 
    private int affordableMeals; 
    private int heartyMeals;  

    public PaymentTerminal() {
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        double price = 2.50;
        
        if (payment >= price) {
            this.money += price;
            this.affordableMeals++;
            return payment - price;
        } else {
          return payment;
        }
    }

    public double eatHeartily(double payment) {
        double price = 4.30;
        
        if (payment >= price) {
            this.money += price;
            this.heartyMeals++;
            return payment - price;
        } else {
          return payment;
        }
    }

    public boolean eatAffordably(PaymentCard card) {
        double price = 2.50;
        
        if (card.takeMoney(price)) {
            this.affordableMeals++;
            return true;
        } else {
            return false;
        }
    }

    public boolean eatHeartily(PaymentCard card) {
        double price = 4.30;
        
        if (card.takeMoney(price)) {
            this.heartyMeals++;
            return true;
        } else {
            return false;
        }
    }
    
    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum > 0) {
            card.addMoney(sum);
            this.money += sum;
        }
    }
    
    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
