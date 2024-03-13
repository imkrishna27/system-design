package org.example.design_patterns.structural_patterns.proxy_design_pattern;

public class EmployeeDaoProxy implements EmployeeDao{
    EmployeeDao employeeDao;
    public EmployeeDaoProxy(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }
    @Override
    public void getEmployee() {
        System.out.println("accessing via proxy allowed only get method");
        employeeDao.getEmployee();
    }

    @Override
    public void postEmployee() {
        System.out.println("method not allowed");
    }

    @Override
    public void deleteEmployee() {
        System.out.println("method not allowed");
    }
}
