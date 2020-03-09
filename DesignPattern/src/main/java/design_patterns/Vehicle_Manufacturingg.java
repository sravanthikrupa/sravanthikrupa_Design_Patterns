package design_patterns;

public class Vehicle_Manufacturingg {
		public static Scooty buildBike(ScootyType model){
			 Scooty bike = null;
		        switch (model) {
		        case SMALL:
		            bike = new Small();
		            break;
		        case LUXURY:
		            bike = new Luxury();
		            break;
		 
		        default:
		            break;
		        }
		        return bike;
			
		}
}
