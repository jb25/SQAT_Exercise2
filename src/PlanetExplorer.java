
// Before submitting write your ID and finish time here. Your ID is written on project description sheets.
// ID:
// Finish time:

public class PlanetExplorer {


	private int x;
	private int y;
	private int posX;
	private int posY;
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

	}

	public PlanetExplorer(int x, int y) {
		// TODO Auto-generated constructor stub
		setX(x);
		setY(y);
	}

	public String executeCommand(String command){
		String pos="(";
		pos+=getX();
		pos+=",";
		pos+= getY();
		pos+=",";
		pos+="N";
		pos+=")";
		Char pointTo=pos.charAt(5);


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



		}


		return pos;
	}
	public void turnRight(){


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
