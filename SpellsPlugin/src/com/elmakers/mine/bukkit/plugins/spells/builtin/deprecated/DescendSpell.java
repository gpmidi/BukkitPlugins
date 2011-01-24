package com.elmakers.mine.bukkit.plugins.spells.builtin.deprecated;

import org.bukkit.Location;
import org.bukkit.Material;

import com.elmakers.mine.bukkit.plugins.spells.Spell;

public class DescendSpell extends Spell 
{
	
	@Override
	public boolean onCast(String[] parameters) 
	{
		Location location = findPlaceToStand(player.getLocation(), false);
		if (location != null) 
		{
			castMessage(player, "Going down!");
			player.teleportTo(location);
			return true;
		} 
		else 
		{		
			// no spot found to ascend
			castMessage(player, "Nowhere to go down");
			return false;
		}
	}

	@Override
	public String getName() 
	{
		return "descend";
	}

	@Override
	public String getDescription() 
	{
		return "Go down to the nearest safe spot";
	}

	@Override
	public String getCategory() 
	{
		return "deprecated";
	}

	@Override
	public Material getMaterial()
	{
		return Material.BROWN_MUSHROOM;
	}
	
	
}