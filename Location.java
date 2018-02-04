
public class Location {
	private int rowNumber;
	private int colNumber;

	/**
	 * Create a new Location
	 * 
	 * @param row the row number
	 * @param col the column number
	 */
	public Location(int row, int col){
		rowNumber = row;
		colNumber = col;
	}
	
	/** @return the row number of this Location */
	public int getRowNumber(){
		return rowNumber;
	}
	
	/** @return the column number of this Location */
	public int getColNumber(){
		return colNumber;
	}
	
	public String toString(){
		return "Row: " + rowNumber + "\tCol: " + colNumber;
	}
}
