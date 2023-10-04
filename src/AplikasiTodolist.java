public class AplikasiTodolist {
    public static String[] model = new String[10];
    public static void main(String[] args) {
//        testShowTodolist();
//        testAddTodoList();
        testRemoveTodoList();
    }

    /**
     * Show todolist logic
     * */
    public static void showTodolist() {
        for(var i = 0; i < model.length; i++){
            var todo = model[i];
            var no = i + 1;

            if(todo != null){
                System.out.println(no + "." + todo + "\n");
            }
        }
    }

    /**
     * show testing logic for show todolist
     * */
    //test tampilkan data di array
    public static void testShowTodolist(){
        model[0] = "test 1";
        model[1] = "test 2";
        model[2] = "test 3";
        model[3] = "test 4";
        showTodolist();
    }


    /**
     * Menambah todo ke list
     * */
    public static void addTodolist(String todo){
//        cek apakah model penuh?
        var isFull = true;
        for(int i = 0; i < model.length; i++){
            if(model[i] == null){
                //model masih ada yang kosong
                isFull = false;
                break;
            }
        }
        //cek penuh dan resize array 2x lipat
        if(isFull){
            var temp = model;
            model = new String[model.length * 2];
                for(int i = 0; i < temp.length; i++){
                    model[i] = temp[i];
                }
        }

//        tambahkan ke posisi yang data arraynya NULL
        for(var i = 0; i < model.length; i++){
            if(model[i] == null){
                model[i] = todo;
                break;
            }
        }
    }

    public static void testAddTodoList(){
        for(int i = 0; i < 25; i++){
            addTodolist("contoh todo ke. " +i);
        }
        showTodolist();
    }
    /**
     * delete todo from list
     * */
    public static boolean removeTodolist(Integer number){
        //cek apakah todonya lebih dari index kan dimulai dari o makanya dicek kalau indexnya 10 maka akan dianggap gagal
        if((number - 1) >= model.length){
            return false;
        }//dicek apakah isinya diindex sudah null atau tdk, ini ada data sebelumnya atau tdk
        else if(model[number - 1] == null){
            return false;
        }//disini kalau ada isinya dan akan berhasil mengambil index dan valuenya
        else{
            for(int i = (number - 1); i < model.length; i++){
                if(i == (model.length - 1)){
                    model[i] = null;
                }else {
                    model[i] = model[i + 1];
                }
            }
            return true;
        }
    }

    //test menghapus
    public static void testRemoveTodoList(){
        addTodolist("satu");
        addTodolist("dua");
        addTodolist("tiga");
        addTodolist("empat");
        addTodolist("lima");
        var result = removeTodolist(20);
        System.out.println(result);

        result = removeTodolist(8);
        System.out.println(result);

        result = removeTodolist(2);
        System.out.println(result);

        showTodolist();



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
