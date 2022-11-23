package BenimDosyalar.j01_Variables.j36_Map.Task;

import java.util.HashMap;
import java.util.Map;

public class Task02 {
    public static void main(String[] args) {
        /*
        Task ->
         Key:isim ,email,adres,telefon
         Key2lere ait valueeleri depolayan bir kartvizit  map ve isim Key'e kartvizit map'i value tanımlayan farklı bir map tanımlayıp
         print eden code create ediniz
         */
          Map<String, String> nasımKrtvzt = new HashMap<>();
          nasımKrtvzt.put("isim","Nazım");
          nasımKrtvzt.put("email","nazım@gmail.com");
          nasımKrtvzt.put("adres","nazilli");
          nasımKrtvzt.put("telefon","05346523478");

          Map<String, String>mehmetKrtvzt = new HashMap();
          mehmetKrtvzt.put("isim","mehmet");
          mehmetKrtvzt.put("email","mehmet.@gmail.com");
          mehmetKrtvzt.put("adres","aydın");
          mehmetKrtvzt.put("telefon","05423697854");

          Map<String, Map<String, String>>kartvizit=new HashMap<>();
          kartvizit.put("QA Nazım",nasımKrtvzt);
          kartvizit.put("QA mehmet",mehmetKrtvzt);

        System.out.println("kartvizit = " + kartvizit);
          System.out.println("kartvizit.get(\"QA Mehmet\").get(\"telefon\") = " + kartvizit.get("QA Mehmet").get("telefone"));




        Map<Integer,Kartvizit> krt=new HashMap<>();
        Kartvizit k1=new Kartvizit("Enise","enise@tester.com","google company","1905");
        krt.put(k1.id, k1);
        System.out.println("krt = " + krt);
        System.out.println("krt.get(k1.id) = " + krt.get(k1.id));//k1.id key values:isim='Enise', email='enise@tester.com', adres='google company', telefon='1905'
        System.out.println("krt.get(k1.id) = " + krt.get(101));//101 key values:isim='Enise', email='enise@tester.com', adres='google company', telefon='1905'

    }
}


//semihMap.get(isim) = Semih Nerde
//        semihMap.get(telefon) = 0 532 230000
//        ismailKartvizit.get(isim) = İsmail Demir
//        ismailKartvizit.get(telefon) = 0 546 450000
//        semih in telefonu = 0 532 230000
//        ismail in bilgileri = {telefon=0 546 450000, adres=Amsterdam/Hollanda, email=ismail@gmail.com, isim=İsmail Demir}
//        kartvizitler = {ismail={telefon=0 546 450000, adres=Amsterdam/Hollanda, email=ismail@gmail.com, isim=İsmail Demir}, semih={telefon=0 532 230000, adres=Frkanfurt/Almanya, email=Semih@hotmail.com, isim=Semih Nerde}}
