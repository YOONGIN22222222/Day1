package show;
import java.util.*;
import menu.Menu;

public class ShowMenu {
    Menu menu = new Menu();
    private int number;
    public void show() {
        Scanner sc = new Scanner(System.in);
        System.out.println("----히딩크 이용자 관리----");

        System.out.println("1 :: 예약현황 ");
        System.out.println("2 :: 예약등록 ");
        System.out.println("3 :: 예약 수정 ");
        System.out.println("4 :: 예약 삭제 ");
        System.out.println("5 :: 종료 ");

        System.out.print("번호를 입력하세요 : ");
        number = sc.nextInt();
    }
    public void choice() {
        switch (number) {
            case (1): //예약현황확인
                menu.showUse();
                break;
            case (2): //예약 등록
                menu.saveUse();
                break;
            case (3): //예약 내용 수정
                menu.updateUse();
                break;
            case (4): //예약 삭제
                menu.deleteUse();
                break;
            case (5): //종료
                System.out.println("프로그램을 종료합니다");
                System.exit(0);
        }
    }
    }

