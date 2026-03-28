public class Program30 {
    public static void main(String[] args) {

        int element = 1;
        double value = 6;

        double a=0,R1=0,R2=0,S=0;

        switch (element) {

            case 1:
                a=value;
                R1=a*Math.sqrt(3)/4;
                R2=2*R1;
                S=a*a*Math.sqrt(3)/4;
                break;

            case 2:
                R1=value;
                a=4*R1/Math.sqrt(3);
                R2=2*R1;
                S=a*a*Math.sqrt(3)/4;
                break;

            case 3:
                R2=value;
                R1=R2/2;
                a=4*R1/Math.sqrt(3);
                S=a*a*Math.sqrt(3)/4;
                break;

            case 4:
                S=value;
                a=Math.sqrt(4*S/Math.sqrt(3));
                R1=a*Math.sqrt(3)/4;
                R2=2*R1;
        }

        System.out.println("a="+a);
        System.out.println("R1="+R1);
        System.out.println("R2="+R2);
        System.out.println("S="+S);
    }
}
