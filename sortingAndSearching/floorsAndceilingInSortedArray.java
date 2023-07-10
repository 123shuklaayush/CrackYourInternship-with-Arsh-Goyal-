package DSAsheetByArsh.sortingAndSearching;

import kotlin.Pair;

import java.util.Arrays;

public class floorsAndceilingInSortedArray {
    static int floor(int arr[],int n,int x){
        int i=0; int j=n-1;
        int ans=-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(arr[mid]<=x){
                ans=arr[mid];
                i=mid+1;
            }
            else if(arr[mid]>x){
                j=mid-1;
            }
        } return ans;
    }

    static int ceil(int arr[],int n,int x){
        int i=0;
        int j=n-1;
        int ans=-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(arr[mid]>=x){
                ans=arr[mid];
                j=mid-1;
            }
            else if(arr[mid]<x){
                i=mid+1;
            }
        }
        return ans;
    }
}
