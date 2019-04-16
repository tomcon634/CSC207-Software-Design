
import java.util.ArrayList;

public class Flight {
	private String name;
	public ArrayList<Airport> airports = new ArrayList<>();
	private String date;

	public Flight(String name, String date) {
		this.name = name;
		this.date = date;
	}

	public String getName() {
		return this.name;
	}

	public String getDate() {
		return this.date;
	}

	public void addAirport(Airport a) {
		this.airports.add(a);
		a.flights.add(this);
	}

	public boolean equals(Flight other) {
		return this.getClass() == other.getClass() && this.name.equals(other.name) && this.date.equals(other.date);
	}

	public ArrayList getAirports() {
		return this.airports;
	}

	@Override
	public String toString() {
		StringBuilder ret = new StringBuilder(this.name + ", " + this.date);
		int i = 0;
		while (i != this.airports.size()) {
			ret.append(System.lineSeparator());
			ret.append(this.airports.get(i).getName());
			i = i + 1;
		}
		String retu = ret.toString();

		return retu;
	}

}
