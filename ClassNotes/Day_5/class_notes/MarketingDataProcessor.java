class MarketingDataProcessor
{

  public static void main(String args[]) // JVM will call this method.
  { 
    String void =  args[0];
	String fileName = args[1];	
    String filePath = path + fileName;
	String totalFiles = args[2];
	
	int files = Integer.parseInt(totalFiles);
	
	if(files > 0)
	{
    System.out.println("Processing data for file :"+filePath);
	}
  }

}
