package j8streamexamples;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class FlatMapTest {

    public static void main(String[] args) {

        Company company = getCompanyObject("c1");
        Company companyTwo = getCompanyObject("c2");
//        company.getEmployeeList().stream().map(emp -> emp.getAddressList())
//                .flatMap(address -> (address).stream())
//                .collect(Collectors.toList()).forEach(System.out::println);

        ArrayList<Company> companyList = new ArrayList<>();
        companyList.add(company);
        companyList.add(companyTwo);

        companyList.stream().map(company1 -> company1.getEmployeeList())
                .flatMap(employees -> employees.stream().filter(employee -> employee.getAge()>25))
                .map(employee -> employee.getAddressList())
                .flatMap(address -> (address).stream())
                .collect(Collectors.toList()).forEach(System.out::println);
    }

    public static Company getCompanyObject(String companyName){
        //Create Four Addresses
        //Adding companyName to houeseNumber to identify the objects when printed through System.out.println()
        Address empOneAddressOne = new Address(companyName+" 1","Street1","CityOne","StateOne","500001");
        Address empOneAddressTwo = new Address(companyName+" 2","Street2","CityTwo","StateTwo","500002");

        Address empTwoAddressOne = new Address(companyName+ " 1a","Street1a","CityOne","StateOne","500001");
        Address empTwoAddressTwo = new Address(companyName+" 2a","Street2a","CityTwo","StateTwo","500002");

        ArrayList<Address> empOneAddressesList = new ArrayList();
        empOneAddressesList.add(empOneAddressOne);
        empOneAddressesList.add(empOneAddressTwo);

        ArrayList<Address> empTwoAddressesList = new ArrayList();
        empTwoAddressesList.add(empTwoAddressOne);
        empTwoAddressesList.add(empTwoAddressTwo);

        //Create Two Employees
        Employee empOne = new Employee("empOne",25,empOneAddressesList);
        Employee empTwo = new Employee("empTwo",35,empTwoAddressesList);

        ArrayList<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(empOne);
        employeeList.add(empTwo);

        Company company = new Company(companyName,employeeList);
        return company;
    }
}
