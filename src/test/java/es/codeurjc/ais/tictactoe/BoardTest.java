package es.codeurjc.ais.tictactoe;


import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class BoardTest {

	@Test
	public void testWinner1() {

	Board board = new Board();
		
	Player jugador = new Player(1,"x", "Diego");
	Player jugador2 = new Player(2,"o", "Belen");

	int[] posicion = new int[3];

	board.getCell(0).value = jugador.getLabel();
	posicion[0] = 0;

	board.getCell(4).value = jugador2.getLabel();

	board.getCell(1).value = jugador.getLabel();
	posicion[1] = 1;

	board.getCell(5).value = jugador2.getLabel();

	board.getCell(2).value = jugador.getLabel();
	posicion[2] = 2;

	assertArrayEquals(posicion, board.getCellsIfWinner(jugador.getLabel()));
	assertArrayEquals(null, board.getCellsIfWinner(jugador2.getLabel()));
	assertEquals(false, board.checkDraw());

	}
}

