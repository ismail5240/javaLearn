package BenimDosyalar.j01_Variables.proje_21_11_22.depoYonetimi02;

import java.util.ArrayList;

public interface Planning {
    int idBase = 1001;

    void pSpecification(String name, String producer, String unit);
    ArrayList<Product> pList();
    void pShelving(int id, String shelf);//bu methoa-d su aksi



}