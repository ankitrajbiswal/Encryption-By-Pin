package project;
import java.util.*;
public class encryptbypin {

	public static void main(String[] args) {
		
		        Scanner sc= new Scanner(System.in);
		        System.out.println("Enter 4 PIN Of Your Choice");
		        int n1=sc.nextInt(), n2=sc.nextInt(), n3=sc.nextInt(), n4=sc.nextInt();
		        
		       
		       char g=' ';
		        String gg="";
		        int c=0,cc=n1,d=0,e=0,f=0,n=0,nnn=0,m=0;
		        while (cc!=0){
		            cc=cc/10;
		            n+=1;
		        }
		        while(c<=n-1){ 
		            nnn=Math.min((n1%10),Math.min((n2%10),Math.min((n3%10),(n4%10))));
		            m=m+((int)Math.pow(10,c))*nnn;
		            n1=n1/10;
		            n2=n2/10;
		            n3=n3/10;
		            n4=n4/10;
		            c+=1;
		        }
		        System.out.println("The Generated Pin is :"+m);
		        System.out.println("Enter the message you want to encrypt");
		        String msg=sc.nextLine();
		        String nn=sc.nextLine();
		        nn=nn.replaceAll(" ","");
		        nn=nn.toLowerCase();
		       // System.out.println(n);
		        int k=nn.length();
		        c=0;
		        while(e<=k-1){
		            g=(nn.charAt(e));
		            d=m/((int)Math.pow(10,(n-1-c)));
		            d=d%10;
		            f=(int)g+d;
		            if(f>122){
		                f=96+(f-122);
		            }
		            gg=gg+((char)f);
		            c+=1;
		            if(c==n){
		                c=0;
		            }
		            e+=1;
		        }
		        System.out.print(gg.toUpperCase());
		    } 
		
	}




