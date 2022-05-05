import java.util.*;
class sorting_Q1
{
	
	void insertion(int a1[]){
		int n=a1.length-1;
		int key=a1[n];
		for(int j=n-1;j<=0;j--){
			if(a1[j]>key){
				a1[j+1]=a1[j];
				display(a1,n);
			}
			else{
				a1[j+1]=key;
				display(a1,n);
			}
			
		}
	}
	
	void display(int a1[],int n){
		
		for(int j=0;j<=n;j++){
			System.out.print(a1[j]+" ");
		}
		System.out.println();
	}
	
	public static void main(String args[]){
		
		sorting_Q1 s=new sorting_Q1();
		Scanner sc=new Scanner(System.in);
		System.out.println("number of element");
		int i=sc.nextInt();
		int a1[]=new int[i];
		for(int j=0;j<i;j++){
			a1[j]=sc.nextInt();
		}
		s.insertion(a1);
	}
}