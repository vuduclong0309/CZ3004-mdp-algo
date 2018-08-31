package simulator;

import robot.Robot;

public class Map {
	
	/*
	 * Constants for the map
	 */
	public static final int MAPROWS = 20;
	public static final int MAPCOLS = 20;
	public static final int MAPSIZE = 300;
	public static final int GOAL_ROW_NO = 18;
	public static final int GOAL_COL_NO = 13;
	
	private Robot robot;
	private GridCell[][] grid;
	
	public Map(Robot robot) {
		
		this.robot = robot;
		
		
	}

	/*
	 * 
	 */
	public void setAllUnexplored() {
		for (int r=0;r<MAPROWS;r++) {
			for (int c=0;c<MAPCOLS;c++) {
				if (r <=(GOAL_ROW_NO + 1) && r >= (GOAL_ROW_NO - 1) && c <= (GOAL_COL_NO + 1) && c >= (GOAL_COL_NO - 1)) {
					grid[r][c].setExplored(true);
				}
				else
					grid[r][c].setExplored(false);
				
			}
		}
	}
}
