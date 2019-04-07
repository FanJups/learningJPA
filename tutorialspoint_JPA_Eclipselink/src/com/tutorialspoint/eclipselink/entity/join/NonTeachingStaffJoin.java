package com.tutorialspoint.eclipselink.entity.join;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(referencedColumnName = "sid")

public class NonTeachingStaffJoin extends StaffJoin {
	private String areaexpertise;

	public NonTeachingStaffJoin(int sid, String sname, String areaexpertise) {
		super(sid, sname);
		this.areaexpertise = areaexpertise;
	}

	public NonTeachingStaffJoin() {
		super();
	}

	public String getAreaexpertise() {
		return areaexpertise;
	}

	public void setAreaexpertise(String areaexpertise) {
		this.areaexpertise = areaexpertise;
	}
}