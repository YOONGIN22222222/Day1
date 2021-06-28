package use;
import java.util.*;


//이용자명, 대표학생학번, 이용시간
public class Use {

    public String name;
    public int stuNumber;
    public int dayTime;//이용시간
    public String useP;
    private String answer;

    public Use() {

    }

    public int getstuNo() {
        return stuNumber;
    }

    public void setstuNo(int stuNumber) {
        this.stuNumber = stuNumber;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public int getdayTime() {
        return dayTime;
    }

    public void setdayTime(int dayTime) {
        this.dayTime = dayTime;
    }

   public Use(String name, int stuNumber,int dayTime){
        super();
        this.name = name;
        this.stuNumber = stuNumber;
        this.dayTime = dayTime;
   }


    public void remove(int i) {
    }
}
