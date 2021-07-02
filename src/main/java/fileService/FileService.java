package fileService;

import org.apache.commons.io.FileUtils;
import use.Use;
import java.io.*;

import java.nio.file.Paths;
import java.util.*;



public class FileService {
    //ArrayList<Use> list = new ArrayList();


    public ArrayList<Use> readFile() { //txt파일에 저장된 정보를 가져와서 내 프로그램에 다시 나타나도록
        ArrayList<Use> list = new ArrayList<>();
        try {
            File file = new File("data.txt");
            FileReader reader = new FileReader(file);
            BufferedReader bufReader = new BufferedReader(reader);
            String line = "";
            int i = 0;
//            System.out.println(filename);
//            FileReader filereader = new FileReader(file);
//            BufferedReader bufReader = new BufferedReader(filereader);
//
//            int i =0;
//            String line = " ";

            while ((line = bufReader.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(line, " ");

                i=Integer.parseInt(st.nextToken().trim());
                int dayTime = Integer.parseInt(st.nextToken().trim());
                int stuNumber = Integer.parseInt(st.nextToken().trim());
                String name = st.nextToken().trim();

                list.add(new Use(i, dayTime, stuNumber, name));
                i++;
            }
            bufReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("data.txt 파일이 존재하지 않습니다.");
        } catch (IOException e) {
            System.out.println("IO 예외처리");
        }
        return list;
    }

    public void writeFile(ArrayList<Use> list) { //우리가 프로그램 돌리면 여기 정보들이 txt파일에 저장되도록
        try {
            String path = Paths.get(".").toAbsolutePath().toString();
            String filename = path + "/data.txt";
            File file = new File(filename); //파일 객체
            System.out.println(filename);
            FileWriter fw = new FileWriter(file, false);
            for (int n=0; n<list.size();n++) {
                fw.write(list.get(n).getI()+" "+list.get(n).getdayTime() + " " + list.get(n).getstuNo() + " " + list.get(n).getname() + "\n");
            }//            list.add(new Use(i, dayTime, stuNumber, name));
            fw.flush();
            fw.close();
            System.out.println("파일저장완료!!!");
        }
        catch (FileNotFoundException e) {
            System.out.println(("data.txt 파일이 존재하지 않습니다."));
        } catch (IOException e) {
            System.out.println();
        }

        System.out.println("잘 저장되었습니다.");

    }
}

