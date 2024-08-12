public class Mensagem {

    public static void main(String args) {
        String msgtxt = mensagem(args);
        System.out.println(msgtxt);
    }

    private static String mensagem(String msg) {
        if(msg == null){
            return "Menssagem de Padrão da Class";

        }else{
            return msg;
        }
    }
}
