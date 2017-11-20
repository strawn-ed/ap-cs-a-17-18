import java.io.*;
import java.util.*;

public class TicTacToe
{
    // data members
    private char[][] grid;
    private int turn_number;
    private boolean game_is_won;
    
    // constructor
    public TicTacToe()
    {
        this.grid = new char[3][3];
        for (int i = 0; i < grid.length; i++)
        {
            for (int j = 0; j < grid[0].length; j++)
            {
                grid[i][j] = ' ';
            }
        }
        this.turn_number = 0;
        this.game_is_won = false;
    }
    
    // methods
    public int get_turn_number()
    {
        return turn_number;
    }
    
    public boolean get_game_is_won()
    {
        return game_is_won;
    }
    
    public void make_move(int row, int col)
    {
        if (validate_move(row, col))
        {
            if (turn_number % 2 == 0)
            {
                grid[row][col] = 'X';
            }
            else
            {
                grid[row][col] = 'O';
                
            }
            turn_number++;
        }
    }
    
    private boolean validate_move(int row, int col)
    {
        boolean is_valid = true;
        
        if (row < 0 || col < 0 || row > 2 || col > 2)
        {
            System.out.println("ERROR: Invalid location.");
            is_valid = false;
        }
        else if (!(grid[row][col] == ' '))
        {
            System.out.println("ERROR: Spot taken.");
            is_valid = false;
        }
        
        return is_valid;
    }
    
    public void print_grid()
    {
        for (int i = 0; i < grid.length; i++)
        {
            for (int j = 0; j < grid[0].length; j++)
            {
                if (j == 0)
                {
                    System.out.print(" " + grid[i][j] + " | ");
                }
                else if (j == 1)
                {
                    System.out.print(grid[i][j] + " | ");
                }
                else
                {
                    System.out.println(grid[i][j]);
                }
            }
            if (i < grid.length - 1)
            {
                System.out.println("-----------");
            }
        }
    }
    
    public void check_if_won()
    {
        if (turn_number >= 5)
        {
            for (int i = 0; i < grid.length; i++)
            {
                if (grid[0][i] == grid[1][i] && grid[1][i] == grid[2][i] && grid[0][i] != ' ')
                {
                    game_is_won = true;
                }
                if (grid[i][0] == grid[i][1] && grid[i][1] == grid[i][2] && grid[i][0] != ' ')
                {
                    game_is_won = true;
                }
            }
            if ((grid[0][0] == grid[1][1] && grid[1][1] == grid[2][2] && grid[0][0] != ' ') ||
                (grid[0][2] == grid[1][1] && grid[1][1] == grid[2][0] && grid[0][2] != ' '))
            {
                game_is_won = true;
            }
        }
    }
    
    public void print_final_status()
    {
        if (game_is_won)
        {
            if (turn_number % 2 != 0)
            {
                System.out.println("X is the champion");
            }
            else
            {
                System.out.println("O is the champion");
            }
        }
        else
        {
            System.out.println("Draw");
        }
    }
    
    // runner method
    public static void main(String args[])
    {
        TicTacToe game = new TicTacToe();
        
        Scanner readIn = new Scanner(System.in);
        
        while (game.get_turn_number() < 9 && !game.get_game_is_won())
        {
            System.out.print("Row: ");
            int row = readIn.nextInt();
            System.out.print("Column: ");
            int col = readIn.nextInt();
            game.make_move(row, col);
            game.print_grid();
            game.check_if_won();
        }
        
        game.print_final_status();
    }
}