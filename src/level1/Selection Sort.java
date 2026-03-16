/*
Name: Trinity Hurtado
Date: 09/15/26
scores.get(j) > scores.get(maxIndex) ensures highest first.
Swapping moves the max to the front each time.
*/

public void selectionSortScores(int[] scores) {

    for (int i = 0; i < scores.length - 1; i++) {

        int maxIndex = i;

        for (int j = i + 1; j < scores.length; j++) {

            if (scores[j] > scores[maxIndex]) {
                maxIndex = j;
            }

        }

        int temp = scores[i];
        scores[i] = scores[maxIndex];
        scores[maxIndex] = temp;
    }
}