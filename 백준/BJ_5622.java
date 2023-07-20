package Coding_test_study.백준;
/*상근이의 할머니는 아래 그림과 같이 오래된 다이얼 전화기를 사용한다.
전화를 걸고 싶은 번호가 있다면, 숫자를 하나를 누른 다음에 금속 핀이 있는 곳 까지 시계방향으로 돌려야 한다. 숫자를 하나 누르면 다이얼이 처음 위치로 돌아가고,
다음 숫자를 누르려면 다이얼을 처음 위치에서 다시 돌려야 한다.
숫자 1을 걸려면 총 2초가 필요하다. 1보다 큰 수를 거는데 걸리는 시간은 이보다 더 걸리며, 한 칸 옆에 있는 숫자를 걸기 위해선 1초씩 더 걸린다.
상근이의 할머니는 전화 번호를 각 숫자에 해당하는 문자로 외운다. 즉, 어떤 단어를 걸 때, 각 알파벳에 해당하는 숫자를 걸면 된다. 예를 들어, UNUCIC는 868242와 같다.
할머니가 외운 단어가 주어졌을 때, 이 전화를 걸기 위해서 필요한 최소 시간을 구하는 프로그램을 작성하시오.*/
import java.io.*;
public class BJ_5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int sec = 0;
        for(int i=0;i<s.length();i++){
            switch (s.charAt(i)){
                case 'A': case 'B' : case 'C':
                    sec += 3;
                    break;
                case 'D': case 'E' : case 'F':
                    sec += 4;
                    break;
                case 'G': case 'H' : case 'I':
                    sec += 5;
                    break;
                case 'J': case 'K' : case 'L':
                    sec += 6;
                    break;
                case 'M': case 'N' : case 'O':
                    sec += 7;
                    break;
                case 'P': case 'Q': case 'R': case 'S':
                    sec += 8;
                    break;
                case 'T': case 'U' : case 'V':
                    sec += 9;
                    break;
                case 'W': case 'X': case 'Y': case 'Z':
                    sec += 10;
                    break;
            }
        }
        System.out.println(sec);

        /*
        다른 풀이(숏코딩)
        int s = 0;
		for (char c : new Scanner(System.in).next().toCharArray()) {
			c -= (c > 82) ? (c > 89) ? 2 : 1 : 0;
			s += (c - 56) / 3;
		}
		System.out.println(s);*/
    }
}
