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
	private GridCell[][] cells;
	
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
					cells[r][c].setExplored(true);
				}
				else
					cells[r][c].setExplored(false);
				
			}
		}
	}
	
	 /**
     * Sets a cell as an obstacle and the surrounding cells as virtual walls or resets the cell and surrounding
     * virtual walls.
     */
    public void setObstacleCell(int row, int col, boolean obstacle) {
        if (obstacle && (startZone(row, col) || inGoalZone(row, col)))
            return;

        cells[row][col].setIsObstacle(obstacle);

        if (row >= 1) {
        	cells[row - 1][col].setVirtualWall(obstacle);            // bottom cell

            if (col < MapConstants.MAP_COLS - 1) {
            	cells[row - 1][col + 1].setVirtualWall(obstacle);    // bottom-right cell
            }

            if (col >= 1) {
            	cells[row - 1][col - 1].setVirtualWall(obstacle);    // bottom-left cell
            }
        }

        if (row < MAPROWS - 1) {
        	cells[row + 1][col].setVirtualWall(obstacle);            // top cell

            if (col < MapConstants.MAP_COLS - 1) {
                grid[row + 1][col + 1].setVirtualWall(obstacle);    // top-right cell
            }

            if (col >= 1) {
                grid[row + 1][col - 1].setVirtualWall(obstacle);    // top-left cell
            }
        }

        if (col >= 1) {
            grid[row][col - 1].setVirtualWall(obstacle);            // left cell
        }

        if (col < MAPCOLS - 1) {
            grid[row][col + 1].setVirtualWall(obstacle);            // right cell
        }
    }
	
	
}
