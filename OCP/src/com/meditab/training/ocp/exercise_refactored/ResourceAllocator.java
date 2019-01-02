package assignment_day3_1;

public class ResourceAllocator
{
    private static final int INVALID_RESOURCE_ID = -1;

    public interface ResourceInterface {

    	public int allocate(ResourceType r);
    	public void free(ResourceType r , int resourceId);
    }


}