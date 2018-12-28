package com.meditab.training.ocp.exercise;

public interface functions {
	
	public int allocate(ResourceType resourceType);
	public void free(ResourceType resourceType, int resourceId);
	private void markSpaceSlotFree(int resourceId);
	private void markTimeSlotFree(int resourceId);
	private void markSpaceSlotBusy(int resourceId);
	private int findFreeSpaceSlot();
	private void markTimeSlotBusy(int resourceId);
	private int findFreeTimeSlot();
}