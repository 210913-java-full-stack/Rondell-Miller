package MetroBank.utils;

import MetroBank.colletions.MyArrayList;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainMenu {

    public class MainMenu extends View {

        public MainMenu(Scanner scanner) {
            super("MainMenu", scanner);
        }

        /**
         * We print options prompting the user for input, accept that input and navigate to the appropriate next view.
         */
        @Override
        public void renderView() {
            //Write the I/O here, also the navigation based on processing input
            System.out.println("===MAIN MENU===\nEnter selection:\n\n1) View ToDo Items.\n2) Mark item complete.\nQ) Quit");
            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    viewManager.navigate("ViewToDoList");
                    return;
                case "2":
                    viewManager.navigate("MarkItemComplete");
                    return;
                case "Q":
                case "q":
                    viewManager.setRunning(false);
                    return;
            }
        }
    }