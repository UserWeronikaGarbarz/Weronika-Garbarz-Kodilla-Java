package com.kodilla.good.patterns.food2door.producer;

public class Company {

    private final String companyName;
    private final String address;
    private final Long nip;

    public Company(String companyName, String address, Long nip) {
        this.companyName = companyName;
        this.address = address;
        this.nip = nip;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getAddress() {
        return address;
    }

    public Long getNip() {
        return nip;
    }

    @Override
    public String toString() {
        return "Company Name: '" + companyName + '\'' +
                ", address='" + address + '\'' +
                ", nip=" + nip +
                '}';
    }
}
