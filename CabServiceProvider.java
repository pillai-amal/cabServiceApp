public class CabServiceProvider {
	private String cabServiceName;
	private int totalCabs;

	public CabserviceProvider(String cabServiceName, int totalCabs) {
		this.cabserviceName = cabServiceName;
		this.totalCabs = totalCabs;
	}
	public double calculateRewardPrice(Driver driver) {
		double rating = this.driver.getAverageRating();
		double bonus;
		if (cabServiceName.equals("Halo")) {
			if(rating >= 4.5 && rating <= 5) bonus = 10*rating;
			else if(rating >= 4 && rating <= 4.5) bonus = 5*rating;
		}
		else if (cabServiceName.equals("Halo")) {
			if(rating >= 4.5 && rating <= 5) bonus = 8*rating;
			else if(rating >= 4 && rating <= 4.5) bonus = 3*rating;
		} 
		return Math.round(bonus*100)/100;
	}
	public String getCabserviceName() {
		return cabServiceName;
	}
	public void setCabServiceName(String cabServiceName) {
		this.cabServiceName = cabServiceName;
	}
	public int getTotalCabs() {
		return totalCabs;
	}
	public void setTotalCabs(int totalCabs) {
		this.totalCabs = totalCabs;
	}
}
