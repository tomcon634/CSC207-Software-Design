
import java.util.ArrayList;

public class Airport {
	private String name;
	public ArrayList<Flight> flights = new ArrayList<>();

	public Airport(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public boolean wasVisitedBy(Flight f) {
		return flights.contains(f);
	}

	public boolean onSameFlight(Airport a) {
		for (int i = 0; i < this.flights.size(); i++) {
			for (int j = 0; j < this.flights.get(i).getAirports().size(); j++)
			if (flights.get(i).getAirports().get(j).equals(a)) {
				return true;
			}
		}
		return false;
	}

	public void addFlight(Flight f) {
		this.flights.add(f);
		f.airports.add(this);
	}

	public boolean equals(Airport other) {
		if (this.flights.size() != other.flights.size()) {
			return false;
		}
		for (int i = 0; i < this.flights.size(); i++) {
			if (!other.flights.contains(this.flights.get(i))) {
				return false;
			}
		}
		return this.name.equals(other.name);
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder(this.name);
		int i = 0;
		if (flights.size() == 0) {
			s.append(" ()");
		} else {
			s.append(" (");
			while (i != this.flights.size()) {
				s.append(flights.get(i).getName());
				if (i != this.flights.size() - 1) {
					s.append(", ");
				}
				i = i + 1;
			}
			s.append(")");
		}
		String sb = s.toString();

		return sb;
	}
}
