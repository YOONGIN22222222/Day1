import java.util.*;

//이용자명, 대표학생학번, 이용시간
public class Use {
    Scanner sc = new Scanner(System.in);

    private String name;
    private int stuNumber;
    private String dayTime;//이용시간
    private boolean useAvailable;
    private ArrayList<Use> useList = new ArrayList<Use>();
    private String useP;
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
            System.out.println("----히딩크 이용자 관리----");

            System.out.println("1 :: 예약현황 \n2 :: 예약등록 \n 3 :: 예약 수정 \n 4 :: 예약 삭제 \n 5 :: 종료");
            System.out.print("번호를 입력하세요 : ");
            stuNumber = sc.nextInt();

            switch (stuNumber){
                case(1): //예약현황확인
                    showUse();
                case(2): //예약 등록
                    saveUse();
                case(3): //예약 내용 수정

                case(4): //예약 삭제

                case(5): //종료
                    break;
            }
        }

        public void showUse(){ //시간대별 이용유무 표시
        //아침 9시부터 밤10시까지 이용가능
            //9:00-10:00 XX 또는 OO 출력

            for(int i=9; i<21; i++){
                if(i.equals(useList.get(i).getdayTime()))
                    useP = "XX";
                else
                    useP ="OO";

                System.out.println(i+"시 -"+i+1+"시  :  " + useP);
            }
            System.out.println();
        printMenu();
        }

        public void saveUse(){ //이용자 한명이 본인 예약 등록시
            System.out.println("예약을 희망하십니까?(y/n)");
            answer = sc.nextLine();

            while(answer=="y"){
                Use use = new Use();
                while(true) {
                //시간이 중복되는지 안되는 지 확인
                    int n=0;
                    System.out.print("이용시작시간 입력(ex: 9) : ");
                    String hour = sc.next();
                    for (int i = 9; i<=useList.size(); i++){
                        if (hour.equals(useList.get(i).getdayTime())){
                            n++;
                            System.out.println("이미 이용중인 시간입니다. 다시 입력하세요.");
                            break;
                        } // end if
                    } // end for
                    if(n==0)
                        use.setdayTime(hour);

                        break;
                }
                System.out.print("대표학생 이름/단체명 입력 : ");
                String name = sc.nextLine();
                setname(name);
                System.out.print("대표학생 학번입력(예 22100641) :");
                int stuNumber = sc.nextInt();
                setstuNo(stuNumber);

            }
            printMenu();
            }

            public void updateUse(){ //수정
            while(true){
             //수정할 대표학생의 학번 입력
                System.out.println("수정할 대표학생의 학번 입력바랍니다");
                int Number = sc.nextInt();
                int n=0;
                for(int i=0; i<useList.size();i++){
                    if(Number.equals(useList.get(i).getstuNo())){
                        System.out.println("시작 이용시간 입력바랍니다 ");
                        useList.get(i).setdayTime(sc.nextLine());
                    n++;
                    System.out.println(" 이용시간 수정이 완료되었습니다.");
                    break;
                    }

                }
                if(n==0){
                    System.out.println("해당 학번의 예약내역이 존재하지 않습니다.");
                }
                else{
                    break;
                }
            }
            }

            public void deleteUse(){ //삭제
            while(true) {
                System.out.println("예약시간 삭제를 원하는 학생의 학번을 입력해주세요.");
                int dnumber = sc.nextInt();
                int n = 0;
                for (int i = 0; i < useList.size(); i++) {
                    if (dnumber.equals(useList.get(i).getstuNo())) {
                        useList.remove(i);
                        n++;
                        System.out.println(dnumber + "학생의 예약시간 삭제 완료");
                        break;
                    }
                }
                if (n == 0) {
                    System.out.println("해당 학번의 예약내역이 존재하지 않습니다");
                }else{
                    break;
                }
            }
            }









}
