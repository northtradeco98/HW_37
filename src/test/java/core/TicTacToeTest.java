package core;

import static org.junit.Assert.*; import org.junit.*;

import org.junit.Test;

public class TicTacToeTest {

	@Before public void before() {
		              TicTacToe.board[0] = "1";
		              TicTacToe.board[1] = "2";
		              TicTacToe.board[2] = "3";
		              TicTacToe.board[3] = "4";
		              TicTacToe.board[4] = "5";
		              TicTacToe.board[5] = "6";
		              TicTacToe.board[6] = "7";
		              TicTacToe.board[7] = "8";
		              TicTacToe.board[8] = "9";
		              }     
		       @Test public void test_O1() {
		              TicTacToe.board[0] = "O";
		              TicTacToe.board[1] = "O";
		              TicTacToe.board[2] = "O";
		              assertEquals("Not correct", "O", TicTacToe.checkWinner());
		             }
		       @Test public void test_O2() {
		              TicTacToe.board[3] = "O";
		              TicTacToe.board[4] = "O";
		              TicTacToe.board[5] = "O";
		              assertEquals("Not correct", "O", TicTacToe.checkWinner());
		             }
		       @Test public void test_O3() {
		              TicTacToe.board[6] = "O";
		              TicTacToe.board[7] = "O";
		              TicTacToe.board[8] = "O";
		              assertEquals("Not correct", "O", TicTacToe.checkWinner());
		             }
		       @Test public void test_O4() {
		              TicTacToe.board[0] = "O";
		              TicTacToe.board[3] = "O";
		              TicTacToe.board[6] = "O";
		              assertEquals("Not correct", "O", TicTacToe.checkWinner());
		             }
		       @Test public void test_O5() {
		              TicTacToe.board[1] = "O";
		              TicTacToe.board[4] = "O";
		              TicTacToe.board[7] = "O";
		              assertEquals("Not correct", "O", TicTacToe.checkWinner());
		             }
		       @Test public void test_O6() {
		              TicTacToe.board[2] = "O";
		              TicTacToe.board[5] = "O";
		              TicTacToe.board[8] = "O";
		              assertEquals("Not correct", "O", TicTacToe.checkWinner());
		             }
		       @Test public void test_O7() {
		              TicTacToe.board[0] = "O";
		              TicTacToe.board[4] = "O";
		              TicTacToe.board[8] = "O";
		              assertEquals("Not correct", "O", TicTacToe.checkWinner());
		             }
		       @Test public void test_O8() {
		              TicTacToe.board[2] = "O";
		              TicTacToe.board[4] = "O";
		              TicTacToe.board[6] = "O";
		              assertEquals("Not correct", "O", TicTacToe.checkWinner());
		             }
		       @Test public void test_X1() {
		              TicTacToe.board[0] = "X";
		              TicTacToe.board[1] = "X";
		              TicTacToe.board[2] = "X";
		              assertEquals("Not correct", "X", TicTacToe.checkWinner());
		       }
		       @Test public void test_X2() {
		              TicTacToe.board[3] = "X";
		              TicTacToe.board[4] = "X";
		              TicTacToe.board[5] = "X";
		              assertEquals("Not correct", "X", TicTacToe.checkWinner());
		       }
		       @Test public void test_X3() {
		              TicTacToe.board[6] = "X";
		              TicTacToe.board[7] = "X";
		              TicTacToe.board[8] = "X";
		              assertEquals("Not correct", "X", TicTacToe.checkWinner());
		       }
		       @Test public void test_X4() {
		              TicTacToe.board[0] = "X";
		              TicTacToe.board[3] = "X";
		              TicTacToe.board[6] = "X";
		              assertEquals("Not correct", "X", TicTacToe.checkWinner());
		       }
		       @Test public void test_X5() {
		              TicTacToe.board[1] = "X";
		              TicTacToe.board[4] = "X";
		              TicTacToe.board[7] = "X";
		              assertEquals("Not correct", "X", TicTacToe.checkWinner());
		       }
		       @Test public void test_X6() {
		              TicTacToe.board[2] = "X";
		              TicTacToe.board[5] = "X";
		              TicTacToe.board[8] = "X";
		              assertEquals("Not correct", "X", TicTacToe.checkWinner());
		       }
		       @Test public void test_X7() {
		              TicTacToe.board[0] = "X";
		              TicTacToe.board[4] = "X";
		              TicTacToe.board[8] = "X";
		              assertEquals("Not correct", "X", TicTacToe.checkWinner());
		       }
		       @Test public void test_X8() {
		              TicTacToe.board[2] = "X";
		              TicTacToe.board[4] = "X";
		              TicTacToe.board[6] = "X";
		              assertEquals("Not correct", "X", TicTacToe.checkWinner());
		       }
		       @Test public void draw1() {
		              TicTacToe.board[0] = "X";
		              TicTacToe.board[2] = "X";
		              TicTacToe.board[3] = "X";
		              TicTacToe.board[4] = "X";
		              TicTacToe.board[7] = "X";
		              TicTacToe.board[1] = "O";
		              TicTacToe.board[5] = "O";
		              TicTacToe.board[6] = "O";
		              TicTacToe.board[8] = "O";
		              assertEquals("Not correct", "draw", TicTacToe.checkWinner());
		             }
		       @Test public void draw2() {
		              TicTacToe.board[8] = "X";
		              TicTacToe.board[2] = "X";
		              TicTacToe.board[3] = "X";
		              TicTacToe.board[6] = "X";
		              TicTacToe.board[1] = "X";
		              TicTacToe.board[7] = "O";
		              TicTacToe.board[5] = "O";
		              TicTacToe.board[4] = "O";
		              TicTacToe.board[0] = "O";
		              assertEquals("Not correct", "draw", TicTacToe.checkWinner());
		             }
		       @Test public void draw3() {
		              TicTacToe.board[0] = "X";
		              TicTacToe.board[2] = "X";
		              TicTacToe.board[3] = "X";
		              TicTacToe.board[5] = "X";
		              TicTacToe.board[7] = "X";
		              TicTacToe.board[1] = "O";
		              TicTacToe.board[4] = "O";
		              TicTacToe.board[6] = "O";
		              TicTacToe.board[8] = "O";
		              assertEquals("Not correct", "draw", TicTacToe.checkWinner());
		             }
		       @Test public void draw4() {
		              TicTacToe.board[0] = "X";
		              TicTacToe.board[5] = "X";
		              TicTacToe.board[6] = "X";
		              TicTacToe.board[1] = "X";
		              TicTacToe.board[7] = "X";
		              TicTacToe.board[4] = "O";
		              TicTacToe.board[2] = "O";
		              TicTacToe.board[3] = "O";
		              TicTacToe.board[8] = "O";
		              assertEquals("Not correct", "draw", TicTacToe.checkWinner());
		             }
		      
		       @Test public void test1() {
		              TicTacToe.turn = "X";
		              TicTacToe.board[0] = "X";
		              TicTacToe.board[1] = "O";     
		              assertEquals("Not correct", null, TicTacToe.checkWinner());
		             }
		       @Test public void test2() {
		              TicTacToe.turn = "X";
		              TicTacToe.board[1] = "X";
		              TicTacToe.board[0] = "O";     
		              assertEquals("Not correct", null, TicTacToe.checkWinner());
		             }
		       @Test public void test3() {
		              TicTacToe.turn = "X";
		              TicTacToe.board[2] = "X";
		              TicTacToe.board[3] = "O";     
		              assertEquals("Not correct", null, TicTacToe.checkWinner());
		             }
		       @Test public void test4() {
		              TicTacToe.turn = "X";
		              TicTacToe.board[3] = "X";
		              TicTacToe.board[4] = "O";     
		              assertEquals("Not correct", null, TicTacToe.checkWinner());
		             }

}
