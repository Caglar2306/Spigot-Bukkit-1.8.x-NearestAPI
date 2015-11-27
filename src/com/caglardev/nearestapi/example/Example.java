package com.caglardev.nearestapi.example;

import java.util.ArrayList;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Creature;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import com.caglardev.nearestapi.Nearest;
import com.caglardev.nearestapi.NearestCreature;
import com.caglardev.nearestapi.NearestEntity;
import com.caglardev.nearestapi.NearestPlayer;

public class Example extends JavaPlugin {
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(sender instanceof Player) {
			Player player = (Player) sender;

			if(player != null) {
				if(cmd.getName().equalsIgnoreCase("nearest")) {
					// get nearest player
					Player nearestPlayer = Nearest.getNearestPlayer(player).getPlayer();
					if(nearestPlayer != null) {
						player.sendMessage("The nearest player is: " + nearestPlayer.getName());
					} else {
						player.sendMessage("No player in your near!");
					}

					// get nearest players
					ArrayList<NearestPlayer> nearestPlayers = Nearest.getNearestPlayers(player, 10);

					if(nearestPlayers.size() == 0) {
						player.sendMessage("No players in your near!");
					} else {
						StringBuilder stringBuilder = new StringBuilder("Players in your near: ");

						for(int i = 0; i < nearestPlayers.size(); i++) {
							stringBuilder.append(nearestPlayers.get(i).getPlayer().getName());

							if(i != (nearestPlayers.size() - 1)) {
								stringBuilder.append(", ");
							}
						}

						player.sendMessage(stringBuilder.toString());
					}

					// get nearest entity
					Entity nearestEntity = Nearest.getNearestEntity(player).getEntity();
					if(nearestEntity != null) {
						player.sendMessage("The nearest entity is: " + nearestEntity.getName());
					} else {
						player.sendMessage("No entities in your near!");
					}

					// get nearest entities
					ArrayList<NearestEntity> nearestEntities = Nearest.getNearestEntities(player, 10);

					if(nearestEntities.size() == 0) {
						player.sendMessage("No entities in your near!");
					} else {
						StringBuilder stringBuilder = new StringBuilder("Entities in your near: ");

						for(int i = 0; i < nearestEntities.size(); i++) {
							stringBuilder.append(nearestEntities.get(i).getEntity().getName());

							if(i != (nearestEntities.size() - 1)) {
								stringBuilder.append(", ");
							}
						}

						player.sendMessage(stringBuilder.toString());
					}

					// get nearest creature
					Creature nearestCreature = Nearest.getNearestCreature(player).getCreature();
					if(nearestCreature != null) {
						player.sendMessage("The nearest creature is: " + nearestCreature.getName());
					} else {
						player.sendMessage("No creatures in your near!");
					}

					// get nearest creatures
					ArrayList<NearestCreature> nearestCreatures = Nearest.getNearestCreatures(player, 10);

					if(nearestCreatures.size() == 0) {
						player.sendMessage("No creatures in your near!");
					} else {
						StringBuilder stringBuilder = new StringBuilder("Creatures in your near: ");

						for(int i = 0; i < nearestCreatures.size(); i++) {
							stringBuilder.append(nearestCreatures.get(i).getCreature().getName());

							if(i != (nearestCreatures.size() - 1)) {
								stringBuilder.append(", ");
							}
						}

						player.sendMessage(stringBuilder.toString());
					}
				}
			}
		}

		return false;
	}
}
