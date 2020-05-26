package org.oodles.optaplanner_pocdemo.taskAssignment;

import org.oodles.optaplanner_pocdemo.common.domain.AbstractPersistable;

public class Skill extends AbstractPersistable
{
	private String name;

    public Skill() {
    }

    public Skill(long id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return name;
    }

}
