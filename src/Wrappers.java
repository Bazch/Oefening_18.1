public class Wrappers {

    public static void main(String[] args) {
        int i = 10;
        String a = String.valueOf(i);

        String b = "100";
        int c = Integer.parseInt(b);

        double d = 8723_8724_8732_7836d;
        String e = String.valueOf(d);

        String f = "1000";
        double g = Double.parseDouble(f);

        Double h = 8723_8724_8732_7836d;
        double j = h;
        int k = (int) j;

        System.out.println(a);
        System.out.println(c);
        System.out.println(e);
        System.out.println(g);
        System.out.println(j);
        System.out.println(k);


    }
}
