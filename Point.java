class Point {
	String id
	double x,y;

	//TODO add new variable
	
	String boja;	

	//TODO constructor

	public Point(String id, double x, double y, String boja) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.boja = boja;
    }


	//TODO setters and getters
    	public String getId() {
        	return id;
    	}

	public void setId(String id) {
		this.id = id;
	}

	public double getX() {
		return x;
	}

    	public void setX(double x) {
        	this.x = x;
    	}

    	public double getY() {
        	return y;
    	}

    	public void setY(double y) {
        	this.y = y;
    	}

    	public String getBoja() {
        	return boja;
    	}

    	public void setBoja(String boja) {
        	this.boja = boja;
    	}

    	public void move (char xDirection, char yDirection) {
       		if(xDirection == 'L')
		{
			double x1=x-1;
			setX(x1);	
		}
		if(xDirection == 'R')
		{
			double x1=x+1;
			setX(x1);	
		}
		if(yDirection == 'U')
		{
			double y1=y+1;
			setY(y1);	
		}
		if(yDirection == 'D')
		{
			double y1=y-1;
			setY(y1);	
		}
	    }

    	public void draw () {
       		System.out.println("Point is located at: (" + x + "," + y + ")" );
    	}
    
}

