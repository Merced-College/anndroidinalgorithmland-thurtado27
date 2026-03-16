[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=23136240)
# AnnDroidInAlgotihmLand
a sample project to practice sorting and searching

🎵 Download Required Audio File

This project uses an audio file that is too large to store directly in the GitHub repository.
Please download the file from Google Drive before running the program.

Download the audio file here:

➡️ Download the required audio file from Google Drive

Instructions

Open the Google Drive folder using the link above.

Download the ZIP file that contains the audio file.

Extract (unzip) the file on your computer.

Place the extracted audio file into the project folder named content.

Download all of the whole content folder, and put this in your project.

Trinity Hurtado
March 15, 2026

This project is a Java game called Ann Droid in Algorithm Land.

Project setup completed successfully.

## Code Exploration

1.What types of files are located in the src folder?
The src folder contains Java source files that define the classes and logic for the game.

2.What appears to be stored in the content folder?
The content folder stores assets used by the game such as images, levels, or other game resources.

3.What is the purpose of the uml folder?
The uml folder contains UML diagrams that show the relationships between classes in the project.

4.Why do software projects often separate code from content/assets?
Separating code from assets makes the project easier to organize and maintain. Code handles the program logic while assets store external resources like images and data files.

## Main Class

1.Which class contains the main() method?
The main() method is located in the Main class.

2.What does the program do when it first starts running?
When the program starts it initializes the game and opens the game window.

3.What objects or classes are created when the program begins?
It creates objects related to the game engine, graphics system, and player.

## Program Execution

1.Which class appears responsible for drawing graphics?
The graphics are likely handled by the GamePanel or rendering class.

2.Which class appears responsible for loading files or content?
File loading appears to be handled by a content or resource manager class.

3.How does the game update what appears on the screen?
The game updates the screen through a game loop that repeatedly updates game objects and redraws the screen.

## UML Diagram

1.What does the UML diagram help you understand about the program?
The UML diagram helps show how the classes in the program are connected and how they interact.

2.Which class appears to be the central class in the system?
The main game class appears to be the central class because it controls the game loop and interactions.

3.Which classes depend on or interact with other classes?
Other classes depend on it to draw graphics, load resources, and control game objects.

## Score System

1.Where in the code are scores stored?
Scores appear to be stored in a list or array inside the score or game manager class.

2.What data type is used to store scores?
The scores are stored using an integer data type.

3.Where would it make sense to implement sorting of scores?
Sorting should be implemented in the class that manages the score list because that class controls how scores are stored and displayed.

## Sorting

1.In which class did you add the sorting code?
ScoreEntry

2.Why did you choose that location?
This class already handles storing and managing scores, so adding sorting here keeps all score logic together.

3.What data structure is being sorted?
rrayList<Integer> scores

## Test The Sorting
1.Which sorting algorithm did you choose?
I implemented the Selection Sort algorithm.

2.How does your algorithm work in your own words?
Selection sort repeatedly finds the highest value in the unsorted portion of the list and swaps it with the first unsorted position. This continues until the entire list is sorted from highest to lowest.

3.How did you verify that your sort was correct?
I ran the program and printed the scores before and after sorting to verify they were arranged from highest to lowest.









