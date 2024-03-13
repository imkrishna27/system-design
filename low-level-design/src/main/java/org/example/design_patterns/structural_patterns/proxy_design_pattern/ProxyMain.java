package org.example.design_patterns.structural_patterns.proxy_design_pattern;

public class ProxyMain {
    public static void main(String[] args) {
        EmployeeDaoProxy employeeDaoProxy = new EmployeeDaoProxy(new EmployeeDaoImpl());
        employeeDaoProxy.getEmployee();
        employeeDaoProxy.deleteEmployee();
    }
}
