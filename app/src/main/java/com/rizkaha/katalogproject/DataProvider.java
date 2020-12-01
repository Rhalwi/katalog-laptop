package com.rizkaha.katalogproject;

import android.content.Context;

import com.rizkaha.katalogproject.type.acer;
import com.rizkaha.katalogproject.type.asus;
import com.rizkaha.katalogproject.type.laptop;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {
    private static final List<laptop> laptops = new ArrayList<>();


    private static List<acer> initDataAcer(Context ctx) {
        List<acer> acers = new ArrayList<>();
        acers.add(new acer("Acer","Acer Aspire 3 A314-21","Rp 3.490.000",
                "Acer Aspire 3 A314-21 Memiliki antena kuat untuk Wireless 802.11ac, dan juga jaga mata Anda dari blue light dengan teknologi BlueLightShield.",R.drawable.g_acer_aspire_3_a311_31__l_1));
        acers.add(new acer("Acer","Acer Swift 5 SF514-54GT", "Rp 15.975.000",
                "Acer Swift 5 SF514-54GT ini memiliki prosesor Intel Core i5/i7 dengan kecepatan 1.0/1.3 GHz, RAM 8/16GB, SSD 512GB dan layar 14 inci dengan resolusi Full HD 1920 x 1080 piksel.",R.drawable.g_acer_swift_5_sf514_s4gt_l_1));

        acers.add(new acer("Acer","Acer Nitro 5 AN515-43", "Rp 9.399.000",
                "Acer Nitro 5 AN515-43 ini memiliki layar 15,6 inci dengan resolusi 1920 x 1080 pixels, RAM 8GB, Prosesor AMD Ryzen 5/7 dan menggunakan OS Windows 10 Home.",R.drawable.g_acer_nitro_5_an515_43));

        acers.add(new acer("Acer","Acer Aspire Switch 10", "Rp 3.723.000",
                "Acer Aspire Switch 10 is a Windows 8.1 of Operating System, 1.33 GHz of processor, 10.1inch LED, Active Matrix TFT Colour LCD",R.drawable.g_acer_aspire_switch_10));

        acers.add(new acer("Acer","Acer Nitro 5 AN515-52", "Rp 9.345.000",
                "Acer Nitro 5 AN515-52 ini memiliki prosesor Intel Core i5/i7, GPU NVIDIA GeForce GTX 1050/1050 Ti/1060, RAM 4/8/16GB, HDD 1TB & SSD 256GB dan baterai 3.320 mAh.",R.drawable.g_acer_nitro_5_an515_52));

        acers.add(new acer("Acer","Acer One 10 S100X","Rp 3.700.000",
                "Equipped with Intel Atom Quad Core Z3735F, 2GB DDR3, and 32GB eMMC + 500GB HDD",R.drawable.g_acer_one_10_s100x_l_1));
        return acers;
    }
    private static List<asus> initDataAsus(Context ctx) {
        List<asus> asuss = new ArrayList<>();
        asuss.add(new asus("Asus", "ASUS X540LJ","Rp 5.299.000",
                "Dengan desain yang klasik dan warna yang ekspresif, lebih cepat dan mudah dengan adanya koneksi USB type C, Audi yang oke dengan Sonic Master",R.drawable.g_asus_x540lj));
        asuss.add(new asus("Asus","ASUS ROG GL552VW", "Rp 16.000.000",
                "ASUS ROG GL552VW is a 15.6inch (1366 x 768) of HD, (1920 x 1080) of Full HD, up to 16GB of memory size.",R.drawable.g_asus_rog_gl552vw_l_1));

        asuss.add(new asus("Asus","ASUS VivoBook S14 S433FL", "Rp 9.764.370",
                "ASUS VivoBook S14 S433 ini memiliki layar 14 inci dengan resolusi Full HD 1920 x 1080 pixels, RAM 8GB, ROM 512GB SSD, prosesor i5/i7 dan VGA NVIDIA GeForce MX250.",R.drawable.g_asus_vivobook_s14_s433fl));

        asuss.add(new asus("Asus","ASUS ZenBook Pro Duo UX581GV", "Rp 33.499.000",
                "ZenBook Pro Duo adalah notebook berlayar ganda yang menampilkan ASUS ScreenPad Plus 4K, yang dipadukan dengan layar utama OLED 4K UHD, dan juga terintegrasi dengan LED-backlit NumberPad.",R.drawable.g_asus_zenbook));

        asuss.add(new asus("Asus","ASUS ROG Zephyrus Duo 15", "Rp 66.999.000",
                "ROG Zephyrus Duo 15 adalah laptop gaming andalan dari Asus yang menampilkan chip 10-generasi Intel Intel, RTX Super GPU Nvidia, dan mengintegrasikan keyboard RGB-backlit per-key dan layar sekunder ROG ScreenPad Plus.",R.drawable.g_asus_rogzephyrusduo_15));

        return asuss;
    }

    private static void iniAllLaptops(Context ctx) {
        initDataAcer(ctx);
        initDataAsus(ctx);
    }

    public static List<laptop> getAllLaptop(Context ctx) {
        if (laptops.size() == 0) {
            iniAllLaptops(ctx);
        }
        return  laptops;
    }

    public static List<laptop> getLaptopsByTipe(Context ctx, String jenisLaptop) {
        List<laptop> laptopsByType = new ArrayList<>();
        if (laptops.size() == 0) {
            iniAllLaptops(ctx);
        }
        for (laptop h : laptops) {
            if (h.getJenis().equals(jenisLaptop)) {
                laptopsByType.add(h);
            }
        }
        return laptopsByType;
    }
}
