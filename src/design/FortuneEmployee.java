package design;

public class FortuneEmployee extends EmployeeInfo{

    /**
     * FortuneEmployee class has a main methods where you will be able to create Object from
     * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible
     * to use with proper business work flow.Think as a Software Architect, Product Designer and
     * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
     * more to design an application that will meet for fortune 500 Employee Information
     * Services.
     * <p>
     * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
     **/
    public static void main(String[] args) {
        EmployeeInfo employeeInfo = new FortuneEmployee();

        System.out.println(employeeInfo.employeeName());
        System.out.println(employeeInfo.employeeId());
        System.out.println(employeeInfo.calculateSalary());
        employeeInfo.assignDepartment();
        employeeInfo.benefitLayout();

        System.out.println(employeeInfo.calculateEmployeeBonus(5,8));
        System.out.println(employeeInfo.calculateEmployeePension());

    }

}
