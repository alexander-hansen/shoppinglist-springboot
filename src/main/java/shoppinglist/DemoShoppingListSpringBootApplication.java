package shoppinglist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import shoppinglist.entity.DaftarBelanja;
import shoppinglist.entity.DaftarBelanjaDetil;
import shoppinglist.repository.DaftarBelanjaRepo;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

@SpringBootApplication
public class DemoShoppingListSpringBootApplication implements CommandLineRunner
{
    @Autowired
    private DaftarBelanjaRepo repo;

    public static void main(String[] args)
    {
        SpringApplication.run(DemoShoppingListSpringBootApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //cari berdasarkan id
        Scanner sc = new Scanner(System.in);
        List<DaftarBelanja> all = repo.findAll();
//        System.out.println("membaca semua record DaftarBelanja:");
//        for (DaftarBelanja db : all) {
//            System.out.println(db.getJudul());
//            List<DaftarBelanjaDetil> listBarang = db.getDaftarBarang();
//            for (DaftarBelanjaDetil barang : listBarang) {
//                System.out.println("\t" + barang.getNamaBarang() + " " + barang.getByk() + " "  + barang.getSatuan());
//            }
//        }

        //search by id
        System.out.println("mencari daftar belanja");
        System.out.println("masukkan id daftar belanja :");
        long idDB = sc.nextInt();

        //debugging
        System.out.println("id masukkan adalah : " + idDB);
        //output
        new DaftarBelanja().searchID(idDB,all);

        //search by name

        //insert

        //update

        //delete
        DaftarBelanja dbHapus = new DaftarBelanja();
        repo.delete(dbHapus);

        //insert
    }
}
