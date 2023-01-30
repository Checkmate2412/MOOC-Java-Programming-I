
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition) {
        return new Money(this.euros + addition.euros, 
                this.cents + addition.cents);
    }
    
    public boolean lessThan(Money compared) {        
        if (this.euros == compared.euros) {
            if (this.cents < compared.cents)
                return true;
        } else if (this.euros < compared.euros)
            return true;
        return false;
    }
    
    public Money minus(Money decreaser) {
        int finalEuros = this.euros - decreaser.euros;
        int finalCents = this.cents - decreaser.cents;
        
        if (finalEuros < 0) {
            finalEuros = 0;
            finalCents = 0;
        } else {
            if (finalCents < 0) {
                finalEuros--;
                finalCents = finalCents + 100;
            }
        }
        
        return new Money(finalEuros, finalCents);
    }
    
    @Override
    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
