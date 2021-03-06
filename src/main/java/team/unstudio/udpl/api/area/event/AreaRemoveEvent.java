package team.unstudio.udpl.api.area.event;

import org.bukkit.event.HandlerList;

import team.unstudio.udpl.api.area.Area;

public class AreaRemoveEvent extends AreaEvent{

	public AreaRemoveEvent(Area area) {
		super(area);
	}
	
	private static final HandlerList handler = new HandlerList();

	@Override
	public HandlerList getHandlers() {
		return handler;
	}
	
	public static HandlerList getHandlerList(){
		return handler;
	}
}
