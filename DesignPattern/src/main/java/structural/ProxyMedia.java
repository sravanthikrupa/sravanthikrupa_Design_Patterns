package structural;

	public class ProxyMedia implements MediaFile{
		private File mediaFileImpl;
		   private String Filename;

		   public ProxyMedia(String Filename){
		      this.Filename = Filename;
		   }

		   public void printname() {
		      if(mediaFileImpl == null){
		         mediaFileImpl = new File(Filename);
		      }
		      mediaFileImpl.printname();
		   }
	}

