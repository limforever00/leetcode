package exam;

public class Robot {

	public static void main(String[] args) {
		int[][] a = {{0,1,2},{-1,1,2},{3,1,2}};
		String[] b = {};
		
		int c = solution(a, 2, 0, b);
		
		System.out.println("res = "+ c);
		
	}
	
	
	public static int solution(int[][] office, int r, int c, String[] move) {
		int answer = 0;
		String face = "North";
		boolean moveYN = false;
		int len = move.length;
		int r1 = r;
		int c1 = c;
		if(r1 > office.length-1 || c1 > office[0].length-1) {
			return -1;
		}
		answer += office[r1][c1];
		office[r1][c1] = 0;
		
		for(int i=0; i<len; i++) {	
			
			if(move[i].equals("go")) {
				System.out.println("case go");
				switch(face){
				case "East":
					System.out.println("case East");
					if((c1+1 < office[0].length) || (office[r1][c1+1] != -1)) {
						c1 += 1;
						moveYN = true;
					}
					break;
				case "West":
					System.out.println("case West");
					if((c1 -1 >= 0) || (office[r1][c1-1] != -1)){
						c1 -= 1;
						moveYN = true;
					}	
					break;
				case "South":
					System.out.println("case South");
					if((r1+1 < office.length) || (office[r1+1][c1] != -1)){
						r1 += 1;
						moveYN = true;
					}	
					break;
				case "North":
					System.out.println("case North");
					if((r1-1 >= 0) && (office[r1-1][c1] != -1)){
						r1 -= 1;
						moveYN = true;
					}	
					break;
				}
			}else if(move[i].equals("right")) {
				switch(face) {
				case "East":
					face = "South";
					moveYN = false;
					break;
				case "West":
					face = "North";
					moveYN = false;
					break;
				case "South":
					face = "West";
					moveYN = false;
					break;
				case "North":
					face = "East";
					moveYN = false;
					break;	
				}
			}else if(move[i].equals("left")) {
				switch(face) {
				case "East":
					face = "North";
					moveYN = false;
					break;
				case "West":
					face = "South";
					moveYN = false;
					break;
				case "South":
					face = "East";
					moveYN = false;
					break;
				case "North":
					face = "West";
					moveYN = false;
					break;	
				}
			}
			if(moveYN == true) {
				answer += office[r1][c1];
				office[r1][c1] = 0;
			}
		}
		
		
		return answer;
	}
}
