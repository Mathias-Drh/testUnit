/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creatures;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import creatures.crea.Dragon;
import creatures.crea.Licorne;
import creatures.crea.Creatures;

public class JUnitTest {

	public JUnitTest() {
	}

	@BeforeAll
	public static void setUpClass() {
	}

	@AfterAll
	public static void tearDownClass() {
	}

	@BeforeEach
	public void setUp() {
	}

	@AfterEach
	public void tearDown() {
	}

	@Test
	public void doDamage() {
		Monster monster1 = new Licorne();
		Monster monster2 = new Dragon();
		int pvmonster1 = monster1.getPV();
		int pvmonster2 = monster2.getPV();
		int monsterattack1 = monster1.getRandomAtt();
		int monsterattack2 = monster2.getRandomAtt();
		monster1.useAtt(monster2, monsterattack1);
		monster2.useAtt(monster1, monsterattack2);

		assertEquals(0, pvmonster1 - monster2.getAttack(monsterattack2).getDegat() - monster1.getPV());
		assertEquals(0, pvmonster2 - monster1.getAttack(monsterattack1).getDegat() - monster2.getPV());
	}
}
