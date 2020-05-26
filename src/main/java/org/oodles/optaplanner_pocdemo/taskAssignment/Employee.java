package org.oodles.optaplanner_pocdemo.taskAssignment;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;


public class Employee extends TaskOrEmployee
{
	
	private String fullName;
	private Set<Skill> skillSet;
	
	public Employee() {
    }

    public Employee(long id, String fullName) {
        super(id);
        this.fullName = fullName;
        skillSet = new LinkedHashSet<Skill>();
        //affinityMap = new LinkedHashMap<>();
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Set<Skill> getSkillSet() {
        return skillSet;
    }

    public void setSkillSet(Set<Skill> skillSet) {
        this.skillSet = skillSet;
    }
    
    @Override
    public String toString() {
        return fullName;
    }
    
    
    // -------- Complex Method Declaration -- 
    
    @Override
    public Employee getEmployee() {
        return this;
    }

    @Override
    public Integer getEndTime() {
        return 0;
    }

}
