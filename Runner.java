
public class Runner {
	public static void main(String[] args) {
		ContestOrganizer co = new ContestOrganizer();
		co.createContestants();
		co.sortAllRows();
		co.printScores();
		System.out.println(co.findWinnerName());
	}
}
