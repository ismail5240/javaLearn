package BenimDosyalar.j01_Variables.proje_21_11_22.depoYonetimi02;

public class Product {
    int id;
    int quantity;
    String name;
    String producer;
    String unit;
    String shelf;

    Product() {

    }

    Product(int id, String name, String producer, String unit) {
        this.id = id;
        this.name = name;
        this.producer = producer;
        this.unit = unit;
    }
}