import java.util.Scanner;


class TV {
    public void ligar() {
        System.out.println("TV ligada");
    }
    
    public void desligar() {
        System.out.println("TV desligada");
    }
    
    public void ajustarVolume(int nivel) {
        System.out.println("Volume da TV ajustado para " + nivel);
    }
    
    public void mudarCanal(int canal) {
        System.out.println("Canal alterado para " + canal);
    }
}

class SistemaDeSom {
    public void ligar() {
        System.out.println("Sistema de som ligado");
    }
    
    public void desligar() {
        System.out.println("Sistema de som desligado");
    }
    
    public void configurarSurround() {
        System.out.println("Modo surround ativado");
    }
    
    public void configurarPadrao() {
        System.out.println("Modo de som padrão ativado");
    }
}

class Luzes {
    public void dim(int intensidade) {
        System.out.println("Luzes ajustadas para intensidade " + intensidade);
    }
    
    public void desligar() {
        System.out.println("Luzes desligadas");
    }
}


class HomeTheaterFacade {
    private TV tv;
    private SistemaDeSom som;
    private Luzes luzes;
    
    public HomeTheaterFacade(TV tv, SistemaDeSom som, Luzes luzes) {
        this.tv = tv;
        this.som = som;
        this.luzes = luzes;
    }
    
    public void assistirFilme() {
        System.out.println("\nPreparando para assistir filme...");
        luzes.dim(10);
        tv.ligar();
        som.ligar();
        som.configurarSurround();
        tv.ajustarVolume(25);
    }
    
    public void ouvirMusica() {
        System.out.println("\nPreparando para ouvir música...");
        luzes.dim(30);
        tv.desligar();
        som.ligar();
        som.configurarPadrao();
    }
    
    public void assistirTV() {
        System.out.println("\nPreparando para assistir TV...");
        luzes.dim(20);
        tv.ligar();
        som.ligar();
        som.configurarPadrao();
        tv.ajustarVolume(15);
    }
    
    public void desligarTudo() {
        System.out.println("\nDesligando o home theater...");
        tv.desligar();
        som.desligar();
        luzes.desligar();
    }
}


public class Main {
    public static void main(String[] args) {
       
        TV tv = new TV();
        SistemaDeSom som = new SistemaDeSom();
        Luzes luzes = new Luzes();
        
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(tv, som, luzes);
        
        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        do {
            System.out.println("\n=== Menu Home Theater ===");
            System.out.println("1 - Assistir filme");
            System.out.println("2 - Ouvir música");
            System.out.println("3 - Assistir TV");
            System.out.println("4 - Desligar tudo");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();
            
            switch(opcao) {
                case 1:
                    homeTheater.assistirFilme();
                    break;
                case 2:
                    homeTheater.ouvirMusica();
                    break;
                case 3:
                    homeTheater.assistirTV();
                    break;
                case 4:
                    homeTheater.desligarTudo();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while(opcao != 0);
        
        scanner.close();
    }
}