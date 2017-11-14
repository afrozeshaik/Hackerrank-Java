package hakerrank;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;


class JourneyToTheMoon {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int e=s.nextInt();
		int adm[][]=new int[n][n];
		for (int i = 0; i < e; i++) {
			int n1=s.nextInt();
			int n2=s.nextInt();
			adm[n1][n2]=1;
			adm[n2][n1]=1;
		}
		Set nodes = new HashSet();
		for (int i = 0; i <n; i++) {
			nodes.add(i);
		}
		Queue result = new LinkedList<Integer>();
		int visited[]=new int[n];
		while(!nodes.isEmpty()){
			Iterator it =nodes.iterator();
			int p = (int) it.next();
			nodes.remove(p);   // this will be the root node
			
			
			Queue tq=new LinkedList();  // queue used for bfs
			tq.add(p);
			
			
			int tempcount=1;			// sure there will be one element as root for new subtree(disjoint)
			
			while(!tq.isEmpty()){
				
				int out=(int) tq.remove();		//remove the root element
				visited[out]=1;
				
				
				for (int i = 0; i <n; i++) {
					if(adm[out][i]==1 && visited[i]==0){
						
						tq.add(i);			// adding the unvisited elements to the tq
						visited[i]=1;
						tempcount=tempcount+1;
						nodes.remove(i);
					}
				}
				
			}
			result.add(tempcount);
		
		}
		int siz=result.size();
		int ans[]=new int[siz];
		for (int i = 0; i < siz; i++) {
			ans[i]=(int) result.remove();
		}
		long finans=0;
		for (int i = 0; i <siz-1; i++) {
			int temp=0;
			for (int j = i+1; j < siz; j++) {
				temp=temp+ans[j];
			}
			finans+=ans[i]*temp;
		}
		System.out.println(finans);
		
		
	}
	
}
