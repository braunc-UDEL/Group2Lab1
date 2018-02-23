package pkgCore;

import java.util.LinkedList;

public class Round {

	private int ComeOutScore;
	private eGameResult eGameResult;
	private LinkedList<Roll> rolls = new LinkedList<Roll>();
	private boolean gameOver = false;
	private int rollCount = 1;

	public Round() {
		Roll ComeOutRoll = new Roll();
		ComeOutScore = ComeOutRoll.getScore();
		while (gameOver) {
			if (ComeOutScore == 7 || ComeOutScore == 11) {
				eGameResult = eGameResult.NATURAL;
				gameOver = true;
				break;
			}
			if (ComeOutScore == 2 || ComeOutScore == 3 || ComeOutScore == 12) 
				{
				eGameResult = eGameResult.CRAPS;
				gameOver = true;
				break;
				}
			else {
				Roll newRole = new Roll();
				rollCount++;
				if (newRole.getScore() == ComeOutScore)
				{
					eGameResult = eGameResult.POINT;
					gameOver = true;
					break; 
				}
			if (newRole.getScore() == 7)
				{
				eGameResult = eGameResult.SEVEN_OUT;
				gameOver = true;
				break;
				}
			}
		}
	}

	public int RollCount() {
		return rollCount;
	}
}
