package org.oodles.optaplanner_pocdemo.employeeRouting;

import org.oodles.optaplanner_pocdemo.employeeRouting.location.Location;
import org.optaplanner.core.api.domain.entity.PlanningEntity;
import org.optaplanner.core.api.domain.variable.InverseRelationShadowVariable;


@PlanningEntity
public interface Standstill {
	/**
     * @return sometimes null
     */
	public Employee getEmployee();
	
	public Location getLocation();
	
	@InverseRelationShadowVariable(sourceVariableName = "previousStandstill")
    Customer getNextCustomer();

    void setNextCustomer(Customer nextCustomer);

}
