    package task_manager_system;

    import java.util.PriorityQueue;
    import java.util.Queue;

    public class TaskManager<T> {


        private Queue<T> tasks;

        public TaskManager(){
            tasks = new PriorityQueue<T>();
        }


        public String addTask(T task){
            if (task == null) return "";
            boolean offer = tasks.offer(task);
            String message = "Bir hata oluştu task eklenemedi";
            if (offer){
                message = "Task başarıyla eklendi";
            }
            return message  ;
        }

        public T getNextTask(){
            if (tasks.isEmpty()) return null;
            return tasks.poll();
        }

        public T peekNextTask(){
            if (tasks.isEmpty()) return null;
            return tasks.peek();
        }

        public void removeTask(T task){
            if (task == null) return;
            tasks.remove(task);
        }

        public int size(){
            return tasks.size();
        }

        public boolean isEmpty(){
            return tasks.isEmpty();
        }

        public void clear(){
            tasks.clear();
        }
    }
