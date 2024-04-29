package gold.iv.no3190;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		//초기화
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] board = new int[N][N]; //0: 없음, 1: 사과, 2: 뱀
		int K = Integer.parseInt(br.readLine());
		for (int i = 0; i < K; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			board[Integer.parseInt(st.nextToken()) - 1][Integer.parseInt(st.nextToken()) - 1] = 1;
		}
		int L = Integer.parseInt(br.readLine());
		int[] timeToMove = new int[L];
		char[] dirToMove = new char[L];
		for (int i = 0; i < L; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			timeToMove[i] = Integer.parseInt(st.nextToken());
			dirToMove[i] = st.nextToken().charAt(0);
		}

		//뱀 이동
		int[] moveDirR = {0, -1, 0, 1}; //동 북 서 남
		int[] moveDirC = {1, 0, -1, 0};
		int moveDirIdx = 0;
		Deque<int[]> location = new ArrayDeque<>();
		location.addFirst(new int[] {0, 0});
		int gameTime = 0;
		int moveIdx = 0;
		while(true) {
			//뱀이 움직인 후
			int[] past = location.getFirst();
			int[] head = new int[] {past[0] + moveDirR[moveDirIdx], past[1] + moveDirC[moveDirIdx]};
			location.addFirst(head);
			//게임 시간이 1초 흘렀다
			gameTime++;
			//만약 보드 밖
			if (head[0] < 0 || head[1] < 0 || head[0] >= N || head[1] >= N) break;
			//만약 자기 몸
			if (board[head[0]][head[1]] == 2) break;
			//만약 사과
			if (board[head[0]][head[1]] == 1) {
				board[head[0]][head[1]] = 2;
			}
			//만약 아무것도 없다
			if (board[head[0]][head[1]] == 0) {
				board[head[0]][head[1]] = 2;
				int[] tail = location.removeLast();
				board[tail[0]][tail[1]] = 0;
			}
			//뱀 방향전환
			if (moveIdx < L && gameTime == timeToMove[moveIdx]) {
				if (dirToMove[moveIdx] == 'D') {
					if (moveDirIdx == 0) moveDirIdx = moveDirR.length - 1;
					else moveDirIdx--;
				}
				if (dirToMove[moveIdx] == 'L') {
					if (moveDirIdx == moveDirR.length - 1) moveDirIdx = 0;
					else moveDirIdx++;
				}
				moveIdx++;
			}
		}

		System.out.println(gameTime);
	}
}