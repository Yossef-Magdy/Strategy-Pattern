public abstract class Payment{
    private float amount;
    private IauthorizeBehavior authorizeBehavior;
    private IprintBehavior printBehavior;
    public Payment() {
        
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public IauthorizeBehavior getAuthorizeBehavior() {
        return authorizeBehavior;
    }

    public void setAuthorizeBehavior(IauthorizeBehavior authorizeBehavior) {
        this.authorizeBehavior = authorizeBehavior;
    }

    public IprintBehavior getPrintBehavior() {
        return printBehavior;
    }

    public void setPrintBehavior(IprintBehavior printBehavior) {
        this.printBehavior = printBehavior;
    }
    
}
