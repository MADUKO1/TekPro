public class Soal4
{
    static short methodOne(long l)
    { // 10 long
        int i = (int) l; // 10 integer
        return (short)i; // 10 short
    }
    public static void main(String[] args)
    {
        double d = 10.25; // 10.25 double
        float f = (float) d; // 10.25F float
        byte b = (byte) methodOne((long) f); // long -> integer (10.25F -> 10)
        System.out.println(b);
    }
}