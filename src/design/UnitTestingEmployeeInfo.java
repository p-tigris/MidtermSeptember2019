package design;

public class UnitTestingEmployeeInfo {

    public static void main(String[] args) {
        //Write Unit Test for all the methods has been implemented in this package.
        EmployeeInfo employeeInfo = new EmployeeInfo("John Smith", 49583);
        System.out.println(employeeInfo.employeeName());
        System.out.println(employeeInfo.employeeId());

    }
}
