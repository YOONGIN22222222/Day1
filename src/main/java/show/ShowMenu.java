package show;
import java.io.*;
public class ShowMenu {
    BufferedReader br;
    public String show() throws IOException{

        System.out.println("--------------");
        System.out.println("히딩크 예약관리");
        System.out.println("--------------");
        System.out.println("1. 예약현황확인");
        System.out.println("2. 예약 등록");
        System.out.println("3.예약시간 수정");
        System.out.println("4. 예약삭제");
        System.out.println("5. 파일에 저장");

        System.out.println("6. 프로그램 종료");

        System.out.println("원하는 기능의 번호를 선택하세요.");
        br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();

    }
}
