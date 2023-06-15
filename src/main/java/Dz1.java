import java.util.Random;
//1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
public class Dz1 {
    public static void main(String[] args) {
        Random random = new Random();
        int i = new Random().nextInt(274, 275);
        System.out.println(i);
//2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
        int n = MaxBit(i);
        System.out.println("Номер старшего значения бита  n =  " +n);
//3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
        int[] m1 = getMultiples(n,i);
//4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
        int[] m2 = getNonMultiples(n,i);

    }
    public static int MaxBit(int i) {
        int n = Integer.toBinaryString(i).length();
        return n;
    }
    static int[] getMultiples(int n, int i){
        int size = getArraySize(n, i);
        int[] m1 = new int[size];
        int k = 0;
        for (int j = i; j < Short.MAX_VALUE; j++){
            if (j%n == 0) {
                m1[k] = j;
                k++;
            }
        }
        return m1;
    }

    static int[] getNonMultiples(int n, int i){
        int size = 0;
        for (int j = Short.MIN_VALUE; j < i; j++){
            if (j%n != 0) size++;
        }
        int[] m2 = new int[size];
        int k = 0;
        for (int j = Short.MIN_VALUE; j < i; j++){
            if (j%n != 0) {
                m2[k] = j;
                k++;
            }
        }
        return m2;
    }

    static int getArraySize(int n, int i){
        int size = 0;
        for (int j = i; j < Short.MAX_VALUE; j++){
            if (j%n == 0) size++;
        }
        return size;
    }
}