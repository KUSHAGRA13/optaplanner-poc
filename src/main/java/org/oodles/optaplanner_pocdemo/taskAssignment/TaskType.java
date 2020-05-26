package org.oodles.optaplanner_pocdemo.taskAssignment;

import java.util.List;

import org.oodles.optaplanner_pocdemo.common.domain.AbstractPersistable;

public class TaskType extends AbstractPersistable
{
	
	private String code;
    private String title;
    private int baseDuration; // In minutes

    private List<Skill> requiredSkillList;
    
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getBaseDuration() {
        return baseDuration;
    }

    public void setBaseDuration(int baseDuration) {
        this.baseDuration = baseDuration;
    }

    public List<Skill> getRequiredSkillList() {
        return requiredSkillList;
    }

    public void setRequiredSkillList(List<Skill> requiredSkillList) {
        this.requiredSkillList = requiredSkillList;
    }
    
    @Override
    public String toString() {
        return code;
    }

}
