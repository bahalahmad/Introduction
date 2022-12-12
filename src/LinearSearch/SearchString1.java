package LinearSearch;
public class SearchString1 {
    public static void main(String[] args) {
        String name = "Bahal";
        char target = 'c';
        System.out.println(search(name,target));
    }
    static boolean search(String str, char target){
        if(str.length()==0)
            return false;
        for(char ch : str.toCharArray())
            if(ch==target)
                return true;
        return false;
    }

}
