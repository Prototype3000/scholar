package craig.com.permutations;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Table {
	public void doPerm(int base,int pow,String permString){
		ArrayList<ArrayList<Integer>>tablePerm = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer>linkPerm = new ArrayList<Integer>();
		Set<Integer>determinePerm = new HashSet<Integer>();
		int x=0;
		int [] countPerm = new int [pow];
		String result="";
		while(x<Math.pow(base, pow)){
		
			for(int k=0; k<pow;k++){
				int e = (int) Math.pow(base, pow-(k+1));
				int value = countPerm[k]/e;
				
				result = result + permString.charAt(value);
				determinePerm.add(value);
				//linkPerm.add(value);
				countPerm[k]=countPerm[k]+1;
				
				
				if(countPerm[k]==base*e){

					countPerm[k]=0;
				}
				
				
			}
			
			//tablePerm.add(linkPerm);
			System.out.println();
			if(determinePerm.size()==permString.length()){
				System.out.println(result);
			}
			result ="";
			determinePerm.clear();
			linkPerm.clear();
			x++;
		}
		
	
	}
	public void doBaseXTable(int base,int pow,int rows){
		int generateTable=0;
		int [] countPerm = new int [pow];
		while(generateTable<rows){
			System.out.print(generateTable+": ");
			for(int i=0; i<pow;i++){
				int power = (int) Math.pow(base, pow-(i+1));
				int value = countPerm[i]/power;
				System.out.print(value+" ");
				countPerm[i]=countPerm[i]+1;
				
				
				if(countPerm[i]==base*power){

					countPerm[i]=0;
				}
				
				
			}
			
			
			System.out.println();
			
			generateTable++;
		}
		
	
	}

}
