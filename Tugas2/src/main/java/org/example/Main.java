class Herbivora {
    String nama="sapi",makanan="rumput";

    void makan() {
        System.out.println(nama + " " + "memakan" + " " + makanan);
    }
}

public class Main {
    public static void main(String[] args) {
        Herbivora herbivora = new Herbivora();
        System.out.println("nama: " + herbivora.nama);
        System.out.println("makanan: " + herbivora.makanan);
        herbivora.makan();
    }
}
