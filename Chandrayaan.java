import java.util.*;
class Chandrayaan3 {
	
    private int x, y, z;
    private char direction;
    
    Chandrayaan3(int initial_x, int initial_y, int initial_z, char initial_direction) {
        x = initial_x;
        y = initial_y;
        z = initial_z;
        direction = initial_direction;
    }

    void moveForward() {
        if (direction == 'N') {
            y += 1;
        } else if (direction == 'S') {
            y -= 1;
        } else if (direction == 'E') {
            x += 1;
        } else if (direction == 'W') {
            x -= 1;
        } else if (direction == 'U') {
            z += 1;
        } else if (direction == 'D') {
            z -= 1;
        }
    }
    void moveBackward() {
        if (direction == 'N') {
            y -= 1;
        } else if (direction == 'S') {
            y += 1;
        } else if (direction == 'E') {
            x -= 1;
        } else if (direction == 'W') {
            x += 1;
        } else if (direction == 'U') {
            z -= 1;
        } else if (direction == 'D') {
            z += 1;
        }
    }

    void turnLeft() {
        if (direction == 'N') {
            direction = 'W';
        } else if (direction == 'S') {
            direction = 'E';
        } else if (direction == 'E') {
            direction = 'N';
        } else if (direction == 'W') {
            direction = 'S';
        }else if(direction=='U') {
        	direction = 'N';
        } else if(direction=='D') {
        	direction = 'S';
        }
    }
     void turnRight() {
        if (direction == 'N') {
            direction = 'E';
        } else if (direction == 'S') {
            direction = 'W';
        } else if (direction == 'E') {
            direction = 'S';
        } else if (direction == 'W') {
            direction = 'N';
        } else if(direction=='U') {
        	direction = 'N';
        } else if(direction=='D') {
        	direction = 'S';
        }
        
    }

    void turnUp() {
    	if (direction == 'N') {
            direction = 'U';
        } else if (direction == 'S') {
            direction = 'D';
        } else if (direction == 'E') {
            direction = 'U';
        } else if (direction == 'W') {
            direction = 'D';
        }
    }

    void turnDown() {
    	if (direction == 'N') {
            direction = 'D';
        } else if (direction == 'S') {
            direction = 'U';
        } else if (direction == 'E') {
            direction = 'D';
        } else if (direction == 'W') {
            direction = 'U';
        }
    }
     void executeCommands(char[] commands) {
        for (char command : commands) {
            if (command == 'f') {
                moveForward();
            } else if (command == 'b') {
                moveBackward();
            } else if (command == 'l') {
                turnLeft();
            } else if (command == 'r') {
                turnRight();
            } else if (command == 'u') {
                turnUp();
            } else if (command == 'd') {
                turnDown();
            }
        }
    }

    void printPosition_and_Direction() {
    	System.out.println("Final Position: (" + x + ", " + y + ", " + z + ")");
        System.out.println("Final Direction: " + direction);
        
    }
}


public class Chandrayaan {

	public static void main(String[] args) {
		 Chandrayaan3 spacecraft=new Chandrayaan3(0, 0, 0, 'N');
		 char[] commands = {'f', 'r', 'u', 'b', 'l'};
		 spacecraft.executeCommands(commands);
		 spacecraft.printPosition_and_Direction();

	}

}
