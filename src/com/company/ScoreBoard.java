package com.company;

public class ScoreBoard {
    int sizeC = 0;
    int sizeR = 0;
    char [][] scoreboard;

    public ScoreBoard(int r, int c)
    {
        sizeR = r;
        sizeC = c;
        scoreboard = new char[sizeC][sizeR];
    }

    public void print()
    {
        for (int r = 0; r < sizeR; ++r)
        {
            for (int c = 0; c < sizeC; ++c)
            {
                System.out.printf("%s ", scoreboard[c][r]);
            }
            System.out.println();
        }
    }
}
