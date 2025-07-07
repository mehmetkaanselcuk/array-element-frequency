public class Main {
    public static void main(String[] args) {
        int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] kontrol = new int[dizi.length];

        for (int i = 0; i < dizi.length; i++) {
            if (kontrol[i] == 1) continue;

            int tekrar = 1;

            for (int j = i + 1; j < dizi.length; j++) {
                if (dizi[i] == dizi[j]) {
                    tekrar++;
                    kontrol[j] = 1;
                }
            }

            System.out.println(dizi[i] + " sayısı " + tekrar + " kere tekrar edildi.");
        }
    }
}
