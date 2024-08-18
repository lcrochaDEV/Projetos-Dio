
public class Combo {
    public static String planos(String plano) {
        String[] comboArray = {"movel", "banda larga", "tv"};
        for(int i = 0; i < comboArray.length; i++){
            if(comboArray[i].equals(plano))
            return comboArray[i];
        }
        return null;
    }
}
