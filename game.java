class Game{
   public static void showgametitle(){
   System.out.println(" welcome to adventure quest");
}
   public static void showgamerules(){
   System.out.println("Rules 1-collect coins, 2-avoid obstacles,3- reach goal");
}
  
   public static void showloadingscreen(){
   System.out.println("Loading game... pls wait");
}

     public static void main (String [] args){
     display showgametitle();
     display showgamerules();
     display showloadingscreen();

}
}