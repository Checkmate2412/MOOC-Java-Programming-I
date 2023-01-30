
public class Timer {
    private ClockHand hundrethClock, secondClock;
    
    public Timer() {
        this.hundrethClock = new ClockHand(100);
        this.secondClock = new ClockHand(60);
    }
    
    public void advance(){
        this.hundrethClock.advance();
        
        if (this.hundrethClock.value() == 0) {
            this.secondClock.advance();
        }
    }
    
    @Override
    public String toString() {
        return this.secondClock + ":" + this.hundrethClock;
    }
}
