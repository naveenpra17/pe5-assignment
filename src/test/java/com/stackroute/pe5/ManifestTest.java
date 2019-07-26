package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ManifestTest {
    private Manifest manifest;

    @Before//creating an instance of manifest class
    public void setUp() {
        manifest = new Manifest();
    }

    @After
    public void tearUp(){
        manifest=null;
    }
    @Test//testing for sorted student details
    public void givenMethodWillCheckForSortedStudentInputDeatils(){
    //input list
        Student student1=new Student(82,"naveen",42);
        Student student2=new Student(22,"praveen",42);
        Student student3=new Student(62,"kiran",33);
        Student student4=new Student(20,"vimal",60);
        List<Student> list=new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);

        //act
        List<Student> student=manifest.sortingMethod(list);
        //expected sorted list
        List<Student> list1=new ArrayList<>();
        list1.add(student4);
        list1.add(student2);
        list1.add(student1);
        list1.add(student3);
        //assert
        assertEquals(list1,student);

    }

    @Test
    public void givenMethodWillCheckForNullInputList(){
        List list=new ArrayList();

        //act
        List<Student> student=manifest.sortingMethod(list);

        //asert

        assertNull(student);
    }
}