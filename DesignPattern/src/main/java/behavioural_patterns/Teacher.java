package behavioural_patterns;

	public abstract class Teacher {
		abstract void work();
		abstract void takebreak();
		abstract void getpaid();
		public final void CometoWork(){
			work();
			takebreak();
			work();
			
		}	

	}

