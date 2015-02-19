package histoire;
import clojure.java.api.Clojure;
import clojure.lang.IFn;

public class Core {
    public static void main(String[] args)
    {
    	IFn plus = Clojure.var("clojure.core", "inc");
        System.out.println();
    }
}
