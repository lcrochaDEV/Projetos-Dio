import java.util.Scanner;

public class VerificacaoServico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada do serviço a ser verificado
        System.out.println("Por favor, digite o serviço contratado (movel, fixa, banda larga, tv): ");
        String servico = scanner.nextLine().trim();
        // Entrada do nome do cliente e os serviços contratados
        System.out.println("Digite o seu nome seguido pelos planos (por exemplo, Alice,movel,fixa): ");
        String entradaCliente = scanner.nextLine().trim();

        // Separando o nome do cliente e os serviços contratados
        String[] partes = entradaCliente.split(",");
        String nomeCliente = partes[0];
        boolean contratado = false;
       
        //TODO: Verifica se o Cliente está Cadastrado.
        String[] usuario = {"Alice", "Bob", "Carol"};
        for(int i = 0; i < usuario.length; i++){
        if(username(nomeCliente) != null){
            // TODO: Verifique se o serviço está na lista de serviços contratados
            for(int i = 0; i < partes.length; i++){           
                if(partes[i].equals(servico)){
                    System.out.println("Sim");
                    contratado = true;
                    break;
                }
            }
            if(contratado == false){
                System.out.println("Não");
                System.exit(0);
            }
        }else{
            System.out.println("Usuario não Cadastrado.");
        }
        scanner.close();
    }
    public static String username(String cliente){
        String[] usuario = {"Alice", "Bob", "Carol"};
        for(int i = 0; i < usuario.length; i++){
            if(usuario[i].equals(cliente))
            return usuario[i];
        }
        return null;
    }
}   
 