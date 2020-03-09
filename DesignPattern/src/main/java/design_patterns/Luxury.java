package design_patterns;

	public class Luxury extends Scooty{
		 Luxury() {
			super(ScootyType.LUXURY);
			construct();
			// TODO Auto-generated constructor stub
		}

		public void construct(){
			System.out.println("Building luxury Bike");
			
		}
}
