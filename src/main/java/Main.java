import java.util.*;
import menu.Menu;
//히딩크이용목록/대표학생이름/학번/이용시간

public class Main { //메뉴 보여주는 메인클래스
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        int number;
        System.out.println("----히딩크 이용자 관리----");

        System.out.println("1 :: 예약현황 ");
        System.out.println("2 :: 예약등록 ");
        System.out.println("3 :: 예약 수정 ");
        System.out.println("4 :: 예약 삭제 ");
        System.out.println("5 :: 종료 ");

        System.out.print("번호를 입력하세요 : ");
        number = sc.nextInt();

        switch (number){
            case(1): //예약현황확인
                menu.showUse();
            case(2): //예약 등록
                menu.saveUse();
            case(3): //예약 내용 수정
                menu.updateUse();
            case(4): //예약 삭제
                menu.deleteUse();
            case(5): //종료
                System.out.println("프로그램을 종료합니다");
                System.exit(0);
        }
    }
}
