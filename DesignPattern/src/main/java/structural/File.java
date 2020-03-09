package structural;


public class File implements MediaFile{
private String Filename;

public File(String Filename){
    this.Filename = Filename;
    loadFromDisk(Filename);
 }

public void printname() {
	System.out.println("Displaying:"+ Filename);
	// TODO Auto-generated method stub
	
}
private void loadFromDisk(String Filename){
    System.out.println("Loading "+Filename);
 }
}
