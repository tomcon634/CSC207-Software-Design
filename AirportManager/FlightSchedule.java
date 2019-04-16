import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FlightSchedule {

	private static boolean isInFile = false;
	private static Airport a;

	public static void main(String[] args) throws IOException {
		BufferedReader kbd = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the name of an airport.");
		String input = kbd.readLine();
		a = new Airport(input);
		while (!input.equals("exit")) {
			String fileName = "FlightList.txt";
			Path path = Paths.get(fileName);
			try (BufferedReader fileInput = Files.newBufferedReader(path)) {
				String line = fileInput.readLine();
				while (line != null) {
					if (line.contains(input)) {
						isInFile = true;
						String sub1 = line.substring(0, line.indexOf(" "));
						String sub2 = line.substring(line.indexOf(" ") + 1, line.indexOf("|"));
						a.addFlight(new Flight(sub1, sub2));
					}
					line = fileInput.readLine();
				}
			}
			if (isInFile) {
				System.out.println(a.toString());
			} else {
				System.out.println("This is not a valid airport.");
			}
			isInFile = false;
			System.out.println("Enter the name of an airport.");
			input = kbd.readLine();
			a = new Airport(input);
		}
	}
}