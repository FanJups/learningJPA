package com.tutorialspoint.eclipselink.entity.join;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(referencedColumnName = "sid")

public class TeachingStaffJoin extends StaffJoin {
	private String qualification;
	private String subjectexpertise;

	public TeachingStaffJoin(int sid, String sname,

			String qualification, String subjectexpertise) {
		super(sid, sname);
		this.qualification = qualification;
		this.subjectexpertise = subjectexpertise;
	}

	public TeachingStaffJoin() {
		super();
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getSubjectexpertise() {
		return subjectexpertise;
	}

	public void setSubjectexpertise(String subjectexpertise) {
		this.subjectexpertise = subjectexpertise;
	}
}