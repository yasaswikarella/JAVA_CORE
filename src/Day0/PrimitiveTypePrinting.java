package Day0;

public class PrimitiveTypePrinting {
    public static void main(String[] args) {
        byte b=9;
        short s=8;
        int i=7;
        long l=10l;
        float f=7.8f;
        double d=79.789221;
        boolean bo=true;
        char c='h';
        System.out.println("value of b = "+b+" is of type "+((Object)b).getClass().getSimpleName());
        System.out.println("value of s = "+s+" is of type "+((Object)s).getClass().getSimpleName());
        System.out.println("value of i = "+i+" is of type "+((Object)i).getClass().getSimpleName());
        System.out.println("value of l = "+l+" is of type "+((Object)l).getClass().getSimpleName());
        System.out.println("value of d = "+d+" is of type "+((Object)d).getClass().getSimpleName());
        System.out.println("value of f = "+f+" is of type "+((Object)f).getClass().getSimpleName());
        System.out.println("value of bo = "+bo+" is of type "+((Object)bo).getClass().getSimpleName());
        System.out.println("value of c = "+c+" is of type "+((Object)c).getClass().getSimpleName());
    }
}
