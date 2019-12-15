package com.raman.party.model;


import javax.persistence.*;

@Entity
@Table(name = "partyTable")
public class Party {
    private long id;
    private String firstName;
    private String lastName;
    private String fullName;
    private long requestSubSystemId;
    private int partyTypeCode;
    private long partyNumber;
    private String uniqueName;
    private String latinName;
    private String nationalityNumber;
    private String economyNumber;
    private String internalUniqueNumber;
    private String imageUrl;

    public Party() {

    }

    public Party(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

//    @Column(name = "first_name", nullable = false)
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

//    @Column(name = "last_name", nullable = false)
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public long getRequestSubSystemId() {
        return requestSubSystemId;
    }

    public void setRequestSubSystemId(long requestSubSystemId) {
        this.requestSubSystemId = requestSubSystemId;
    }

    public int getPartyTypeCode() {
        return partyTypeCode;
    }

    public void setPartyTypeCode(int partyTypeCode) {
        this.partyTypeCode = partyTypeCode;
    }

    public long getPartyNumber() {
        return partyNumber;
    }

    public void setPartyNumber(long partyNumber) {
        this.partyNumber = partyNumber;
    }

    public String getUniqueName() {
        return uniqueName;
    }

    public void setUniqueName(String uniqueName) {
        this.uniqueName = uniqueName;
    }

    public String getLatinName() {
        return latinName;
    }

    public void setLatinName(String latinName) {
        this.latinName = latinName;
    }

    public String getNationalityNumber() {
        return nationalityNumber;
    }

    public void setNationalityNumber(String nationalityNumber) {
        this.nationalityNumber = nationalityNumber;
    }

    public String getEconomyNumber() {
        return economyNumber;
    }

    public void setEconomyNumber(String economyNumber) {
        this.economyNumber = economyNumber;
    }

    public String getInternalUniqueNumber() {
        return internalUniqueNumber;
    }

    public void setInternalUniqueNumber(String internalUniqueNumber) {
        this.internalUniqueNumber = internalUniqueNumber;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName
                + "]";
    }

}
