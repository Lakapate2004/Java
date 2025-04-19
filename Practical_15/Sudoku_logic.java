/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sudoku;
import java.util.Random;

/**
 *
 * @author Hero
 */
public class Sudoku_logic {
    public String[][] originalLayout;
    public String[][] layout;
    String[][] userAns;
    int size;
    int remove;
    boolean valid;
    int[] rmvIndex;
    
    public void getLayout() {
    layout = new String[size][size];
    originalLayout = new String[size][size];
    Random random = new Random();

    int maxRetries = 100; // to avoid infinite loop
    int retries = 0;

    for (int i = 0; i < size; i++) {
        for (int j = 0; j < size; j++) {
            boolean placed = false;
            int attempts = 0;

            while (!placed && attempts < maxRetries) {
                int num = random.nextInt(size) + 1;
                if (isValid(i, j, num)) {
                    layout[i][j] = String.valueOf(num);
                    placed = true;
                }
                attempts++;
            }

            if (!placed) {
                // Restart the whole grid generation if stuck
                getLayout();
                return;
            }
        }
    }
    for(int i =0;i<size;i++){
        originalLayout[i] = layout[i].clone();
    }
}

     boolean isValid(int row, int col, int num) {
        for (int i = 0; i < row; i++) {
            if (layout[i][col] != null && Integer.parseInt(layout[i][col]) == num) {
                return false;
            }
        }
        for (int j = 0; j < col; j++) {
            if (layout[row][j] != null && Integer.parseInt(layout[row][j]) == num) {
                return false;
            }
        }
        return true;
    }
      void rmvElements() {
        Random random = new Random();
        rmvIndex = new int[2 * remove];
        int count = 0;
    
        while (count < remove) {
            int i = random.nextInt(size);
            int j = random.nextInt(size);
    
            if (!layout[i][j].equals(" ")) {
                layout[i][j] = " ";
                rmvIndex[2 * count] = i;
                rmvIndex[2 * count + 1] = j;
                count++;
            }
        }
    }
      boolean checkSolution() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                for (int k = j + 1; k < size; k++) {
                    if (userAns[i][j].equals(userAns[i][k]) || userAns[j][i].equals(userAns[k][i])) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    

    
}
