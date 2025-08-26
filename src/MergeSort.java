public class MergeSort {

    //[16,21,11,8,12,22] -> Merge Sort

    public static void main(String[] args){


        int[] dizi = {16,21,11,8,12,22};
        int[] siralanmisDizi = sirala(dizi);
        for(int i : siralanmisDizi){
            System.out.print(i+ " ");
        }

    }

    public static int[] sirala(int[] dizi){
        if (dizi.length == 1){
            return dizi;
        }
        int bolmeYeri = dizi.length / 2 ;

        int[] solDizi = new int[bolmeYeri];
        for (int i = 0; i < solDizi.length; i++) {
            solDizi[i] = dizi[i];
        }

        int[] sagDizi = new int[dizi.length - bolmeYeri];
        for (int i = 0; i < sagDizi.length ; i++) {
            sagDizi[i] = dizi[bolmeYeri + i];
        }

        solDizi = sirala(solDizi);
        sagDizi = sirala(sagDizi);


        return birlestir(solDizi, sagDizi);
    }

    public static int[] birlestir(int[] soldizi, int[] sagDizi){

        int[] birlestir = new int[sagDizi.length +  soldizi.length];

        int i = 0, j = 0, k = 0;
        while (i < sagDizi.length && j < soldizi.length) {
            if (sagDizi[i] < soldizi[j]) {
                birlestir[k++] = sagDizi[i++];
            }else  {
                birlestir[k++] = soldizi[j++];
            }
        }
        while (i < sagDizi.length) {
            birlestir[k++] = sagDizi[i++];
        }
        while (j < soldizi.length) {
            birlestir[k++] = soldizi[j++];
        }
        return birlestir;
    }


    /** 🔹 Cevap: Her çağrıda yeni dizi açılıyor ✅
     *
     * sirala([16,21,11,8,12,22])
     * │
     * ├─ solDizi: sirala([16,21,11])
     * │   │
     * │   ├─ solDizi: sirala([16]) → return [16]
     * │   └─ sagDizi: sirala([21,11])
     * │       │
     * │       ├─ solDizi: sirala([21]) → return [21]
     * │       └─ sagDizi: sirala([11]) → return [11]
     * │
     * │   birlestir([16], [11,21]) → [11,16,21]
     * │
     * └─ sagDizi: sirala([8,12,22])
     *     │
     *     ├─ solDizi: sirala([8]) → return [8]
     *     └─ sagDizi: sirala([12,22])
     *         │
     *         ├─ solDizi: sirala([12]) → return [12]
     *         └─ sagDizi: sirala([22]) → return [22]
     *
     *     birlestir([8], [12,22]) → [8,12,22]
     *
     * birlestir([11,16,21], [8,12,22]) → [8,11,12,16,21,22]

     Java’da fonksiyon (metot) her çağrıldığında kendi çalışma alanını (stack frame) açar.
     Yani senin sirala() fonksiyonun her çağırıldığında yepyeni solDizi ve sagDizi dizileri oluşur.

     🔹 Adım Adım Gösterelim

     Dizimiz: [16,21,11,8,12,22]

     İlk çağrı:

     sirala([16,21,11,8,12,22])


     solDizi = [16,21,11]

     sagDizi = [8,12,22]

     Şimdi sirala(solDizi) çağırılır:

     sirala([16,21,11])


     Burada başka bir solDizi ve başka bir sagDizi oluşturulur:

     solDizi = [16]

     sagDizi = [21,11]

     👉 Dikkat et: Bu solDizi, ilk çağrının solDizi’siyle aynı değil. Hafızada ayrı kutular.

     Sonra sirala([21,11]) çağrılır:

     solDizi = [21]

     sagDizi = [11]

     Burada da yepyeni diziler var. Öncekilerden bağımsız.

     🔹 Benzetme

     Düşün ki sen koca bir karpuzu kesiyorsun 🍉

     İlk seferde ortadan ikiye ayırdın → sol yarım, sağ yarım.

     Sol yarımı tekrar alıp kestin → yine yeni sol ve sağ parçalar çıktı.

     Onları da kesiyorsun…
     Her seferinde yeni parçalar oluşuyor, eskisi yok olmuyor.

     Java’da da aynı:
     Her sirala() çağrısı yeni bir solDizi ve sagDizi oluşturuyor.
     Senin yazdığın int[] solDizi değişkeni aslında her çağrıda yeniden tanımlanıyor.

     🔹 Teknik Olarak

     Java’da her fonksiyon çağrısı stack’te ayrı bir bölge açar.

     O fonksiyonun içindeki değişkenler (mesela solDizi, sagDizi) sadece o çağrıya özeldir.

     Fonksiyon bitince, o diziler kaybolur. Ama geri döndürdüğün değer (return) üst çağrıya iletilir.

     ✅ Yani reis özet:
     Tek bir solDizi yok. Her çağrıda hafızada yepyeni solDizi ve sagDizi açılıyor.
     Böylece dizi küçüle küçüle en sona kadar gidiyor.**/
}
