package tictactoe;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        int FIELD_EMPTY = 32;
        int FIELD_X = 88;
        int FIELD_O = 79;
        boolean hasXWin = false;
        boolean hasOWin = false;
        boolean hasDiagonalXWin = false;
        boolean hasDiagonalOWin = false;
        // initializing matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = FIELD_EMPTY;
            }
        }
        // printing matrix
        System.out.println("---------");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matrix[i].length; j++) {
                char output = (char) matrix[i][j];
                System.out.print(output + " ");
            }
            System.out.println("|");
        }
        System.out.println("---------");
        // entering and checking coordinates
        while (!hasDiagonalOWin || !hasDiagonalXWin || !hasOWin || !hasXWin) {
            // running "X"
            while (true) {
                String inputX = scanner.nextLine();
                inputX = inputX.replaceAll(" ", "");
                if (inputX.matches("^[0-9]+$")) {
                    int coordinatesX = Integer.parseInt(inputX);
                    if (coordinatesX == 11 || coordinatesX == 12 || coordinatesX == 13 ||
                            coordinatesX == 21 || coordinatesX == 22 || coordinatesX == 23 ||
                            coordinatesX == 31 || coordinatesX == 32 || coordinatesX == 33) {
                        switch (coordinatesX) {
                            case 11:
                                if (matrix[0][0] == FIELD_EMPTY) {
                                    matrix[0][0] = FIELD_X;
                                    break;
                                } else {
                                    System.out.println("This cell is occupied! Choose another one!");
                                    continue;
                                }
                            case 12:
                                if (matrix[0][1] == FIELD_EMPTY) {
                                    matrix[0][1] = FIELD_X;
                                    break;
                                } else {
                                    System.out.println("This cell is occupied! Choose another one!");
                                    continue;
                                }
                            case 13:
                                if (matrix[0][2] == FIELD_EMPTY) {
                                    matrix[0][2] = FIELD_X;
                                    break;
                                } else {
                                    System.out.println("This cell is occupied! Choose another one!");
                                    continue;
                                }
                            case 21:
                                if (matrix[1][0] == FIELD_EMPTY) {
                                    matrix[1][0] = FIELD_X;
                                    break;
                                } else {
                                    System.out.println("This cell is occupied! Choose another one!");
                                    continue;
                                }
                            case 22:
                                if (matrix[1][1] == FIELD_EMPTY) {
                                    matrix[1][1] = FIELD_X;
                                    break;
                                } else {
                                    System.out.println("This cell is occupied! Choose another one!");
                                    continue;
                                }
                            case 23:
                                if (matrix[1][2] == FIELD_EMPTY) {
                                    matrix[1][2] = FIELD_X;
                                    break;
                                } else {
                                    System.out.println("This cell is occupied! Choose another one!");
                                    continue;
                                }
                            case 31:
                                if (matrix[2][0] == FIELD_EMPTY) {
                                    matrix[2][0] = FIELD_X;
                                    break;
                                } else {
                                    System.out.println("This cell is occupied! Choose another one!");
                                    continue;
                                }
                            case 32:
                                if (matrix[2][1] == FIELD_EMPTY) {
                                    matrix[2][1] = FIELD_X;
                                    break;
                                } else {
                                    System.out.println("This cell is occupied! Choose another one!");
                                    continue;
                                }
                            case 33:
                                if (matrix[2][2] == FIELD_EMPTY) {
                                    matrix[2][2] = FIELD_X;
                                    break;
                                } else {
                                    System.out.println("This cell is occupied! Choose another one!");
                                    continue;
                                }
                        }
                        break;
                    } else {
                        System.out.println("Coordinates should be from 1 to 3!");
                    }
                } else {
                    System.out.println("You should enter numbers");
                }
            }
            // printing matrix
            System.out.println("---------");
            for (int i = 0; i < matrix.length; i++) {
                System.out.print("| ");
                for (int j = 0; j < matrix[i].length; j++) {
                    char output = (char) matrix[i][j];
                    System.out.print(output + " ");
                }
                System.out.println("|");
            }
            System.out.println("---------");
            //checking X winner in left/right diagonal
            int countLeftDiagX = 0;
            int countRightDiagX = 0;
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][i] == FIELD_X) {
                    countLeftDiagX++;
                }
                if (matrix[i][2 - i] == FIELD_X) {
                    countRightDiagX++;
                }
            }
            if (countLeftDiagX == 3 || countRightDiagX == 3) {
                hasDiagonalXWin = true;
            }
            //checking X winner by columns and rows
            int cellX = 0;
            for (int i = 0; i < matrix.length; i++) {
                int check_i = 0;
                int check_j = 0;
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] != FIELD_EMPTY) {
                        cellX++;
                    }
                    check_i += matrix[i][j];
                    check_j += matrix[j][i];
                }
                if (check_i == 3 * FIELD_X || check_j == 3 * FIELD_X) {
                    hasXWin = true;
                }
            }
            if (hasDiagonalXWin || hasXWin) {
                System.out.println("X wins");
                break;
            } else if (cellX == 9) {
                System.out.println("Draw");
                break;
            }
            // running "O"
            while (true) {
                String inputO = scanner.nextLine();
                inputO = inputO.replaceAll(" ", "");
                if (inputO.matches("^[0-9]+$")) {
                    int coordinatesO = Integer.parseInt(inputO);
                    if (coordinatesO == 11 || coordinatesO == 12 || coordinatesO == 13 ||
                            coordinatesO == 21 || coordinatesO == 22 || coordinatesO == 23 ||
                            coordinatesO == 31 || coordinatesO == 32 || coordinatesO == 33) {
                        switch (coordinatesO) {
                            case 11:
                                if (matrix[0][0] == FIELD_EMPTY) {
                                    matrix[0][0] = FIELD_O;
                                    break;
                                } else {
                                    System.out.println("This cell is occupied! Choose another one!");
                                    continue;
                                }
                            case 12:
                                if (matrix[0][1] == FIELD_EMPTY) {
                                    matrix[0][1] = FIELD_O;
                                    break;
                                } else {
                                    System.out.println("This cell is occupied! Choose another one!");
                                    continue;
                                }
                            case 13:
                                if (matrix[0][2] == FIELD_EMPTY) {
                                    matrix[0][2] = FIELD_O;
                                    break;
                                } else {
                                    System.out.println("This cell is occupied! Choose another one!");
                                    continue;
                                }
                            case 21:
                                if (matrix[1][0] == FIELD_EMPTY) {
                                    matrix[1][0] = FIELD_O;
                                    break;
                                } else {
                                    System.out.println("This cell is occupied! Choose another one!");
                                    continue;
                                }
                            case 22:
                                if (matrix[1][1] == FIELD_EMPTY) {
                                    matrix[1][1] = FIELD_O;
                                    break;
                                } else {
                                    System.out.println("This cell is occupied! Choose another one!");
                                    continue;
                                }
                            case 23:
                                if (matrix[1][2] == FIELD_EMPTY) {
                                    matrix[1][2] = FIELD_O;
                                    break;
                                } else {
                                    System.out.println("This cell is occupied! Choose another one!");
                                    continue;
                                }
                            case 31:
                                if (matrix[2][0] == FIELD_EMPTY) {
                                    matrix[2][0] = FIELD_O;
                                    break;
                                } else {
                                    System.out.println("This cell is occupied! Choose another one!");
                                    continue;
                                }
                            case 32:
                                if (matrix[2][1] == FIELD_EMPTY) {
                                    matrix[2][1] = FIELD_O;
                                    break;
                                } else {
                                    System.out.println("This cell is occupied! Choose another one!");
                                    continue;
                                }
                            case 33:
                                if (matrix[2][2] == FIELD_EMPTY) {
                                    matrix[2][2] = FIELD_O;
                                    break;
                                } else {
                                    System.out.println("This cell is occupied! Choose another one!");
                                    continue;
                                }
                        }
                        break;
                    } else {
                        System.out.println("Coordinates should be from 1 to 3!");
                    }
                } else {
                    System.out.println("You should enter numbers");
                }
            }
            // printing matrix
            System.out.println("---------");
            for (int i = 0; i < matrix.length; i++) {
                System.out.print("| ");
                for (int j = 0; j < matrix[i].length; j++) {
                    char output = (char) matrix[i][j];
                    System.out.print(output + " ");
                }
                System.out.println("|");
            }
            System.out.println("---------");
            //checking O winner in left/right diagonal
            int countLeftDiagO = 0;
            int countRightDiagO = 0;
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][i] == FIELD_O) {
                    countLeftDiagO++;
                }
                if (matrix[i][2 - i] == FIELD_O) {
                    countRightDiagO++;
                }
            }
            if (countLeftDiagO == 3 || countRightDiagO == 3) {
                hasDiagonalOWin = true;
            }
            //checking O winner by columns and rows
            int cell = 0;
            for (int i = 0; i < matrix.length; i++) {
                int check_i = 0;
                int check_j = 0;
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] != FIELD_EMPTY) {
                        cell++;
                    }
                    check_i += matrix[i][j];
                    check_j += matrix[j][i];
                }
                if (check_i == 3 * FIELD_O || check_j == 3 * FIELD_O) {
                    hasOWin = true;
                }
            }
            if (hasDiagonalOWin || hasOWin) {
                System.out.println("O wins");
                break;
            } else if (cell == 9) {
                System.out.println("Draw");
                break;
            }
        }
    }
}