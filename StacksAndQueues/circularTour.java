package DSAsheetByArsh.StacksAndQueues;

public class circularTour {
    static int tour(int petrol[], int distance[])
    {
        int deficit=0;
        int start=0;
        int cal=0;
        for(int i=0;i<petrol.length;i++){
            cal+=petrol[i]-distance[i];
            if(cal<0){
                start=i+1;
                deficit+=cal;
                cal=0;
            }

        }
        return (cal+deficit)>0 ? start :-1;
    }

    public static void main(String[] args) {
        int[] pet = {6, 7, 4, 10, 6, 5};
        int[] dis= {5, 6, 7, 8, 6, 4};
        System.out.println(tour(pet, dis));
    }
}
