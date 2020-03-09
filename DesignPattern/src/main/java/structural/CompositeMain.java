package structural;

	public class CompositeMain {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Employee emp1 = new Employee("Mrudula","Programmer",30000);
			Employee emp2 = new Employee("Jaanu","CEO",300000);
			Employee emp3 = new Employee("Ram","Programmer",30000);
			Employee emp4= new Employee("Sidhanth","Sales",10000);
			Employee emp5 = new Employee("Anjali","Programmer",15000);
			Employee emp6 = new Employee("Nikitha","Marketing",20000);
			Employee emp7 = new Employee("Sravanthi","Programmer",25000);
			Employee emp8 = new Employee("Madhu","Manager",25000);
			
			
			emp3.addcoworker(emp1);
	        emp3.addcoworker(emp7);

	        emp1.addcoworker(emp7);
	        emp1.addcoworker(emp8);

	        System.out.println(emp3);
	        for (Employee headEmployee : emp3.getworkers()) {
	            System.out.println(headEmployee);
	            
	            for(Employee employee : headEmployee.getworkers()) {
	                System.out.println(employee);
	            }
	        }
		}
}
