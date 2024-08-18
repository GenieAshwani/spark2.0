package Project;

public class Aadhaar {

    private String aadhaarNumber;
    private String name;
    private String fatherName;
    private String address;

    public Aadhaar(String aadhaarNumber, String name, String fatherName, String address) {
        this.aadhaarNumber = aadhaarNumber;
        this.name = name;
        this.fatherName = fatherName;
        this.address = address;
    }

    public String getAadhaarNumber() {
        return aadhaarNumber;
    }

    public void setAadhaarNumber(String aadhaarNumber) {
        this.aadhaarNumber = aadhaarNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Aadhaar{" +
                "aadhaarNumber='" + aadhaarNumber + '\'' +
                ", name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
