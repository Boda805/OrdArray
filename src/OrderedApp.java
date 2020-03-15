public class OrderedApp {
    public static void main(String[] args) {
        OrdArray arr1 = new OrdArray(7);
        arr1.insert(5);
        arr1.insert(10);
        arr1.insert(15);
        arr1.insert(20);
        arr1.insert(30);

        arr1.display();
        System.out.println(arr1.find(5));


        arr1.delete(30);
        arr1.display();
        System.out.println(arr1.size());

    }
}