public class AplikasiTodolist {
    public static String[] model = new String[10];
    public static void main(String[] args) {
        testShowTodolist();
    }

    /**
     * Show todolist logic
     * */
    public static void showTodolist() {
        for(var i = 0; i < model.length; i++){
            var todo = model[i];
            var no = i++;

            if(todo != null){
                System.out.println(no + " . " + todo +"\n");
            }
        }
    }

    /**
     * show testing logic for show todolist
     * */
    public static void testShowTodolist(){
        model[0] = "test 1";
        model[1] = "test 1";
        model[2] = "test 1";
        showTodolist();
    }
    /**
     * add todolist logic
     * */

    public static void addTodolist(){

    }
    /**
     * delete todo from list
     * */
    public static void removeTodolist(){

    }
    /**
     * view show todolist
     * */
    public static void viewShowTodolist(){

    }
    /**
     * view add todolist
     * */
    public static void viewAddTodolist(){

    }
    /**
     * view remove todolist
     * */
    public static void viewRemoveTodolist(){

    }
}
