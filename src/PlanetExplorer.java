
// Before submitting write your ID and finish time here. Your ID is written on project description sheets.
// ID:
// Finish time:

public class PlanetExplorer {


	private int x;
	private int y;
	private int posX;
	private int posY;
	private char dir;
	//	private String f;

	public PlanetExplorer(int x, int y, String obstacles){
		/*	x and y represent the size of the grid.
		 *  Obstacles is a String formatted as follows: "(obs1_x,obs1_y)(obs2_x,obs2_y)...(obsN_x,obsN_y)" with no white spaces. 
		 *  
		Example use: For a 100x100 grid with two obstacles at coordinates (5,5) and (7,8)
		PlanetExplorer explorer = new PlanetExplorer(100,100,"(5,5)(7,8)")  

		 */

		setX(x);
		setY(y);
		setPosX(0);
		setPosY(0);

	}

	public PlanetExplorer(int x, int y) {
		// TODO Auto-generated constructor stub
		setX(x);
		setY(y);
		setPosX(0);
		setPosY(0);
	}

	public String executeCommand(String command){
		String pos="(";
		pos+=getPosX();
		pos+=",";
		pos+= getPosY();
		pos+=",";
		pos+="N";
		pos+=")";

		/* The command string is composed of "f" (forward), "b" (backward), "l" (left) and "r" (right)
		 * Example: 
		 * The explorer is on a 100x100 grid at location (0, 0) and facing NORTH. 
		 * The explorer is given the commands "ffrff" and should end up at (2, 2) facing East.

		 * The return string is in the format: "(pos_x,pos_y,facing)(obs1_x,obs1_y)(obs2_x,obs2_y)..(obsN_x,obsN_y)" 
		 * Where pos_x and pos_y are the final coordinates, facing is the current direction the explorer is pointing to (N,S,W,E).
		 * The return string should also contain a list of coordinates of the encountered obstacles. No white spaces.
		 */


		if (command=="") {
			return pos;
		} else if (command.equals("r")) {
			System.out.println(pos);
			pos.replace(pos.charAt(5), turnRight(pos.charAt(pos.length()-2)));
			System.out.println(turnRight(pos.charAt(pos.length()-2)));

			return pos;
		}else if (command.equals("l")) {
			pos.replace(pos.charAt(5), turnLeft(pos.charAt(pos.length()-2)));
			return pos;
		}


		return pos;
	}
	public Character turnRight(char pointTo){
		switch (pointTo) {
		case 'N':
			return 'E';
		case 'E':
			return 'S';
		case 'S':
			return 'W';
		case 'W':
			return 'N';

		}
		return pointTo;
	}
	public Character turnLeft(char pointTo){
		switch (pointTo) {
		case 'N':
			return 'W';
		case 'E':
			return 'N';
		case 'S':
			return 'E';
		case 'W':
			return 'S';

		}
		return pointTo;
	}
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}



}
