package DSAsheetByArsh.StacksAndQueues;

import java.util.Stack;

public class theCelebrityProblem {
    int celebrity(int arr[][], int n)
    {
        // code here
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i< n; i++){
            st.push(i);
        }
        while(st.size() >1){
            int i = st.pop();
            int j = st.pop();
            if(arr[i][j] == 1)
                st.push(j);
            else st.push(i);
        }
        int ans=st.pop();

        for(int i=0;i<n;i++){
            if(ans==i)continue;
            if(arr[ans][i]==1 || arr[i][ans] ==0)return -1;


        }

        return ans;
    }
}
