package by.tc.task01.service;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

import java.util.ArrayList;

public interface ApplianceService {	
	
	ArrayList<Appliance> find(Criteria criteria);

	Appliance findLowestCostAppliance();

}
