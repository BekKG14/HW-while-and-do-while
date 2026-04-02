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

    int budget = 800;
    int days = 0;
    int cost = 100;
    while(budget > 0){
        days++;
        if(days % 5 == 0) {
            continue;
        }else {
            budget = budget - cost;
        }
        ;
    }
    System.out.println("Денег хватит на " + days +" дней.");


    int budgetTwo = 10000;
    int costTwo = 100;
    int daysTwo = 0;
    for(; budgetTwo > 0; ){
        daysTwo++;
        if(daysTwo % 5 == 0){
            continue;
        }else {
        budgetTwo = budgetTwo - costTwo;
        }

    }
    System.out.println("Денег хватит на " + daysTwo +" дней.");

    int month = 0;
    int total = 0;
    int goal = 12000000;
    int savingMonthly = 15000;
    do{
      total = total + savingMonthly;
      month++;
      if (month % 6 ==0){
          total = total + total * 7 / 100;
      }
      System.out.println("Накопил "+ total + "p. За " +month+ " месяцев." );
      if (total >= goal){
          break;
      }
    } while (true);

    int charge = 0;
    int minute = 0;
    int overheats = 0;
    while (charge < 100){
        minute++;
        charge = charge + 2;
        if(minute % 10 == 0 ){
            overheats++;
            System.out.println("Перегрев, заряд " + charge+ "%");
            if (overheats > 3){
                System.out.println("Зарядка прекращена. Текущий заряд: "+ charge + "%");
                break;
            }
        }
    }
}

