import java.util.Scanner;

public class TicTacToe3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Tic Tac Toe game.");
        System.out.println(" There are two players in this game.");
        System.out.println("And also you should play this game for both of them.");
        System.out.println("Player 1, what's your name ?");
        String p1 = scanner.nextLine();
        System.out.println("Player 2, what's your name ?");
        String p2 = scanner.nextLine();
        System.out.println("This is our game table and you should enter a number thinking by locigal.");

        char[][] board = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '*';

            }

        }
        boolean isPlayer1 = true;

        drawBoard(board);
        boolean gameEnded = false;
        while (!gameEnded) {
            char symbol = ' ';
            if (isPlayer1) {
                symbol = 'X';
            } else {
                symbol = 'O';
            }
            if (isPlayer1) {
                System.out.println(p1 + "'s Turn (X): ");
            } else {
                System.out.println(p2 + "'s Turn (O): ");
            }
            int row = 0;
            int col = 0;
            while (true) {
                System.out.println("Enter a row( 0, 1 or 2 ) :");
                row = scanner.nextInt();
                System.out.println("Enter a col ( 0, 1 or 2 ) :");
                col = scanner.nextInt();
                if (row < 0 || col < 0 || row > 2 || col > 2) {
                    System.out.println("Your row and col are out of bounds ! ");
                } else if (board[row][col] != '*') {
                    System.out.println("Someone has already made move there ! ");
                } else {

                }
                break;

            }
            board[row][col] = symbol;
            if (hasWon(board) == 'X') {
                System.out.println(p1 + " We are congratulations you since  YOU WON!!!");
                gameEnded = true;
            } else if (hasWon(board) == 'O') {
                System.out.println(p2 + " We are congratulations you since  YOU WON!!!");
                gameEnded = true;
            } else {
                if (hasTied(board)) {
                    System.out.println("It's a tie!");
                    gameEnded = true;
                } else {
                    isPlayer1 = !isPlayer1;
                }
                drawBoard(board);

            }


        }
    }

        public static void drawBoard ( char[][] board){
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(board[i][j]);

                }
                System.out.println();
            }
        }

        public static char hasWon ( char[][] board){
            for (int i = 0; i < 3; i++) {
                if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != '*') {
                    return board[i][0];
                }

            }
            for (int i = 0; i < 3; i++) {
                if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != '*') {
                    return board[0][i];
                }

            }
            if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != '*') {
                return board[0][0];
            }
            if (board[2][0] == board[1][1] && board[1][1] == board[0][2] && board[2][0] != '*') {
                return board[2][0];
            }
            return '*';
        }
        public static boolean hasTied ( char[][] board){
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == '*') {
                        return false;
                    }

                }

            }
            return true;
        }

    }
