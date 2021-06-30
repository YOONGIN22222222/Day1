package menu;
import java.util.*;
import use.Use;
import java.io.*;
import use.Use;

public class Menu {
Scanner sc = new Scanner(System.in);
    String answer;
    int dNumber;
BufferedReader br;

    public void showUse(ArrayList<Use> list) { //시간대별 이용유무 표시
        String per = "OO";
        System.out.println();
        System.out.println("시간대별 예약자 현황");

        if (list.size() == 0) {
            for (int i = 9; i < 22; i++) {
                System.out.println("모든시간 예약가능합니다");
                return;
            }
            System.out.println();
        } else {
            for (int n = 0; n < list.size(); n++) {
                System.out.println(list.get(n).getdayTime()+"시 ~  "+(list.get(n).getdayTime()+1)+"시  "+list.get(n).getstuNo() +" "+list.get(n).getname() );
            }
        }
    }


    public void saveUse() { //이용자 한명이 본인 예약 등록시
        int num;
        int hour;
        int cnt = 0;
        Use use = new Use();

        num = list.size();

        System.out.print("이용시작시간 입력(ex: 9) : ");
            hour = sc.nextInt();
            //시간이 중복되는지 안되는 지 확인
            if(list.size()==0) {
                cnt = 0;
            }
            else if(list.size()>=0){
                for (int i = 0; i < list.size(); i++) {
                    if (hour == list.get(i).getdayTime()) {
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
            list.add(use);
            System.out.println(list);

            } else {
                System.out.println("이미 이용중인 시간입니다.");
            }
        //Use(int dayTime, int stuNumber, String name)
        Use u = new Use(num,dayTime,stuNumber, name);

        return u;
    }



    public void updateUse(){ //수정
        while(true){
            //수정할 대표학생의 학번 입력
            System.out.println("수정할 대표학생의 학번 입력바랍니다");
            int Number = sc.nextInt();
            int n=0;
            for(int i=0; i<list.size();i++){
                if(Number ==list.get(i).getstuNo()){
                    System.out.println("시작 이용시간 입력바랍니다 ");
                    list.get(i).setdayTime(sc.nextInt());
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
            for (int i = 0; i < list.size(); i++) {
                if (dNumber == list.get(i).getstuNo()) {
                    n+=1;
                    list.remove(i);
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
