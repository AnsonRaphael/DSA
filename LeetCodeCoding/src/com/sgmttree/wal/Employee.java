package com.sgmttree.wal;

import java.util.HashMap;

public class Employee {
    String name;
    Employee(String  name){
        this.name=name;
    }
    public boolean equals(Object o){
        return ((Employee) o).name.equals(this.name);
    }
    public int hashCode(){
        return 9;
    }
public static void main(String[] args) {
        Object o = new Employee("what");
        //o="what";
        Employee ml = new Employee("what");
    Employee ml1 = new Employee("what1");
        System.out.println(ml.equals(o));

    HashMap<Employee,Integer> lm= new HashMap<>();
    lm.put(ml,4);
    lm.put(ml1,5);
     System.out.println(lm.size());

}
}
