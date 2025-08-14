import java.util.ArrayList;
import java.util.Scanner;


class Fruit {
    String name;
    double price;
    int stock;
    int demand;
            

    Fruit(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    };

    
    double TotalCost() {
        return price * demand;
    };
};


public class BelanjaBuah2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Fruit> AvailableFruits = new ArrayList<>();
            AvailableFruits.add(new Fruit("mangoe", 5000, 10));
        double total = 0;
        double FinalUnit = 0, bayar, kembalian;
        int a, user;
        boolean jalan = true;
while (jalan == true) {
            System.out.println("==================");
        System.out.println("Selamat datang di toko Sakti");
        System.out.println("klik 1 untuk penjual, klik 2 untuk pembeli, klik lainya untuk exit");
        user = input.nextInt();
        System.out.println("==================");
        boolean penjual;
        boolean penjual1, penjual2, penjual3, penjual4, penjual5;
        int actionPenjual;
        if (user == 1) {
            penjual = true;
            while (penjual == true) {
                System.out.println("==================");
                System.out.println("Berhasil Login sebagai penjual");
                System.out.println("==================");
                System.out.println("Stock saat ini");
            for(a = 0; a < AvailableFruits.size(); a++){
                System.out.println("Name: " + AvailableFruits.get(a).name + " Stock: " + AvailableFruits.get(a).stock + " Harga : " + AvailableFruits.get(a).price);
                };
                System.out.println("==================");
                System.out.println("apa yang ingin anda lakukan?");
                System.out.println("klik 1 untuk menambah item baru");
                System.out.println("klik 2 untuk mengubah nama item lama");
                System.out.println("klik 3 untuk mengubah harga item lama");
                System.out.println("klik 4 untuk mengubah stock item lama");
                System.out.println("klik 5 untuk menghapus item lama");
                System.out.println("klik 6 untuk log out");
                actionPenjual = input.nextInt();
                if (actionPenjual == 6) {
                    penjual = false;
                } else if (actionPenjual == 1 ){
                    penjual1 = true;
                    while (penjual1 == true) {
                        System.out.println("Menambahkan item baru selcted");
                        System.out.println("==================");
                        System.out.println("Masukkan nama item baru");
                        String newName = input.next();
                        System.out.println("Item " + newName + " created");
                        System.out.println("==================");
                        System.out.println("Masukkan harga item baru");
                        double newHarga = input.nextDouble();
                        System.out.println("==================");
                        System.out.println("Harga item baru set to " + newHarga);
                        System.out.println("==================");
                        System.out.println("Masukkan jumlah stock " + newName);
                        int newStock = input.nextInt();

                        Fruit newFruit = new Fruit(newName, newHarga, newStock);
                        AvailableFruits.add(newFruit);
                        System.out.println("==================");
                        System.out.println("Berhasil menambahkan item " + newName);
                        penjual1 = false;
                    }
                } else if(actionPenjual == 2){
                    penjual2 = true;
                    while (penjual2 == true) {
                        System.out.println("==================");
                        for(a = 0; a < AvailableFruits.size(); a++){
                            System.out.println("(" + a +")" + AvailableFruits.get(a).name);
                    };
                        System.out.println("==================");
                        System.out.println("nama item tagalog mana yang mau anda ubah");
                        int newTagalog = input.nextInt();
                        System.out.println("==================");
                        System.out.println("Masukkan nama baru");
                        AvailableFruits.get(newTagalog).name = input.next();
                        System.out.println("==================");
                        System.out.println("Updated name");
                        penjual2 = false;
                };
                } else if (actionPenjual == 3) {
                    penjual3 = true;
                    while (penjual3 == true) {
                        System.out.println("==================");
                        for(a = 0; a < AvailableFruits.size(); a++){
                        System.out.println("(" + a +")" + AvailableFruits.get(a).name + ": " + AvailableFruits.get(a).price);
                    };
                        System.out.println("==================");
                        System.out.println("Harga item tagalog mana yang mau anda ubah");
                        int newTagalog = input.nextInt();
                        System.out.println("==================");
                        System.out.println("Masukkan harga baru");
                        AvailableFruits.get(newTagalog).price = input.nextDouble();
                        System.out.println("==================");
                        System.out.println("Updated harga");
                        penjual3 = false;
                    }
                } else if (actionPenjual == 4) {
                    penjual4 = true;
                    while (penjual4 == true) {
                        System.out.println("==================");
                        for(a = 0; a < AvailableFruits.size(); a++){
                        System.out.println("(" + a +")" + AvailableFruits.get(a).name + ": " + AvailableFruits.get(a).stock);
                    };
                        System.out.println("==================");
                        System.out.println("Stock item tagalog mana yang mau anda ubah");
                        int newTagalog = input.nextInt();
                        System.out.println("==================");
                        System.out.println("Masukkan stock baru");
                        AvailableFruits.get(newTagalog).stock = input.nextInt();
                        System.out.println("==================");
                        System.out.println("Updated stock");
                        penjual4 = false;
                    }
                } else if (actionPenjual == 5) {
                    penjual5 = true;
                    while (penjual5 == true) {
                        System.out.println("==================");
                        for(a = 0; a < AvailableFruits.size(); a++){
                        System.out.println("(" + a +")" + AvailableFruits.get(a).name + "Harga: " + AvailableFruits.get(a).price + "Stock: " + AvailableFruits.get(a).stock);
                    };
                        System.out.println("==================");
                        System.out.println("Item tagalog mana yang mau anda hapus");
                        int newTagalog = input.nextInt();
                        AvailableFruits.remove(newTagalog);
                        penjual5 = false;
                    }
                }
                
            };


        } else if (user == 2) {
            System.out.println("==================");
            System.out.println("Berhasil Login sebagai pembeli");
            for(a = 0; a < AvailableFruits.size(); a++){
                System.out.println("Stock " + AvailableFruits.get(a).name + ": " + AvailableFruits.get(a).stock + " Harga : " + AvailableFruits.get(a).price);
                };
                System.out.println("==================");

            for(a = 0; a < AvailableFruits.size(); a++){
                System.out.println("Masukkan jumlah " + AvailableFruits.get(a).name + " yang ingin anda beli: ");
                AvailableFruits.get(a).demand = input.nextInt();
            while (AvailableFruits.get(a).demand > AvailableFruits.get(a).stock) {
                System.out.println("==================");
                System.out.println("Not enough in stock");
                System.out.println("==================");
                System.out.println("Masukkan jumlah " + AvailableFruits.get(a).name + " yang ingin anda beli: ");
                AvailableFruits.get(a).demand = input.nextInt();
        };
            System.out.println("==================");
            System.out.println(AvailableFruits.get(a).demand + " " + AvailableFruits.get(a).name + "(s) added to cart");
            System.out.println("==================");
        };

        for(a = 0; a < AvailableFruits.size(); a++){
            total += AvailableFruits.get(a).TotalCost();
        };
        for(a = 0; a < AvailableFruits.size(); a++){
            FinalUnit += AvailableFruits.get(a).demand;
        };

        System.out.println("==================");
        for(a = 0; a < AvailableFruits.size(); a++){
            System.out.println("Jumlah " + AvailableFruits.get(a).name + ": " + AvailableFruits.get(a).demand + " X " + AvailableFruits.get(a).price);
        };
        System.out.println("Total unit: " + FinalUnit);
        System.out.println("==================");
        System.out.println("Total: " + total);
        System.out.println("==================");
        System.out.println("Masukkan pembayaran: ");
        bayar = input.nextDouble();
        while (total > bayar) {
            System.out.println("==================");
            System.out.println("Not enough paid");
            System.out.println("==================");
            System.out.println("Pembayaran kurang: " + (total - bayar));
            System.out.println("Tambahkan uang pembayaran sebanyak");
            bayar += input.nextInt();
        }
        kembalian = bayar - total;

        System.out.println("==================");
        System.out.println("Pembayaran Berhasil");
        System.out.println("==================");
        for(a = 0; a < AvailableFruits.size(); a++){
            System.out.println(AvailableFruits.get(a).name + " " + AvailableFruits.get(a).demand + " X : " + AvailableFruits.get(a).TotalCost());
        };
        System.out.println("Total unit: " + FinalUnit);
        System.out.println("==================");
        System.out.println("Harga Total: " + total);
        System.out.println("Pembayaran sebesar: " + bayar);
        System.out.println("Kembalian: " + kembalian);
        System.out.println("==================");
        jalan = false;
        } else{
            jalan = false;
        }
};
    };
};