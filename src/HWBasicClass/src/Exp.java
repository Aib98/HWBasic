class Human{
    // Возраст
    int age;
    // Пол
    String sex;
    int [] famaly;

    //Метод
    int getWaist(){
        return age * 1000;
    }

    int getElem(int pos){
        return  famaly[pos];
    }

}


public class Exp {
    public static void main(String[] args) {
        Human manAndrew = new Human();
        manAndrew.age = 32;
        manAndrew.sex = "man";
        manAndrew.famaly = new int [] {1, 3, 4, 7};

        System.out.println(manAndrew.getWaist());
        System.out.println(manAndrew.sex);

        for  (int i = 0; i < manAndrew.famaly.length; i++){

//            System.out.println(manAndrew.getElem(i));
            System.out.println(manAndrew.famaly[i]);
        }
    }
}
