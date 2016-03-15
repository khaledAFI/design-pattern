package com.klead.dp.creational.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kafi on 14/03/2016.
 */
public class EmployeesPrototype implements Cloneable {

    private List<String> empList;

    public EmployeesPrototype() {
        empList = new ArrayList<String>();
    }

    public EmployeesPrototype(List<String> list) {
        this.empList = list;
    }

    public void loadData() {

        //read all employees from database and put into the list
        empList.add("Ahmad");
        empList.add("Mohammed");
        empList.add("Hamza");
        empList.add("Ines");
    }

    public List<String> getEmpList() {
        return empList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        List<String> temp = new ArrayList<String>();
        for (String s : this.getEmpList()) {
            temp.add(s);
        }
        return new EmployeesPrototype(temp);
    }

}
