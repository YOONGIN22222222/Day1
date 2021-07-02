package use;

//이용자명, 대표학생학번, 이용시간
public class Use {

    public String name;
    public int stuNumber;
    public int dayTime;//이용시간
    public int i;


    public Use(int i, int dayTime, int stuNumber, String name) {
        this.i = i;
        this.dayTime = dayTime;
        this.stuNumber = stuNumber;
        this.name = name;
    }

    public int getI(){
        return i;
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



}
