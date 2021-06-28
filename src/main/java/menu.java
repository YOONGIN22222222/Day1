
import java.util.Scanner;
import java.util.InputMismatchException;

public class menu {
    private Scanner scanner = new Scanner(System.in);
    private int number;

    public void printMenu() {
        System.out.println("----시작----");

        System.out.println("1 :: 월요일");
        System.out.println("2 :: 화요일");
        System.out.println("3 :: 수요일");
        System.out.println("4 :: 목요일");
        System.out.println("5 :: 금요일");
        System.out.println("6 :: 토요일");
        System.out.println("7 :: 일요일");

        System.out.print("원하는 요일의 번호를 입력하세요 : ");
        number = scanner.nextInt();
    }

    public void showUse(){ //요일_ 시간대별 이용유무 표시

    }
    public void saveUse(){ //이용자 한명이 본인 예약 등록시

        try//이용하시겠습니까의 질문에 y로 대답시 실행되도록
        {
            System.out.print("이용시간 입력 : ");
            String hour = scanner.nextLine();
            System.out.print("대표학생 이름/단체명 입력 : ");
            String name = scanner.nextLine();
            System.out.print("대표학생 학번입력(예 22100641) :");
            int stuNumber = scanner.nextInt();

        }
        catch (InputMismatchException e)
        {
            System.out.println("형식에 맞게 입력하세요.");
            scanner.nextLine();
        }
    }


}
