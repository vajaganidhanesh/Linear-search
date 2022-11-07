
public class string {
    public static void main(String[] args) {
        String name = "dhanesh";
        char target = 'a';
        System.out.println(linearSearch1(name,target));
    }
    static  boolean linearSearch1(String name,char target){
        if(name.length() ==0){
            return false;
        }

        for (char ch:name.toCharArray()) {
            if (ch == target){
                return true;
            }
        }
        return false;
    }
    static  boolean linearSearch(String name,char target){
        if(name.length() ==0){
            return false;
        }

        for (int i = 0; i < name.length(); i++) {
            if(target == name.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
