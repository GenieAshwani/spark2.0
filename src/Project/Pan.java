package Project;

public class Pan {
    private String panNumber;
    private String aadhaarNumber;
    private String bankDetails;
    private String investments;

    public Pan(String panNumber, String aadhaarNumber, String bankDetails, String investments) {
        this.panNumber = panNumber;
        this.aadhaarNumber = aadhaarNumber;
        this.bankDetails = bankDetails;
        this.investments = investments;
    }

    public String getPanNumber() {
        return panNumber;
    }

    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }

    public String getAadhaarNumber() {
        return aadhaarNumber;
    }

    public void setAadhaarNumber(String aadhaarNumber) {
        this.aadhaarNumber = aadhaarNumber;
    }

    public String getBankDetails() {
        return bankDetails;
    }

    public void setBankDetails(String bankDetails) {
        this.bankDetails = bankDetails;
    }

    public String getInvestments() {
        return investments;
    }

    public void setInvestments(String investments) {
        this.investments = investments;
    }

    @Override
    public String toString() {
        return "Pan{" +
                "panNumber='" + panNumber + '\'' +
                ", aadhaarNumber='" + aadhaarNumber + '\'' +
                ", bankDetails='" + bankDetails + '\'' +
                ", investments='" + investments + '\'' +
                '}';
    }
}
