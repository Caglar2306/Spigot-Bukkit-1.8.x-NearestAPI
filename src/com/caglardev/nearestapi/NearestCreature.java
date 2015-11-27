package com.caglardev.nearestapi;

import org.bukkit.entity.Creature;

public class NearestCreature {

	private Creature creature;
	private double distance;
	
	public NearestCreature(Creature creature, double distance) {
		this.creature = creature;
		this.distance = distance;
	}

	public void setCreature(Creature creature) {
		this.creature = creature;
	}
	
	public void setDistance(double distance) {
		this.distance = distance;
	}
	
	public Creature getCreature() {
		return this.creature;
	}
	
	public double getDistance() {
		return this.distance;
	}
}
