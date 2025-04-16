interface Drawable{
    default void draw(){
        System.out.println("Draw function is being used");
    }
}
class Rectangle implements Drawable{
    @Override
    public void draw(){
        System.out.println("This is being used in Rectange");
    }
}
class Circle implements Drawable{
    @Override
    public void draw(){
        System.out.println("Drawing circle");
    }
}
class Triangle implements Drawable{
    public void draw(){
        System.out.println("Drawing Triangle");
    }
}
interface sortable{
  public default void sort (int [] arrr){
        for(int  i=0;i<arrr.length;i++){
            System.out.println(arrr[i]);
        }
    }
}
class Bubblesort implements sortable{
    @Override
       public void sort(int [] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            System.out.println(arr[i]);
        }
     }
}
class SelectionSort implements sortable {
    @Override
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int MinInt = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[MinInt]) {
                    MinInt = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[MinInt];
            arr[MinInt] = temp;
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);
        }
    }
}
//question 8 in Assignment 2
interface Searchable{
    boolean search(String keyword);
}
class Document implements Searchable{
    private String text;
    public Document(String key){
        this.text=key;
    }
    @Override
    public boolean search(String keyword){
        if(keyword==null|| keyword.isEmpty()){
            return false;
        }
        return text.contains(keyword);
    }
    public void display(){
        System.out.println("Document Text:"+text);
}
}
public class question5A2 {
    public static void main(String[] args) {
        int[] arr = {2, 34, 5, 3, 4,};
        Bubblesort obj = new Bubblesort();
        SelectionSort obj1 = new SelectionSort();
        obj1.sort(arr);
//        obj.sort(arr);
        Document doc = new Document("This is a sample Java text document for searching.");
        doc.display();
        String a="Java";
        if(doc.search(a)){
            System.out.println("Keyword "+ a +" found in the document");
        }
        else{
            System.out.println("Keyword "+ a +"not found");
        }
    }
}

