import java.io.*;
import java.nio.file.Paths;
import java.util.*;

import use.Use;

public class FileService {

    String path = Paths.get(".").toAbsolutePath().toString();
    String filename = path + "/data.txt";

    public ArrayList<Use> readFile(){ //txt파일에 저장된 정보를 가져와서 내 프로그램에 다시 나타나도록
    try
    {
        File file = new File(filename); //파일 객체 생성
        FileReader filereader = new FileReader(file); //입력 스트림 생성
        BufferedReader bufReader = new BufferedReader(filereader); //입력 버퍼 생성

        int i = 0;
        String line = "";
        while ((line = bufReader.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(line, "/");
            //Use(int dayTime, int stuNumber, String name)
            int dayTime = Integer.parseInt(st.nextToken().trim());
            int stuNumber = Integer.parseInt(st.nextToken().trim());
            String name = st.nextToken().trim();

            list.add(new Use(i,dayTime, stuNumber, name)); //i를 넣어야하는지? 말아야하는지. 내 기본 Use클래스에서는 i가 쓰이지 않음
            i++;
        }
        bufReader.close();
    }catch(FileNotFoundException e){
        System.out.println("data.txt 파일이 존재하지 않습니다.");
    }catch(IOException e){
        System.out.println(e);
    }
        return list;

    }

    public void writeFile(ArrayList<Use> list) { //우리가 프로그램 돌리면 여기 정보들이 txt파일에 저장되도록
    try{
            File file = new File(filename); //파일 객체
            BufferedWriter bw = new BufferedWriter(new FileWriter(file)); //쓰기버퍼 생성
            for (Use u: this.list) { //Use(int dayTime, int stuNumber, String name)
                bw.write(u.getdayTime() + " / " + u.getstuNo() + " / " + u.getname() );
                bw.newLine();
            }
            bw.close();
    }catch (FileNotFoundException e) {
        System.out.println(filename+" 파일이 존재하지 않습니다.");
        }catch(IOException e){
        System.out.println(e);
        }
        }
        }
    }