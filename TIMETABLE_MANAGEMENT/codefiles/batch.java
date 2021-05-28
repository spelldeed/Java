package TIMETABLE_MANAGEMENT;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class batch extends timetablee
{

    static Random rand = new Random();
    ArrayList<String> profs_in_batch = new ArrayList<>();
    ArrayList<Integer> track_of_empty_slots = new ArrayList<Integer>();
    ArrayList<String> courses_in_batch = new ArrayList<>() ;
    int add(course c, professor p)
    {
        if(c.search_prof(p.getProf_name())) {
            for (int i = 0; i <= (5); i++) {
                for (int j = 0; j <= 7; j++) {
                    if ((this.a[i][j] == null) && (p.a[i][j] == null))
                        track_of_empty_slots.add(i * 10 + j);
                }
            }
            int x, y;
            if (track_of_empty_slots.size() >= c.getCredits()) {
                for (int i = 0; i <= c.getCredits(); i++) {
                    int k = rand.nextInt(track_of_empty_slots.size());
                    x = track_of_empty_slots.get(k) / 10;
                    y = track_of_empty_slots.get(k) % 10;
                    this.a[x][y] = c.getName_course() + "\n(" + p.getProf_name() + ")";
                    p.a[x][y] = c.getName_course() + "\n(" + this.getBatch_name() + ")";
                    track_of_empty_slots.remove(k);
                }
                courses_in_batch.add(c.getName_course());
                track_of_empty_slots.clear();
                return 1;
            }
            track_of_empty_slots.clear();
            return 2;
        }

        return 3;
    }
    void removeprofs(String s)
    {
        this.profs_in_batch.remove(new String(s));
        System.out.println(profs_in_batch);
        for(int i=0;i<=5;i++)
        {
            for(int j=0;j<=7;j++) {

                try {
                    String str = this.a[i][j];
                    if(str!=null) {
                        if (str.substring(str.indexOf("(") + 1, str.indexOf(")")).equals(s))
                            this.a[i][j] = "";
                    }
                } catch (StringIndexOutOfBoundsException e)
                {
                    //e.printStackTrace();
                }
            }
        }
    }
    void Extract_old_profs() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 7; j++) {
                String str = this.a[i][j];
                if ((str != null)&&(!str.trim().isEmpty())&&(this.profs_in_batch.indexOf(str.substring(str.indexOf("(")+1,str.indexOf(")")))==-1)) {
                    this.profs_in_batch.add(str.substring(str.indexOf("(") + 1, str.indexOf(")")));
                }
            }
        }
    }
    void Extract_old_courses()
    {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 7; j++) {
                String str = this.a[i][j];
                if ((str!=null)&&(!str.trim().isEmpty())&&(this.courses_in_batch.indexOf(str.substring(0,str.indexOf("(")))==-1)) {
                    this.courses_in_batch.add(str.substring(0, str.indexOf("(")));
                }
            }
        }
    }


}
