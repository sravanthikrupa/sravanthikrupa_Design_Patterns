package behavioural_patterns;

public class MainTemplate {

		public static void main(String[] args){
			Teacher emp = new Programmer();
			emp.CometoWork();
			System.out.println();
			 emp = new Hod();
			 emp.CometoWork();
		}

}
