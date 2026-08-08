class Solution {
    public static boolean isFriend(int id, int[] friends){
        for(int i = 0; i < friends.length; i++){
            if(friends[i] == id){
                return true;
            }
        }
        return false;
    }

    public int[] recoverOrder(int[] order, int[] friends) {
        int n = friends.length;
        int idx = 0;
        int[] finish = new int[n];
        for(int i = 0; i < order.length; i++){
            int id = order[i];
            if(isFriend(id, friends)){
                finish[idx++] = id;
            }
        }
        return finish;
    }
}