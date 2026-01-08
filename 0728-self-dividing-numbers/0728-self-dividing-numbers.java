class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=left;i<=right;i++){
            int n=i;
            boolean check=true;
            while(n!=0){
             int n1=n%10;
            if(n1!=0 && i%n1==0){
                n=n/10;
            }
            else{check=false;
            break;}}
            if(check){res.add(i);}

        

        
    }
    return res;
    }
}