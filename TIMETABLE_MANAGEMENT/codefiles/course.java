package TIMETABLE_MANAGEMENT;

import java.util.ArrayList;
import java.util.Locale;

public class course
{
    // name, credit(get,set), name of professor,size
    private String name_course;
    private Integer credits;
    private ArrayList<String> course_profs = new ArrayList<String>();
    void setName_course(String s)
    {
        this.name_course=s;
    }
    void setCredits(int c)
    {
        this.credits=c;
    }
    String getName_course()
    {
        return this.name_course;
    }
    int getCredits()
    {
        return this.credits;
    }
    void add_courseprofs(String s)
    {
        this.course_profs.add(s);
        //System.out.println("IN course prof "+this.getName_course());
        //System.out.println(s+"\n");
    }
    void remove_courseprofs(String s){
        this.course_profs.removeIf(sk-> sk.equals(s));
    }
    boolean search_prof(String s)
    {
       // int i=0;
        //System.out.println("we start");
        //System.out.println(this.getName_course());
//        while(i!=this.course_profs.size()) {
//            System.out.println(this.course_profs);
//            i++;
//        }
        if(this.course_profs.indexOf(s)!=-1)
            return true;
        return false;
    }
    int size_profs_array()
    {
        return this.course_profs.size();
    }
}
