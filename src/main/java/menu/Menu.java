package menu;
import java.util.*;
import use.Use;

public class Menu {
ArrayList<Use>useArr = new ArrayList<Use>();
Scanner sc = new Scanner(System.in);
    String answer;


    public void showUse() { //시간대별 이용유무 표시
        String per = "OO";
        System.out.println();
        System.out.println("시간대별 예약자 현황");
        int n = 0;
        if (useArr.size() == 0) {
            for (int i = 9; i < 22; i++) {
                System.out.println(i + "시 ~ " + (i + 1) + "시  :  사용가능");
            }
            System.out.println();
        } else {
            while (n < useArr.size()) {
                for (int i = 9; i < 21; i++) {
                    System.out.println("출력됨");
                    if (i == useArr.get(n).getdayTime())
                        per = "XX";
                    else
                        per = "OO";

                    System.out.println(i + "시 ~" + (i + 1) + "시  :  " + per);
                    ++n;
                }
            }
        }
    }




    public void saveUse(){ //이용자 한명이 본인 예약 등록시
        System.out.println("예약을 희망하십니까?(y/n)");
       answer = sc.nextLine();
        Use use = new Use();
        while(answer.equals("y")){

            while(true) {
                //시간이 중복되는지 안되는 지 확인
                int n=0;
                System.out.print("이용시작시간 입력(ex: 9) : ");
                int hour = sc.nextInt();
                for (int i = 9; i<= useArr.size(); i++){
                    if (hour==useArr.get(i).getdayTime()){
                        n++;
                        System.out.println("이미 이용중인 시간입니다. 다시 입력하세요.");

                    } // end if

                } // end for
                if(n==0)
                    use.setdayTime(hour);

                break;
            }
            System.out.print("대표학생 이름/단체명 입력 : ");
            String name = sc.nextLine();
            use.setname(name);
            System.out.print("대표학생 학번입력(예 22100641) :");
            int stuNumber = sc.nextInt();
            use.setstuNo(stuNumber);

            break;


        }

    }

    public void updateUse(){ //수정
        while(true){
            //수정할 대표학생의 학번 입력
            System.out.println("수정할 대표학생의 학번 입력바랍니다");
            int Number = sc.nextInt();
            int n=0;
            for(int i=0; i< useArr.size();i++){
                if(Number ==useArr.get(i).getstuNo()){
                    System.out.println("시작 이용시간 입력바랍니다 ");
                    useArr.get(i).setdayTime(sc.nextInt());
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
            for (int i = 0; i < useArr.size(); i++) {
                if (dnumber==useArr.get(i).getstuNo()){
                    useArr.get(i).dayTime=0;
                    useArr.get(i).stuNumber =0;
                    useArr.get(i).name="";
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
