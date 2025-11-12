package basics.operators;

public class OperatorsPractice2 {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z = x++;
        System.out.println(z);
        System.out.println(x);

        String values[] = new String[1];
        values[0] = "1";

        main2(new String[]{"256"});

        int s = 5;
        s += s + mx(s) + ++s;
        System.out.println(s);

        int i1 = 1, i2 = 2, i3 = 3; float i4 = i1 + (i2=i3 ); System.out.println((int)i4);

        boolean var = (premisa1() & premisa2());

        boolean var2 = true || true && false;
        System.out.println(var2);
    }

    public static void main2(String[] args){
        Integer i = Integer.parseInt(args[0]);
        Integer j = i;
        System.out.println(i + " " + j);
        i--;
        i++;
        System.out.println(i + " " + j);
        System.out.println((i==j));
    }

    static int mx(int s){
        for(int i=0; i<3; i++){
            s = s + i;
        }
        System.out.println(s);
        return s;

    }

    static boolean premisa1(){
        System.out.println("Entro en premisa 1");
        return false;
    }

    static boolean premisa2(){
        System.out.println("Entro en premisa 2");
        return true;
    }

    public static void main3(String args[ ] ){       int i, j, k;       i = j = k = 9;       System.out.println(i);    }


}

