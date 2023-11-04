package org.launchcode.techjobs.persistent.models.dto;

import jakarta.validation.constraints.NotNull;
import org.launchcode.techjobs.persistent.models.Job;
import org.launchcode.techjobs.persistent.models.Skill;

public class JobSkillDTO {
    @NotNull
    private Job job;
    @NotNull
    private Skill skill;
    public JobSkillDTO(){}

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public Job getJob() {
        return job;
    }
}
