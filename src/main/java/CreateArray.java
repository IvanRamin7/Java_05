public class CreateArray {

    /**
     В голубой папке java создать класс CreateArray, написать в этом классе метод createIntArray(),
     который принимает на вход 5 целых чисел,  и возвращает массив из этих же чисел.
     Например, createIntArray(1, 2, 3, 4, 5) -> {1, 2, 3, 4, 5}**/

    public int[] createIntArray(int a, int b, int c, int d, int e) {

        return new int[] {a, b, c, d, e};
    }

    /**
     Написать метод createDoubleArray(), который принимает на вход 5 чисел типа double, и возвращает массив из
     этих же чисел.
     Например, createDoubleArray(1.1, 2.5, 3.7, 4.0, 5.5) -> {1.1, 2.5, 3.7, 4.0, 5.5}
     **/

    public double[] createDoubleArray(double a, double b, double c, double d, double e) {

        return new double[] {a, b, c, d, e};
    }

    /**
     Написать метод createStringArray(), который принимает на вход 5 слов, и возвращает массив из этих слов
     Например, createStringArray(“It”, “was”, “an”, “apple”, “pie”) -> {“It”, “was”, “an”, “apple”, “pie”}
     **/

    public String[] createStringArray (String a, String b, String c, String d, String e) {

        return new String[] {a, b, c, d, e};
    }

    /**
     Написать метод createArrayFromText(), который принимает на вход предложение из нескольких слов и возвращает массив
     из этих слов.
     Например, createArrayFromText(“It was an apple pie”) -> {“It”, “was”, “an”, “apple”, “pie”}**/

    public String[] createArrayFromText(String incoming) {
        if(incoming != null) {

            return incoming.split(" ");
        }

        else return new String[0];
    }

    /**
     * В классе CreateArray написать метод createIntArrayFromText(), который принимает
     * на вход строку чисел (н-р, “3 4 1 8 10 12.3”) и возвращает массив типа int[] из этих чисел.
     * (vожно использовать split() или toCharArray())
     */

    public int[] createIntArrayFromText(String inside) {
        String[] arrayOfStrings = inside.split(" ");
        int[] out = new int[arrayOfStrings.length];

        for (int i = 0; i < arrayOfStrings.length; i++) {
                if(arrayOfStrings[i].contains(".")) {
                    out[i] = (int) Double.parseDouble(arrayOfStrings[i]);
                } else out[i] = Integer.parseInt(arrayOfStrings[i]);
        }
        return out;
    }
}
