package task_manager_system;

import java.util.Date;

public class Main {

    /*
     Açıklama:

     Bir görev yönetim sistemi geliştirilmektedir.

     Sistem içerisinde görevler (Task) tutulacaktır.
     Her görev belirli bir öncelik değerine sahiptir.

     Önceliği yüksek olan görevler daha önce işlenmelidir.

     Örnek:

     - Kritik hata düzeltme (High priority)
     - Yeni özellik geliştirme (Medium priority)
     - Kod refactor (Low priority)

     Bu görevler öncelik sırasına göre işlenmelidir.


     Problem:

     Normal List kullanıldığında görevler sıralı şekilde
     yönetilemez ve öncelik mantığı uygulanamaz.


     Amaç:

     PriorityQueue ve Comparable kullanarak
     önceliğe göre çalışan bir görev yönetim sistemi geliştirmek.


     Task Özellikleri:

     - id
     - title
     - description
     - priority
     - createdTime


     Örnek Kullanım:

     TaskManager manager = new TaskManager();

     manager.addTask(new Task(1, "Fix Bug", "Critical bug", 1));
     manager.addTask(new Task(2, "Add Feature", "New feature", 3));
     manager.addTask(new Task(3, "Refactor", "Clean code", 5));

     Task nextTask = manager.getNextTask();

     System.out.println(nextTask);


     Beklenen:

     - PriorityQueue kullanılmalı
     - Comparable interface kullanılmalı
     - Task sınıfı oluşturulmalı
     - TaskManager sınıfı oluşturulmalı
     - Önceliğe göre sıralama yapılmalı


     Geliştirilecek Methodlar:

     - addTask(Task task)
     - getNextTask()
     - removeTask()
     - size()
     - isEmpty()


     Bonus (Zorlaştırmak İçin):

     - Task history ekleme
     - Task filtering
     - Task sorting by date

    */
    public static void main(String[] args){

        TaskManager<Task> manager = new TaskManager<>();

        manager.addTask(new Task(1L, "Fix Bug", "Critical bug", 1L,new Date()));
        manager.addTask(new Task(2L, "Add Feature", "New feature", 3L,new Date()));
        manager.addTask(new Task(3L, "Refactor", "Clean code", 5L,new Date()));

        Task nextTask = manager.getNextTask();
        System.out.println(nextTask);
        Task nextTask2 = manager.getNextTask();
        System.out.println(nextTask2);
        Task nextTask3 = manager.getNextTask();
        System.out.println(nextTask3);


    }
}
