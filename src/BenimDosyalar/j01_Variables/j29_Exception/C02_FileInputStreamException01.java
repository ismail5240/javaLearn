package BenimDosyalar.j01_Variables.j29_Exception;

import java.io.FileInputStream;
import java.io.IOException;

public class C02_FileInputStreamException01 {

    public static void main(String[] args) throws IOException {//IO işlemleri en parent class exception
   // public static void main(String[] args) throws FileNotFoundException {// read() method import öncesichild exception


FileInputStream fis =new FileInputStream("C:\\Users\\ASUS\\IdeaProjects\\javaLearn\\src\\BenimDosyalar\\j01_Variables\\j_29_Exception\\Not Defteri");
//FileInputStream fis =new FileInputStream("C:\\Users\\ASUS\\IdeaProjects\\javaLearn\\src\\BenimDosyalar\\j01_Variables\\j_29_Exception\\Not Defteri");
  // ilgili dosyaya ulaşmak için  fis obj tanımlandı parametre olarak ulaşacak  dosya yolu girildi

        int k;

        while((k= fis.read())!=-1){//IOException -> evde yoksa controlu
            System.out.print((char)k);//k int  ascci olan file değeri char ici casting-> type dönüşümü
        }





    }
}
