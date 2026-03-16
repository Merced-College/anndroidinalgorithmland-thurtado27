/**
 * Sorts the given array of scores in descending order using selection sort.
 * The largest remaining element is moved to the front in each iteration.
 */
public void selectionsSortScores(int[] scores) {
    for (int i = 0; i < scores.length -1; i++) {
        int maxIndex = i;
        for (int j = i + 1; j < scores.length; j++) {
            if (scores[j] > scores[maxIndex]){
                maxIndex = j;
            }
        }
        int temp = scores[i];
        scores[i] = scores[maxIndex];
        scores[maxIndex] = temp;
     }
}