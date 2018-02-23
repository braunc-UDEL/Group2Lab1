package pkgTest;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgCore.Die;

public class DieTest {

	@Test
	public void TestDie() {

		for (int a = 0; a < 10000; a++) {
			Die d = new Die();
			if (d.getDieValue() <= 6 && d.getDieValue() >= 1)
			{
				
			}
			else
			{
				fail("Die value is out of range: " + d.getDieValue());
			}
		}

	}
/*
	public void TestRandomDie() {
		int iTotalTrails = 10000;
		
		int[] arrayInt = {0,0,0,0,0,0};
		for (int a = 0; a < 10000; a++) {
			Die d = new Die();
			
			arrayInt[d.getDieValue()-1]++;
		}
		for (int i: arrayInt)
		{
			assertEquals((iTotalTrails / 6)/i, 1, 0.01);
		}
	} */
}
