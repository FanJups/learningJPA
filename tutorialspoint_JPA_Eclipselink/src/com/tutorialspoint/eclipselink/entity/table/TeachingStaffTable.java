package com.tutorialspoint.eclipselink.entity.table;

import javax.persistence.Entity;

@Entity
public class TeachingStaffTable extends StaffTable {
	private String qualification;
	private String subjectexpertise;

	public TeachingStaffTable(int sid, String sname, String qualification, String subjectexpertise) {
		super(sid, sname);
		this.qualification = qualification;
		this.subjectexpertise = subjectexpertise;
	}

	public TeachingStaffTable() {
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