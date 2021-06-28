import java.util.*;

//이용자명, 대표학생학번, 이용날짜, 이용시간
public class Use {
    Scanner sc = new Scanner(System.in);

    private String name;
    private int stuNumber;
    private int dayNumber;//이용 요일
    private String dayTime;//이용시간
    private boolean useAvailable;
    private ArrayList<Use> useList = new ArrayList<Use>();


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

    public int getdayNumber() {
        return dayNumber;
    }

    public void setdayNumber(int dayNumber) {
        this.dayNumber = dayNumber;
    }

    public String getdayTime() {
        return dayTime;
    }

    public void setdayTime(String dayTime) {
        this.dayTime = dayTime;
    }

    public boolean getAvailable() {
        return useAvailable;
    }

    public void setAvailable(boolean useAvailable) {
        this.useAvailable = useAvailable;
    }





        public void printMenu(){
            System.out.println("----welcome----");

            System.out.println("1 :: 월요일 \n2 :: 화요일 \n 3 :: 수요일 \n 4 :: 목요일 \n 5 :: 금요일 \n 6 :: 토요일 \n 7 :: 일요일 \n ");
            System.out.print("원하는 요일의 번호를 입력하세요 : ");
            stuNumber = sc.nextInt();

            switch (stuNumber){
                case(1):
                    showUse();
                case(2):
                    showUse();
                case(3):
                    showUse();
                case(4):
                    showUse();
                case(5):
                    showUse();
                case(6):
                    showUse();
                case(7):
                    showUse();


            }
        }

        public void showUse(){ //요일_ 시간대별 이용유무 표시

        }
        public void saveUse(){ //이용자 한명이 본인 예약 등록시

            try//이용하시겠습니까의 질문에 y로 대답시 실행되도록
            {
                System.out.print("이용시간 입력 : ");
                String hour = sc.nextLine();
                System.out.print("대표학생 이름/단체명 입력 : ");
                String name = sc.nextLine();
                System.out.print("대표학생 학번입력(예 22100641) :");
                int stuNumber = sc.nextInt();

            }
            catch (InputMismatchException e)
            {
                System.out.println("형식에 맞게 입력하세요.");
                sc.nextLine();
            }
        }





}
