package design_patterns;


	public  abstract class Scooty {
		public Scooty(ScootyType model) {
	        this.model = model;
	        arrangeParts();
	    }
	 
	    private void arrangeParts() {

	    }
	 
	  
	    protected abstract void construct();
	 
	    private ScootyType model = null;
	 
	    public ScootyType getModel() {
	        return model;
	    }
	 
	    public void setModel(ScootyType model) {
	        this.model = model;
	    }

}
