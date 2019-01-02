package assignment_day3_1;

public class Time implements ResourceInterface{
	
	
	ResourceType resource = null;
	int resourceId;
	public int allocate(ResourceType r)
	{
		if(r.equals(resource.TIME_SLOT))
		{
			resourceId = findFreeTimeSlot();
			markTimeSlotBusy(resourceId);
		}
		return resourceId;
	}
	
	
    private void markTimeSlotFree(int resourceId)
    {
    }
    
    private void markTimeSlotBusy(int resourceId)
    {
    }
    

    private int findFreeTimeSlot()
    {
        return 0;
    }


	@Override
	public void free(ResourceType r, int resourceId) {
		// TODO Auto-generated method stub
		if(r.equals(resource.TIME_SLOT))
		{
			  markTimeSlotFree(resourceId);
		}
	}

}
