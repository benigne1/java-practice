public class Fish implements Prey,Preditor {
    @Override 
public void hunt(){
    System.out.println("the fish is hunting");
}
public void flee(){
    System.out.println("the fish is running!");
}
    
}
