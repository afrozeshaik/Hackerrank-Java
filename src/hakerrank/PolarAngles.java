package hakerrank;
import java.util.Scanner;
public class PolarAngles {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	float x[]=new float[a];
	float y[]=new float[a];
	float v[]=new float[a];
	for (int i = 0; i < a; i++) {
		x[i]=s.nextInt();
		y[i]=s.nextInt();
	}
		for (int i = 0; i <a; i++) {
			if(x[i]==0 && y[i]>0){v[i]=90;}
			else if(x[i]==0 && y[i]<0){v[i]=270;}
			else if(x[i]>0 && y[i]==0){v[i]=0;}
			else if(x[i]<0 && y[i]==0){v[i]=180;}
			else if(x[i]>0 && y[i]>0){v[i]=y[i]/x[i];}
			else if(x[i]<0 && y[i]>0){v[i]=90+((-1)*x[i])/y[i];}
			else if(x[i]<0 && y[i]<0){v[i]=180+(y[i])/x[i];}
			else if(x[i]>0 && y[i]<0){v[i]=270+(x[i])/((-1)*y[i]);}
			
		}
		
		for (int i = 0; i < v.length; i++) {
			float min=999999;int k = 0;
			for (int j = 0; j < v.length; j++) {
				if(v[j]<min){k=j;min=v[j];}
			}v[k]=999999999;System.out.println((int)x[k]+" "+(int)y[k]);
		}
	}

}
