import java.io.*;
import java.util.*;
public class fractonal_Knapsack {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        double profit[]=new double[n];
        double weight[]=new double[n];
        double ratio[]= new double[n];
        for(int i=0;i<n;i++){
            profit[i] = sc.nextDouble();
            weight[i] = sc.nextDouble();
            ratio[i] = profit[i]/weight[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(ratio[i]+",");
        }
        double totalspace=sc.nextDouble();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(ratio[j] < ratio[j+1]){
                    double temp = profit[j];
                    profit[j] = profit[j+1];
                    profit[j+1] = temp;
                    temp = weight[j];
                    weight[j] = weight[j+1];
                    weight[j+1] = temp;
                    temp = ratio[j];
                    ratio[j] = ratio[j+1];
                    ratio[j+1] = temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(profit[i]+","+weight[i]+" : "+ratio[i]);
        }
        double amount=0.0;
        for(int i=0;i<n-1;i++){
            double p = profit[i];
            double w = weight[i];
            if(w<=totalspace){
                amount += p;
                totalspace -= w;
            }
            else
            {
                amount += totalspace*(profit[i]/weight[i]);
                break;
            }
        }
        System.out.println(amount);

    }
}