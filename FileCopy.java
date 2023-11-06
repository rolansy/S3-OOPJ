import java.io.*;
public class FileCopy {
    public static void main(String[] args) throws IOException {
        FileInputStream f1=null;
        FileOutputStream f2=null;
        try{
            f1=new FileInputStream("Trial.txt");
            f2= new FileOutputStream("Copy.txt");
            int c;
            do{
                c=f1.read();
                if(c!=-1){
                    f2.write((char)c);
                }while (c!=-1);
            }
        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
        }
    }
}