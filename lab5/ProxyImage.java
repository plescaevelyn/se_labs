package lab5;

public class ProxyImage implements Image{
		private boolean rotate;
		private RotatedImage rotatedImage;
	   private RealImage realImage;
	   private String fileName;
	 
	   public ProxyImage(String fileName, boolean rotate){
	      this.fileName = fileName;
	      this.rotate = rotate;
	   }
	 
	   @Override
	   public void display() {
	      if(realImage == null){
	         realImage = new RealImage(fileName);
			   if (rotate == true) {
				   rotatedImage.display();
			   } else {
				   realImage.display();
			   }
	      }
	      realImage.display();
	   }
}