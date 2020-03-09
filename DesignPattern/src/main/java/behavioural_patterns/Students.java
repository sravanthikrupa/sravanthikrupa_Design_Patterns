package behavioural_patterns;

	public class Students implements Sector {
		  public String[] students = {"Sravanthi","Krupa","Anjali","Ashish","Janu"};

		public Iterator getIterator() {
			// TODO Auto-generated method stub
			return new StudentsIterator();
		}

		private class StudentsIterator implements Iterator {
			  int index;
		      
		      public boolean hasnext() {
		          if(index < students.length) {
		              return true;
		          } 
		          return false;
		      }

		     
		      public Object next() {
		          if(this.hasnext()) {
		              return students[index++];
		          }
		          return null;
		         
		      }
		}
}
