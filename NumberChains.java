import java.io.*;
class NumberChains
{
	static int a[]=new int[5000];
	public static void main(String arghh[])throws Exception
	{
		input("");
	}
	static void input(String s)throws Exception
	{
		BufferedReader br=new BufferedReader(new FileReader("Questions.txt"));
		while((s=br.readLine())!=null)
		{
			if(s.equals("0"))
			return ;
			generate(s,"",0);
		}
	}
	static void generate(String s,String x,int c)
	{
		System.out.println("The Original Number is "+s);
		while(true)
		{
			int a=as(s,"");
			int d=des(s,"");
			int dif=d-a;
			System.out.println(d+" - "+a+" = "+dif);
			c++;
			if(x.indexOf(dif+"")>=0)
			{
				System.out.println("Chain Length "+c+"\n");
				break;
			}
			x=x+dif+" ";
			s=dif+"";
		}
	}
	static int as(String s,String a)
	{
		for(char ch='0';ch<='9';ch++)
		{
			for(int i=0;i<s.length();i++)
			if(s.charAt(i)==ch)
			{
				a=a+ch;
				s=s.substring(0,i)+s.substring(i+1);
			}
		}
		return(Integer.parseInt(a));
	}
	static int des(String s,String a)
	{
		for(char ch='9';ch>='0';ch--)
		{
			for(int i=0;i<s.length();i++)
			if(s.charAt(i)==ch)
			{
				a=a+ch;
				s=s.substring(0,i)+s.substring(i+1);
			}
		}
		return(Integer.parseInt(a));
	}
}