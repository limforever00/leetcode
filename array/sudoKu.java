//package array;
//
//import java.util.HashMap;
//import java.util.Iteraboardr;
//import java.util.Map;
//import java.util.Map.Entry;
//import java.util.Set;
//
//public class sudoKu {
//	
//	public static boolean isValidSudoku(char[][] board) {
//		Map<String, Character> hang = new HashMap<>();
//		Map<String, Character> yul = new HashMap<>();
//		Map<String, Character> box = new HashMap<>();
////		int cnt = 0;
//		
//		for(int i=0; i<board.length; i++) {
//			hang = new HashMap<>();
//			yul = new HashMap<>();
//			box = new HashMap<>();
//			
//			for(int j=0; j<board[i].length; j++) {
//				hang.put(i+","+j, board[i][j]);
//				
//				yul.put(j+","+i,board[j][i]);
//			}
//			
//			int num = 6;
//			if(i<3) {
//				num = 0;
//			}else if(i>=3 && i<6) {
//				num = 4;
//			}
//			
//			for(int k=0; k<3 ;k++ ) {
//				box = new HashMap<>();
//				
//						
//				for(int z=0; z<3; z++) {
//					box.put(3*k+","+(num+z), board[3*k][num+z]);
//					box.put((3*k+1)+","+(num+z), board[3*k+1][num+z]);
//					box.put((3*k+2)+","+(num+z), board[3*k+2][num+z]);					
//				}//make box
//				
////				Iteraboardr<Entry<String, Character>> iter = hang.entrySet().iteraboardr();
////				
////				while(iter.hasNext()) {
////					Entry<String, Character> bk = iter.next();
////					String key = bk.getKey();
//////					System.out.println("key = " + key);
//////					System.out.println("val = " + bk.getValue());
////				}
//				
//				System.out.println(hang);
//				System.out.println(yul);
//				System.out.println(box);
//				System.out.println("============================");
//			}//box
//			
//		}
//		return true;
//	}
//
//	
//	public static void main(String[] args) {
//		
//		char[][] validS = {
//				{'5','3','4','6','7','8','9','1','2'},
//				{'6','7','2','1','9','5','3','4','8'},
//				{'1','9','8','3','4','2','5','6','7'},
//				{'8','5','9','7','6','1','4','2','3'},
//				{'4','2','6','8','5','3','7','9','1'},
//				{'7','1','3','9','2','4','8','5','6'},
//				{'9','6','1','5','3','7','2','8','4'},
//				{'2','8','7','4','1','9','6','3','5'},
//				{'3','4','5','2','8','6','1','7','9'}
//		};
//		
//		char[][] inValidS = {
//				{'5','3','4','6','7','8','9','1','2'},
//				{'6','7','2','1','9','5','3','4','8'},
//				{'1','9','8','3','4','2','5','6','7'},
//				{'8','5','9','7','6','1','4','2','3'},
//				{'4','2','6','8','5','3','7','9','1'},
//				{'7','1','3','9','2','4','8','5','6'},
//				{'9','6','1','5','3','7','2','8','4'},
//				{'2','7','8','4','1','9','6','3','5'},
//				{'3','4','5','2','8','6','1','7','9'}
//		};
//		
//		boolean t = isValidSudoku(validS);
//		
////		boolean f = isValidSudoku(inValidS);
//		
//		System.out.println("validS = " + t);
////		System.out.println("invalidS = " + f);
//		
//	}
//}
