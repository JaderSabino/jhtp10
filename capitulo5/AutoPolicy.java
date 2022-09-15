public class AutoPolicy {

    private int accountNumber;
    private String makeAndModel;
    private String state;

    public AutoPolicy(int accountNumber, String makeAndModel, String state) {
        this.accountNumber = accountNumber;
        this.makeAndModel = makeAndModel;
        if (
            state.equals("CT") ||
            state.equals("MA") ||
            state.equals("ME") ||
            state.equals("NH") ||
            state.equals("NJ") ||
            state.equals("NY") ||
            state.equals("PA") ||
            state.equals("VT")
        ) {
            this.state = state;
        } else {
            System.out.println("invalid state");
        }
        
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getMakeAndModel() {
        return makeAndModel;
    }

    public void setMakeAndModel(String makeAndModel) {
        this.makeAndModel = makeAndModel;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        if (
            state.equals("CT") ||
            state.equals("MA") ||
            state.equals("ME") ||
            state.equals("NH") ||
            state.equals("NJ") ||
            state.equals("NY") ||
            state.equals("PA") ||
            state.equals("VT")
        ) {
            this.state = state;
        } else {
            System.out.println("invalid state");
        }
        
    }

    public boolean isNoFaultState() {
        boolean noFaultState;
        switch (getState()) {
            case "MA": case "NJ": case "NY": case "PA":
                noFaultState = true;
                break;
            default: 
                noFaultState = false;
                break;
        }
        return noFaultState;
    }
}