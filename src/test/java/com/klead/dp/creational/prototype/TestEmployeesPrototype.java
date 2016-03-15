package com.klead.dp.creational.prototype;

import org.junit.Test;

import java.util.List;

/**
 * Created by kafi on 14/03/2016.
 */
public class TestEmployeesPrototype {

    @Test
    public void testPrototype() throws CloneNotSupportedException {
        EmployeesPrototype emps = new EmployeesPrototype();
        emps.loadData();
        //Use the clone method to get the Employee object
        EmployeesPrototype empsNew = (EmployeesPrototype) emps.clone();
        EmployeesPrototype empsNew1 = (EmployeesPrototype) emps.clone();
        List<String> list = empsNew.getEmpList();
        list.add("Khaled");
        List<String> list1 = empsNew1.getEmpList();
        list1.remove("Hamza");
        System.out.println("emps List: " + emps.getEmpList());
        System.out.println("empsNew List: " + list);
        System.out.println("empsNew1 List: " + list1);
    }
}
