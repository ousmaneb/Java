import java.util.Scanner;
public class Programming1 {
    static int town1;
    static int town2;
    static int town3;
    static int town4;
    static int town5;
    
    public static void main(String[] args) {
        getPopulation(args);
        drawPopulationBar(args);
    }
    
    
    
    public static void getPopulation(String[] args) {
        Scanner user_input = new Scanner(System.in);
        
        System.out.print("Enter the population of town 1: ");
        town1 = user_input.nextInt();
        
        System.out.print("Enter the population of town 2: ");
        town2 = user_input.nextInt();
        
        System.out.print("Enter the population of town 3: ");
        town3 = user_input.nextInt();
        
        System.out.print("Enter the population of town 4: ");
        town4 = user_input.nextInt();
        
        System.out.print("Enter the population of town 5: ");
        town5 = user_input.nextInt();
    }
    
    
    public static void drawPopulationBar(String[] args) {
        
        System.out.println();
        System.out.println("POPULATION GRAPH:");
        int t1=town1 / 1000;
        int t2=town2 / 1000;
        int t3=town3 / 1000;
        int t4=town4 / 1000;
        int t5=town5 / 1000;
        
        System.out.print("Town 1: ");
        for (int i=1; i<=t1; i++){
            System.out.print("*");
        }
        System.out.println("\n");
        
        System.out.print("Town 2: ");
        for (int i=1; i<=t2; i++){
            System.out.print("*");
        }
        System.out.println("\n");
        
        System.out.print("Town 3: ");
        for (int i=1; i<=t3; i++){
            System.out.print("*");
        }
        System.out.println("\n");
        
        System.out.print("Town 4: ");
        for (int i=1; i<=t4; i++){
            System.out.print("*");
        }
        System.out.println("\n");
        
        System.out.print("Town 5: ");
        for (int i=1; i<=t5; i++){
            System.out.print("*");
        }
        
        System.out.println("\n");
        
    }
}

