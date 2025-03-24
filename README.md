# N-Queens Problem Using Backtracking

## Overview
The **N-Queens problem** is a classic combinatorial problem that involves placing `N` queens on an `N × N` chessboard so that no two queens attack each other. This means that no two queens can be in the same row, column, or diagonal.

## Approach
The solution is implemented using **Backtracking**, a technique that explores all possible placements and backtracks whenever a conflict arises. The algorithm follows these steps:

1. Start placing queens row by row.
2. For each row, try placing a queen in every column.
3. If a safe position is found (no other queens threaten the position), place the queen and move to the next row.
4. If no safe position exists in a row, backtrack to the previous row and change the queen’s position.
5. Repeat this process until all `N` queens are placed successfully or all possibilities are exhausted.

## Time Complexity
- The worst-case time complexity is **O(N!)**, as the algorithm explores all possible ways to place `N` queens.
- Optimizations like **pruning** and **constraint checks** help improve performance.

## Applications
- Constraint satisfaction problems
- AI and optimization algorithms
- Chess-related problem-solving

## How to Run
1. Compile and run the Java program.
2. Input the board size `N`.
3. The program will print all valid solutions.



