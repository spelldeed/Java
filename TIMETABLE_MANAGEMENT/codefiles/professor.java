package TIMETABLE_MANAGEMENT;



import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class professor extends timetablee
{
    private ArrayList<String> courses = new ArrayList<String>();
    ArrayList<String> batches_under_profs = new ArrayList<>();

    private String prof_name;
    boolean addCourses(String s)
    {
        //System.out.println("Added course " + s + " to "+this.prof_name);
        return this.courses.add(s);
    }
    ArrayList<String> returnCourses()
    {
        //System.out.println(this.courses.size());
        return this.courses;
    }
    String getProf_name()
    {
        return this.prof_name;
    }
    void setProf_name(String s)
    {
        this.prof_name = s;
    }
    void Extract_old_batches()
    {
        for(int i=0;i<=5;i++)
        {
            for (int j=0;j<=7;j++) {
                try {
                    String str = this.a[i][j];
                    if ((str != null)&&(this.batches_under_profs.indexOf(str.substring(str.indexOf("(") + 1, str.indexOf(")")))==-1)) {
                        this.batches_under_profs.add(str.substring(str.indexOf("(") + 1, str.indexOf(")")));
                    }
                }
                catch (StringIndexOutOfBoundsException e)
                {
                    //e.printStackTrace();
                }

            }
        }
    }
    void removebatch(String k)
    {
        this.batches_under_profs.remove(new String(k));
        System.out.println(batches_under_profs);
        for(int i=0;i<=5;i++)
        {
            for(int j =0;j<=7;j++)
            {

                try {
                    String str = this.a[i][j];
                    if (str != null)
                    {
                        if (str.length() >= 1) {
                            if (str.substring(str.indexOf("(") + 1, str.indexOf(")")).equals(k)) {
                                this.a[i][j] = "";
                            }
                        }
                    }
                }
                catch(StringIndexOutOfBoundsException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
    void Extract_old_courses_Professor()
    {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 7; j++) {
                try {
                    //System.out.println("inside the loop of Extract_old_courses_professors for "+this.getProf_name());
                    String str = this.a[i][j];
                    //System.out.println(i + "  " + j + " "+ str);
                    if ((str != null) &&(this.courses.indexOf(str.substring(0,str.indexOf("(")))==-1))
                    {
                        //System.out.println("course extracted for "+this.prof_name+" course "+ str);
                        this.courses.add(str.substring(0, str.indexOf("(")));
                    }
                }catch (StringIndexOutOfBoundsException e)
                { }
            }
        }
    }

}
