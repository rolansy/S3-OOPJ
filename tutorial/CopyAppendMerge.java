package tutorial;
import java.io.*;
public class CopyAppendMerge{
    public static void main(String[] args) {
        String f1="File1.txt";
        String f2="File2.txt";
        String fm="Merged.txt";
    }
    try{
        BufferedReader br1=new BufferedReader(new FileReader(f1));
        BufferedReader br2=new BufferedReader(((new FileReader(f2));
        BufferedWriter bmw=new BufferedWriter(new FileWriter(fm));
    }
}