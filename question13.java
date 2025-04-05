interface animal{
    void makesound();
}
interface pet{
    void play();
}
class dog implements animal,pet{
    @Override
    public void makesound() {
        System.out.println("Woof");
    }

    @Override
    public void play() {
        System.out.println("woffing");
    }
}
class question13{
    public static void main(String[] args){
        System.out.println("Completing question 13");
        dog d=new dog();
        d.makesound();
        d.play();
    }
}