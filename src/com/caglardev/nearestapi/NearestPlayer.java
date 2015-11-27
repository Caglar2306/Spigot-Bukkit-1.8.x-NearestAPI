package com.caglardev.nearestapi;

import org.bukkit.entity.Player;

public class NearestPlayer {

	private Player player;
	private double distance;
	
	public NearestPlayer(Player player, double distance) {
		this.player = player;
		this.distance = distance;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}
	
	public void setDistance(double distance) {
		this.distance = distance;
	}
	
	public Player getPlayer() {
		return this.player;
	}
	
	public double getDistance() {
		return this.distance;
	}
}
