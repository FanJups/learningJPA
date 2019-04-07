package com.tutorialspoint.eclipselink.entity.table;

import javax.persistence.Entity;

@Entity
public class NonTeachingStaffTable extends StaffTable {
	private String areaexpertise;

	public NonTeachingStaffTable(int sid, String sname, String areaexpertise) {
		super(sid, sname);
		this.areaexpertise = areaexpertise;
	}

	public NonTeachingStaffTable() {
		super();
	}

	public String getAreaexpertise() {
		return areaexpertise;
	}

	public void setAreaexpertise(String areaexpertise) {
		this.areaexpertise = areaexpertise;
	}
}
