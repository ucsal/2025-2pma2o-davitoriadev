import java.util.Map;

import br.com.mariojp.solid.ocp.CustomerType;
import br.com.mariojp.solid.ocp.DiscountCalculator;
import br.com.mariojp.solid.ocp.PartnerPolicy;
import br.com.mariojp.solid.ocp.PremiumPolicy;
import br.com.mariojp.solid.ocp.RegularPolicy;

public class Main {
	public static void main(String[] args) {
		DiscountCalculator calculator = new DiscountCalculator(Map.of(
			CustomerType.REGULAR, new RegularPolicy(),
			CustomerType.PREMIUM, new PremiumPolicy(),
			CustomerType.PARTNER, new PartnerPolicy()
		));

		System.out.println(calculator.apply(100, CustomerType.REGULAR));
		System.out.println(calculator.apply(100, CustomerType.PREMIUM));
		System.out.println(calculator.apply(100, CustomerType.PARTNER));
		System.out.println(calculator.apply(100, null));
	}
}
