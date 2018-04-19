package ListCollection;

import java.util.HashSet;

public class SetEx {
 
    public static void main(String[] args) {
 
        Employee e1 = new Employee(1,"A");
        Employee e2 = new Employee(1,"B");
        Employee e3 = new Employee(1,"A");
        
        HashSet<Employee> set = new HashSet<Employee>();
        
        set.add(e1); // Employee A added
        set.add(e2); // Employee B added
        set.add(e3); // Employee A added .. not considered a duplicate as Employee doesn't override equals()
        
        System.out.println(set.size());
        //prints 3
        System.out.println(set);
    }
 
}
 
