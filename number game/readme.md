# 🕹️ Core Java: Tic-Tac-Toe Game

A interactive, console-based **3x3 Tic-Tac-Toe** game developed in Java. This project demonstrates fundamental programming concepts including arrays, loops, conditional logic, and exception handling.

---

## 📂 Project Structure

| File Name | Description |
| :--- | :--- |
| **`number.java`** | The main driver class containing the game board, win-check logic, and the "play again" loop. |

---

## 🎮 How to Play

The game uses a numbered grid system (1-9). Players enter a number to place their mark (**X** or **O**) in the corresponding slot.



### The Board Layout:
| 1 | 2 | 3 |
|---|---|---|
| 4 | 5 | 6 |
| 7 | 8 | 9 |

1. **Player X** always starts first.
2. Enter a number between **1 and 9** to choose your slot.
3. The game checks for a winner after every move (Horizontal, Vertical, or Diagonal).
4. If the board is full with no winner, the game declares a **Draw**.
5. After the game ends, type `yes` to play again or `no` to exit.

---

## ✨ Key Features

* **Win Detection:** Evaluates 8 different winning combinations using a `switch` case and `if-else` logic.
* **Input Validation:** Uses `try-catch` blocks to handle `InputMismatchException`, ensuring the game doesn't crash if a user enters a non-numeric character.
* **Slot Protection:** Prevents players from overwriting a cell that is already occupied.
* **Replay Loop:** Uses a `do-while` loop to allow multiple rounds without restarting the program.

---

## 🚀 How to Run

1.  **Clone/Download** the repository.
2.  Open your IDE (Eclipse, IntelliJ, or VS Code).
3.  Navigate to `src/corejavaprograms/number.java`.
4.  Right-click the file and select **Run As > Java Application**.

---

## 🛠️ Requirements
* **Java Runtime:** JRE/JDK 18+
* **IDE:** Eclipse (recommended) or any Java-supported editor.
