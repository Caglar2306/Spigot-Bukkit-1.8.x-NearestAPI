package com.caglardev.nearestapi;

import org.bukkit.entity.Entity;

public class NearestEntity {

	private Entity entity;
	private double distance;
	
	public NearestEntity(Entity entity, double distance) {
		this.entity = entity;
		this.distance = distance;
	}

	public void setEntity(Entity entity) {
		this.entity = entity;
	}
	
	public void setDistance(double distance) {
		this.distance = distance;
	}
	
	public Entity getEntity() {
		return this.entity;
	}
	
	public double getDistance() {
		return this.distance;
	}
}
