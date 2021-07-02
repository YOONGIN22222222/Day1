
import menu.Menu;
import show.ShowMenu;
import use.Use;
import fileService.FileService;
import java. util.ArrayList;
//히딩크이용목록/대표학생이름/학번/이용시간

public class Main { //메뉴 보여주는 메인클래스
    public static void main(String[] args) {
        FileService fileService = new FileService();
        ShowMenu showM = new ShowMenu();
        ArrayList<Use> list;
        list = fileService.readFile();
        Menu menu = new Menu();

        while (true) {

            try {
                String number = showM.show();
                switch (number) {
                    case "1": //예약현황확인
                        menu.showUse();
                        break;
                    case "2": //예약 등록
                        menu.saveUse();
                        break;
                    case "3": //예약 내용 수정
                        menu.updateUse();
                        break;
                    case "4": //예약 삭제
                        menu.deleteUse();
                        break;
                    case "5"://파일에 기록
                        fileService.writeFile(list);
                        System.out.println("파일이 기록되었습니다.");
                        break;
                    case "6": //프로그램 종료
                        System.out.println("프로그램을 종료합니다");
                        System.exit(0);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}


