package org.example.design_patterns.structural_patterns.proxy_design_pattern;

public class EmployeeDaoImpl implements EmployeeDao{
    @Override
    public void getEmployee() {
        System.out.println("sending employee");
    }

    @Override
    public void postEmployee() {
        System.out.println("saving employee");
    }

    @Override
    public void deleteEmployee() {
        System.out.println("deleting employee");
    }
}
