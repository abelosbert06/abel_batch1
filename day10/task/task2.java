//create a car in java using getter and setter

void main(){
	Car car1 = new Car();
	car1.setModel("Civic");
	car1.setBrand("Honda");
	car1.setYear(2006);
	car1.setEngineType("Petrol");
	car1.setEngineCapacity("10l");

	IO.println(car1.getModel());
	IO.println(car1.getBrand());
	IO.println(car1.getYear());
	IO.println(car1.getEngineType());
	IO.println(car1.getEngineCapacity());
}

class Car{
	private String model;
	private String brand;
	private int year;
	private String engineType;
	private String engineCapacity;

	public void setModel(String model){
		this.model = model;
	}

	public void setBrand(String brand){
		this.brand = brand;
	}
	
	public void setYear(int year){
		this.year = year;
	}

	public void setEngineType(String engineType){
		this.engineType = engineType;
	}

	public void setEngineCapacity(String engineCapacity){
		this.engineCapacity = engineCapacity;
	}

	public String getModel(){
		return model;
	}

	public String getBrand(){
		return brand;
	}

	public int getYear(){
		return year;
	}

	public String getEngineType(){
		return engineType;
	}

	public String getEngineCapacity(){
		return engineCapacity;
	}

}
