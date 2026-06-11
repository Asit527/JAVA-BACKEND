class FileMannager{
	public static void main(String[]args){
		int downloadSize=10;
		int freeSpace= 20;
		int mobileDataLeft= 30;
		int freeCloudSpace=50;


		System.out.print("Download Status : ");// and 
		System.out.println(downloadSize<=freeSpace && mobileDataLeft>=downloadSize);



		System.out.print("Download Status : ");// or
		downloadSize=40;
		System.out.println(downloadSize<=freeSpace || freeCloudSpace>=downloadSize);



	}
}