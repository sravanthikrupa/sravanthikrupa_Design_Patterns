package design_patterns;

	public class Small extends Scooty{

		 Small() {
			super(ScootyType.SMALL);
			construct();
			// TODO Auto-generated constructor stub
		}
		 public void construct(){
			 System.out.println("Building small Bike");
		 }

}
