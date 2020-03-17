package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void testSaveManyToMany() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        Assert.assertNotEquals(0, softwareMachineId);
        Assert.assertNotEquals(0, dataMaestersId);
        Assert.assertNotEquals(0, greyMatterId);

        //CleanUp
        try {
            companyDao.deleteById(softwareMachineId);
            companyDao.deleteById(dataMaestersId);
            companyDao.deleteById(greyMatterId);
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    public void testNamedQueriesEmployee() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee martinSmith = new Employee("Martin", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
        Company company = new Company("SQL experts");

        johnSmith.getCompanies().add(company);
        martinSmith.getCompanies().add(company);
        stephanieClarckson.getCompanies().add(company);
        lindaKovalsky.getCompanies().add(company);
        company.getEmployees().add(johnSmith);
        company.getEmployees().add(martinSmith);
        company.getEmployees().add(stephanieClarckson);
        company.getEmployees().add(lindaKovalsky);

        //When
        employeeDao.save(johnSmith);
        employeeDao.save(martinSmith);
        employeeDao.save(stephanieClarckson);
        employeeDao.save(lindaKovalsky);
        List<Employee> smithDao = employeeDao.retrieveLastname("Smith");

        List<Employee> smithList = new ArrayList<>();
        smithList.add(johnSmith);
        smithList.add(martinSmith);

        int companyId = company.getId();

        //Then
        Assert.assertEquals(smithList, smithDao);

        //CleanUp
        try {
            companyDao.deleteById(companyId);
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    public void testNamedQueriesCompanies() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee martinSmith = new Employee("Martin", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");

        Company sqlExperts = new Company("SQL experts");
        Company javaExperts = new Company("Java experts");
        Company javaMasters = new Company("Java masters");
        Company javax = new Company("Javax");
        Company javageeks = new Company("Java Geeks");

        sqlExperts.getEmployees().add(johnSmith);
        javaExperts.getEmployees().add(johnSmith);
        javaMasters.getEmployees().add(martinSmith);
        javax.getEmployees().add(stephanieClarckson);
        javageeks.getEmployees().add(martinSmith);

        johnSmith.getCompanies().add(sqlExperts);
        johnSmith.getCompanies().add(javaExperts);
        martinSmith.getCompanies().add(javaMasters);
        martinSmith.getCompanies().add(javageeks);
        stephanieClarckson.getCompanies().add(javax);

        //When
        companyDao.save(sqlExperts);
        companyDao.save(javaExperts);
        companyDao.save(javaMasters);
        companyDao.save(javax);
        companyDao.save(javageeks);

        List<Company> results = companyDao.getCompanyByNameLike("Jav%");

        System.out.println("COMPANIES" + results);

        int johnId = johnSmith.getId();
        int martinId = martinSmith.getId();
        int stephanieId = stephanieClarckson.getId();

        //Then
        Assert.assertEquals(4, results.size());

        //CleanUp
        try {
            employeeDao.deleteById(johnId);
            employeeDao.deleteById(martinId);
            employeeDao.deleteById(stephanieId);
        } catch (Exception e) {
            //do nothing
        }
    }
}