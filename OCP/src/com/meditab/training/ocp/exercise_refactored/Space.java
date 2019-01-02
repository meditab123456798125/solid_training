package assignment_day3_1;

public class Space implements ResourceInterface{

	
	ResourceType resource = null;
	int resourceId;
	
	public int allocate(ResourceType r)
	{
		if(r.equals(resource.SPACE_SLOT))
		{
			resourceId = findFreeSpaceSlot();
			markSpaceSlotBusy(resourceId);
		}
		return resourceId;
	}
	
    private void markSpaceSlotFree(int resourceId)
    {
    }

    private void markSpaceSlotBusy(int resourceId)
    {
    }
    
    private int findFreeSpaceSlot()
    {
        return 0;
    }

	@Override
	public void free(ResourceType r, int resourceId) {
		// TODO Auto-generated method stub
		if(r.equals(resource.SPACE_SLOT))
		{
	         markSpaceSlotFree(resourceId);
		}
	}


}
