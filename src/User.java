public class User {    
    public static String username(String cliente){
        String[] usuario = {"Alice", "Bob", "Carol"};
        for(int i = 0; i < usuario.length; i++){
            if(usuario[i].equals(cliente))
            return usuario[i];
        }
        return null;
    }
}
