import java.util.Random;

public class ContestOrganizer {
	/** the number of rows of contestant */
	public static final int NUM_ROWS = 10;

	/** the number of columns of contestant */
	public static final int CONTESTANTS_PER_ROW = 10;

	/** the two-dimensional array of contestant */
	private Contestant[][] contestants;

	/**
	 * Sorts arr in increasing order by score Postcondition: - arr sorted in
	 * increasing order by score. - Location of each contestant correctly updated
	 * such that column number matches contestant's position in arr.
	 * 
	 * @param arr
	 *            the array to be sorted.
	 */
	public void sort(Contestant[] arr) {
		/* code goes here */
	}

	public void createContestants() {
		Contestant[][] newContestants = new Contestant[10][10];
		int contestantNumber = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				Contestant temp = new Contestant(i, j);
				temp.setScore(new Random().nextInt(200));
				temp.setName("Person " + contestantNumber++);
				newContestants[i][j] = temp;
			}
		}
		this.contestants = newContestants;
	}

	/**
	 * Sorts each row of contestants into increasing order by score. Postcondition:
	 * Contestant with highest score in row[k] is in the rightmost column of row[k],
	 * 0 <= k < NUM_ROWS
	 */
	public void sortAllRows() {
		/* code goes here */
		Contestant temp;
		for (Contestant[] c1 : contestants) {
			for (int j = c1.length - 1; j > 0; j--) {
				for (int i = 0; i < j; i++) {
					if (c1[i].getScore() > c1[i + 1].getScore()) {
						temp = c1[i];
						c1[i] = c1[i + 1];
						c1[i + 1] = temp;
					}
				}
			}
		}
	}

	/**
	 * Returns name of contestant with highest score Precondition: - Contestants
	 * have not been sorted by score. - Top score is unique - Only one contestant
	 * has the highest score.
	 * 
	 * @return name of contestant with highest score.
	 */

	public void printScores() {
		for (int i = 0; i < contestants.length; i++) {
			for (int j = 0; j < contestants[i].length; j++) {
				System.out.println(contestants[i][j].getName() + ": " + contestants[i][j].getScore());
			}
			System.out.println("\n\n");
		}

	}

	public String findWinnerName() {
		sortAllRows();
		Contestant best = new Contestant(0, 0);
		for (Contestant[] c1 : contestants) {
			if (c1[c1.length - 1].getScore() > best.getScore()) {
				best = c1[c1.length - 1];
			}
		}

		return best.getName();
	}
}
