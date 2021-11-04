package by.tc.task01.main;

import static by.tc.task01.entity.criteria.SearchCriteria.*;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Appliance> appliances;

		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		//////////////////////////////////////////////////////////////////

		Criteria criteriaOven = new Criteria(Oven.class.getSimpleName());
		criteriaOven.add(Oven.WEIGHT.toString(), 5);

		appliances = service.find(criteriaOven);

		PrintApplianceInfo.print(appliances);

		System.out.println("Lowest cost appliance: " + service.findLowestCostAppliance());

	}

}
