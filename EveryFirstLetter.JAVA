public class Main {
    
    
    public static void initial(){
        String x = "some words that work";
        String[] name = x.split(" ");
        for(int i = 0; i < name.length; i++){
            String s = name[i];
            System.out.println(s.charAt(0));
        }
    }
    
    public static void main(String args[]) {        
        initial();
    }
}
