public class C1_Q6 {
    public static int countNumberStrings(String[] strs) {
        // fill here!
        int count = 0;
        for(int i=0; i< strs.length; i++){
            try{
                Integer.parseInt(strs[i]);
                count++;
            }catch (NumberFormatException e){
            }catch (NullPointerException e){
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String[] strs = {"123", "abc", "12", "", null};
        System.out.println(countNumberStrings(strs)); // 2
    }
}
