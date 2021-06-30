import java.util.*;
import menu.Menu;
import show.ShowMenu;
import use.Use;

//히딩크이용목록/대표학생이름/학번/이용시간

public class Main { //메뉴 보여주는 메인클래스
    public static void main(String[] args){
        ArrayList<Use> list;
        Scanner sc = new Scanner(System.in);
        use.getNumber=0;
        Use use = new Use();
        ShowMenu showmenu = new ShowMenu();
        FileService fileservice = new FileService();
        list = fileservice.readFile();

        while(true) {
            showmenu.show();
            showmenu.choice();
        }

    }
}
