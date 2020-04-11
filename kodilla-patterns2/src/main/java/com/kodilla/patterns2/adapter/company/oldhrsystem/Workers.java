package com.kodilla.patterns2.adapter.company.oldhrsystem;

public class Workers {
    private String[][] workers = {
            {"774874", "John", "Smith"},
            {"779974", "John1", "Smith1"},
            {"004874", "John2", "Smith2"},
            {"544874", "John3", "Smith3"}};
    private double[] salaries = {
            4500.00,
            3700.00,
            5400.00,
            6700.00};

    public String getWorker(int n) {
        if (n > salaries.length) {
            return "";
        }
        return workers[n][0] + ", " + workers[n][1] + ", " + workers[n][2] + ", " + salaries[n];
    }

    public String[][] getWorkers() {
        return workers;
    }

    public double[] getSalaries() {
        return salaries;
    }
}
