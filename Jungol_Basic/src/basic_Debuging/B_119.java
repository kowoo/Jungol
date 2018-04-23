package basic_Debuging;

public class B_119 {
    public static void main(String[] args) {
        java.util.Calendar cal = java.util.Calendar.getInstance();
        int a1=0;
        int a2=0;
        int a3=0;
        a1= cal.get ( java.util.Calendar.YEAR )-1900;
        a2+= cal.get ( java.util.Calendar.MONTH );
        a3+= cal.get ( java.util.Calendar.DATE );
        System.out.printf("%d %d %d ", a1, a2, a3);
    }
}