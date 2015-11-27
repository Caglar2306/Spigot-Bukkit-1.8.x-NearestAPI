package com.caglardev.nearestapi;

import java.util.ArrayList;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Creature;
import org.bukkit.plugin.java.JavaPlugin;

public class Nearest extends JavaPlugin {

	private static double DEFAULT_X = 100;
	private static double DEFAULT_Y = 100;
	private static double DEFAULT_Z = 100;

	public static NearestEntity getNearestEntity(Player player, double x, double y, double z) {
		NearestEntity nearestEntity = new NearestEntity(null, 0);
		
		double distance = Double.MAX_VALUE;
		for(Entity entity : player.getNearbyEntities(x, y, z)) {
			double entityDistance = entity.getLocation().distance(entity.getLocation());
			if(entityDistance < distance) {
				distance = entityDistance;
				nearestEntity = new NearestEntity(entity, entityDistance);
			}
		}
		
		return nearestEntity;
	}
	
	public static NearestEntity getNearestEntity(Player player) {
		return getNearestEntity(player, DEFAULT_X, DEFAULT_Y, DEFAULT_Z);
	}
	
	public static ArrayList<NearestEntity> getNearestEntities(Player player, int maxEntities, double x, double y, double z) {
		ArrayList<NearestEntity> nearestEntities = new ArrayList<NearestEntity>();

		double distance = Double.MAX_VALUE;
		for(Entity entity : player.getNearbyEntities(x, y, z)) {
			double entityDistance = player.getLocation().distance(entity.getLocation());
			
			if(entityDistance < distance) {
				distance = entityDistance;
				if(nearestEntities.size() < maxEntities) {
					nearestEntities.add(new NearestEntity(entity, entityDistance));
				} else {
					break;
				}
			}
		}
		
		return nearestEntities;
	}
	
	public static ArrayList<NearestEntity> getNearestEntities(Player player, int maxPlayers) {
		return getNearestEntities(player, maxPlayers, DEFAULT_X, DEFAULT_Y, DEFAULT_Z);
	}
	
	public static NearestCreature getNearestCreature(Player player, double x, double y, double z) {
		NearestCreature nearestEntity = new NearestCreature(null, 0);
		
		double distance = Double.MAX_VALUE;
		for(Entity entity : player.getNearbyEntities(x, y, z)) {
			if(entity instanceof Creature) {
				double entityDistance = entity.getLocation().distance(entity.getLocation());
				if(entityDistance < distance) {
					distance = entityDistance;
					nearestEntity = new NearestCreature((Creature) entity, entityDistance);
				}
			}
		}
		
		return nearestEntity;
	}
	
	public static NearestCreature getNearestCreature(Player player) {
		return getNearestCreature(player, DEFAULT_X, DEFAULT_Y, DEFAULT_Z);
	}
	
	public static ArrayList<NearestCreature> getNearestCreatures(Player player, int maxCreatures, double x, double y, double z) {
		ArrayList<NearestCreature> nearestCreatures = new ArrayList<NearestCreature>();

		double distance = Double.MAX_VALUE;
		for(Entity entity : player.getNearbyEntities(x, y, z)) {
			if(entity instanceof Creature) {
				double entityDistance = player.getLocation().distance(entity.getLocation());
				
				if(entityDistance < distance) {
					distance = entityDistance;
					if(nearestCreatures.size() < maxCreatures) {
						nearestCreatures.add(new NearestCreature((Creature) entity, entityDistance));
					} else {
						break;
					}
				}
			}
		}
		
		return nearestCreatures;
	}
	
	public static ArrayList<NearestCreature> getNearestCreatures(Player player, int maxPlayers) {
		return getNearestCreatures(player, maxPlayers, DEFAULT_X, DEFAULT_Y, DEFAULT_Z);
	}

	public static NearestPlayer getNearestPlayer(Player player, double x, double y, double z) {
		NearestPlayer nearestPlayer = new NearestPlayer(null, 0);
		
		double distance = Double.MAX_VALUE;
		for(Entity entity : player.getNearbyEntities(x, y, z)) {
			if(entity instanceof Player) {
				double entityDistance = player.getLocation().distance(entity.getLocation());
				
				if(entityDistance < distance) {
					distance = entityDistance;
					nearestPlayer = new NearestPlayer((Player) entity, entityDistance);
				}
			}
		}
		
		return nearestPlayer;
	}
	
	public static NearestPlayer getNearestPlayer(Player player) {
		return getNearestPlayer(player, DEFAULT_X, DEFAULT_Y, DEFAULT_Z);
	}
	
	public static ArrayList<NearestPlayer> getNearestPlayers(Player player, int maxPlayers, double x, double y, double z) {
		ArrayList<NearestPlayer> nearestPlayers = new ArrayList<NearestPlayer>();

		double distance = Double.MAX_VALUE;
		for(Entity entity : player.getNearbyEntities(x, y, z)) {
			if(entity instanceof Player) {
				double entityDistance = player.getLocation().distance(entity.getLocation());
				
				if(entityDistance < distance) {
					distance = entityDistance;
					if(nearestPlayers.size() < maxPlayers) {
						nearestPlayers.add(new NearestPlayer((Player) entity, entityDistance));
					} else {
						break;
					}
				}
			}
		}
		
		return nearestPlayers;
	}
	
	public static ArrayList<NearestPlayer> getNearestPlayers(Player player, int maxPlayers) {
		return getNearestPlayers(player, maxPlayers, DEFAULT_X, DEFAULT_Y, DEFAULT_Z);
	}
}
