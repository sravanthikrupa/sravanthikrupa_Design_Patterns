package design_patterns;

public class Mainbuilder {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			User user1 = new User.UserBuilder("Sravanthi", "Krupa")
					.age(21)
					.phone("9860594241")
					.address("Hyderabad")
					.build();
			System.out.println(user1);
			User user2 = new User.UserBuilder("Anjali", "Payyavula")
					.age(32)
					//no number
					.address("Hyderabad")
					.build();
			System.out.println(user2);

		}

}
