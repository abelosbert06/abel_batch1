import java.lang.StringBuffer;
import java.lang.StringBuilder;

public class StringB {

    public static void main(String[] args) {
        var sb = new StringBuilder("jill");
        sb.append(" chris");
        sb.reverse();
        System.out.println(sb.toString());

        var sbr = new StringBuffer("Wesker ");
        sbr.append(" yes");
        sbr.reverse();
        System.out.println(sbr.toString());
    }
}
