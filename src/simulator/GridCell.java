package simulator;

public class GridCell {
	private int row;
	private int col;
	private boolean obstacle;
	private boolean isexplored;
	
	public GridCell(int row, int col) {
		this.row = row;
		this.col = col;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}

	public boolean isObstacle() {
		return obstacle;
	}

	public void setObstacle(boolean obstacle) {
		this.obstacle = obstacle;
	}

	public boolean isIsexplored() {
		return isexplored;
	}

	public void setIsexplored(boolean isexplored) {
		this.isexplored = isexplored;
	}
	
	
	
	
}
