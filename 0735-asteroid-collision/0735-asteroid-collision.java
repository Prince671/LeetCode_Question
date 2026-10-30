class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> st=new ArrayDeque<>();

        for(int ast:asteroids){
            if(ast>=0){
                st.push(ast);
            }else{
                // intail value is negative 
                if(st.isEmpty()){
                    st.push(ast);
                }
                else if(!st.isEmpty() && st.peek()<0){
                    st.push(ast);
                }
                else{

                    boolean destoryed=false;

                    while(!st.isEmpty() && ast<0 && st.peek()>0){
                        if(st.peek() < -ast){
                            st.pop();
                            continue;
                        }
                        else if(st.peek() > -ast){
                            destoryed=true;
                            break;
                        }else{
                            destoryed=true;
                            st.pop();
                            break;
                        }
                    }
                    if(destoryed==false){
                        st.push(ast);
                    }
                }
            }
        }

        int[] ans=new int[st.size()];
        for(int i=st.size()-1; i>=0; i--){
            ans[i]=st.pop();
        }

        return ans;
    }
}