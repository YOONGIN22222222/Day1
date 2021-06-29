import java.util.*;
import menu.Menu;
import show.ShowMenu;
import use.Use;

//히딩크이용목록/대표학생이름/학번/이용시간

public class Main { //메뉴 보여주는 메인클래스
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Use use = new Use();
        use.getNumber=0;
        ShowMenu showmenu = new ShowMenu();
        while(true) {
            showmenu.show();
            showmenu.choice();
        }

    }
}
