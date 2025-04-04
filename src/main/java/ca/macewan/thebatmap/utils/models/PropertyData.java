package ca.macewan.thebatmap.utils.models;

/**
 * Model class representing property assessment data
 */
public class PropertyData {
    private String accountNumber;
    private Address address;
    private Neighbourhood neighbourhood;
    private Location location;
    private Assessment assessment;

    // Getters and setters
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAddress(String houseNum, String street) {
        this.address = new Address(houseNum, street);
    }

    public Address getAddress() { return this.address; }

    public void setNeighbourhood(String neighbourhood, String ward) {
        this.neighbourhood = new Neighbourhood(neighbourhood, ward);
    }

    public Neighbourhood getNeighbourhood() { return this.neighbourhood; }

    public void setLocation(double latitude, double longitude) {
        this.location = new Location(latitude, longitude);
    }

    public Location getLocation() { return location; }

    public void setAssessment(double assessedValue, int assessmentClass1Percent, int assessmentClass2Percent, int assessmentClass3Percent,
                              String assessmentClass1, String assessmentClass2, String assessmentClass3) {
        this.assessment = new Assessment(assessedValue, assessmentClass1Percent, assessmentClass2Percent, assessmentClass3Percent,
                assessmentClass1, assessmentClass2, assessmentClass3);
    }

    public Assessment getAssessment() { return assessment; }

    @Override
    public String toString() {
        return "PropertyData{" +
                "accountNumber='" + accountNumber + '\'' +
                ", address='" + address + '\'' +
                ", neighbourhood='" + neighbourhood + '\'' +
                ", assessedValue=" + assessment.getAssessedValue() +
                '}';
    }
}