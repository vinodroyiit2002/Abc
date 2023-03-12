package com.company.Assignment4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class CollectionEmployee {
    private int id;
    private String name;
    private String address;
    private Double Salary;

    public CollectionEmployee(int id, String name, String address, Double salary){
      this.id=id;
      this.name=name;
      this.address=address;
      this.Salary = salary;

    }
    public int getId(){ return id;}

    @Override
    public String toString() {
        return "CollectionEmployee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", Salary=" + Salary +
                '}';
    }

    public static void main(String[] args) {
        List<CollectionEmployee> list = new ArrayList<>();
        list.add(new CollectionEmployee(100,"Ram","18244 Camborne Edmond  73012", 2000.00));
        list.add(new CollectionEmployee(102,"Roy","194 NW Edmond  73012", 4000.00));
        list.add(new CollectionEmployee(103,"Vinod","186 NW Edmond  73012", 5000.00));
        list.add(new CollectionEmployee(104,"Shiva","111 NW Oklahoma  73012", 6000.00));
         Iterator< CollectionEmployee> it = list.iterator();
         int searchId= 102;
         while (it.hasNext()) {
             CollectionEmployee emp = it.next();
             if (emp.getId() == searchId)
                 System.out.println(emp);
         }



    }
}

