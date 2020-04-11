package com.kodilla.patterns2.adapter.company.newhrsystem;

import java.math.BigDecimal;
import java.util.Objects;

public class Employee {
    private final String peselId;
    final private String firstname;
    final private String lastname;
    final private BigDecimal basicSalary;

    public Employee(String peselId, String firstname, String lastname, BigDecimal basicSalary) {
        this.peselId = peselId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.basicSalary = basicSalary;
    }

    public String getPeselId() {
        return peselId;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public BigDecimal getBasicSalary() {
        return basicSalary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return peselId.equals(employee.peselId) &&
                Objects.equals(firstname, employee.firstname) &&
                Objects.equals(lastname, employee.lastname) &&
                Objects.equals(basicSalary, employee.basicSalary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(peselId, firstname, lastname, basicSalary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "peselId='" + peselId + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", basicSalary=" + basicSalary +
                '}';
    }
}
