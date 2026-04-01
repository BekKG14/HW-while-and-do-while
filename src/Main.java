//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    int firstFriday = 3;
    for (int i = 0; i <= 31; i++) {
        if ((i - firstFriday) % 7 == 0) {
            System.out.println("Сегодня пятница, "+ i +"-е число. Необходимо подготовить отчет");
        }
    }
}