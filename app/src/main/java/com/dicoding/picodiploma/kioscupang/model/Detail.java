package com.dicoding.picodiploma.kioscupang.model;

import com.dicoding.picodiploma.kioscupang.R;

import java.util.ArrayList;

public class Detail {
    private static String[] cupangNames = {
      "Halfmoon","Crown Tail","Plakat","Double Tail","HMPK","Giant","Big Ear","Ikan Cupang Sawah","Ikan Cupang Paradise","Ikan Cupang Sarawak","Ikan Cupang Emas","Ikan Cupang Fancy","Ikan Cupang Veiltail","Ikan Cupang Coccina"
    };
    private static String[] cupangDetail = {
      "Seperti namanya, jenis ikan cupang halfmoon memiliki sirip dan ekor yang seolah menyatu membentuk setengah lingkaran. Ikan cupang Halfmoon ini dikenal dan dipelihara karena keindahannya.\n" +
              "\n" +
              "Varian warnanya juga kalah menarik, mulai dari merah menyala, kuning, bahkan putih.","Cupang crown tail menjadi mendunia karena variasi keindahannya. Disebut crown tail atau ekor mahkota, karena bila dibalik menghadap ke atas serit-serit pada ekornya terlihat seperti mahkota raja.\n" +
            "\n" +
            "Jenis ikan cupang ini banyak sekali dikoleksi orang banyak karena hasil breeder yang cukup langka.","Ikan cupang plakat sering digunakan sebagai ikan adu. Namun, tidak sedikit orang yang memelihara cupang jenis plakat ini. Walaupun bentuknya indah, ikan cupang plakat mempunyai kesan sirip yang tegas dan kekar.\n" +
            "\n" +
            "Gerakan ikan cupang plakat juga tidak terlalu anggun tapi terlihat lebih sangar.","Disebut double tail karena bagian ekornya terbelah dua, seperti bercagak dua. Jenis ikan cupang double tail tergolong sulit dikembangkan. Oleh karena itu, keberadaannya masih jarang dijumpai di pasaran dan terkenal langka.","Ikan cupang HMPK adalah hasil breeding dari ikan cupang jenis plakat dan halfmoon lalu disingkat menjadi HMPK. HMPK menuai banyak pujian karena bentuk dan warnanya yang indah nan menawan.","Ikan cupang raksasa ini berhasil dikembangkan breeder dari Thailand. Ukuran terbesarnya mencapai 12 cm, jauh lebih besar dari jenis ikan cupang lainnya. Berkat ukuran tubuhnya yang besar, ikan cupang giant ini tidak bisa bergerak lincah dibandingkan jenis lainnya.","Jenis ikan cupang yang sering disebut cupang dumbo ini memiliki sirip telinga yang sangat lebar seperti sayap. Pada dasarnya ikan jenis ini adalah salah satu variasi ikan cupang yang baru dikembangkan dan sudah banyak ditemui di Indonesia.","Cupang alam atau cupang sawah adalah cupang yang belum mengalami persilangan, dan ikan ini jauh dari jangkauan manusia. Warna tubuhnya bergaris kuning dan biru. Harga ikan cupang sawah ini bervariasi.\n" +
            "\n" +
            "Jika semakin bagus dan langka maka bisa sangat mahal. Namun, sebaliknya jika sudah umum ikan cupang ini harganya bisa sangat murah bahkan gratis.","Cupang paradise atau ilmiahnya Marcopodus opercularis, banyak ditemukan di daerah persungaian Sumatra, Kalimantan dan Sulawesi. Ciri-ciri ikan ini adalah ekornya cabang, warnanya bergaris-garis vertikal dengan warna hijau muda.","Ciri-ciri khusus dari cupang jenis ini adalah adanya semacam garis yang berada di sisi kanan kiri ikan dari kepala hingga pangkal ekor. Cupang Sarawak biasanya sangat mudah beradaptasi di alam.\n" +
            "\n" +
            "Cupang jenis ini juga lebih dari mampu hidup dengan sangat nyaman di daerah air dengan tekanan yang tinggi. Jenis ikan alam yang satu ini warnanya agak sederhana dan transparan.","Ikan cupang surga ini memiliki ciri-ciri yang hampir mirip dengan cupang paradise. warnanya kecokelatan dan siripnya memanjang, cupang jenis ini bisa kita temui di Asia Tenggara tepatnya di Jawa, Sumatra.\n" +
            "\n" +
            "Ukurannya bisa mencapai 10 cm, cukup besar untuk ukuran cupang.","Ikan cupang emas kerap ditemukan di sawah, selokan, sungai, dan rawa. Sebutan latin cupang emas adalah Betta unimaculata yang berarti warnanya agak ke emas-emasan.","Ikan cupang fancy memiliki ukuran sirip yang tidak besar seperti ikan cupang halfmoon, tetapi jenis ikan cupang ini memiliki warna yang cantik. Ikan ini terkenal karena kombinasi warna degradasi seperti lukisan yang sangat cantik yang membuat harganya mahal.","Jenis cupang veiltail memiliki bentuk tubuh  yang hampir mirip dengan halfmoon dan double tail. Perbedaan antara Ikan cupang veiltail dengan halfmoon dan double tail adalah dari ‘kekuatan’ ekor.\n" +
            "\n" +
            "Dulu ikan cupang veiltail ini banyak diminati orang karena kemudahan mendapatkannya, tetapi karena semakin banyak ikan cupang silangan, veiltail sedikit tersisihkan.","Tubuhnya berbentuk silinder dengan warna merah tua dari sirip hingga kepala. Bentuk kepalanya bulat panjang berwarna perak kekuning-kuningan. Sirip insangnya transparan merah, sirip polos dan panjang.\n" +
            "\n" +
            "Nama lain dari ikan cupang ini adalah cupang Belgi Bangkok."
    };
    private static String[] cupangprice = {
            "Rp. 25.000 - 150.000",
            "Rp. 15.000 - 250.000",
            "Rp. 10.000 - 120.000",
            "Rp. 12.000 - 200.000",
            "Rp. 25.000 - 150.000",
            "Rp. 15.000 - 250.000",
            "Rp. 10.000 - 120.000",
            "Rp. 3.000 - 15.000",
            "Rp. 25.000 - 150.000",
            "Rp. 15.000 - 250.000",
            "Rp. 10.000 - 120.000",
            "Rp. 12.000 - 200.000",
            "Rp. 25.000 - 150.000",
            "Rp. 15.000 - 250.000",
            "Rp. 10.000 - 120.000"
    };

    private static int[] cupangimage = {
            R.drawable.aba,
            R.drawable.abb,
            R.drawable.abc,
            R.drawable.abd,
            R.drawable.abe,
            R.drawable.abf,
            R.drawable.abg,
            R.drawable.abh,
            R.drawable.abi,
            R.drawable.abj,
            R.drawable.abk,
            R.drawable.abl,
            R.drawable.abm,
            R.drawable.abn,
            R.drawable.abo
    };

    public static ArrayList<Hickey> getListData(){
        ArrayList<Hickey> list = new ArrayList<>();
        for (int position = 0; position < cupangNames.length; position++){
            Hickey hickey = new Hickey();
            hickey.setName(cupangNames[position]);
            hickey.setDetail(cupangDetail[position]);
            hickey.setHarga(cupangprice[position]);
            hickey.setPhoto(cupangimage[position]);
            list.add(hickey);
        }
        return list;
    }
}
