package menu;
import java.util.*;
import use.Use;

public class Menu {
ArrayList<Use>useArr = new ArrayList<Use>();
Scanner sc = new Scanner(System.in);
    String answer;
    int dNumber;


    public void showUse() { //시간대별 이용유무 표시
        String per = "OO";
        System.out.println();
        System.out.println("시간대별 예약자 현황");

        if (useArr.size() == 0) {
            for (int i = 9; i < 22; i++) {
                System.out.println("모든시간 예약가능합니다");
            }
            System.out.println();
        } else {
            for (int n = 0; n < useArr.size(); n++) {
                System.out.print(useArr.get(n).getdayTime()+"시 ~  "+(useArr.get(n).getdayTime()+1)+"시  " );
                System.out.print(useArr.get(n).getstuNo());
                System.out.println(" "+useArr.get(n).getname());
            }
        }
    }





    public void saveUse() { //이용자 한명이 본인 예약 등록시
        int hour;
        int cnt = 0;
        Use use = new Use();
        System.out.print("이용시작시간 입력(ex: 9) : ");
            hour = sc.nextInt();
            //시간이 중복되는지 안되는 지 확인
            if(useArr.size()==0) {
                cnt = 0;
            }
            else if(useArr.size()>=0){
                for (int i = 0; i < useArr.size(); i++) {
                    if (hour == useArr.get(i).getdayTime()) {
                        cnt++;
                    }
                }//end for
            }
                if (cnt == 0) {

                 use.setdayTime(hour);
                System.out.println("대표학생 이름/단체명 입력 : ");
                String name = sc.next();
                use.setname(name);
                System.out.println("대표학생 학번입력(예 22100641) :");
                int stuNumber = sc.nextInt();
                use.setstuNo(stuNumber);

            use.Use(hour,stuNumber,name);
            useArr.add(use);
            System.out.println(useArr);

            } else {
                System.out.println("이미 이용중인 시간입니다.");
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
        int n=0;
        while(true) {
            System.out.println("삭제를 원하는 학생의 학번을 입력해주세요.");
            dNumber = sc.nextInt();
            for (int i = 0; i < useArr.size(); i++) {
                if (dNumber == useArr.get(i).getstuNo()) {
                    n+=1;
                    useArr.remove(i);
                    break;
                }

            }
            if (n == 0) {
                System.out.println("해당 학번의 예약내역이 존재하지 않습니다");
                break;
            }else{
                System.out.println(dNumber + "학생의 예약시간 삭제 완료");
                break;
            }
        }


    }
}
