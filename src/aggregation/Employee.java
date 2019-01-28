package aggregation;

import abstraction.AbstractDemo;

public class Employee extends AbstractDemo {

    String empNamel;
    String empId;
    String salary;
    Company company;
    String[] list;



    public Employee(String empNamel, String empId, String salary, Company company,String[] list) {
        this.empNamel = empNamel;
        this.empId = empId;
        this.salary = salary;
        this.company = company;
        this.list=list;
    }

    @Override
    public void getDetails() {

    }

    void showDetails()
    {
        System.out.println("Name : "+empNamel+"\n" +
                "Id  :"+empId+"\n" +
                "Salary : "+salary+"\n" +
                "Company  Name : "+company.cmpName+"\n" +
                "Company Address : "+company.cmpAddress );
    }

    public static void main(String[] args) {
        String[] cities={"punr","Mumbai"};
        Company company=new Company("Codekul","Kothrud");
        Employee employee=new Employee("Santosh","001","20,000",company,cities);
        employee.showDetails();
    }

}
