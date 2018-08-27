import com.xoriant.demopack1.*;
import static com.xoriant.demopack1.Class2.*;
import static java.lang.System.out;
import static java.lang.Integer.parseInt;

public class PackageMain {
		public static void main(String[] args) {
			Class1 c1 = new Class1();
			Class2 c2 = new Class2();
			c1.num3=5;
			System.out.println(c1.num3);
			System.out.println(c2.num6);
			out.println(c1.num2);
			
			num7=8;
			c2.m5();
			
			c2.m4();
			c1.m1();
			
			int a=parseInt("9");
		}


}
