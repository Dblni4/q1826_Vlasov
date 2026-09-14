package by.itstep.lesson1;



public class LessonOne {
    public static void main(String[] args){
        int ExamGrade = 111;
        if(ExamGrade >= 90 & ExamGrade <= 100) {
            System.out.println("Отлично (A) - Ты гений!");}
        else if(ExamGrade >= 75 & ExamGrade <= 89){
        System.out.println("Хорошо (B) - Молодец!");}
        else if (ExamGrade >= 60 & ExamGrade <= 74){
        System.out.println("Удовлетворительно (C) - Можно лучше");}
        else if(ExamGrade >= 40 & ExamGrade <= 59){
        System.out.println("Плохо (D) - Нужно подтянуть");}
        else if(ExamGrade >= 0 & ExamGrade <= 39){
        System.out.println("Неудовлетворительно (F) - Учи материал!");}
        else System.out.println( "Ошибка! Введите число от 0 до 100"
        );
    }
}
