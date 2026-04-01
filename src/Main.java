void main() {
    int firstFriday = 3;
    for (int i = 0; i <= 31; i++) {
        if ((i - firstFriday) % 7 == 0) {
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
        }
    }
    int distanceCovered = 0;
    int finalDistantion = 42195;
    int checkingTheDistance = 500;
    do{distanceCovered = distanceCovered + checkingTheDistance;
        System.out.println("Держитесь! Осталось " + distanceCovered+ " метров");
    }while(distanceCovered <= finalDistantion);

    int distanceCoveredTwo = 0;
    int finalDistantionTwo = 42195;
    int checkingTheDistanceTwo = 500;
    for(; distanceCoveredTwo <= finalDistantionTwo; ) {
            distanceCoveredTwo = distanceCoveredTwo + checkingTheDistanceTwo;
            System.out.println("2.0 Держитесь! Осталось " + distanceCoveredTwo+ " метров");
    }
}

