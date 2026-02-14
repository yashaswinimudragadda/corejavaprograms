# 🕹️ Tic-Tac-Toe (Java Console Edition)

A classic 3x3 Tic-Tac-Toe game built using Core Java. This project demonstrates basic game logic, board state management, and user input handling.

## ✨ Features
* **Two-player gameplay**: Play locally with a friend (Players X and O).
* **Win/Draw Detection**: Automatically detects horizontal, vertical, and diagonal wins.
* **Input Validation**: Prevents players from picking occupied slots or entering invalid data.
* **Play Again**: Option to restart the game immediately after a match ends.

## 🎮 How to Play

The board is represented by numbers **1 through 9**. When it is your turn, enter the number corresponding to the slot where you want to place your mark.



| 1 | 2 | 3 |
|---|---|---|
| 4 | 5 | 6 |
| 7 | 8 | 9 |

1. **Player X** always goes first.
2. Enter a number (1-9) to place your mark.
3. The first player to get 3 in a row (up, down, across, or diagonally) wins!
4. If all 9 squares are full and no one has 3 in a row, it's a draw.

## 🚀 Execution Instructions

### Prerequisites
* **Java Development Kit (JDK)** 18 or higher.
* An IDE (Eclipse, IntelliJ) or a Terminal.

### Running the Game
1. Open the project in your IDE.
2. Run `number.java`.
3. Follow the on-screen prompts in the console.

## 🛠️ Code Structure
* **`checkWinner()`**: Contains the logic for all 8 possible winning combinations.
* **`printBoard()`**: Renders the current state of the 3x3 grid.
* **`main()`**: Handles the game loop, input exceptions, and the "play again" feature.
