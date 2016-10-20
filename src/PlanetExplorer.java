
// Before submitting write your ID and finish time here. Your ID is written on project description sheets.
// ID:
// Finish time:

public class PlanetExplorer {


	private int x;
	private int y;
	private int posX;
	private int posY;
	private char dir;
	private String pos="";
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
		pos="("+getPosX()+","+getPosY()+","+"N"+")";
		dir=pos.charAt(pos.length()-2);


	}

	public PlanetExplorer(int x, int y) {
		// TODO Auto-generated constructor stub
		setX(x);
		setY(y);
		setPosX(0);
		setPosY(0);
		pos="("+getPosX()+","+getPosY()+","+"N"+")";
		dir=pos.charAt(pos.length()-2);

	}

	public String executeCommand(String command){

		/* The command string is composed of "f" (forward), "b" (backward), "l" (left) and "r" (right)
		 * Example: 
		 * The explorer is on a 100x100 grid at location (0, 0) and facing NORTH. 
		 * The explorer is given the commands "ffrff" and should end up at (2, 2) facing East.

		 * The return string is in the format: "(pos_x,pos_y,facing)(obs1_x,obs1_y)(obs2_x,obs2_y)..(obsN_x,obsN_y)" 
		 * Where pos_x and pos_y are the final coordinates, facing is the current direction the explorer is pointing to (N,S,W,E).
		 * The return string should also contain a list of coordinates of the encountered obstacles. No white spaces.
		 */
System.out.println(pos);
		if (command.length() > 1) {
			pos= this.executeCommand(command.substring(0, 1));
			return this.executeCommand(command.substring(1, command.length()));

		}else if (command=="") {
		} else if (command.equals("r")) {
			pos= pos.replace(pos.charAt(pos.length()-2), turnRight(getDir()));

		}else if (command.equals("l")) {
			pos=pos.replace(pos.charAt(pos.length()-2), turnLeft(getDir()));
		} if (command.equals("f")) {
			dir=pos.charAt(pos.length()-2);
			Forward();
			pos="("+getPosX()+","+getPosY()+","+dir+")";

		} if (command.equals("b")) {
			System.out.println(pos);
			dir=pos.charAt(pos.length()-2);
			Backward();
			pos="("+getPosX()+","+getPosY()+","+dir+")";
			System.out.println(pos);

		}

		return pos;

	}
	public Character turnRight(char pointTo){
		switch (pointTo) {
		case 'N':
			setDir( 'E');
			break;
		case 'E':
			setDir( 'S');
			break;
		case 'S':
			setDir( 'W');
			break;

		case 'W':
			setDir( 'N');
			break;


		}
		return getDir();
	}
	public Character turnLeft(char pointTo){
		switch (pointTo) {
		case 'N':
			setDir('W');
			break;
		case 'E':
			setDir( 'N');
			break;
		case 'S':
			setDir( 'E');
			break;
		case 'W':
			setDir( 'S');
			break;

		}
		return getDir();
	}
	public void Forward(){
		switch (getDir()) {
		case 'N':
			setPosY(posY+1);
			break;
		case 'E':
			setX(getX()+1);
			break;
		case 'S':
			setPosY(posY-1);
			break;

		case 'W':
			setX(getX()-1);
			break;


		}
	}
	public void Backward(){
		switch (getDir()) {
		case 'N':
			setPosY(posY-1);
			break;
		case 'E':
			setX(getX()-1);
			break;
		case 'S':
			setPosY(posY+1);
			break;
		case 'W':
			setX(getX()+1);
			break;
		}
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

	public char getDir() {
		return dir;
	}

	public void setDir(char dir) {
		this.dir = dir;
	}

	public String getPos() {
		return pos;
	}

	public void setPos(String pos) {
		this.pos = pos;
	}



}
