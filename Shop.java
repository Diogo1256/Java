import java.util.Scanner;

public class Shop {
    
    public static void main(String[] args) {
        
        Scanner valores = new Scanner(System.in);
        
        System.out.println("----------");
        System.out.println("Bem vindo ao mercadinho, o que você deseja comprar?");
        System.out.println("----------");
        System.out.println("1 - Salgadinho Cheetos (R$15)");
        System.out.println("2 - Peito de boi (R$20");
        System.out.println("3 - Biscoito que fede a bunda (R$67)");
        System.out.println("4 - Pepsi (R$5)");
        System.out.println("5 - Coca zero (R$15)");
        System.out.println("----------");
        
        int item = valores.nextInt();
        
        System.out.println("----------");
        System.out.println("Selecione a quantidade por favor:");
        System.out.println("----------");
        
        int quan = valores.nextInt();
        
        System.out.println("----------");
        
        if (item == 1)
            
            System.out.println("Total: " + 15*quan);
        
        if (item == 2)
            
            System.out.println("Total: " + 20*quan);
        
        if (item == 3)
            
            System.out.println("Total: " + 67*quan);
        
        if (item == 4)
            
            System.out.println("Total: " + 5*quan);
        
        if (item == 5)
            
            System.out.println("Total: " + 15*quan);
        
        System.out.println("----------");
        
        System.out.println("Qual seu metodo de pagamento?");
        System.out.println("1 - Cartão de Credito");
        System.out.println("2 - Pix");
        System.out.println("----------");
        
        int me = valores.nextInt();
        
        System.out.println("----------");
        
        if (me == 1)
            
            System.out.println("Insira o numero do cartão:");
            System.out.println("----------");
        
        double car = valores.nextDouble();
        
        if (me == 2)
            
            System.out.println("Insira a sua chave pix:");
        System.out.println("----------");
        
        double pix = valores.nextDouble();
        
    }
    
}