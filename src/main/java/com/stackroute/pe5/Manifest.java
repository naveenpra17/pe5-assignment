package com.stackroute.pe5;

import java.util.*;

public class Manifest {

    public List<Student> sortingMethod(List student) {
        if(student.isEmpty())//checking for list null
            return null;

        Collections.sort(student,new StudentSorter());//passing list values to student sorter method
        return student;


    }
}
